package pets.Turno;
import pets.Pet;

import static pets.Const.Constantes.*;
import static pets.Turno.Testes.*;

public class SetaAtributos {
    public static void newTurnStats(Pet pet) {
        pet.setFome(pet.getFome() + ATT_FOME);
        pet.setLimpeza(pet.getLimpeza() + ATT_LIMPEZA);
        pet.setFelicidade(pet.getFelicidade() + ATT_FELICIDADE);
    }

    public static void endTurn(Pet pet) {
        atualizaLimpeza(pet);
        atualizaFelicidade(pet);
        atualizaFome(pet);
        atualizaDoenca(pet);
        atualizaIdade(pet);
    }

    private static void atualizaFome(Pet pet) {
        if (testeFome(pet)) {
            System.out.println(pet.getNome() + " esta faminto");
            pet.tomaDano(DANO);
        } else {
            System.out.println("o pet esta satisfeito com a barriga relativamente cheia");
        }
        if (!pet.estaVivo() && pet.getVida() >= DANO) {
            System.out.println(pet.getNome() + " morreu de fome.");
        }
    }

    private static void atualizaFelicidade(Pet pet) {
        if (testeFelicidade(pet)) { //felicidade acima do mínimo de felicidade (40)
            System.out.println(pet.getNome() + " está contente");
            //50% de chance de regen DANO/2
            if (testeRegen(pet)) {
                //true o pet regenera DANO/2
                System.out.println("tao feliz que se regenerou!");
                pet.tomaDano(-DANO/2);
            }
        } else {
            //felicidade abaixo do mínimo de felicidade (40)
            System.out.println(pet.getNome() + " esta infeliz");
            if (testeDegen()) {
                //true o pet recebe DANO/2
                System.out.println("tao triste que sua saude se deteriorou.");
                pet.tomaDano(DANO/2);
            }
            if (!pet.estaVivo() && pet.getVida() >= DANO/2) {
                System.out.println(pet.getNome() + " morreu de tristeza.");
            }
        }
    }

    private static void atualizaLimpeza(Pet pet) {
        if (testeLimpeza(pet)) {
            //Se limpeza <= 45, o pet está sujo e e pode adoecer com probabilidade de 30%.
            System.out.println(pet.getNome() + " esta sujo");
            if (!pet.isDoente() && testeAdoeceu() && pet.estaVivo()) {
                //o pet deve estar saudavel (doente = false) para adoecer
                System.out.println("adoeceu por viver na imundície.");
                pet.setDoente(true);
            }
        }
    }

    private static void atualizaDoenca(Pet pet) {
        //Se doente, o pet tem 10% de chance de morrer ao fim do turno.
        if (pet.isDoente() && pet.estaVivo()) {
            if (testeDoenteMorte()) {
                System.out.println(pet.getNome() + " faleceu devido a sua doença :(");
                pet.setVida(VIDA_MORTO);
            }
        }
    }

    private static void atualizaIdade(Pet pet) {
        pet.setIdade(pet.getIdade() + 1);
        //O pet envelhece e sua idade aumenta 1 ponto.
        if ((pet.getIdade() > IDADE_IDOSO) && testeVelhiceMorte() && pet.estaVivo()) {
            //é idoso e passou no teste de morte por velhice
            System.out.println(pet.getNome() + " faleceu devido a sua idade avançada :(");
            pet.setVida(VIDA_MORTO);
        }
    }
}

