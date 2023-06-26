package pets.Const;
public final class Constantes {

    private Constantes(){} //previne criação de instancias

    public static final int DANO = -10;             //dano padrão = -20
    public static final int ATT_FOME = 15, ATT_LIMPEZA = -10, ATT_FELICIDADE = -10; //variaveis que atualizam os status no inicio de cada turno
    //incrementos aos status de acordo com a açao do jogador
    public static final int LIMP_INCREMENTO = 30;
    public static final int FELIC_INCREMENTO = 30;
    public static final int FOME_INCREMENTO = -40;
    //valores maximos e minimos para parametros
    public static final int LIMP_MAX = 100;
    public static final int FOME_MAX = 100;
    public static final int VIDA_MAX = 100;
    public static final int FELIC_MAX = 100;
    public static final int FOME_MIN = 0;
    public static final int LIMP_MIN = 0;
    public static final int FELIC_MIN = 0;
    public static final int VIDA_MORTO = 0;        //se vida <= 0, o pet está morto
    public static final int FELIC_FELIZ = 70;      //Se felicidade >= 70, o pet está feliz
    public static final int FELIC_INFELIZ = 40;    //Se felicidade <= 40, o pet está infeliz
    public static final int FOME_FAMINTO = 70;     //Se fome >= 70, o pet está com fome 
    public static final int LIMP_SUJO = 45;        //Se limpeza <= 45, o pet está sujo
    //probabilidades
    public static final double PROB_REGEN = .5;
    public static final double PROB_MORTEVELHICE = .35;
    public static final double PROB_MEDIC_CURA = .40;
    public static final double PROB_DEGEN = .5;
    public static final double PROB_DOENTE = .3;
    public static final double FOME_BONUSPROB = .3;
    public static final double BRINCAR_BONUSPROB = .35;
    public static final double PROB_DOENTEMORTE = .20;
    public static final int IDADE_IDOSO = 15;      //Se idade >= 15, o pet está velho
}
