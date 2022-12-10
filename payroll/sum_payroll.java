package payroll;

public class sum_payroll {
     static int totalEmp,count;
    static double totalGross,totalNetGross,totalTax,totalInsurance;
     static double gross, netGross,tax;
    sum_payroll(double gross,double netGross,int count,double tax){
        this.count=count;
        this.gross=gross;
        this.netGross=netGross;
        this.tax=tax;

    }
     sum_payroll(){
        
    }
    void report(){
       System.out.println("adding it...");
       totalEmp=totalEmp+count;
       totalGross=totalGross+gross;
       totalNetGross=totalNetGross+netGross;
       totalTax=totalTax+tax;
       totalInsurance=50*count;
     
    }
    
        void summary_display(){
 
        System.out.println("Payroll Report");   
        System.out.println("Total Number of Employees: " + count );
        System.out.println("Total Gross: " + totalGross);
        System.out.println("Total Net: " + totalNetGross);
        System.out.println("Total Tax: " + totalTax);
        System.out.println("Total Insurance: " + totalInsurance); 
       
       
       
    }
    
    
}