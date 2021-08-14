package src.p6.q3;

public class driver {
    public static void printElements(Employee[] empArray){
        for(int i =0;i<empArray.length;i++){
            System.out.println(empArray[i].getClass().getSimpleName());
//            if(empArray[i] instanceof CommissionEmployee){
//                System.out.println("Commission Employee");
//            }
//            else if(empArray[i] instanceof Clerk){
//                System.out.println("Clerk");
//            }
//            else{
//                System.out.println("Employee");
//            }
            System.out.println(empArray[i]);
            System.out.println("Total salary:"+ empArray[i].calculateSalary());
        }
    }
    public static void main(String[] args) {
        Employee[] empArray = {
                new Employee("Kong",1,1000),
                new CommissionEmployee("Kuok", 2, 1000,10000,0.1),
                new Clerk("Yong",3,1000,100,1,2)

        };
        printElements(empArray);

        System.out.println("Test Equal===================");
        Employee emp = new Employee("Kong",1,1000);
        Clerk clerk = new Clerk("Yong",1,1000,100,1,2);
        CommissionEmployee cm = new CommissionEmployee("Kong", 2, 1000,10000,0.1);

        System.out.println("Emp Same as clerk:"+emp.equals(clerk));
        System.out.println("Emp Same as commission :"+emp.equals(cm));

    }
}
