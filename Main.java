public class Main {
    public static void main(String[] args){
    
        String nomeDoPet = "teste";
        int vidaDoPet = 100;
        int idadeDoPet = 0;
        
        boolean petEstaVivo = false;
        if(vidaDoPet > 0) petEstaVivo = true;
        
        System.out.print("o pet se chama " + nomeDoPet);
        
        if(petEstaVivo) System.out.print(", está vivo");
        else System.out.print(", está morto");
        
        System.out.print(", e completou " + idadeDoPet + " semanas de idade.\n");
    }
}
