package pets.Turno;

import pets.Pet;
import static pets.Const.Constantes.*;
public class FimDeTurnoTestes {
    public static void testeFome(Pet pet){
        if(pet.getFome() >= FOME_FAMINTO){
            System.out.println("pet esta faminto");
            pet.setVida(pet.getVida() + DANO);
        }else
            System.out.println("o pet esta satisfeito com a barriga relativamente cheia");
    }

    public static void testeFelicidade(Pet pet){
        if(pet.getFelicidade() >= FELIC_FELIZ){ //felicidade acima do mínimo de felicidade
            System.out.println("pet esta feliz");
            //50% de chance de regen DANO/2
            if(Chance.testarChance(.5) && pet.getVida() <= (VIDA_MAX + DANO/2)){
                //true o pet regenera DANO/2
                pet.setVida(pet.getVida() - DANO/2);
            }
        }
        else if(pet.getFelicidade() <= FELIC_INFELIZ){ //felicidade abaixo do mínimo de felicidade
            System.out.println("pet esta INfeliz");
            if(Chance.testarChance(.5)){
                //true o pet recebe DANO/2
                pet.setVida(pet.getVida() + DANO/2);
            }
        } else System.out.println("o pet está com humor médio. nem feliz, nem infeliz.");
    }
    public static void testeLimpeza(Pet pet){
        //TODO Se limpeza <= 45, o pet está sujo e e pode adoecer com probabilidade de 30%.
    }
    public static void testeDoente(Pet pet){
        //TODO Se doente, o pet tem 10% de chance de morrer ao fim do turno.
    }
    public static void testeVelhice(Pet pet){
        //TODO  O pet pode morrer de velhice caso o atributo idade seja alto o suficiente: maior que 15 turnos.

    }
}
