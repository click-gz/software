package software.xmclass.Software_engineering._course.domain;

public class LikeandDisLikeModel {
    private int OridinaryUserID;
    private int PracticalUserID;
    private int Like;

    public int getOridinaryUserID() {
        return OridinaryUserID;
    }

    public void setOridinaryUserID(int oridinaryUserID) {
        OridinaryUserID = oridinaryUserID;
    }

    public int getPracticalUserID() {
        return PracticalUserID;
    }

    public void setPracticalUserID(int practicalUserID) {
        PracticalUserID = practicalUserID;
    }

    public int getLike() {
        return Like;
    }

    public void setLike(int like) {
        Like = like;
    }

    @Override
    public String toString() {
        return "LikeandDisLikeModel{" +
                "OridinaryUserID=" + OridinaryUserID +
                ", PracticalUserID=" + PracticalUserID +
                ", Like=" + Like +
                '}';
    }
}
