package Lab1;

public class CommissionedEmployee extends Employee {
    int grossSales;
    int commissionRate;
    String firstName;
    String lastName;
    int employeeNumber;

    public CommissionedEmployee(){}
    public CommissionedEmployee(String lastName, String firstName, int employeeNumber, int grossSales, int commissionRate){
        this.lastName = lastName;
        this.firstName = firstName;
        this.employeeNumber = employeeNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public void payCheck(){
        double answer = (grossSales*(commissionRate/100.00f));
        System.out.println("The " + this.getClass().getSimpleName()+" earned $" + answer);

    }
    public void bonusAlert(double bonusAmount){
        double fin = (grossSales*(commissionRate/100.00f))+bonusAmount;
        System.out.println(this.getClass().getSimpleName()+ " got a bonus of "+ bonusAmount+" and now earns $" + fin);
    }

    public void printEmployeeFullName(){
        System.out.println(lastName+ ", " + firstName);
    }
}
