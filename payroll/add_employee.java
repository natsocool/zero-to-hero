/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payroll;

/**
 *
 * @author dan
 */
import java.util.*;

public class add_employee {
    
    
    static String array1[] = {"Name", "Address", "Department", "Hourly Wage", "Designation of Work"};
    static String array2[] = new String[5];
    static String[] employees = new String[100];
    
    
    static int j = 0;
    
    
    add_employee(){
    
    }
    
    void new_emp(){
        add_employee ademp = new add_employee();
        String choice = "";
        Scanner in = new Scanner(System.in);
        
        for(int i=0;i<array1.length;i++){
            System.out.print("Enter Employee's " + (array1[i]) + ": ");
            array2[i] = in.nextLine();
        }
        ademp.add_to_arr(array2);
        
        System.out.print("\nDo you want to add another Employee?[Y/N]");
        choice = in.nextLine();
        
        if("Y".equalsIgnoreCase(choice)){
            ademp.new_emp();
        }else{
            System.out.println("\n[1]Display Employee Information or [2]Go To Menu? [1/2]");
            choice = in.nextLine();
            if ("1".equalsIgnoreCase(choice)){ademp.display_arr();
            }else{
                ABC_Company abc = new ABC_Company();
                abc.main_menu();}
        }
        
    }
    
    void add_to_arr(String[] x){
        for (int i = 0; i < array1.length;i++){
            employees[j] = array2[i];
            j++;
        }
    }
    
    void display_arr(){
        String[] cleanarr = Arrays.stream(employees).filter(Objects::nonNull).toArray(String[]::new);
        System.out.println("\nEmployee Information: ");
        for (int i = 0; i <cleanarr.length;i++){
                if(i%5 == 0){
                    System.out.println("");
                }
                System.out.print(cleanarr[i]+"\t\t");
        }
    }
}