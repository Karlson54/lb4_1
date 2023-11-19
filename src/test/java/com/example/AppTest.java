package com.example;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class AppTest {

    @Test
    public void testIsPalindrome() {
        assertTrue(App.isPalindrome("level"));
        assertTrue(App.isPalindrome("A man a plan a canal Panama"));
        assertTrue(App.isPalindrome("Able was I saw eLba"));
        assertFalse(App.isPalindrome("hello"));
        assertFalse(App.isPalindrome("not a palindrome"));
    }
}
