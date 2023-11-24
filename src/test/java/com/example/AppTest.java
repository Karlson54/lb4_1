package com.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class AppTest {

    private App app;

    @Before
    public void setUp() {
        app = new App();
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(app.isPalindrome("level"));
        assertTrue(app.isPalindrome("A man a plan a canal Panama"));
        assertTrue(app.isPalindrome("Able was I saw eLba"));
        assertFalse(app.isPalindrome("hello"));
        assertFalse(app.isPalindrome("not a palindrome"));
    }
}
