package com.example.project;

import java.text.DecimalFormat;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here
        
        double totalTip = ((double)percent*0.01)*cost;
        DecimalFormat df = new DecimalFormat("#.##");      
        
        double totalBill = cost+totalTip;
        double perPersonBeforeTip = cost/people;
        double tipPerPerson = totalTip/people;
        double perPersonTotalCost = totalBill/people;  
        totalTip = Double.valueOf(df.format(totalTip)); // I learned how to round from here: https://stackoverflow.com/questions/2808535/round-a-double-to-2-decimal-places
        totalBill = Double.valueOf(df.format(totalBill));
        perPersonBeforeTip = Double.valueOf(df.format(perPersonBeforeTip));
        tipPerPerson = Double.valueOf(df.format(tipPerPerson));
        perPersonTotalCost = Double.valueOf(df.format(perPersonTotalCost));              
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $"+cost+"\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: "+percent+"%\n");
        result.append("Total tip: $"+totalTip+"\n");
        result.append("Total Bill with tip: $"+totalBill+"\n");
        result.append("Per person cost before tip: $"+perPersonBeforeTip+"\n");
        result.append("Tip per person: $"+tipPerPerson+"\n");
        result.append("Total cost per person: $"+perPersonTotalCost+"\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12; 
        int percent = 15;
        double cost = 566.97;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
