/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.ac.fh_kufstein.uebung_02.Classes;

/**
 *
 * @author paetow
 */
public class Fahrzeug

    {
    private short Reifen;
    private Farbe Colour;
    private short PS;
    private short Tueren;
    private boolean Gestartet;
    private short Geschwindigkeit;
    public static int Anzahl;

    public Fahrzeug(short Reifen, Farbe Colour, short PS, short Tueren)
    {
        this.Reifen = Reifen;
        this.Colour = Farbe.BLACK;
        this.Colour = Colour;
        this.PS = PS;
        this.Tueren = Tueren;
        this.Gestartet = false;
        
    }

 
    void starten(){Gestartet = true;}
    void stoppen(){Gestartet = false;}
    void beschleunigen(short geschwindigkeit)
    {
        if (Gestartet = true){
        Geschwindigkeit += geschwindigkeit;
        if (Geschwindigkeit > 250){Geschwindigkeit = 250;} 
        else 
        {System.out.println("Das Auto ist nicht gestartet");}
        }
        
    }
    
    void bremsen(short geschwindigkeit)
    {
     if (Gestartet = true){
        Geschwindigkeit -= geschwindigkeit;
        if (Geschwindigkeit < 0){Geschwindigkeit = 0;} 
        else 
        {System.out.println("Das Auto ist nicht gestartet");}
        }
    }

    public short getReifen()
    {
        return Reifen;
    }

    public void setReifen(short Reifen)
    {
        this.Reifen = Reifen;
    }

    
     public Farbe getFarbe()
    {
        return Colour;
    }

    public void setFarbe(Farbe Colour)
    {
        this.Colour = Colour;
    }

    public short getPS()
    {
        return PS;
    }

    public void setPS(short PS)
    {
        this.PS = PS;
    }

    public short getTueren()
    {
        return Tueren;
    }

    public void setTueren(short Tueren)
    {
        this.Tueren = Tueren;
    }

    public boolean isGestartet()
    {
        return Gestartet;
    }

    public void setGestartet(boolean Gestartet)
    {
        this.Gestartet = Gestartet;
    }

    public short getGeschwindigkeit()
    {
        return Geschwindigkeit;
    }

    public void setGeschwindigkeit(short Geschwindigkeit)
    {
        this.Geschwindigkeit = Geschwindigkeit;
    }

    public int getAnzahl()
    {
        return Anzahl;
    }

    public void setAnzahl(int Anzahl)
    {
        Fahrzeug.Anzahl = Anzahl;
    }
    
    
    
  
}

