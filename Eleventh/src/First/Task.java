package First;

import java.sql.Date;
import java.text.DateFormat;

public class Task {
    private String developer;
    private Date dateGet;
    private Date datePass;
    private DateFormat formatter;

    public Task(String developer, Date dateGet, Date datePass, DateFormat formatter) {
        this.developer = developer;
        this.dateGet = dateGet;
        this.datePass = datePass;
        this.formatter = formatter;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public Date getDateGet() {
        return dateGet;
    }

    public void setDateGet(Date dateGet) {
        this.dateGet = dateGet;
    }

    public Date getDatePass() {
        return datePass;
    }

    public void setDatePass(Date datePass) {
        this.datePass = datePass;
    }

    public DateFormat getFormatter() {
        return formatter;
    }

    public void setFormatter(DateFormat formatter) {
        this.formatter = formatter;
    }

    @Override
    public String toString() {
        return "Task{" +
                "developer='" + developer + '\'' +
                ", dateGet=" + formatter.format(dateGet) +
                ", datePass=" + formatter.format(datePass) +
                '}';
    }
}
