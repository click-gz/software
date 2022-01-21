package software.xmclass.Software_engineering._course.domain.PracticalUserList;

public class PracticalUserSingle {
    private int PracticalUserID;
    private String UserName;
    private int OridinaryUserID;
    private String Summary;
    private char group;

    public char getGroup() {
        return group;
    }

    public void setGroup(char group) {
        this.group = group;
    }

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

    @Override
    public String toString() {
        return "PracticalUserSingle{" +
                "PracticalUserID=" + PracticalUserID +
                ", UserName='" + UserName + '\'' +
                ", OridinaryUserID=" + OridinaryUserID +
                ", Summary='" + Summary + '\'' +
                '}';
    }
}
