package software.xmclass.Software_engineering._course.domain;

import java.util.Date;

public class usermodel {

    private Integer Uid;

    private String Pwd;

    private String Name;

    private String Age;

    private String Gender;

    private String Phone;

    private Date CreateTime;

    private String token;

    public Integer getUid() {
        return Uid;
    }

    public void setUid(Integer uid) {
        Uid = uid;
    }

    public String getPwd() {
        return Pwd;
    }

    public void setPwd(String pwd) {
        Pwd = pwd;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    @Override
    public String toString() {
        return "usermodel{" +
                "Uid=" + Uid +
                ", Pwd='" + Pwd + '\'' +
                ", Name='" + Name + '\'' +
                ", Age='" + Age + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Phone='" + Phone + '\'' +
                ", CreateTime=" + CreateTime +
                '}';
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date createTime) {
        CreateTime = createTime;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
