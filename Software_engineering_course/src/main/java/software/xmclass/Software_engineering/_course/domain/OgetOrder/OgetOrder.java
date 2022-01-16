package software.xmclass.Software_engineering._course.domain.OgetOrder;

import java.util.Date;

public class OgetOrder {
    private int OrderId;
    private int PracticalUserID;
    private String Name;
    private Date OTime;
    private int OrderState;

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int orderId) {
        OrderId = orderId;
    }

    public int getPracticalUserID() {
        return PracticalUserID;
    }

    public void setPracticalUserID(int practicalUserID) {
        PracticalUserID = practicalUserID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getOTime() {
        return OTime;
    }

    public void setOTime(Date OTime) {
        this.OTime = OTime;
    }

    public int getOrderState() {
        return OrderState;
    }

    public void setOrderState(int orderState) {
        OrderState = orderState;
    }

    @Override
    public String toString() {
        return "OgetOrder{" +
                "OrderId=" + OrderId +
                ", PracticalUserID=" + PracticalUserID +
                ", Name='" + Name + '\'' +
                ", OTime=" + OTime +
                ", OrderState=" + OrderState +
                '}';
    }
}
