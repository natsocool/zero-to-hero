package season_1;
import java.util.*;

public class Prelim {
    
    void executeEasy1(){
        Scanner scan = new Scanner(System.in);
        String [] vowels = {"A", "E", "I", "O", "U"};
        System.out.println("Enter a letter:");
        String inputletter = scan.nextLine();
        String answer ="";

        for (int i=0;i<vowels.length;i++){
            if(inputletter.equalsIgnoreCase(vowels[i])){
                answer = "Vowel";
                break;
            }else{
                answer = "Consonant";
            }
        }
        System.out.println("The Letter " + inputletter + " is a " + answer);
    }

    void executeEasy2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number as a base of multiplication table: ");
        int input = scan.nextInt();

        for(int i = 1;i<11;i++){
            System.out.println(input + " * " + i + " = " + (input*i));
        }
    }

    void executeEasy3(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to be squared: ");
        int input = scan.nextInt();

        System.out.println("The Perfect Square of " + input + " is " + (input*input));
    }

    void executeEasy4(){
        Scanner scan = new Scanner(System.in);
        int [] nums = new int [5];
        int sum = 0;

        for(int i=0;i<nums.length;i++){
            System.out.print("(" + i + ")" + "Enter a number: ");
            nums[i] =  scan.nextInt();
            sum += nums[i];
        }
        System.out.println("The average of the 5 numbers is " + (sum/5));
    }
}
