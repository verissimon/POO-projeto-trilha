package pets;

import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import pets.Turno.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        List<Pet> pets = new ArrayList<>();
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
                    pets.add(dog);
                }
                case 2 -> {
                    Gato gato = new Gato(nomeDoPet);
                    gato.print();
                    pets.add(gato);
                }
                case 3 -> {
                    Pinguim pingu = new Pinguim(nomeDoPet);
                    pingu.print();
                    pets.add(pingu);
                }
                default -> {
                    System.out.println("invalido");
                    continue;
                }
            }
            scanner.nextLine();
            Pet petAtual = pets.get(pets.size()-1); //seleciona pet que foi adicionado na jogada mais recente
            while(petAtual.estaVivo()){ //cada iteracao é um turno
                System.out.println();
                //TODO ITERACAO PET ATUAL
                /*NOVO TURNO*/
                SetaAtributos.newTurnStats(petAtual);
                //TODO acoes do jogador

                //FIM ACOES DO JOGADOR
                /*FIM DO TURNO*/
                SetaAtributos.endTurn(petAtual);
            }
            System.out.println("é o fim de "+ petAtual.getNome() + ". RIP ;-;\n");
            System.out.println("GAME OVER\n\n");
            
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