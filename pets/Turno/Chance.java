package pets.Turno;

import java.util.Random;

public class Chance {
    public static boolean testarChance(double chance) {
        Random random = new Random();
        return random.nextDouble() < chance; //retorna true se o numero gerador for menor que chance
    }
}
