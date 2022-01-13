package software.xmclass.Software_engineering._course.domain.login;

public class loginPwd {
    private String phone;

    private String pwd;

    @Override
    public String toString() {
        return "loginPwd{" +
                "phone='" + phone + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
