package Lab1;

public abstract class Employee {
    String firstName;
    String lastName;
    int employeeNumber;
    double payCheck;
    double bonusAmount;

    public Employee(){}

    public void payCheck(){
        System.out.println("PAYCHECK");
        System.out.println("================================");
        System.out.println( lastName + ", " + firstName + " " + employeeNumber + " weekly pay is");
    }

    public void bonusAlert(double bonusAmount){
        System.out.println(this.getClass().getSimpleName()+ " got a bonus of "+ bonusAmount+" and now earns $" + payCheck+ " ");
    }

public void printEmployeeFullName(){}

}
