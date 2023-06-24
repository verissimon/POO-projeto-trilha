package pets;

import java.util.List;
import java.util.ArrayList;

public class Jogador {
    private List<Pet> pets;
    
    public Jogador(List<Pet> listPets) {
        this.pets = listPets;
    }

    public List<Pet> getPets() {
        return pets;
    }
    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public int calcPontuacao(Pet pet){ //retorna pontuacao para um pet
        return pet.getIdade()*100
                + pet.getLimpeza()*10
                + pet.getFelicidade()*10
                - pet.getFome()*10;
    }
    //classe sobrecarregada
    public int calcPontuacao(List<Pet> pets, int index){ //retorna pontuacao para um pet dada ArrayList e indice
        return pets.get(index).getIdade()*100
                + pets.get(index).getLimpeza()*10
                + pets.get(index).getFelicidade()*10
                - pets.get(index).getFome()*10;
    }
}
