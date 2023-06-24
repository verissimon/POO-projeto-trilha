package pets;

import static pets.Const.Constantes.*;
import static pets.Turno.Testes.*;

public class Pinguim extends Pet {

    public Pinguim(String nome) {
        super(nome);
    }

    @Override
    public void brincar() {
        System.out.println("voce passou um tempo de qualidade no iglu com " + this.getNome());
        this.setFelicidade(this.getFelicidade() + FELIC_INCREMENTO);
        if(testarChance(BRINCAR_BONUSPROB)){
            this.brincarBonus();
        }
    }

    @Override
    public void alimentar() {
        System.out.println("voce alimentou um peixe para seu pinguim " + this.getNome());
        this.setFome(this.getFome() + FOME_INCREMENTO);
        if(testarChance(FOME_BONUSPROB)){
            this.alimentarBonus();
        }
    }


    public void print(){
        System.out.println("    __\n" +
                           "   ( o`-\n"+
                           "   /  \\\n"+
                           "   |  |\n"+
                           "    ^^ ");
    }
    
    @Override //equivale a brincar
    public void brincarBonus() {
        this.setFelicidade(this.getFelicidade() + FELIC_INCREMENTO/3);
        System.out.println("o pinguin " + this.getNome() + " foi nadar e parece estar muito feliz.");
    }

    @Override //equivale a comer
    public void alimentarBonus() {
        System.out.println("voce alimentou "+ this.getNome() + " com seu fruto do mar favorito");
        this.setFome(this.getFome() + FOME_INCREMENTO/4);
    }

}
