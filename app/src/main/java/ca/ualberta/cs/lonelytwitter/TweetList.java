/*
 * Copyright (c) 2017 TeamX, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta.
 * You can find a copy of lisense in this project. Otherwise please contact contact@abc.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by tiejun on 2017-10-11.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){};

    public void add(Tweet tweet) {
        tweets.add(tweet);
    }

    public void addTweet(Tweet tweet) {
        if (this.hasTweet(tweet))
            throw new IllegalArgumentException("duplicate list!");
        else
            tweets.add(tweet);
    }

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }

    public int getCount() {
        return tweets.size();
    }

    public Tweet getTweet(int index) {
        return tweets.get(index);
    }

    public ArrayList<Tweet> getTweets() {
        Collections.sort(tweets);
        return tweets;
    }

}
