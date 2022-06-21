package com.barmin.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Design an algorithm to encode a list of strings to a string. The encoded string
 * is then sent over the network and is decoded back to the original list of strings.
 *
 * @lintcode 659
 * @complexity O(n)
 * @memory O(1)
 */
public class EncodeAndDecodeStrings {

    private static final Character MARKER = '$';

    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public String encode(List<String> strs) {
        final var builder = new StringBuilder();
        for (String str : strs) {
            builder.append(str.length()).append(MARKER);
            builder.append(str);
        }
        return builder.toString();
    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        if (str.length() == 0) {
            return Collections.emptyList();
        }

        final var result = new ArrayList<String>();
        final var chars = str.toCharArray();
        for (int i = 0; i < chars.length; ) {
            // Read word length
            final var wordLengthSb = new StringBuilder();
            while (chars[i] != MARKER) {
                wordLengthSb.append(chars[i]);
                i++;
            }
            final var wordLength = Integer.parseInt(wordLengthSb.toString());
            i++; // move pointer from marker to the first symbol;

            // Read the word
            final var wordSb = new StringBuilder();
            final var endOfWord = i + wordLength;
            for (; i < endOfWord; i++) {
                wordSb.append(chars[i]);
            }
            result.add(wordSb.toString());
        }
        return result;
    }
}
