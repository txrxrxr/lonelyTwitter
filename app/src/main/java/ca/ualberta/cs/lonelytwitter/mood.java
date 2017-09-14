package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by tiejun on 2017-09-14.
 */

public abstract class mood {

    private Date date;

    public mood() {
        this.date = new Date();
    }

    public mood(Date date) {
        this.date = date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public abstract String moodString();




}
