public class Pinguim extends Pet implements Aquatico{

    public Pinguim(String nome) {
        super(nome);
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
