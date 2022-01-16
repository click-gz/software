package software.xmclass.Software_engineering._course.domain;


public class AdministratorModel {
    private int AdministratorID;
    private String Name;
    private String Pwd;

    public int getAdministratorID() {
        return AdministratorID;
    }

    public void setAdministratorID(int administratorID) {
        AdministratorID = administratorID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPwd() {
        return Pwd;
    }

    public void setPwd(String pwd) {
        Pwd = pwd;
    }

    @Override
    public String toString() {
        return "AdministratorModel{" +
                "AdministratorID=" + AdministratorID +
                ", Name='" + Name + '\'' +
                ", Pwd='" + Pwd + '\'' +
                '}';
    }
}
