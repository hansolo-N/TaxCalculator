/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taxcalculator;

public class TaxCalculator {

    //determines what rebate a person will get on their tax based on their age
    public static int CalculateRebate(int age){
        if( age < 65)
        {
            return 17235;
        }
        else if( age >65 && age <75)
        {
            return 9444;
        }
        //age greater than 75
        return 3145;
        
    }
    
    //method used to determine in which income bracket a tax falls within
    public static double CalculateIncome(int income){

        
        if(1 <= income && income <= 237000){
            return ((income-1) * 0.18);
        }
        else if(237101 <= income && income <= 370500){
            return ((income-237101) * 0.26) + 42678 ;
        }
        else if(370501 <= income && income <= 512800){
            return ((income-370501) * 0.31 + 77362);
        }
        else if(512801 <= income && income <= 673000){
            return ((income-512801) * 0.36)+ 121475;
        }
        else if(673101 <= income && income <= 857900){
            return ((income-673101) * 0.39) + 179147;
        }
        else if(857901 <= income && income <= 1817000){
            return ((income-857901) * 0.41) + 251258;
        }
        
        //income greater than R1817000
        return ((income -181700) * 0.45) + 644489;
    }
    
    //calculates monthly tax by subtracting rebate from taxable income
    public static double CalculateTax(int income , int age){
        
        int rebate = CalculateRebate(age);
        double incomeAfterTax = CalculateIncome(income);
        
        return (incomeAfterTax - rebate)/12;
    }
    

 
    
}

