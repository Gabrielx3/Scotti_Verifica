package gioco.personaggi;

public class Guerriero extends Personaggio{
    public Guerriero(String nome,int livello,int puntiVita){
        super(nome, livello, puntiVita);
    }
    @Override
    public void attacca(){
        System.out.println(getNome()+"ha usato la spada");

    }
    @Override
    public void difendi(){
        System.out.println(getNome()+"si è difeso con lo scudo");
    }



}   


