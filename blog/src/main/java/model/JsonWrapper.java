package model;

/**
 * Created by huangfeifeng on 8/15/16.
 */
public class JsonWrapper {
    private int status;
    private String reason;
    private Object result;

    public JsonWrapper(Object result) {
        this(null, 0);
        this.result = result;
    }

    public JsonWrapper(String reason, int status) {
        this.reason = reason;
        this.status = status;
    }

    public JsonWrapper() {
        this(null, 0);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
