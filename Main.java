import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean jogarNovamente = true;
        
        var scanner = new Scanner(System.in);
        while(jogarNovamente){
            int vidaDoPet = 100;
            boolean petEstaVivo = true;
            int idadeDoPet = 0;
            // inicio do jogo: definicao de especie e nome do pet
            System.out.println("Escolha a especie do seu pet: (0 para sair, 1 Cachorro, 2 Gato, 3 Pinguim)");
            //scan da especie
            switch (scanner.nextInt()){
                case 0: System.exit(0);
                case 1: 
                    Cachorro dog = new Cachorro();
                    dog.print();
                    break;
                case 2:
                    Gato gato = new Gato();
                    gato.print();
                    break;
                case 3:
                    Pinguim pingu = new Pinguim();
                    pingu.print();
                    break;
                default: System.out.println("invalido"); continue;
            }
            scanner.nextLine();
            //scan do nome
            System.out.println("insira o nome do pet:");
            String nomeDoPet = scanner.nextLine();
            
            while(petEstaVivo){ //cada iteracao é um turno
                System.out.print("o pet se chama " + nomeDoPet);
                if(vidaDoPet > 0) petEstaVivo = true;
                else petEstaVivo = false;
                idadeDoPet++;
                vidaDoPet -= 10;
                if(petEstaVivo) System.out.print(", está vivo");
                else System.out.print(", está morto");
                System.out.print(", e completou " + idadeDoPet + " semanas de idade.\n");

            }
            
            
            System.out.println("jogar novamente? 0: não, 1: sim");
            if(scanner.nextInt() == 0) System.exit(0);
        }    
        scanner.close();
    }
}
