package Lab1;

public class Main {

    public static void main(String[] args) {

Employee sal = new SalariedEmployee("Winfrey", "Oprah", 77352,2000);
Employee common = new CommissionedEmployee("Wooley", "Davina", 23574,1000000,25);
Employee base = new BasePlusEmployee("Smith", "Will", 93939,10000,800000,10);

   Employee[] staffList = {sal, common, base};
   for(int i = 0; i< staffList.length;i++){
       System.out.print("Employee: ");
       staffList[i].printEmployeeFullName();
       staffList[i].payCheck();
   }
        sal.bonusAlert(50);
    }
}

