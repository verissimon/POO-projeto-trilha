package pets.Turno;

import pets.Pet;
import java.util.Random;
import static pets.Const.Constantes.*;

public class Testes {

    public static boolean testarChance(double chance) {
        Random random = new Random();
        return random.nextDouble() < chance; //retorna true se o numero gerador for menor que chance
    }
    public static boolean testeFome(Pet pet) {
        return pet.getFome() >= FOME_FAMINTO;        //esta com fome
    }

    public static boolean testeFelicidade(Pet pet) {
        return pet.getFelicidade() >= FELIC_INFELIZ; //retorna false se infeliz: felicidade <= 40
    }

    public static boolean testeLimpeza(Pet pet) { //true se pet estiver sujo (limpeza <= 45)
        return pet.getLimpeza() < LIMP_SUJO;
    }


}
