/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bindecconversions;

import java.util.Scanner;

/**
 *
 * @author chrystiandybas
 */
public class BinDecConversions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner myKB = new Scanner(System.in);
        
        int choice = 0;
        
        do{
            try{
                System.out.println("Choose an option \n"
                + "1)Convert binary to decimal \n"
                + "2)Convert decimal to binary \n"
                + "3)Quit the program");

                choice = myKB.nextInt();

                int number = 0;

                if (choice == 1){
                    System.out.println("Enter a binary number ");
                    number = myKB.nextInt();
                    binToDec(number);
                }
                else if(choice == 2){
                    System.out.println("Enter a decimal number ");
                    number = myKB.nextInt();
                    decToBin(number);
                }
                else if(choice == 3){
                    System.out.println("");
                }
                else{
                    System.out.println("You need to choose a valid option");
                }
            }catch(Exception e){
                System.out.println("You need to choose a valid option");
                myKB.next();
                
            }
        }while(choice != 3);
        
        
        
    }
    
    public static int binToDec(int number){
        int decimalNumber = 0;
        int base = 1;
        
        while(number > 0){
            int lastDigit = number % 10;
            number = number / 10;
            decimalNumber = decimalNumber + lastDigit * base;
            base = base * 2;
        }
        System.out.println(decimalNumber);
        return decimalNumber;
    }
    
    public static int decToBin(int number){
        
        StringBuilder binaryNumber = new StringBuilder();
        int quotient = number;
        
        while (quotient > 0){
            int remainder = quotient % 2;
            binaryNumber.append(remainder);
            quotient /= 2;
        }
        binaryNumber = binaryNumber.reverse();
        System.out.println(binaryNumber);
        return Integer.valueOf(binaryNumber.toString());
    }
    
}
