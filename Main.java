import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        List<Pet> pets = new ArrayList<>();
        boolean jogarNovamente = true;
        
        while(jogarNovamente){
            boolean petEstaVivo = true;
            int idadeDoPet = 0;
            //inicio do jogo: definicao de especie e nome do pet
            //scan do nome
            System.out.println("insira o nome do pet:");
            String nomeDoPet = scanner.nextLine();

            System.out.println("Escolha a especie do seu pet: (0 para sair, 1 Cachorro, 2 Gato, 3 Pinguim)");
            //scan da especie
            switch (scanner.nextInt()){
                case 0: System.exit(0);
                case 1: 
                    Cachorro dog = new Cachorro(nomeDoPet);
                    dog.print();
                    pets.add(dog);
                    break;
                case 2:
                    Gato gato = new Gato(nomeDoPet);
                    gato.print();
                    pets.add(gato);
                    break;
                case 3:
                    Pinguim pingu = new Pinguim(nomeDoPet);
                    pingu.print();
                    pets.add(pingu);
                    break;
                default: System.out.println("invalido"); continue;
            }
            scanner.nextLine();
            Pet petAtual = pets.get(pets.size()-1);
            while(petAtual.estaVivo()){ //cada iteracao é um turno
                //TODO ITERACAO PET ATUAL
                System.out.print("o pet se chama " + petAtual.getNome());

                idadeDoPet++;
                if(petEstaVivo) System.out.print(", está vivo");
                else System.out.print(", está morto");
                System.out.print(", e completou " + idadeDoPet + " semanas de idade.\n");
            }
            
            
            System.out.println("jogar novamente? 0: não, 1: sim");
            if(scanner.nextInt() == 0) System.exit(0);
        }    
        scanner.close();
    }
    static Pet buscaNomePet(List<Pet> pets){
        System.out.println("Digite o nome do pet:");
        String nomePet = scanner.nextLine();
        scanner.nextLine();
        Pet pet = null;
        for (Pet p : pets) {
            if (p.getNome() == nomePet) {
                pet = p;
                break;
            }
        }
        return pet;
    }
}
