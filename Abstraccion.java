/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstraccion;

import ClasesEquipo.BayernMunich;
import ClasesEquipo.ManchesterCity;
import ClasesEquipo.RealMadrid;

/**
 *
 * @author comp
 */
public class Abstraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RealMadrid RM = new RealMadrid ();
        ManchesterCity MC = new ManchesterCity ();
        BayernMunich BM = new BayernMunich();
        
        System.out.println(RM.getEquipo());
        System.out.println(RM.getCapitan());
        System.out.println(RM.getPresidente());
        
        System.out.println(MC.getEquipo());
        System.out.println(MC.getCapitan());
        System.out.println(MC.getPresidente());
        
        System.out.println(BM.getEquipo());
        System.out.println(BM.getCapitan());
        System.out.println(BM.getPresidente());
    }
    
}
