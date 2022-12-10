package payroll;
import java.util.*;

public class ABC_Company {

 
    public static void main(String[] args) {
        ABC_Company abc = new ABC_Company();
        
        abc.main_menu();
        
    }
    void main_menu(){
        Scanner in= new Scanner(System.in);
        int choice;
        System.out.println("WELCOME TO ABC's HRIS SYSTEM");
        System.out.println("[1]Add Employee");
        System.out.println("[2]Process Payroll");
        System.out.println("[3]Employees List");
        while(true){
        try{
            choice = Integer.parseInt(in.next());
            if (choice ==1 || choice ==2 || choice ==3){
                break;
                }
            if (choice!=1 || choice!=2 || choice!=3){
                System.out.print("Try again: ");
            }
            
        }catch(Exception e){
            choice = 0;
            System.out.print("Try again: ");
        }
        }
        
        switch(choice){
            case 1: add_employee ademp = new add_employee();
                ademp.new_emp();
                break;
            case 2: ABC_Company hris= new ABC_Company();
                hris.comp_payroll();
                break;
            case 3: add_employee ademp2 = new add_employee();
                ademp2.display_arr();
                ABC_Company hris2= new ABC_Company();
                System.out.println("");
                hris2.main_menu();
                
        }
    }
  
    void comp_payroll(){
        
        double hourlyWage=0,hourlyWork=0;
        String name="";
        
        Scanner in= new Scanner(System.in);
    
        System.out.println("WELCOME TO ABC's PAYROLL SYSTEM");
        System.out.println("Please Enter Employee's Name: ");
        name = in.nextLine();
        if(name.equalsIgnoreCase("DONE")){
        sum_payroll sump= new sum_payroll();
        sump.summary_display();
          }
        else{
            while(true){
                try{
                    System.out.println("Enter Employee's Hourly Wage: ");
                    hourlyWage = Integer.parseInt(in.next());                  
                    System.out.println("Enter Employee's Hourly Work for this Week: ");
                    hourlyWork = Integer.parseInt(in.next());
                    
                    if (hourlyWage > 0 && hourlyWork >0 ){
                        payroll emp_pay=new payroll(hourlyWage,hourlyWork);
                        emp_pay.compute();
                        break;
                    }
                }catch(Exception e){
                        System.out.println("Try again: ");
                    }                 
            }
        }
    }
}
