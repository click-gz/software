package software.xmclass.Software_engineering._course.domain;

import java.util.Arrays;

public class PracticalUserModel {
    private int PracticalUserID;
    private String UserName;
    private String Phone;
    private String Pwd;
    private int OridinaryUserID;
    private String Summary;
    private byte[] BusinessLicense;
    private int infoState;

    public int getPracticalUserID() {
        return PracticalUserID;
    }

    public void setPracticalUserID(int practicalUserID) {
        PracticalUserID = practicalUserID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getPwd() {
        return Pwd;
    }

    public void setPwd(String pwd) {
        Pwd = pwd;
    }

    public int getOridinaryUserID() {
        return OridinaryUserID;
    }

    public void setOridinaryUserID(int oridinaryUserID) {
        OridinaryUserID = oridinaryUserID;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String summary) {
        Summary = summary;
    }

    public byte[] getBusinessLicense() {
        return BusinessLicense;
    }

    public void setBusinessLicense(byte[] businessLicense) {
        BusinessLicense = businessLicense;
    }

    public int getInfoState() {
        return infoState;
    }

    public void setInfoState(int infoState) {
        this.infoState = infoState;
    }

    @Override
    public String toString() {
        return "PracticalUserModel{" +
                "PracticalUserID=" + PracticalUserID +
                ", UserName='" + UserName + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Pwd='" + Pwd + '\'' +
                ", OridinaryUserID=" + OridinaryUserID +
                ", Summary='" + Summary + '\'' +
                ", BusinessLicense=" + Arrays.toString(BusinessLicense) +
                ", infoState=" + infoState +
                '}';
    }
}
