package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by tiejun on 2017-09-13.
 */

public abstract class Tweets implements Tweetable{          // abstract class

    private String message;
    private Date date;
    private ArrayList<mood> moodList = new ArrayList<mood>();

    public Tweets(String message) {
        date = new Date(System.currentTimeMillis());
        this.message = message;

    }

    public Tweets(String message, Date date) {
        this.date = date;
        this.message = message;

    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public void setMessage(String message) throws TweetToolLangException{
        if (message.length() < 140)
            this.message = message;
        else {
            throw new TweetToolLangException();
        }
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public abstract Boolean isImportant();      // abstract method !!!!1

    public void setMoodList(ArrayList<mood> moodList) {
        this.moodList = moodList;
    }

    public ArrayList<mood> getMoodList() {
        return moodList;
    }



}
