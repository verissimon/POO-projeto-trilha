package pets;

import static pets.Const.Constantes.*;

public class Gato extends Pet{
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void brincar() {
        System.out.println("voce brincou de pescaria com seu gato " + this.getNome());
        super.brincar();
    }

    @Override
    public void alimentar() {
        System.out.println("voce alimentou seu gato "+ this.getNome());
        super.alimentar();
    }


    public void print(){
        if(this.isVivo()){
        System.out.println();
        System.out.println("      |\\__/,|   (`\\\n"+
                           "      |o o  |__ _)\n"+
                           "    _.( T   )  `  /\n"+
                           "   ((_ `^--' /_<  \\\n"+
                           "   `` `-'(((/  (((/");
        }
        else{
        System.out.println();
        System.out.println("      |\\__/,|   (`\\\n"+
                           "      |x x  |__ _)\n"+
                           "    _.( T   )  `  /\n"+
                           "   ((_ `^--' /_<  \\\n"+
                           "   `` `-'(((/  (((/");
        }
    }

    @Override
    public void brincarBonus() {
        System.out.println("o gatinho ronronou de felicidade :)");
        this.setFelicidade(this.getFelicidade() + FELIC_INCREMENTO/3);
    }

    @Override
    public void alimentarBonus() {
        System.out.println("voce alimentou "+ this.getNome() + " com sua comida de gato favorita");
        this.setFome(this.getFome() + FOME_INCREMENTO/4);
    }
}
