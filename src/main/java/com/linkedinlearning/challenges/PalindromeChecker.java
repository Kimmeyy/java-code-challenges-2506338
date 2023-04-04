package com.linkedinlearning.challenges;


public class PalindromeChecker {
  
  static boolean isPalindrome(String word) {
    if (word.length()==1){
      return true;
    }
    boolean isPalindrome = false;
    StringBuilder string = new StringBuilder();
    string.append(word.replaceAll(" ", ""));
    char chars[] = new char[string.length()];
    string.getChars(0, string.length(), chars, 0);

    for(int i=0; i<(string.length()/2); i++) {
      if(chars[i]==chars[string.length()-1-i]){
        isPalindrome=true;
        continue;
      } else {
        isPalindrome=false;
      }
    }
    return isPalindrome;
  }
}
