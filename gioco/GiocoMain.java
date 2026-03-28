package gioco;
import gioco.personaggi.Personaggio;
import gioco.utils.GiocoUtils;
import gioco.personaggi.Arciere;
import gioco.personaggi.Mago;
import gioco.personaggi.Guerriero;
import java.util.List;
import java.util.ArrayList;


public class GiocoMain {
    public static void main(String[] args){
    List<Personaggio> personagg= new ArrayList<>();
    personagg.add(new Mago("gabriel", 20, 10));
    personagg.add(new Arciere("Massimo", 270, 1000));
    personagg.add(new Guerriero("Floyd", 670, 777));
        
    
    System.out.println("----------Benvenuti nel gioco-------------");
    for(Personaggio p:personagg){
        GiocoUtils.stampaStatus(p);
        p.attacca();
        p.difendi();
        System.out.println("-------------------------");
    }
    
   

    }
}