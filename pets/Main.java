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
            switch (scanner.nextInt()) {
                case 0 -> System.exit(0);
                case 1 -> {
                    Cachorro dog = new Cachorro(nomeDoPet);
                    dog.print();
                    player.getPets().add(dog);
                }
                case 2 -> {
                    Gato gato = new Gato(nomeDoPet);
                    gato.print();
                    player.getPets().add(gato);
                }
                case 3 -> {
                    Pinguim pingu = new Pinguim(nomeDoPet);
                    pingu.print();
                    player.getPets().add(pingu);
                }
                default -> {
                    System.out.println("invalido");
                    continue;
                }
            }
            scanner.nextLine();
            //Pet petAtual = player.getPets().get(player.getPets().size()-1); //seleciona pet que foi adicionado na jogada mais recente
            Pet petAtual = pets.get(pets.size()-1);
            while(petAtual.estaVivo()){ //cada iteracao é um turno
                System.out.println();
                //TODO ITERACAO PET ATUAL
                /*NOVO TURNO*/
                SetaAtributos.newTurnStats(petAtual);
                //TODO acoes do jogador
                System.out.println("escolha o que fazer:\n"+
                        "0. nada\n" +
                        "1. brincar\n" +
                        "2. limpar\n" +
                        "3. medicar\n" +
                        "4. alimentar");
                switch (scanner.nextInt()){
                    case 0 -> {}
                    case 1 -> petAtual.brincar();
                    case 2 -> {
                        System.out.println("TODO");
                        petAtual.limpar();
                    }
                    case 3 -> {
                        System.out.println("TODO");
                        petAtual.medicar();
                    }
                    case 4 -> petAtual.alimentar();
                    default -> System.out.println("voce nao fez nada");
                }
                scanner.nextLine();
                //FIM ACOES DO JOGADOR
                /*FIM DO TURNO*/
                SetaAtributos.endTurn(petAtual);
            }
            System.out.println("é o fim de "+ petAtual.getNome() + ". RIP ;-;\n");
            System.out.println("GAME OVER\n\n");
            System.out.println(player.getPets().get(0).getNome());
            System.out.println("jogar novamente? 0: não, 1: sim");
            if(scanner.nextInt() == 0) jogarNovamente = false;
        }    
        scanner.close();
    }
    static Pet buscaNomePet(List<Pet> pets){
        System.out.println("Digite o nome do pet:");
        String nomePet = scanner.nextLine();
        scanner.nextLine();
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
