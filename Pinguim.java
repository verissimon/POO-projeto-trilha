public class Pinguim extends Pet implements Nadador{

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
    @Override
    public void brincar(){
        this.nadar();
    }
    
    @Override
    public void nadar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nadar'");
    }

    @Override
    public void comerPeixe() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comerPeixe'");
    }

}
