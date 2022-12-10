package payroll;


public class payroll {
    static int count=0;
    static double hourlyWage,hourlyWork,gross,tax,netGross;
    payroll(double hourlyWage,double hourlyWork){
        this.hourlyWage=hourlyWage;
        this.hourlyWork=hourlyWork;
    }
    
    payroll(){
        
    }
  
    
    void compute(){
         gross = hourlyWage * hourlyWork;
        netGross = (gross - ((gross * 0.12) + 50));
        tax = gross * 0.12;
        count++;
        sum_payroll sump= new sum_payroll(gross,netGross,count,tax);
        sump.report();
        display();
        ABC_Company hris= new ABC_Company();
        hris.comp_payroll();
    }
    
    static void display(){
        System.out.println("Hourly Rate: " + hourlyWage);
        System.out.println("Hourly Wage: " + hourlyWork); 
        System.out.println("Gross: " + gross); 
        System.out.println("Tax: " + tax);
         System.out.println("Insurance: " + 50);
        System.out.println("Net Gross: " + netGross);
        
    }
    
    
    
}
