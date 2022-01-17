package software.xmclass.Software_engineering._course.domain.PgetOrder;

import java.util.Date;

public class PgetOrder_Plus {
    private int OrderID;
    private int OrdinaryUserID;
    private Date OTime;
    private int PayState;
    private Date PayTime;
    private Date OrderTime;
    private int OrderState;
    private String Name;
    private float Price;

    public Date getPayTime() {
        return PayTime;
    }

    public void setPayTime(Date payTime) {
        PayTime = payTime;
    }

    public Date getOrderTime() {
        return OrderTime;
    }

    public void setOrderTime(Date orderTime) {
        OrderTime = orderTime;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public int getOrdinaryUserID() {
        return OrdinaryUserID;
    }

    public void setOrdinaryUserID(int ordinaryUserID) {
        OrdinaryUserID = ordinaryUserID;
    }

    public Date getOTime() {
        return OTime;
    }

    public void setOTime(Date OTime) {
        this.OTime = OTime;
    }

    public int getPayState() {
        return PayState;
    }

    public void setPayState(int payState) {
        PayState = payState;
    }

    public int getOrderState() {
        return OrderState;
    }

    public void setOrderState(int orderState) {
        OrderState = orderState;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "PgetOrder_Plus{" +
                "OrderID=" + OrderID +
                ", OrdinaryUserID=" + OrdinaryUserID +
                ", OTime=" + OTime +
                ", PayState=" + PayState +
                ", OrderState=" + OrderState +
                ", Name='" + Name + '\'' +
                ", Price=" + Price +
                '}';
    }
}
