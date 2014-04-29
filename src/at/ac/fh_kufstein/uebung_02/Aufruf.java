/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.ac.fh_kufstein.uebung_02;

import at.ac.fh_kufstein.uebung_02.Classes.Auto;
import at.ac.fh_kufstein.uebung_02.Classes.Farbe;
import at.ac.fh_kufstein.uebung_02.Classes.Wasserfahrzeug;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



/**
 *
 * @author paetow
 */
public class Aufruf
{

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) 
    {
        //Aufgabe 4
        
        short auto_reifen = 4; short auto1_ps = 300; short auto_tueren = 5; short auto_airbags = 4;
        Auto auto1 = new Auto (auto_reifen,Farbe.SILVER,auto1_ps,auto_tueren,auto_airbags);
        
        short auto2_ps = 250; 
        Auto auto2 = new Auto (auto_reifen,Farbe.SILVER,auto2_ps,auto_tueren,auto_airbags);
        
       short auto3_ps = 200; 
        Auto auto3 = new Auto (auto_reifen,Farbe.SILVER,auto3_ps,auto_tueren,auto_airbags);
        
        short auto4_ps = 150; 
        Auto auto4 = new Auto (auto_reifen,Farbe.SILVER,auto4_ps,auto_tueren,auto_airbags);
        
        short auto5_ps = 100; 
        Auto auto5 = new Auto (auto_reifen,Farbe.SILVER,auto5_ps,auto_tueren,auto_airbags);
        
        
        List<Auto> Liste = new ArrayList<>();
        
        //Befüllen der Liste in unsortierter Reihenfolge
         System.out.println("//Liste unsortiert");
        Liste.add(auto2);Liste.add(auto5);Liste.add(auto4);Liste.add(auto1);Liste.add(auto3);
            for (Auto Car:Liste)System.out.println(Car);
            
        
        //sortieren der Arrayliste
        Collections.sort(Liste);
        
        System.out.println("//Liste nach Sortierung");
        for (Auto Car:Liste)System.out.println(Car);
        
        
        System.out.println("//Ende Aufgabe 4");
        
        
        //Aufgabe 5
        short bmw_reifen = 4; short bmw_ps = 220; short bmw_tueren = 5; short bmw_airbags = 4;
        Auto Bmw = new Auto (bmw_reifen,Farbe.SILVER,bmw_ps,bmw_tueren,bmw_airbags);
        
        short audi_reifen = 4; short audi_ps = 180; short audi_tueren = 5; short audi_airbags = 8;
        Auto Audi = new Auto (audi_reifen,Farbe.BLACK,audi_ps,audi_tueren,audi_airbags);
        
        short titanic_reifen = 0; short titanic_ps = 5100; short titanic_tueren = 0; double titanic_tiefgang = 10.54; short titanic_schrauben = 3; double titanic_ladung = 100000;
        Wasserfahrzeug titanic = new Wasserfahrzeug (titanic_reifen,Farbe.BLUE,titanic_ps,titanic_tueren,titanic_tiefgang,titanic_schrauben,titanic_ladung);
        
        
       
        String Ausgabe_1 = Bmw.toString();
        String Ausgabe_2 = Audi.toString();
        String Ausgabe_3 = titanic.toString();
        
        System.out.println(Ausgabe_1+ "\n" +Ausgabe_2+ "\n" + Ausgabe_3);
    }
    
}
