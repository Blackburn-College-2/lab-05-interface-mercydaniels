/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 *
 * @author mercy.daniels
 */
public class Walking implements CanTravel{
    private final double mph = 5.5;
   
    @Override
    public double move(double miles) {
        double minutes = (miles/mph)/60;
        System.out.println("Round Trip!");
        System.out.println("Leaving....");
        System.out.println("It takes: " + minutes + " hours");
        
    }

    @Override
    public double time() {
        
    }
    
}
