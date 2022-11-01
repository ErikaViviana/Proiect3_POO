package Gogoasa;

class Gogoasa
{
    private String tip;
    private double gramaj;
    private double pret;
    public final int ADAOS_COMERCIAL=2;

    public Gogoasa()
    {
    }

    public Gogoasa (String tip, double gramaj, double pret)
    {
        this.tip = tip;
        this.gramaj = gramaj;
        this.pret = pret + ADAOS_COMERCIAL;
    }
    //acesta este constructorul care are rol in initierea obiectelor din clasa Gogoasa


    public String toString()
    {
        return "Gogoasa " + this.tip + "  are pretul de " + this.pret + " lei si " + this.gramaj + " grame";
    }
    //metoda afiseaza toate proprietatile obiectului

    public String toStringB(StringBuffer msg){
        msg = new StringBuffer();
        msg.append("Gogoasa");
        msg.append(this.tip);
        msg.append("  are pretul de ");
        msg.append(this.pret);
        msg.append(" lei si ");
        msg.append(this.gramaj);
        msg.append(" grame");
        return msg.toString();
    }

    public String getTip()
    {
        return this.tip;
    }

    public void setTip (String tip)
    {
        this.tip = tip;
    }

    public double getPret()
    {
        return this.pret;
    }

    public void setPret (double pret)
    {
        this.pret = pret;
    }

    public double getGramaj()
    {
        return this.gramaj;
    }

    public void setGramaj (double gramaj)
    {
        this.gramaj = gramaj;
    }
    //metodele set si get ofera acces la campurile private ale	clasei
}