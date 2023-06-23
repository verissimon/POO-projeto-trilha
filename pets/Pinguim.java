package pets;

import static pets.Const.Constantes.*;
import static pets.Turno.Testes.testeBrincaBonus;
import static pets.Turno.Testes.testeFomeBonus;

public class Pinguim extends Pet implements Aquatico{

    public Pinguim(String nome) {
        super(nome);
    }

    @Override
    public void brincar() {
        System.out.println("voce passou um tempo de qualidade no iglu com " + this.getNome());
        this.setFelicidade(this.getFelicidade() + FELIC_INCREMENTO);
        if(testeBrincaBonus()){
            this.nadar();
        }
        if(this.getFelicidade() >= 100) this.setFelicidade(FELIC_MAX);
    }

    @Override
    public void alimentar() {
        System.out.println("voce alimentou um peixe para seu pinguim " + this.getNome());
        this.setFome(this.getFome() + FOME_INCREMENTO);
        if(testeFomeBonus()){
            this.comerFrutoDoMar();
        }
        if(this.getFome() >= 100) this.setFelicidade(FELIC_MAX);
    }


    public void print(){
        System.out.println("    __\n" +
                           "   ( o`-\n"+
                           "   /  \\\n"+
                           "   |  |\n"+
                           "    ^^ ");
    }
    
    @Override //equivale a brincar
    public void nadar() {
        this.setFelicidade(this.getFelicidade() + FELIC_INCREMENTO/3);
        System.out.println("o pinguin " + this.getNome() + " foi nadar e parece estar muito feliz.");
    }

    //equivale a comer
    public void comerFrutoDoMar() {
        System.out.println("voce alimentou "+ this.getNome() + " com seu fruto do mar favorito");
        this.setFome(this.getFome() - FOME_INCREMENTO/4);
    }

}
