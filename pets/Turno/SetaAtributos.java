package pets.Turno;
import pets.Pet;

import static pets.Const.Constantes.*;
import static pets.Turno.Testes.*;

public class SetaAtributos {
        /*
        //main para teste
        public static void main(String[] args) {
            Pet morreuDoente = new Cachorro("morreu Doente");
            morreuDoente.setDoente(true);
            while(morreuDoente.estaVivo()){
                System.out.println();
                endTurn(morreuDoente);
                System.out.println("idade: " + morreuDoente.getIdade());
            }
        }
        */
    public static void newTurnStats(Pet pet) {
        pet.setFome(pet.getFome() + ATT_FOME);
        pet.setLimpeza(pet.getLimpeza() + ATT_LIMPEZA);
        pet.setFelicidade(pet.getFelicidade() + ATT_FELICIDADE);
        atualizaMAXMIN(pet);
    }

    public static void endTurn(Pet pet) {
        atualizaDoenca(pet);
        atualizaLimpeza(pet);
        atualizaFelicidade(pet);
        atualizaFome(pet);
        atualizaIdade(pet);
        atualizaMAXMIN(pet);
    }

    private static void atualizaMAXMIN(Pet pet){
        if(pet.getFome() > FOME_MAX) pet.setFome(FOME_MAX);
        if(pet.getLimpeza() > LIMP_MAX) pet.setLimpeza(LIMP_MAX);
        if(pet.getFelicidade() > FELIC_MAX) pet.setFelicidade(FELIC_MAX);
        if(pet.getVida() > VIDA_MAX) pet.setVida(VIDA_MAX);
        if(pet.getFome() < FOME_MIN) pet.setFome(FOME_MIN);
        if(pet.getLimpeza() < LIMP_MIN) pet.setLimpeza(LIMP_MIN);
        if(pet.getFelicidade() < FELIC_MIN) pet.setFelicidade(FELIC_MIN);
    }

    private static void atualizaFome(Pet pet) {
        if(pet.isVivo()){
            if (testeFome(pet)) {
                System.out.println(pet.getNome() + " esta faminto");
                pet.tomaDano(DANO);
            } else {
                System.out.println("o pet esta satisfeito com a barriga relativamente cheia");
            }
            if (pet.getVida() < 0 && pet.isVivo()) {
                System.out.println(ANSI_RED+ pet.getNome() + " morreu de fome." + ANSI_RESET);
                pet.setMorreu(true);
            }
        }
    }

    private static void atualizaFelicidade(Pet pet) {
        if(pet.isVivo()){
            if (testeFelicidade(pet)) { //felicidade acima do mínimo de felicidade (40)
                System.out.println(pet.getNome() + " está contente");
                //50% de chance de regen DANO/2
                if (testarChance(PROB_REGEN) && pet.getFelicidade() > FELIC_FELIZ) {
                    //true o pet regenera DANO/2
                    System.out.println("tao feliz que se regenerou!");
                    pet.tomaDano(-DANO);
                }
            } else {
                //felicidade abaixo do mínimo de felicidade (40)
                System.out.println(pet.getNome() + " esta infeliz");
                if (testarChance(PROB_DEGEN)) {
                    //true o pet recebe DANO/2
                    System.out.println("tao triste que sua saude se deteriorou.");
                    pet.tomaDano(2*DANO);
                }
                if (pet.getVida() < 0) {
                    System.out.println(ANSI_RED+ pet.getNome() + " morreu de tristeza."+ ANSI_RESET);
                    pet.setMorreu(true);    //morreu = true;
                }
            }
        }
    }

    private static void atualizaLimpeza(Pet pet) {
        if (testeLimpeza(pet) && pet.isVivo()) {
            //Se limpeza <= 45, o pet está sujo e e pode adoecer com probabilidade de 30%.
            System.out.println(pet.getNome() + " esta sujo");
            if (!pet.isDoente() && testarChance(PROB_DOENTE) && pet.isVivo()) {
                //o pet deve estar saudavel (doente = false) para adoecer
                System.out.println("adoeceu por viver na imundície.");
                pet.setDoente(true);
            }
        }
    }

    private static void atualizaDoenca(Pet pet) {
        //Se doente, o pet tem 10% de chance de morrer ao fim do turno.
        if (pet.isDoente() && pet.isVivo() && testarChance(PROB_DOENTEMORTE)) {
            System.out.println(ANSI_RED+ pet.getNome() + " faleceu devido a sua doença :("+ANSI_RESET);
            pet.setVida(VIDA_MORTO);
            pet.setMorreu(true);    //morreu = true;
        }
    }

    private static void atualizaIdade(Pet pet) {
        pet.setIdade(pet.getIdade() + 1);
        //O pet envelhece e sua idade aumenta 1 ponto.
        if ((pet.getIdade() > IDADE_IDOSO) && testarChance(PROB_MORTEVELHICE) && pet.isVivo()) {
            //é idoso e passou no teste de morte por velhice
            System.out.println(ANSI_RED+pet.getNome() + " faleceu devido a sua idade avançada :("+ANSI_RESET);
            pet.setVida(VIDA_MORTO);
            pet.setMorreu(true);    //morreu = true;
        }
    }
}

