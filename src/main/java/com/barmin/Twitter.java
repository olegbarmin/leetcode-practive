package com.barmin;

import java.util.*;
import java.util.AbstractMap.SimpleEntry;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * A simplified version of Twitter where users can post tweets, follow/unfollow another user,
 * and see the 10 most recent tweets in their news feed.
 */
class Twitter {

    private record Tweet(Integer timestamp, Integer tweet) {}

    private final Map<Integer, Set<Integer>> userToFollowees = new HashMap<>();
    private final Map<Integer, Deque<Tweet>> usersToFeeds = new HashMap<>();
    private final AtomicInteger idGen = new AtomicInteger();


    public Twitter() {

    }

    /**
     * Composes a new tweet with ID tweetId by the user userId.
     * Each call to this function will be made with a unique tweetId.
     */
    public void postTweet(int userId, int tweetId) {
        Deque<Tweet> feed = usersToFeeds.getOrDefault(userId, new ArrayDeque<>());
        feed.add(new Tweet(idGen.incrementAndGet(), tweetId));
        usersToFeeds.put(userId, feed);
    }

    /**
     * Retrieves the 10 most recent tweet IDs in the user's news feed.
     * Each item in the news feed must be posted by users who the user followed or by the user themself.
     * Tweets must be ordered from most recent to least recent.
     */
    public List<Integer> getNewsFeed(int userId) {
        Set<Integer> followees = userToFollowees.getOrDefault(userId, new HashSet<>(List.of(userId)));
        var heap = new PriorityQueue<Map.Entry<Tweet, Iterator<Tweet>>>((l, r) -> r.getKey().timestamp.compareTo(l.getKey().timestamp)); // Min value to Iterator of the feed;

        for (Integer followee : followees) {
            Deque<Tweet> feed = usersToFeeds.getOrDefault(followee, new ArrayDeque<>());
            if (feed.isEmpty()) continue;
            Iterator<Tweet> iter = feed.descendingIterator();
            heap.add(new SimpleEntry<>(iter.next(), iter));
        }

        final var result = new ArrayList<Integer>();
        int k = 10;
        while (k > 0 && !heap.isEmpty()) {
            var entry = heap.poll();
            Iterator<Tweet> iter = entry.getValue();
            Tweet tweet = entry.getKey();
            if (iter.hasNext()) {
                heap.add(new SimpleEntry<>(iter.next(), iter));
            }
            result.add(tweet.tweet);
            k--;
        }

        return result;
    }

    /**
     * The user with ID followerId started following the user with ID followeeId.
     */
    public void follow(int followerId, int followeeId) {
        Set<Integer> followees = userToFollowees.getOrDefault(followerId, new HashSet<>(List.of(followerId)));
        followees.add(followeeId);
        userToFollowees.put(followerId, followees);
    }

    /**
     * The user with ID followerId started unfollowing the user with ID followeeId.
     */
    public void unfollow(int followerId, int followeeId) {
        Set<Integer> followees = userToFollowees.getOrDefault(followerId, new HashSet<>(List.of(followerId)));
        followees.remove(followeeId);
        userToFollowees.put(followerId, followees);
    }
}
