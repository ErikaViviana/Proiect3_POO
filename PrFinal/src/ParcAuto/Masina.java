package ParcAuto;

public class Masina {
    private String denumire; // Campuri care asigura incapsularea unei entitati\concept
    private String culoare;  //si reprezinta un tip de data definit de utilizator ,
    private	int putere;	// asgiura o descriere a unui concept. Acestea reprezentand
    private int pret ;

    public Masina (String denumire, String culoare,int putere, int pret)
    {
        //constructor care initializeaza campurile clasei
        this.denumire = denumire; // referinta obiectelor curente
        this.culoare = culoare;
        this.putere = putere;
        this.pret = pret;
    }

    //creste pretul cu o anumita valoarea introdusa de la tastatura
    public void scumpire(int sold)
    {
        pret += sold;
    }
    //scade pretul cu o anumita valoare introdusa de la tastatura
    public void ieftinire(int sold)
    {
        pret -=sold;
    }
    // da pretul in functie de putere
    public	void pretconfing(int putere)
    {
        if(putere > 100)
            pret = 35000;
        else
            pret = 25000;
    }
    //incapsularea presupune ascunderea datelor unui obiect pentru asta folosindu-se metode publice de get(retruneaza valoarea unei date private) si set(atribuie o data privata la o anumita valoare)
    public String getDenumire()
    {
        return this.denumire;
    }
    public String getCuloare()
    {
        return this.culoare;
    }
    public int getPret()
    {
        return this.pret;
    }
    public int getPutere()
    {
        return this.putere;
    }
    public void setDenumire(String denumire)
    {
        this.denumire = denumire;
    }
    public void setCuloare(String culoare)
    {
        this.culoare = culoare;
    }
    public void setPret(int pret)
    {
        this.pret = pret;
    }
    public void setPutere(int putere)
    {
        this.putere = putere;
    }
    public String toString()
    {
        pretconfing(putere);
        StringBuffer msg = new StringBuffer();
        msg.append("Denumirea masinii: ");
        msg.append(denumire);
        msg.append("Culoarea masinii: ");
        msg.append(culoare);
        msg.append("Puterea masinii: ");
        msg.append(putere);
        msg.append("Pretul masinii: ");
        msg.append(pret);
        return msg.toString();
    }
}
