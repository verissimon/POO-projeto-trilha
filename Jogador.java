import pets.Pet;
public class Jogador {
    private int pontuacao;
    private Pet pet;
    
    public Jogador(Pet pet) {
        this.pontuacao = 0;
        this.pet = pet;
    }
    public int getPontuacao() {
        return pontuacao;
    }
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    public Pet getPet() {
        return pet;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void calcPontuacao(){
        //TODO calcular pontuacao
    }
}
