/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randompowergen;
import java.util.Random; //Permite criar numero aleatorio

/**
 *
 * @author tulio
 */
public class RandomPowerGen extends Tinker{

    public static void main(String[] args)
    {
       String[]PowerClass = {"Striker", "Blaster", "Shaker", "Mover", "Changer", "Breaker", "Brute", "Tinker", "Stranger", "Master", "Thinker", "Trump"};
       String[]PowerTinkerMethod = {"Hyperspecialist", "Focal", "Libery", "Multithreaded", "Combat", "Chaos", "Resource", "Controller", "Architect", "Mad Scientist", "Magi", "Free"};
       String[]PowerTinkerSpeciality = {"War", "Ego", "Data", "Travel", "Life", "Artifice", "Element", "Impulse", "Alter", "Control", "Psyche", "Safity"};

       Random RNumber = new Random();
       int RN1 = RNumber.nextInt(11);
       int RN2 = 7; //RNumber.nextInt(11);
   
       if (RN1 == RN2){
       System.out.println(RN1);
       System.out.println(PowerClass[RN1]);
       }
       
       else{
       System.out.println(RN1 +" & "+RN2);
       System.out.println(PowerClass[RN1] + " & " +PowerClass[RN2]);
       }
       
       switch (RN1){
         case 7:
            int RNTinkerMethodology1 = RNumber.nextInt(11);
            int RNTinkerMethodology2 = RNumber.nextInt(11); //RNumber.nextInt(11);
            System.out.println("Tinker Methodology: " + PowerTinkerMethod[RNTinkerMethodology1] + " & " +PowerTinkerMethod[RNTinkerMethodology2]);
            break;   
         default:
             if (RN2 != 7){
             System.out.println("Not a tinker.");
             }
           }
      switch (RN2){
         case 7:
            int RNTinkerMethodology1 = RNumber.nextInt(11);
            int RNTinkerMethodology2 = RNumber.nextInt(11); //RNumber.nextInt(11);
            System.out.println("Tinker Methodology: " + PowerTinkerMethod[RNTinkerMethodology1] + " & " +PowerTinkerMethod[RNTinkerMethodology2]);
            break;   
         default:
             if (RN1 != 7){
             System.out.println("Not a tinker.");
             }
       }      
    }       
}