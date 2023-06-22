package pets.Const;
public final class Constantes {

    private Constantes(){} //previne criação de instancias

    public static final int ATT_FOME = 20, ATT_LIMPEZA = -15, ATT_FELICIDADE = -15;

    public static final int VIDA_MAX = 100;
    public static final int FELIC_FELIZ = 70;      //Se felicidade >= 70, o pet está feliz
    public static final int FELIC_INFELIZ = 40;    //Se felicidade <= 40, o pet está infeliz
    public static final int FOME_FAMINTO = 70;     //Se fome >= 70, o pet está com fome 
    public static final int LIMP_SUJO = 45;        //Se limpeza <= 45, o pet está sujo
    public static final double PROB_REGEN = .5;
    public static final double PROB_DEGEN = .5;
    public static final double PROB_DOENTE = .3;
    public static final double PROB_DOENTEMORTE = .1;
    public static final int IDADE_IDOSO = 15;      //Se idade >= 15, o pet está velho
    public static final double PROB_MORTEVELHICE = .55;
    public static final int VIDA_MORTO = 0;        //se vida <= 0, o pet está morto
    public static final int DANO = -20;             //dano padrão = -20
    //TODO outras constantes
}
