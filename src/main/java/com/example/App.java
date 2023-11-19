package com.example;

public class App {

    public static boolean isPalindrome(String word) {
        String cleanedWord = word.replaceAll("\\s", "").toLowerCase();

        StringBuilder reversedWord = new StringBuilder(cleanedWord).reverse();

        return cleanedWord.equals(reversedWord.toString());
    }

    public static void main(String[] args) {
        String exampleWord = "level";
        System.out.println("Is '" + exampleWord + "' a palindrome? " + isPalindrome(exampleWord));
    }
}
