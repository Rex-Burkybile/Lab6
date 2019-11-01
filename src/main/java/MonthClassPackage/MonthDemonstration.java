/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonthClassPackage;

/**
 *
 * @author Rex Burkybile
 */
public class MonthDemonstration {
    public static void main(String[] args) {
        int m = 5;
        
        Month month = new Month(5);
        
        System.out.println(month.toString());
        
        if (month.monthNumber == (m)) {
            System.out.println(month.monthName[month.monthNumber] + " and m are equal to each other");
        } 
        else if (month.monthNumber > (m)){
            System.out.println(month.monthName[month.monthNumber] + " is greater than m");
        }
        else if (month.monthNumber < (m)){
            System.out.println(month.monthName[month.monthNumber] + " is less than m");
        }
    }
}
