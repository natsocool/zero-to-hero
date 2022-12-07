package season_1;
import java.util.*;

public class Quiz1 {
    
    void executeEasy1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int inputnum = scan.nextInt();

        if (inputnum == 0){
            System.out.println("Entered integer is a ZERO");
        }else if(inputnum <0){
            System.out.println("Entered integer is a NEGATIVE INTEGER");
        }else if(inputnum %2 !=0){
            System.out.println("Entered integer is an ODD INTEGER");
        }else{
            System.out.println("Entered integer is a POSITIVE INTEGER");
        }
    }

    void executeEasy2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int inputnum = scan.nextInt();

        switch (inputnum){
            case 1: System.out.println("Entered Number is equivalent to MONDAY");
            break;
            case 2: System.out.println("Entered Number is equivalent to TUESDAY");
            break;
            case 3: System.out.println("Entered Number is equivalent to WEDNESDAY");
            break;
            case 4: System.out.println("Entered Number is equivalent to THURSDAY");
            break;
            case 5: System.out.println("Entered Number is equivalent to FRIDAY");
            break;
            case 6: System.out.println("Entered Number is equivalent to SATURDAY");
            break;
            case 7: System.out.println("Entered Number is equivalent to SUNDAY");
            break;
        }
    }

    void executeEasy3(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter FLOAT 1:");
        float inputnum1 = scan.nextFloat();
        System.out.println("Enter FLOAT 2:");
        float inputnum2 = scan.nextFloat();

        if(inputnum1 == inputnum2){
            System.out.println("Two floats are the same!");
        }else{
            System.out.println("Two floats are not the same!");
        }
    }

    void executeEasy4(){
        System.out.println("These are the first 10 natural numbers!");
        for (int i=0;i<10;i++){
            System.out.print(i + 1 + "  ");
        }
    }

    void executeEasy5(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Dog's Age: ");
        int inputnum = scan.nextInt();
        int age = 20;

        for (int i=1;i<inputnum;i++){
        if (inputnum == 1){
            age = 15;
        }else{
            age += 4;
        }
    }
    System.out.println("The equivalent dog's age to human is: " + age);
    }

    void executeEasy6(){
        Scanner scan = new Scanner(System.in);
        int [] array = new int [5];
        int sum =0;

        for(int i=0;i<5;i++){
            System.out.println("Enter a number: ");
            array[i] = scan.nextInt();
            sum += array[i];
        }
        int average = sum / 5;
        System.out.println("The Sum of all 5 Numbers is: " + sum);
        System.out.println("The Average of all 5 Numbers is: " + average);  
    }
}
