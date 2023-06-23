package pets;

import static pets.Const.Constantes.*;
import static pets.Turno.Testes.testeBrincaBonus;
public class Gato extends Pet implements Terrestre{
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void brincar() {
        System.out.println("voce brincou de pescar com seu gato " + this.getNome());
        this.setFelicidade(this.getFelicidade() + FELIC_INCREMENTO);
        if(testeBrincaBonus()){
            this.setFelicidade(this.getFelicidade() + FELIC_INCREMENTO/3);
            System.out.println("o bicho ronronou de felicidade :)");
        }
        if(this.getFelicidade() >= 100) this.setFelicidade(FELIC_MAX);
    }

    @Override
    public void alimentar() {

    }


    public void print(){
        System.out.println();
        System.out.println("      |\\__/,|   (`\\\n"+
                           "      |o o  |__ _)\n"+
                           "    _.( T   )  `  /\n"+
                           "   ((_ `^--' /_<  \\\n"+
                           "   `` `-'(((/  (((/");
        
    }

    @Override
    public void caminhar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'caminhar'");
    }

    @Override
    public void alimentarPetisco() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comerRacao'");
    }
}
