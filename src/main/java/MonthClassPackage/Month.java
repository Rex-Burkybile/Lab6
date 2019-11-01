/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonthClassPackage;

import java.util.Arrays;

/**
 *
 * @author Rex Burkybile
 */
public class Month {
    int monthNumber;
    
    String[] monthName = { "Filler in the array", "January", "Februry", "March",
            "April", "May", "June", "July", "August", "September",
            "October", "November", "December"};
    
    public Month() {
        int monthNumber=1;
    }
    
    public Month(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            this.monthNumber = 1;
        }
        else {
            this.monthNumber = monthNumber;
        }    
    }
    
    public Month(String monthName) {
        monthNumber = monthName.indexOf(monthName);
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
        if (monthNumber < 1 || monthNumber > 12) {
            this.monthNumber = 1;
        }
        else {
            this.monthNumber = monthNumber;
        }    
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String[] getMonthName() {
        return monthName;
    }

    @Override
    public String toString() {
        return "Month{" + "monthNumber=" + monthNumber + ", monthName=" + monthName[monthNumber] + '}';
    }

    
    public boolean equals(Month month, int m) {
        
        if (this.monthNumber == (m)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean greaterThan(Month month,int m) {
        
        if (this.monthNumber > (m)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean lessThan(Month month, int m) {
       
        if (this.monthNumber < (m)) {
            return true;
        }
        else {
            return false;
        }
    }
    
}
