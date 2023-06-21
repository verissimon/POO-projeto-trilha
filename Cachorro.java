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

    @Override //equivale a brincar
    public void caminhar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'caminhar'");
    }

    @Override //equivale a comer
    public void comerRacao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comerRacao'");
    }
}
