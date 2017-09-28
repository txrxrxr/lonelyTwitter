/*
 * Tweets
 *
 * Version 1.0
 *
 * September 27, 2017
 *
 * Copyright (c) 2017 TeamX, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta.
 * You can find a copy of license in this project. Otherwise please contact contact@abc.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a tweet.
 *
 * @author team X
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 *
 */

public abstract class Tweets implements Tweetable{          // abstract class

    private String message;
    private Date date;
    private ArrayList<mood> moodList = new ArrayList<mood>();

    /**
     *
     * Construct a Tweet Object
     *
     * @param message tweet message
     */
    public Tweets(String message) {
        date = new Date(System.currentTimeMillis());
        this.message = message;

    }

    /**
     *
     * Construct a Tweet Object.
     *
     * @param message tweet message
     * @param date tweet date
     *
     */
    public Tweets(String message, Date date) {
        this.date = date;
        this.message = message;

    }

    /**
     * Return the message of the tweet.
     *
     * @return
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Return the date of the tweet.
     *
     * @return
     */
    public Date getDate() {
        return date;
    }

    /**
     * Set the tweet message.
     *
     * @param message tweet message
     * @throws TweetToolLangException
     */
    public void setMessage(String message) throws TweetToolLangException {
        if (message.length() < 140)
            this.message = message;
        else {
            throw new TweetToolLangException();
        }
    }

    /**
     *
     * Set the date of the tweet.
     *
     * @param date tweet date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     *
     * Return whether the tweet is important.
     *
     * @return
     */
    public abstract Boolean isImportant();      // abstract method !!!!

    /**
     *
     * Set the mood of the tweet
     *
     * @param moodList array of the mood
     */
    public void setMoodList(ArrayList<mood> moodList) {
        this.moodList = moodList;
    }

    /**
     *
     * Return the mood of the tweet
     *
     * @return
     */
    public ArrayList<mood> getMoodList() {
        return moodList;
    }

    /**
     *
     * Represent the string format of a tweet object.
     *
     * @return
     */
    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
