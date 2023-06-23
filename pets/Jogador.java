package pets;

import java.util.List;
import java.util.Objects;

public class Jogador {
    private int pontuacao;
    private List<Pet> pets;
    
    public Jogador(List<Pet> listPets) {
        this.pontuacao = 0;
        this.pets = listPets;
    }
    public int getPontuacao() {
        return pontuacao;
    }
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    public List<Pet> getPets() {
        return pets;
    }
    public void setPet(List<Pet> pets) {
        this.pets = pets;
    }

    public int calcPontuacao(Pet pet){ //retorna pontuacao para um pet
        //TODO calcular pontuacao
    return 0;
    }
    private Pet percorrePet(List<Pet> pets){
        Pet pet = null;
        for (Pet p : pets) {
            //if (Objects.equals(p.getNome(), nomePet)) {
          //      pet = p;
                break;
           // }
        }
        return pet;
    }
}
