package pets.Turno;

import pets.Pet;
import static pets.Const.Constantes.*;
import static pets.Turno.Chance.*;
public class Testes {
    public static boolean testeFome(Pet pet){
        //esta com fome
        return pet.getFome() >= FOME_FAMINTO;
    }
    public static boolean testeFelicidade(Pet pet){
        return pet.getFelicidade() >= FELIC_INFELIZ; //retorna false se infeliz: felicidade <= 40
    }
    public static boolean testeRegen(Pet pet){
            //para regenerar, o pet deve passar no teste e ter felicidade >= 70
            return testarChance(PROB_REGEN) && (pet.getFelicidade() >= FELIC_FELIZ);
    }
    public static boolean testeDegen(){
        return testarChance(PROB_DEGEN);
    }
    public static boolean testeLimpeza(Pet pet){
        //true se pet estiver sujo (limpeza <= 45)
        return pet.getLimpeza() <= LIMP_SUJO;
    }
    public static boolean testeAdoeceu(){
        return testarChance(PROB_DOENTE);
    }
    public static boolean testeDoenteMorte(){
        //Se doente, o pet tem 10% de chance de morrer ao fim do turno.
        return testarChance(PROB_DOENTEMORTE);
    }
    public static boolean testeVelhiceMorte(){ //associado a morte natural
        //O pet pode morrer de velhice caso o atributo idade seja alto o suficiente: maior que 15 turnos.
        return testarChance(PROB_MORTEVELHICE);
    }
}
