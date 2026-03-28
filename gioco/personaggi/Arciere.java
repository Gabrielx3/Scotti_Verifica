package gioco.personaggi;

public class Arciere extends Personaggio{
    public Arciere(String nome,int livello,int puntiVita){
        super(nome, livello, puntiVita);
    }
    @Override
    public void attacca(){
        System.out.println(getNome()+"ha usato l'arco");

    }
    @Override
    public void difendi(){
        System.out.println(getNome()+"si è difeso sparando una freccia");
    }



}   

