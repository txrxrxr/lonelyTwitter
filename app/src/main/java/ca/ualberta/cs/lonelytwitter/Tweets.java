package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by tiejun on 2017-09-13.
 */

public abstract class Tweets implements Tweetable{          // abstract class

    private String message;
    private Date date;

    public Tweets(String message) {
        date = new Date();
        this.message = message;

    }

    public Tweets(String message, Date date) {
        this.date = date;
        this.message = message;

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetToolLangException{
        if (message.length() < 140)
            this.message = message;
        else {
            throw new TweetToolLangException();
        }
    }

    public Date getDate() {
        return date;
    }

    public abstract Boolean isImportant();      // abstract method !!!!1





}
