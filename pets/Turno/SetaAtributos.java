package pets.Turno;
import pets.Pet;
public class NovoTurno {
    private static final int ATT_FOME = 15, ATT_LIMPEZA = -15, ATT_FELICIDADE = -10;
    public static void atualizaStatus(Pet pet){
        pet.setFome(pet.getFome()+ATT_FOME);
        pet.setLimpeza(pet.getLimpeza()+ATT_LIMPEZA);
        pet.setFelicidade(pet.getFelicidade()+ATT_FELICIDADE);
        pet.estaVivo();
    }
}
