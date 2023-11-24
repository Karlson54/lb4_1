package com.example;

public class App {
    public boolean isPalindrome(String word) {
        String cleanedWord = word.replaceAll("\\s", "").toLowerCase();
        StringBuilder reversedWord = new StringBuilder(cleanedWord).reverse();
        return cleanedWord.equals(reversedWord.toString());
    }

    public static void main(String[] args) {
        App app = new App();
        String exampleWord = "level";
        System.out.println("Is '" + exampleWord + "' a palindrome? " + app.isPalindrome(exampleWord));
    }
}
