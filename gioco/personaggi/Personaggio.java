package gioco.personaggi;

public  abstract class Personaggio {
    
    private String nome;
    private int livello;
    private int puntiVita;

    public Personaggio(String nome,int livello,int puntiVita){
        this.nome=nome;
        this.livello=livello;
        this.puntiVita=puntiVita;
    }
    public String getNome(){
        return nome;
    }
    public int getLivello(){
        return livello;
    }
    public int getPuntivita(){
        return puntiVita;
    }
    public abstract void attacca();
    public abstract void difendi();
}
