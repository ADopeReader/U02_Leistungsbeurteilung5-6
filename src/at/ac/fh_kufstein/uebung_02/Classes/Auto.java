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
public class Auto extends Fahrzeug
{

    private boolean Klimaanlage;
    private short Airbags;

    public Auto(short Reifen, Farbe Colour, short PS, short Tueren, short Airbags)
    {
        super(Reifen, Colour, PS, Tueren);
        this.Klimaanlage = false;
        this.Airbags = Airbags;
    }

    void klimaanlageAn()
    {
        if (Klimaanlage == true)
        {
            System.out.println("Die Klimaanlage läuft bereits");
        } else
        {
            Klimaanlage = true;
        }
    }

    void klimaanlageAus()
    {
        if (Klimaanlage == false)
        {
            System.out.println("Die Klimaanlage ist bereits aus");
        } else
        {
            Klimaanlage = false;
        }
    }

    public boolean isKlimaanlage()
    {
        return Klimaanlage;
    }

    public void setKlimaanlage(boolean Klimaanlage)
    {
        this.Klimaanlage = Klimaanlage;
    }

    public short getAirbags()
    {
        return Airbags;
    }

    public void setAirbags(short Airbags)
    {
        this.Airbags = Airbags;
    }

    
 
    
}


