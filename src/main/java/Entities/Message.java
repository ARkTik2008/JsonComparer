package Entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Message {

    @SerializedName("MessageId")
    @Expose
    private String messageId;
    @SerializedName("User")
    @Expose
    private String user;
    @SerializedName("ThreadId")
    @Expose
    private String threadId;
    @SerializedName("ReceivedAt")
    @Expose
    private String receivedAt;
    @SerializedName("From")
    @Expose
    private String from;
    @SerializedName("IsSent")
    @Expose
    private Boolean isSent;
    @SerializedName("Length")
    @Expose
    private Integer length;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    public String getReceivedAt() {
        return receivedAt;
    }

    public void setReceivedAt(String receivedAt) {
        this.receivedAt = receivedAt;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public Boolean getIsSent() {
        return isSent;
    }

    public void setIsSent(Boolean isSent) {
        this.isSent = isSent;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

}