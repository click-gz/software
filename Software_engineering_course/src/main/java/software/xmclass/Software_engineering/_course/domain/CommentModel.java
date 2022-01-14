package software.xmclass.Software_engineering._course.domain;

import java.util.Date;

public class CommentModel {
    private int CommentID;
    private int PracticalUserID;
    private int OridinaryUserID;
    private Date PublishTime;
    private String CommentContext;
    private int CommentState;

    public int getCommentID() {
        return CommentID;
    }

    public void setCommentID(int commentID) {
        CommentID = commentID;
    }

    public int getPracticalUserID() {
        return PracticalUserID;
    }

    public void setPracticalUserID(int practicalUserID) {
        PracticalUserID = practicalUserID;
    }

    public int getOridinaryUserID() {
        return OridinaryUserID;
    }

    public void setOridinaryUserID(int oridinaryUserID) {
        OridinaryUserID = oridinaryUserID;
    }

    public Date getPublishTime() {
        return PublishTime;
    }

    public void setPublishTime(Date publishTime) {
        PublishTime = publishTime;
    }

    public String getCommentContext() {
        return CommentContext;
    }

    public void setCommentContext(String commentContext) {
        CommentContext = commentContext;
    }

    public int getCommentState() {
        return CommentState;
    }

    public void setCommentState(int commentState) {
        CommentState = commentState;
    }

    @Override
    public String toString() {
        return "CommentModel{" +
                "CommentID=" + CommentID +
                ", PracticalUserID=" + PracticalUserID +
                ", OridinaryUserID=" + OridinaryUserID +
                ", PublishTime=" + PublishTime +
                ", CommentContext='" + CommentContext + '\'' +
                ", CommentState=" + CommentState +
                '}';
    }
}
