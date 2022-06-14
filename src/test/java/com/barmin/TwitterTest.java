package com.barmin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TwitterTest {


    @Test
    void test() {
        Twitter twitter = new Twitter();

        int user1 = 1;
        int user2 = 2;

        // basic
        twitter.follow(user2, user1); // user2 -> user1

        twitter.postTweet(user1, 1);
        twitter.postTweet(user1, 2);
        twitter.postTweet(user1, 3);

        List<Integer> actual = twitter.getNewsFeed(user2);
        List<Integer> expected = List.of(3, 2, 1);
        Assertions.assertEquals(expected, actual);

        // self following
        actual = twitter.getNewsFeed(user1);
        expected = List.of(3, 2, 1);
        Assertions.assertEquals(expected, actual);

        // following after tweet publication
        int user3 = 3;
        twitter.follow(user3, user1); // user3 -> user1
        actual = twitter.getNewsFeed(user3);
        expected = List.of(3, 2, 1);
        Assertions.assertEquals(expected, actual);

        // compose tweets of two people
        twitter.follow(user3, user2); // user3 -> [user1, user2]

        twitter.postTweet(user2, 4);
        twitter.postTweet(user2, 5);
        twitter.postTweet(user1, 6);

        actual = twitter.getNewsFeed(user3);
        expected = List.of(6, 5, 4, 3, 2, 1);
        Assertions.assertEquals(expected, actual);

        //  unfollow
        twitter.unfollow(user3, user1);
        actual = twitter.getNewsFeed(user3);
        expected = List.of(5, 4);
        Assertions.assertEquals(expected, actual);
    }
}