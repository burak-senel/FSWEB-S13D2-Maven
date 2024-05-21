package org.example;

public class Main {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(int sayi){
sayi=Math.abs(sayi);
char[] charArray=String.valueOf(sayi).toCharArray();
String reversedSayi="";
for(int i=charArray.length-1;i>=0;i--){
reversedSayi+=charArray[i];
}
return reversedSayi.equalsIgnoreCase(String.valueOf(sayi));
    }
    public static boolean isPerfectNumber(int sayi){
        if(sayi<0)
            return false;
        int total=0;
        for(int i=1;i<=sayi/2;i++){
            if(sayi % i == 0){
                total+=i;
            }
        }
        return sayi==total;

    }
    public static boolean numberToWords(int sayi){
        sayi=Math.abs(sayi);
        char[] charArray=String.valueOf(sayi).toCharArray();
        String reversedSayi="";
        for(int i=charArray.length-1;i>=0;i--){
            reversedSayi+=charArray[i];
        }
        return reversedSayi.equalsIgnoreCase(String.valueOf(sayi));
    }
}
