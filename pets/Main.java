package pets;

import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import pets.Turno.SetaAtributos;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        List<Pet> pets = new ArrayList<>();
        Jogador player = new Jogador(pets);
        boolean jogarNovamente = true;
        
        while(jogarNovamente){

            //inicio do jogo: definicao de especie e nome do pet
            //scan do nome
            System.out.println("insira o nome do pet:");
            String nomeDoPet = scanner.nextLine();

            System.out.println("Escolha a especie do seu pet: (0 para sair, 1 Cachorro, 2 Gato, 3 Pinguim)");
            //scan da especie
            switch (scanner.nextLine()) {
                case "0" -> System.exit(0);
                case "1" -> {
                    Cachorro dog = new Cachorro(nomeDoPet);
                    dog.print();
                    pets.add(dog);
                }
                case "2" -> {
                    Gato gato = new Gato(nomeDoPet);
                    gato.print();
                    pets.add(gato);
                }
                case "3" -> {
                    Pinguim pingu = new Pinguim(nomeDoPet);
                    pingu.print();
                    player.getPets().add(pingu);
                }
                default -> {
                    System.out.println("invalido");
                    continue;
                }
            }
            //seleciona pet que foi adicionado na jogada mais recente
            Pet petAtual = pets.get(pets.size()-1);
            while(petAtual.estaVivo()){ //cada iteracao é um turno
                System.out.println();
                /*NOVO TURNO*/
                SetaAtributos.newTurnStats(petAtual);
                System.out.println("""
                        escolha o que fazer:
                        1. brincar
                        2. limpar
                        3. medicar
                        4. alimentar
                        outro: nada""");
                switch (scanner.nextLine()){
                    case "1" -> petAtual.brincar();
                    case "2" -> petAtual.limpar();
                    case "3" -> petAtual.medicar();
                    case "4" -> petAtual.alimentar();
                    default -> System.out.println("voce nao fez nada");
                }
                //FIM ACOES DO JOGADOR
                /*FIM DO TURNO*/
                SetaAtributos.endTurn(petAtual);
                petAtual.printStats();
            }
            System.out.println("é o fim de "+ petAtual.getNome() + ". RIP ;-;\n");
            System.out.println("GAME OVER\n\n");
            System.out.println("sua pontuacao: " + player.calcPontuacao(petAtual));
            petAtual.printStats();
            System.out.println("jogar novamente? 1: sim\noutro: nao");

            if(!scanner.nextLine().contentEquals("1")) jogarNovamente = false;
        }
        System.out.println("deseja rever a pontuacao de algum pet?\n1. sim\noutro: nao");
        if(scanner.nextLine().contentEquals("1")){
            Pet petAtual = buscaNomePet(pets);
            System.out.println("sua pontuacao: " + player.calcPontuacao(petAtual));
                /*
                usando o metodo sobrecarregado calcPontuacao:
                System.out.println("sua pontuacao: " + player.calcPontuacao(pets, pets.indexOf(petAtual)));
                */
        }
        scanner.close();
    }
    static Pet buscaNomePet(List<Pet> pets){
        System.out.println("Digite o nome exato do pet:");
        String nomePet = scanner.nextLine();
        Pet pet = null;
        for (Pet p : pets) {
            if (Objects.equals(p.getNome(), nomePet)) {
                pet = p;
                break;
            }
        }
        return pet;
    }
}
