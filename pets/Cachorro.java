package pets;

import static pets.Const.Constantes.*;
import static pets.Turno.Testes.*;

public class Cachorro extends Pet{
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void brincar() {
        System.out.println("voce brincou com seu dog " + this.getNome());
        this.setFelicidade(this.getFelicidade() + FELIC_INCREMENTO);
        if(testeBrincaBonus()){
            this.brincarBonus();
        }
    }

    @Override
    public void alimentar() {
        System.out.println("voce alimentou seu dog "+ this.getNome());
        this.setFome(this.getFome() + FOME_INCREMENTO);
        if(testeFomeBonus()){
            this.alimentarBonus();
        }
        if(this.getFome() <= FOME_MIN) this.setFome(FOME_MIN);
    }

    public void print(){
        System.out.println("             __\n"+
                           "    \\ ______/ V`-,\n"+
                           "     }        /~~\n"+
                           "    /_)^ --,r'\n"+
                           "   |b      |b");
        
    }

    @Override
    public void brincarBonus() {
        this.setFelicidade(this.getFelicidade() + FELIC_INCREMENTO/3);
        System.out.println(this.getNome() + " te arrastou pra passear e a caminhada o deixou extremamente feliz :)");
    }

    @Override
    public void alimentarBonus() {
        System.out.println("voce alimentou "+ this.getNome() + " com seu petisco favorito");
        this.setFome(this.getFome() + FOME_INCREMENTO/4);
    }


}
