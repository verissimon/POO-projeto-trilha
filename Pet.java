public abstract class Pet{
    private String nome;
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
        if(this.vida <= 0){
            return false;
        }
        if(this.idade >= 20){
            return false;
        }
        return true;
    }
    //TODO metodos para brincar alimentar limpar
    public abstract void brincar();
    //public abstract void alimentar();
    //public abstract void limpar();
    //public abstract void medicar();
}