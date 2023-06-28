package pets;

import static pets.Const.Constantes.*;

public class Pinguim extends Pet {

    public Pinguim(String nome) {
        super(nome);
    }

    @Override
    public void brincar() {
        System.out.println("voce passou um tempo de qualidade no iglu com " + this.getNome());
        super.brincar();
    }

    @Override
    public void alimentar() {
        System.out.println("voce alimentou um peixe para seu pinguim " + this.getNome());
        super.alimentar();
    }


    public void print(){
        if(this.estaVivo())
            System.out.println("    __\n" +
                           "   ( o`-\n"+
                           "   /  \\\n"+
                           "   |  |\n"+
                           "    ^^ ");
        else
            System.out.println("    __\n" +
                           "   ( x`-\n"+
                           "   /  \\\n"+
                           "   |  |\n"+
                           "    ^^ ");
    }
    
    @Override 
    public void brincarBonus() {
        this.setFelicidade(this.getFelicidade() + FELIC_INCREMENTO/3);
        System.out.println("o pinguin " + this.getNome() + " foi nadar e parece estar muito feliz.");
    }

    @Override 
    public void alimentarBonus() {
        System.out.println("voce alimentou "+ this.getNome() + " com seu fruto do mar favorito");
        this.setFome(this.getFome() + FOME_INCREMENTO/4);
    }
}
