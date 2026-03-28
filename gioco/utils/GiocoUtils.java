package gioco.utils;

import gioco.personaggi.Personaggio;


public class GiocoUtils {
    public static void  stampaStatus(Personaggio p){
        System.out.println("tipo: "+p.getClass().getSimpleName()+" nome: "+p.getNome()+" livello: "+p.getLivello()+" punti vita: "+p.getPuntivita());
    }

    



}
