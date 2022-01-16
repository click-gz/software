package software.xmclass.Software_engineering._course.domain;

import java.util.Date;

public class OrderModel {
    private int OrderID;
    private int PracticalUserID;
    private int OrdinaryUserID;
    private Date OrderTime;
    private float Price;
    private int PayState;
    private Date PayTime;
    private int OrderState;
    private Date OTime;

    public Date getOTime() {
        return OTime;
    }

    public void setOTime(Date time) {
        OTime = time;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public int getPracticalUserID() {
        return PracticalUserID;
    }

    public void setPracticalUserID(int practicalUserID) {
        PracticalUserID = practicalUserID;
    }

    public int getOrdinaryUserID() {
        return OrdinaryUserID;
    }

    public void setOrdinaryUserID(int ordinaryUserID) {
        OrdinaryUserID = ordinaryUserID;
    }

    public Date getOrderTime() {
        return OrderTime;
    }

    public void setOrderTime(Date orderTime) {
        OrderTime = orderTime;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public int getPayState() {
        return PayState;
    }

    public void setPayState(int payState) {
        PayState = payState;
    }

    public Date getPayTime() {
        return PayTime;
    }

    public void setPayTime(Date payTime) {
        PayTime = payTime;
    }

    public int getOrderState() {
        return OrderState;
    }

    public void setOrderState(int orderState) {
        OrderState = orderState;
    }

    @Override
    public String toString() {
        return "OrderModel{" +
                "OrderID=" + OrderID +
                ", PracticalUserID=" + PracticalUserID +
                ", OrdinaryUserID=" + OrdinaryUserID +
                ", OrderTime=" + OrderTime +
                ", Price=" + Price +
                ", PayState=" + PayState +
                ", PayTime=" + PayTime +
                ", OrderState=" + OrderState +
                ", OTime=" + OTime +
                '}';
    }
}
