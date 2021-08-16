ITEM.JAVA

package BURGER_RESTAURENT;
import java.lang.*;
public abstract class Order extends OrderDetails {
private int OrderId;
private int Date; 

public Order(int OrderId, int Date){
this.OrderId = OrderId;
this.Date = Date;
}
public int getOrderId() {
return OrderId;
}
public void setOrderId(int OrderId) {
this.OrderId = OrderId;
}
public int getDate() {
return Date;
}
public void setDate(int Date) {
this.Date = Date;
}
public String toString() {
 return  "Order {" +
 "OrderId=" + OrderId +
 ",Date =" + Date+
 '}';
}
}
