package software.xmclass.Software_engineering._course.domain.PgetOrder;

import java.util.Date;

public class PgetOrder {
    private int OrderID;
    private int OrdinaryUserID;
    private Date OTime;
    private int PayState;
    private int OrderState;
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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

    @Override
    public String toString() {
        return "PgetOrder{" +
                "OrderID=" + OrderID +
                ", OrdinaryUserID=" + OrdinaryUserID +
                ", OTime=" + OTime +
                ", PayState=" + PayState +
                ", OrderState=" + OrderState +
                '}';
    }
}
