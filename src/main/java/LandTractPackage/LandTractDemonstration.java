/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LandTractPackage;

import java.util.Scanner;

/**
 *
 * @author Rex Burkybile
 */
public class LandTractDemonstration {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        LandTract landTrack1 = new LandTract();
        LandTract landTrack2 = new LandTract();
        
        
        
        double area1 = landTrack1.Area();
        double area2 = landTrack2.Area();
        
        
        System.out.println("First land track: " + landTrack1.toString());
        System.out.println("Second land track: " + landTrack2.toString());
        
        if (landTrack2.equals(landTrack1)) {
            System.out.println("Both areas are the same.");
        }
        else
          System.out.println("The areas are different.");
    }

}
