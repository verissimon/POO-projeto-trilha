package pets;

import static pets.Const.Constantes.*;
import static pets.Turno.Testes.testarChance;

public abstract class Pet implements Acoes{
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
    public boolean isDoente() { return doente; }
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
    public void printStats(){
        System.out.println("felicidade de "+this.getNome()+ ": " + this.getFelicidade());
        System.out.println("fome de "+this.getNome()+ ": " + this.getFome());
        System.out.println("limpeza de "+this.getNome()+ ": " + this.getLimpeza());
        System.out.println("idade de "+this.getNome()+ ": " + this.getIdade());
    }
    public void limpar(){
        System.out.println("voce limpou o ambiente que "+ this.getNome() + " vive");
        this.setLimpeza(this.getLimpeza() + LIMP_INCREMENTO);
    }
    public void medicar(){
        if(!this.isDoente()){
            System.out.println("o pet já está saudável");
        } else if(testarChance(PROB_MEDIC_CURA)){
                System.out.println("o pet foi curado de sua doenca");
                this.setDoente(false);
            } else System.out.println("o pet continua doente");
    }
}