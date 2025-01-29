import java.util.*;
public class BankManagementSystem{
    public static void main(String[] args) {
    System.out.println("HELLO CUSTOMER");
    System.out.println("Please enter a password");
    // System.out.println("PASSWORD:");
    Scanner sc= new Scanner(System.in);
    // String password = sc.nextLine();
    String newpassword = sc.nextLine();
    String oldpassword= "vgvg";
    if(newpassword.equals(oldpassword)){
        System.out.println("PASSWORD IS VALID");
        int amount =500000;
        System.out.println("---------------PRESS 1 TO VIEW THE AMOUNT--------------- \n---------------PRESS 2 TO EXIT THE SYSTEM---------------");
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("-------------------------------------");
            System.out.println("YOUR CURRENT BALANCE IS: "+amount);
            System.out.println("-------------------------- -----------");
            System.out.println("PRESS 1 TO ADD THE AMOUNT \n PRESS 2 TO SUBTRACT THE AMOUNT");
            int option = sc.nextInt();
            switch(option){
                case 1:
                System.out.println("******************ENTER THE AMOUNT TO ADD******************");
                int AddAmount=sc.nextInt();
                amount = amount + AddAmount;
                System.out.println("YOUR CURRENT BALANCE IS: "+amount);
                break;
                case 2:
                System.out.println("******************ENTER THE AMOUNT TO SUBTRACT******************");
                int subAmount=sc.nextInt();
                if (subAmount > amount) {
                    System.out.println("INSUFFICIENT BALANCE! TRANSACTION FAILED.");
                } else {
                    amount -= subAmount;  
                    System.out.println("YOUR UPDATED BALANCE IS: " + amount);
                }
                break;
                default:
                System.out.println("INVALID OPTION");
            }
        }
        else{
            System.out.println("THANK YOU FOR USING OUR BANKING SYSTEM");
        }
        
    }
    else{
        System.out.println("PASSWORD IS INVALID");

    }
    sc.close();
    }
}
