package gioco.personaggi;

public class Mago extends Personaggio{
    
   public Mago(String nome,int livello,int puntiVita){
            super(nome, livello, puntiVita);
    }
    @Override
    public void attacca(){
        System.out.println(getNome()+" ha usato la magia");

    }
    @Override
    public void difendi(){
        System.out.println(getNome()+" si è difeso con la bacchetta");
    }



}   
