package pets;

import java.util.List;
import java.util.Objects;

public class Jogador {
    private List<Pet> pets; // agregando o tipo Pet
    
    public Jogador(List<Pet> listPets) {
        this.pets = listPets;
    }

    public List<Pet> getPets() {
        return pets;
    }
    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    private int calcPontuacao(Pet pet){ //retorna pontuacao para um pet
        return pet.getIdade()*100
                + pet.getLimpeza()*10
                + pet.getFelicidade()*10
                - pet.getFome()*10;
    }
    //classe sobrecarregada
    public int calcPontuacao(int index){ //retorna pontuacao para um pet dada posicao na lista
        return pets.get(index).getIdade()*100
                + pets.get(index).getLimpeza()*10
                + pets.get(index).getFelicidade()*10
                - pets.get(index).getFome()*10;
    }

    public Pet buscaPet(String nome){
        Pet pet = null;
        for (Pet p : this.pets) {
            if (Objects.equals(p.getNome(), nome)) {
                pet = p;
                break;
            }
        }
        return pet;
    }

    public void revisaPet(Pet pet){
        pet.print();
        System.out.println("o pet "+pet.getNome()+" viveu "+pet.getIdade()+" turnos");
        System.out.println("como tutor, voce pontuou "+this.calcPontuacao(pet)+"pontos");
        System.out.println("no fim, os status eram os seguintes:\n");
        pet.printStats();
    }
}
