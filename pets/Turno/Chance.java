package pets.Turno;

import java.util.Random;

public class Testes {
    public static boolean testarChance(double chance) {
        Random random = new Random();
        return random.nextDouble()*100 < chance;
    }

    
}
