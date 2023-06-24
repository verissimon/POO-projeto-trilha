package pets;

import static pets.Const.Constantes.*;
import static pets.Turno.Testes.*;

public class Gato extends Pet{
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void brincar() {
        System.out.println("voce brincou de pescaria com seu gato " + this.getNome());
        this.setFelicidade(this.getFelicidade() + FELIC_INCREMENTO);
        if(testarChance(BRINCAR_BONUSPROB)){
            this.brincarBonus();
        }
    }

    @Override
    public void alimentar() {
        System.out.println("voce alimentou seu gato "+ this.getNome());
        this.setFome(this.getFome() + FOME_INCREMENTO);
        if(testarChance(FOME_BONUSPROB)){
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
        this.setFome(this.getFome() + FOME_INCREMENTO/4);
    }
}
