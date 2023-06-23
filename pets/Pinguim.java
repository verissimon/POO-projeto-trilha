package pets;

import static pets.Const.Constantes.*;
import static pets.Turno.Testes.testeBrincaBonus;
public class Pinguim extends Pet implements Aquatico{

    public Pinguim(String nome) {
        super(nome);
    }

    @Override
    public void brincar() {
        System.out.println("voce passou um tempo de qualidade no iglu com " + this.getNome());
        this.setFelicidade(this.getFelicidade() + FELIC_INCREMENTO);
        if(testeBrincaBonus()){
            this.setFelicidade(this.getFelicidade() + FELIC_INCREMENTO/3);
            System.out.println("o bicho bateu as asas de felicidade :)");
        }
        if(this.getFelicidade() >= 100) this.setFelicidade(FELIC_MAX);
    }

    @Override
    public void alimentar() {

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nadar'");
    }

    @Override //equivale a comer
    public void comerPeixe() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comerPeixe'");
    }

}
