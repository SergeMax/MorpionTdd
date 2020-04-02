package sample.Model;

public class Joueur {

    private String nom;
    private char symbol;

    public Joueur(String nom,char symbol)
    {
        setName(nom);
        setSymbol(symbol);

    }
    public String getNom()
    {
        return nom;
    }

    public void setName(String nom)
    {
        this.nom = nom;
    }

    public char getSymbol()
    {
        return symbol;
    }

    public void setSymbol(char symbol)
    {
        this.symbol = symbol;
    }
}
