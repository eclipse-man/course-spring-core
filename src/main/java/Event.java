import java.util.Date;

public class Event {
    private int id;
    private String msg;
    private Date date;

    public Event() {
        id = (int) (Math.random() * 1000);
        date = new Date();
    }

    public String toString() {
        return "Event #" + String.valueOf(id) + ":\n\tMessage: " + msg + "\n\tDate: " + date.toString();
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
