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
public class Walking implements CanTravel {

    private final double mph = 5.5;

    @Override
    public double move(double miles) {
        double minutes = (miles / mph);
        int hourCount = 0;
        for (int i = 0; i <= minutes; i++) {
            if (minutes > 60) {
                hourCount++;
                minutes = minutes - 60;
            }
        }
        
        System.out.println("Round Trip!");
        System.out.println("Leaving....");

        for (int i = 0; i < 2; i++) {
            
        

            System.out.println("Person walking: " + miles + " miles");
            if (hourCount > 1) {
                System.out.println("It takes: "
                        + hourCount + " hours and  " + minutes + " minutes.");
            } else if (hourCount == 1) {
                System.out.println("It takes: " + hourCount
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
        
        System.out.println("Round Trip Time : " + (hourCount * 2) + 
                " hours and " + (minutes * 2) + " minutes");

        return minutes;
    }

}
