public class Cachorro extends Pet implements Terrestre{   
    public Cachorro(String nome) {
        super(nome);
    }

    public void print(){
        System.out.println("             __\n"+
                           "    \\ ______/ V`-,\n"+
                           "     }        /~~\n"+
                           "    /_)^ --,r'\n"+
                           "   |b      |b");
        
    }

    @Override
    public void brincar() {
        // TODO Auto-generated method stub
        this.caminhar();
        throw new UnsupportedOperationException("Unimplemented method 'brincar'");
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
