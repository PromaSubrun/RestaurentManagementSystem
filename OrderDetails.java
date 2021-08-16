ORDER DETAILS.JAVA

package BURGER_RESTAURENT;
import java.util.Scanner;

public class OrderDetails{
    static double t;	//t= total price
 
	
	public static void Bill()
	{
		String Fcode;	//Fcode=food code
		double tp=0,tv=0;	//tp=total price & tv=total vat
		int j;        //insert code//
		for(j=0;j<20;j++)
		{
			System.out.print("\n\t\t\t\t\t\t(Press t for calculate total)\n");
			System.out.print("\t\t\tCode   : ");
			Scanner pc=new Scanner(System.in);
			Fcode=pc.nextLine();
			int price;
			double vat;
                        int quantity = 0;
                        
			if("t".equals(Fcode))   //equals() use to compare object in java//
                            break;
			switch(Fcode)
			{
				case "J101": case "j101":
				price=100;
                                Scanner scQ=new Scanner(System.in);  //
			        System.out.print(" \n \t\t\t Quantity: ");
			        quantity=scQ.nextInt();
                                tp=(tp+price)*quantity;
				vat=Math.ceil(.15*price);
				tv=+vat;
				System.out.println("\t\t\tFood: Burger1");
				System.out.println("\t\t\tPrice  : "+price+" Tk");
                                System.out.println("\t\t\tQuantity    : "+quantity+" piece");
                                System.out.println("\t\t\tTotal Price    : "+tp+" Tk");
                                System.out.println("\t\t\tTotal Vat    : "+tv+" Tk");
				break;
                                                               
				case "K102": case"k102" :
				price=110;
                                Scanner scQa=new Scanner(System.in);  //
			        System.out.print(" \n \t\t\t Quantity: ");
			        quantity=scQa.nextInt();
                                tp=(tp+price)*quantity;
				vat=Math.ceil(.15*price);
				tv=+vat;
				System.out.println("\t\t\tFood: Burger2");
				System.out.println("\t\t\tPrice  : "+price+" Tk");
                                System.out.println("\t\t\tQuantity    : "+quantity+" piece");
                                System.out.println("\t\t\tTotal Price    : "+tp+" Tk");
                                System.out.println("\t\t\tTotal Vat    : "+tv+" Tk");
				break;
                                
				case "C103": case "c103":
				price=120;
                                Scanner scQb=new Scanner(System.in);  //
			        System.out.print(" \n \t\t\t Quantity: ");
			        quantity=scQb.nextInt();
                                tp=(tp+price)*quantity;
				vat=Math.ceil(.15*price);
				tv=+vat;
				System.out.println("\t\t\tFood: Burger3");
				System.out.println("\t\t\tPrice  : "+price+" Tk");
				//System.out.println("\t\t\tVat    : "+vat+" Tk");
                                System.out.println("\t\t\tQuantity    : "+quantity+" piece");
                                System.out.println("\t\t\tTotal Price    : "+tp+" Tk");
                                System.out.println("\t\t\tTotal Vat    : "+tv+" Tk");
				break;
                                
				case "R104": case "r104":
				price=130;
                                Scanner scQc=new Scanner(System.in);  //
			        System.out.print(" \n \t\t\t Quantity: ");
			        quantity=scQc.nextInt();
                                tp=(tp+price)*quantity;
				vat=Math.ceil(.15*price);
				tv=+vat;
				System.out.println("\t\t\tFood: Burger4");
				System.out.println("\t\t\tPrice  : "+price+" Tk");
                                System.out.println("\t\t\tQuantity    : "+quantity+" piece");
                                System.out.println("\t\t\tTotal Price    : "+tp+" Tk");
                                System.out.println("\t\t\tTotal Vat    : "+tv+" Tk");
				break;
                                
				case "S105": case "s105":
				price=140;
                                Scanner scQd=new Scanner(System.in);  //
			        System.out.print(" \n \t\t\t Quantity: ");
			        quantity=scQd.nextInt();
                                tp=(tp+price)*quantity;
				vat=Math.ceil(.15*price);
				tv=+vat;
				System.out.println("\t\t\tFood: Burger5");
				System.out.println("\t\t\tPrice  : "+price+" Tk");
                                System.out.println("\t\t\tQuantity    : "+quantity+" piece");
                                System.out.println("\t\t\tTotal Price    : "+tp+" Tk");
                                System.out.println("\t\t\tTotal Vat    : "+tv+" Tk");
				break;
                                
				case "L106": case "l106":
				price=150;
                                Scanner scQe=new Scanner(System.in);  //
			        System.out.print(" \n \t\t\t Quantity: ");
			        quantity=scQe.nextInt();
                                tp=(tp+price)*quantity;
				vat=Math.ceil(.15*price);
				tv=+vat;
				System.out.println("\t\t\tFood : Burger6");
				System.out.println("\t\t\tPrice  : "+price+" Tk");
                                System.out.println("\t\t\tQuantity    : "+quantity+" piece");
                                System.out.println("\t\t\tTotal Price    : "+tp+" Tk");
                                System.out.println("\t\t\tTotal Vat    : "+tv+" Tk");
				break;
                                
				case "A107": case "a107":
				price=160;
                                Scanner scQf=new Scanner(System.in);  //
			        System.out.print(" \n \t\t\t Quantity: ");
			        quantity=scQf.nextInt();
                                tp=(tp+price)*quantity;
				vat=Math.ceil(.15*price);
				tv=+vat;
				System.out.println("\t\t\tFood: Burger7");
				System.out.println("\t\t\tPrice  : "+price+" Tk");
                                System.out.println("\t\t\tQuantity    : "+quantity+" piece");
                                System.out.println("\t\t\tTotal Price    : "+tp+" Tk");
                                System.out.println("\t\t\tTotal Vat    : "+tv+" Tk");
				break;
                                
				case "F108": case "f108":
				price=170;
                                Scanner scQg=new Scanner(System.in);  //
			        System.out.print(" \n \t\t\t Quantity: ");
			        quantity=scQg.nextInt();
                                tp=(tp+price)*quantity;
				vat=Math.ceil(.15*price);
				tv=+vat;
				System.out.println("\t\t\tFood: Burger8");
				System.out.println("\t\t\tPrice  : "+price+" Tk");
                                System.out.println("\t\t\tQuantity    : "+quantity+" piece");
                                System.out.println("\t\t\tTotal Price    : "+tp+" Tk");
                                System.out.println("\t\t\tTotal Vat    : "+tv+" Tk");
				break;
                                
				case "U109": case "u109":
				price=40;
                                Scanner scQh=new Scanner(System.in);  //
			        System.out.print(" \n \t\t\t Quantity: ");
			        quantity=scQh.nextInt();
                                tp=(tp+price)*quantity;
				vat=Math.ceil(.15*price);
				tv=+vat;
				System.out.println("\t\t\tDrinks: Drinks");
				System.out.println("\t\t\tPrice  : "+price+" Tk");
                                System.out.println("\t\t\tQuantity    : "+quantity+" piece");
                                System.out.println("\t\t\tTotal Price    : "+tp+" Tk");
                                System.out.println("\t\t\tTotal Vat    : "+tv+" Tk");
				break;
				default:
				System.out.println("\t\t\tPlease enter correct code");	
			}
		}
		//end of for loop
		System.out.println("\n\t\t\tTotal Price: "+tp+" Tk");
		System.out.println("\t\t\tTotal Vat  : "+tv+" Tk");
		t=tp+tv;
		System.out.println("\t\t\tTotal      : "+t+" Tk");
	}
	public static void Signature()
	{
		System.out.println("\n\t\t\t\t\t\t\t   Proma");
		System.out.println("\n\t\t\t\t\t\t\t-------------");
		System.out.println("\n\t\t\t\t\t\t\t  Signature");
	}
			
}
