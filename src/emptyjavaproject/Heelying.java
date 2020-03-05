/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 * Heelys are slightly faster than walking
 * @author mercy.daniels
 */
public class Heelying implements CanTravel{
 private final double mph = 6;
/**
 * overrides move to account for using heelys
 * @param miles number of miles being traveled
 * @return hours as double
 */
    @Override
    public double move(double miles) {
       
        double hours = (miles / mph);
        double minutes = (hours * 60) % 60;
       


        System.out.println(hours + " " + minutes);
        
        System.out.println("Round Trip!");
        System.out.println("Leaving....");

        for (int i = 0; i < 2; i++) {
            
        

            System.out.println("Train traveling: " + miles + " miles");
            if (hours > 1) {
                System.out.println("It takes: "
                        + hours + " hours and  " + minutes + " minutes.");
            } else if (hours == 1) {
                System.out.println("It takes: " + hours
                        + " hour and " + minutes + " minutes.");
            } else {
                if (minutes <= 1) {
                    System.out.println("It takes: " + minutes + " minute(s).");
                } else {
                    System.out.println("");
                }
            }
            if (i == 0){
            System.out.println("Returning...."); 
            }
        }
        
        System.out.println("Round Trip Time : " + (hours * 2) + 
                " hours and " + (minutes * 2) + " minutes");

    return hours;
    }

    
}
