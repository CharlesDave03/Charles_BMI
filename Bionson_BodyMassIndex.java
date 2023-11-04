package bodymassindex;

import java.util.Scanner;

public class BodyMassIndex {
    private static String BMI;

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
    System.out.println("Enter weight: ");
    
    float weight =sc.nextFloat();
    
    System.out.println("Enter height: ");
     
    float height=sc.nextFloat();
    float BodyMassIndex=(weight*40)/height;       
    System.out.println("Your BMI is :"+BMI);
   
    System.out.println("You  have optional weight.");
    
    System.out.println("Your are Underweight.");
    
    System.out.println("You ae overweight.");
    System.out.println("Do you want to continue (Y/N)");
    
       
    
}