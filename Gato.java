public class Gato extends Pet implements Terrestre{
    public Gato(String nome) {
        super(nome);
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
    public void comerRacao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comerRacao'");
    }
}
