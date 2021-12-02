
/**
 * 
 *
 * @RM
 * @Version 1 
 * @ date december 1st 2021
 */
import java.util.Random;
import java.util.Scanner;
/**
 * 
 * @author FLVS AP CSA team
 * @version 2021
 * 
 * This Math trick and many more can be found at: http://www.pleacher.com/handley/puzzles/mtricks.html
 *
 */

public class MathTrick {
    
    /**
     * 
     ******  DO NOT USE ARRAYS OR CONVERT NUMBERS TO STRING UNTIL STEP 7 ******
     *
     */
    
    // Step 1) Creates a random 3 digit (100-999) number where the first and last digit differ by more than one
    // Hint: Use Math.random() to create number in the correct range
    //          use modulus to find the last digit and divide by 100 for the first digit.
    //         calculate the difference, which method can you use so it doesn't matter how the numbers are subtract?
    //          while the difference of the digits is less than 2, create a new random number and try again

    public static int getRandomNum() 
    {   int max = 999;
        int min = 100;
        int num;
        int firstdigit;
        int thirddigit;
        do { 
            num = (int)(Math.random()*(max-min+1)+min);
            firstdigit = num/100;
            thirddigit = num%10;
        }while(Math.abs(firstdigit - thirddigit)<2);
    return num;
    }
    // Step 2 & 4) reverse the digits of a number
    // Hint: to reverse a number without converting it to a String:
    //        create a new variable to store the reversed number
    //        while the original number > 0
    //        for each digit, multiply the new variable by 10 (to make room for the new digit) 
    //        then add the last digit (remember modulus?) to the new variable
    //        divide the original number by 10 to get rid of the last digit
    //    Ex: 584--> (0 x 10) + 4 = 4 ; 58--> (4 x 10) + 8 = 48; 5-->(48 x 10) + 5 = 485

    public static int reverseDigits(int num) {
        int newnum = 0;
        while(num > 0){
            newnum = newnum*10;
            newnum += num%10;
            num = num/10;
        }
        // complete the method
        return  newnum;
    }
    
    // Step 7) replace characters in a String according to the chart
    // Hint: Loop through the String and "replace" the numbers with the corresponding letter
    public static String replaceLtr(String str)
    {
         String newString = "";
        for(int i=0; i< str.length(); i++) {
        String newNum = str.substring(i,1+i);
        if (newNum.equals("0")){
            newNum = "Y";
        }
        if (newNum.equals("1")){
            newNum = "M";
        }
        if (newNum.equals("2")){
            newNum = "P";
        }
        if (newNum.equals( "3")){
            newNum = "L";
        }
        if (newNum.equals("4")){
            newNum = "R";
        }
        if (newNum.equals("5")){
            newNum = "O";
        }
        if (newNum.equals("6")){
            newNum = "F";
        }
        if (newNum.equals("7")){
            newNum = "A";
        }
        if (newNum.equals("8")){
            newNum = "I";
        }
        if (newNum.equals("9")){
            newNum = "B";
        }
        newString = newString + newNum;
    }
        return newString;
    }
    
    // Step 8) reverse the letters in a String
    // Hint: start with an empty String variable 
        //         loop through the original word   
    //         add one letter at time to the new variable using concatenation and .substring()
    public static String reverseString(String str) {
        String newString = "";
        for (int i= str.length(); i > 0; i--) {
            String newNum = str.substring(i-1,i);
            newString = newString + newNum;
        }
        return newString;
    }
        
    public static void main(String[] args) 
    {
       
             int threeDigit = getRandomNum();
             System.out.println(threeDigit);
             threeDigit = reverseDigits(threeDigit);
             System.out.println(threeDigit);
                   int million = threeDigit * 1000000;
           int subtract = million - 733361573;
           String realSubtract = String.valueOf(subtract);
           String convert = replaceLtr( realSubtract);
    String endString = reverseString(convert);
    System.out.println(endString);
}
}
