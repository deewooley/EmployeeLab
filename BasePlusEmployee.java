package Lab1;

public class BasePlusEmployee extends CommissionedEmployee {
   int baseSalary;
   int grossSales;
   int commissionRate;
   String firstName;
   String lastName;
   int employeeNumber;

   public BasePlusEmployee(String lastName, String firstName, int employeeNumber, int baseSalary, int grossSales, int commissionRate){

      this.firstName = firstName;
      this.lastName = lastName;
      this.employeeNumber = employeeNumber;
      this.baseSalary = baseSalary;
      this.grossSales = grossSales;
      this.commissionRate = commissionRate;

   }

   @Override
   public void payCheck(){
      System.out.println("The "+this.getClass().getSimpleName()+" earned $"+(double)((baseSalary)+grossSales*(commissionRate/100.00f)));

   }
   public void bonusAlert(double bonusAmount){
      this.bonusAmount =bonusAmount;
      double finAmount = (baseSalary)+grossSales*(commissionRate/100.00f)+bonusAmount;
      System.out.println(this.getClass().getSimpleName()+ " got a bonus of $"+ bonusAmount+" and now earns $" + finAmount);
   }

   public void printEmployeeFullName(){
      System.out.println(lastName+ ", " + firstName);
   }
}