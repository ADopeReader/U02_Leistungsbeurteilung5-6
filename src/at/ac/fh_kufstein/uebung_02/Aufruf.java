/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.ac.fh_kufstein.uebung_02;

import at.ac.fh_kufstein.uebung_02.Classes.Farbe;
import at.ac.fh_kufstein.uebung_02.Classes.Wasserfahrzeug;
import at.ac.fh_kufstein.uebung_02.Classes.Auto;



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
        short bmw_reifen = 4; short bmw_ps = 220; short bmw_tueren = 5; short bmw_airbags = 4;
        Auto Bmw = new Auto (bmw_reifen,Farbe.SILVER,bmw_ps,bmw_tueren,bmw_airbags);
        
        short audi_reifen = 4; short audi_ps = 180; short audi_tueren = 5; short audi_airbags = 8;
        Auto Audi = new Auto (audi_reifen,Farbe.BLACK,audi_ps,audi_tueren,audi_airbags);
        
        short titanic_reifen = 0; short titanic_ps = 5100; short titanic_tueren = 0; double titanic_tiefgang = 10.54; short titanic_schrauben = 3; double titanic_ladung = 100000;
        Wasserfahrzeug titanic = new Wasserfahrzeug (titanic_reifen,Farbe.BLUE,titanic_ps,titanic_tueren,titanic_tiefgang,titanic_schrauben,titanic_ladung);
    }
    
}
