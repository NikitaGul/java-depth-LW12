package com.edu.chmnu.ki_123.c3;

public class Main {

    public static String chipper(String input, int shift) {
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String encrypted = "";
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                int value = upperCase.indexOf(c);
                if(value == -1){
                    value = lowerCase.indexOf(c);
                    encrypted = encrypted.concat(String.valueOf(lowerCase.charAt((value + shift) % 26)));
                }
                else{
                    encrypted = encrypted.concat(String.valueOf(upperCase.charAt((value + shift) % 26)));
                }
            } else {
                encrypted = encrypted.concat(String.valueOf(c));
            }
        }
        return encrypted;
    }

    public static String dechipper(String input, int shift){
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String decrypted = "";
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                int value = upperCase.indexOf(c);
                if(value == -1){
                    value = lowerCase.indexOf(c);
                    if(value - shift < 0){
                        decrypted = decrypted.concat(String.valueOf(lowerCase.charAt((26 + (value - shift)) % 26)));
                    }
                    else {
                        decrypted = decrypted.concat(String.valueOf(lowerCase.charAt((value - shift) % 26)));
                    }
                }
                else{
                    if(value - shift < 0){
                        decrypted = decrypted.concat(String.valueOf(upperCase.charAt((26 + (value - shift)) % 26)));
                    }
                    else {
                        decrypted = decrypted.concat(String.valueOf(upperCase.charAt((value - shift) % 26)));
                    }
                }
            } else {
                decrypted = decrypted.concat(String.valueOf(c));
            }
        }
        return decrypted;
    }

    public static void main(String[] args) {
        String sentance = "Code this phrase";
        int shift = 5;

        String cryptSentence = chipper(sentance, shift);
        System.out.println(cryptSentence);

        String decryptSentence = dechipper(cryptSentence, shift);
        System.out.println(decryptSentence);
    }
}