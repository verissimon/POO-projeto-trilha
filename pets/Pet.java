package pets;
public abstract class Pet {
    private final String nome;
    private int vida;
    private int idade;
    private boolean doente;
    private int fome;
    private int felicidade;
    private int limpeza;
    
    public Pet(String nome){
        this.nome = nome;
        //valores inciais padrao = 100
        this.vida = 100;
        this.idade = 0;
        this.doente = false;
        this.fome = 0;
        this.felicidade = 100;
        this.limpeza = 100;
    }
    public boolean isDoente() {
        return doente;
    }
    public void setDoente(boolean doente) {
        this.doente = doente;
    }
    public String getNome() {
        return nome;
    }
    public int getVida() {
        return vida;
    }
    public int getIdade() {
        return idade;
    }
    public int getFome() {
        return fome;
    }
    public void setVida(int vida){ this.vida = vida;}
    public void setIdade(int idade){ this.idade = idade;}
    public void setFome(int fome) {
        this.fome = fome;
    }
    public int getFelicidade() {
        return felicidade;
    }
    public void setFelicidade(int felicidade) {
        this.felicidade = felicidade;
    }
    public int getLimpeza() {
        return limpeza;
    }
    public void setLimpeza(int limpeza) {
        this.limpeza = limpeza;
    }

    public boolean estaVivo(){
        return this.vida > 0;
    }
    public void tomaDano(int dano){
        if(this.estaVivo()) {
            this.vida += dano;
        }
    }

    public abstract void brincar();
    public abstract void alimentar();
    public void limpar(){
        //TODO limpar
    }
    public void medicar(){
        //todo limpar
    }
}