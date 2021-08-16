
package BURGER_RESTAURENT;
import java.util.Scanner;
import static BURGER_RESTAURENT.Item.Menu;
import static BURGER_RESTAURENT.OrderDetails.Bill;
import static BURGER_RESTAURENT.OrderDetails.Signature;

public class Customer {

private int CustomerId; 
private String CustomerName;

public Customer(int CustomerId,String CustomerName,Order Order){
this.CustomerId=CustomerId;
this.CustomerName=CustomerName;

}
public int getCustomerId() {
return CustomerId;
}
public void setCustomerId(int CustomerId) {
this.CustomerId = CustomerId;
}
public String getCustomerName() {
return CustomerName;
}
 public void setCustomerName(String CustomerName) {
    this.CustomerName = CustomerName;
 }
@Override
    public String toString() {
 return  "Customer {" +
         "CustomerId=" + CustomerId +
         ",CustomerName="+CustomerName + 
        '}';
 }
       public static void CustomerInfo(){
			String CustomerName;
			Scanner sc=new Scanner(System.in);
			System.out.print(" \n \t\t\tCustomer Name: ");
			CustomerName=sc.nextLine();
                        int CustomerId;
                        System.out.print(" \t\t\tCustomer ID  : " );
                        Scanner scId=new Scanner(System.in);                       
                        CustomerId=scId.nextInt();
                        int i = 0;
			Bill();
			Signature();
		}
    public static void DisplayInformation() 
	{
		System.out.println("\t\t-----------------------------------------------------");
		System.out.println("\t\t                 ***** WELCOME *****                ");
                System.out.println("\t\t                         MENU                       ");
		System.out.println("\t\t-----------------------------------------------------\n\n\n\n");
		Menu();
                
               //2 char c;
		//2Scanner sc=new Scanner(System.in);
		//2c=sc.nextLine().charAt(0); 
// to read a charter,we use next() function & next() function returns the next word in the input as a string//
//charAt(0) function returns 1st charter in that string//

                
                 
                      //1OrderDetails obj=new OrderDetails();
                      //1obj.CustomerInfo();                                       
                      //DisplayInformation();
                      //OrderDetails obj=new OrderDetails();
                      //obj.CustomerInfo(); 
                          CustomerInfo();        
		Scanner back=new Scanner(System.in);
		System.out.print("\n\n\t\tPress m to return main menu or press any other key to exit: ");
                int b;
		b=back.nextLine().charAt(0);
		if(b=='m') {
                    DisplayInformation();
                } 
	} 
}
