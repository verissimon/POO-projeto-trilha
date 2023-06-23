package pets;

import static pets.Const.Constantes.*;
import static pets.Turno.Testes.testeBrincaBonus;
import static pets.Turno.Testes.testeFomeBonus;

public class Gato extends Pet implements Terrestre{
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void brincar() {
        System.out.println("voce brincou de pescaria com seu gato " + this.getNome());
        this.setFelicidade(this.getFelicidade() + FELIC_INCREMENTO);
        if(testeBrincaBonus()){
            this.brincarBonus();
        }
        if(this.getFelicidade() >= 100) this.setFelicidade(FELIC_MAX);
    }

    @Override
    public void alimentar() {
        System.out.println("voce alimentou seu gato "+ this.getNome());
        this.setFome(this.getFome() - FOME_INCREMENTO);
        if(testeFomeBonus()){
            this.alimentarBonus();
        }
        if(this.getFome() <= FOME_MIN) this.setFome(FOME_MIN);
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
    public void brincarBonus() {
        this.setFelicidade(this.getFelicidade() + FELIC_INCREMENTO/3);
        System.out.println("o bicho ronronou de felicidade :)");
    }

    @Override
    public void alimentarBonus() {
        System.out.println("voce alimentou "+ this.getNome() + " com sua comida de gato favorita");
        this.setFome(this.getFome() - FOME_INCREMENTO/4);
    }
}
