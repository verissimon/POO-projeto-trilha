package pets;

import static pets.Const.Constantes.*;

public class Cachorro extends Pet{
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void brincar() {
        System.out.println("voce brincou com seu dog " + this.getNome());
        super.brincar();
    }

    @Override
    public void alimentar() {
        System.out.println("voce alimentou seu dog "+ this.getNome());
        super.alimentar();
    }

    public void print(){
        if(this.estaVivo())
        System.out.println("             __\n"+
                           "    \\ ______/ Vo-,\n"+
                           "     }        /~~\n"+
                           "    /_)^ --,r'\n"+
                           "   |b      |b");
        else
        System.out.println("             __\n"+
                           "    \\ ______/ Vx-,\n"+
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
