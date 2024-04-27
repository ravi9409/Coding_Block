package org.example;

public class StringPalindromeCheck {
    public static void main(String[] args) {
        String a = "abcbca";
        System.out.println(StringPalindrome(a));
    }

    public static boolean StringPalindrome(String word) {
       int i=0;
       int j=word.toCharArray().length-1;
       boolean flag=true;
       char[] word1=word.toCharArray();
       for (;i<word1.length;i++){
           while (i<j){
               if(word1[i]==word1[j])
               {
                   i++;
                   j--;
               }
               else {
                   flag=false;
                   break;
               }
           }
       }
       return flag;
    }
}