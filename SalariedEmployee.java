package Lab1;

public class SalariedEmployee  extends Employee{
    String firstName;
    String lastName;
    int employeeNumber;
    double weeklySalary;
    int socialSecurityNumber;

public SalariedEmployee(String lastName, String firstName, int employeeNumber, double weeklySalary){

   this.lastName = lastName;
   this.firstName = firstName;
   this.employeeNumber = employeeNumber;
   this.weeklySalary = weeklySalary;
}
public  void setSocialSecurityNumber(){
    socialSecurityNumber = 1;
}
    @Override
    public void payCheck(){
        System.out.println("This " + this.getClass().getSimpleName()+" employee earned $" + this.weeklySalary);
}
    public void bonusAlert(double bonusAmount){
        double amount = weeklySalary+bonusAmount;
        System.out.println(this.getClass().getSimpleName()+ " got a bonus of "+ bonusAmount+" and now earns $" + amount);
    }

    public void printEmployeeFullName(){
    System.out.println(lastName+ ", " + firstName);
    }
}