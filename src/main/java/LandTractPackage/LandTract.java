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
public class LandTract {
    Scanner keyboard = new Scanner(System.in);
    double length;
    double width;
    double area;

    
    
    public LandTract() {
        System.out.println("Land Track's Length");
        length = keyboard.nextDouble();
        System.out.println("Land Track's Width");
        width = keyboard.nextDouble();
        area = 0.0;
    }

    
    
    public LandTract(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double Area() {
        double area = length * width;
        this.area = area;
        return area;
    }

    public boolean equals(LandTract landTrack1){
        boolean equal;
        if (area == (landTrack1.area)) {
            equal = true;
        }
        else{
            equal = false;
        }
        return equal;
    }

    @Override
    public String toString() {
        return "length is: " + length + " the width is: " + width + " and the area is: " + area + '.';
    }
    
    
    
    
}
