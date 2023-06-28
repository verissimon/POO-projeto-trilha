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
                    pets.add(dog);
                }
                case "2" -> {
                    Gato gato = new Gato(nomeDoPet);
                    pets.add(gato);
                }
                case "3" -> {
                    Pinguim pingu = new Pinguim(nomeDoPet);
                    player.getPets().add(pingu);
                }
                default -> {
                    System.out.println("invalido");
                    continue;
                }
            }
            //seleciona pet que foi adicionado na jogada mais recente
            Pet petAtual = pets.get(pets.size()-1);
            petAtual.print();

            while(petAtual.estaVivo()){ //cada iteracao é um turno, e se encerra quando o pet morre
                /*NOVO TURNO*/
                SetaAtributos.newTurnStats(petAtual);
                //INICIO ACAO DO JOGADOR 
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
                System.out.println();
            }
            petAtual.print();
            System.out.println("\né o fim de "+ petAtual.getNome() + ". RIP ;-;\n");
            System.out.println("GAME OVER");
            System.out.println("sua pontuacao: " + player.calcPontuacao(pets.indexOf(petAtual)));
            System.out.println("jogar novamente? 1: sim\noutro: nao");

            if(!scanner.nextLine().contentEquals("1")) jogarNovamente = false;
        }

        System.out.println("deseja rever infos de algum pet?\n1. sim\noutro: nao");
        if(scanner.nextLine().contentEquals("1")){
            
            System.out.println("Digite o nome exato do pet:");
            String nomePet = scanner.nextLine();
            Pet petAtual = player.buscaPet(nomePet);
            if(Objects.isNull(petAtual))
                System.out.println("pet nao encontrado");
            else {
                player.revisaPet(petAtual);
            }
        }
        scanner.close();
    }
}
