
package com.stage1;


public class StringWed {
    public static void main(String[] args) {
        
        /*
        // has own pool - different path to location
        String word = "Java"; // string literal - can be used anytime
        String word2 = new String("Java"); // string by new keyword*/
        
        /*
        // charAt() - it will get the character at specific index
        String name = "Winter";
        System.out.println(name.charAt(0));
        
        // use case:
        String lastName = "Simara";
        String firstName = "Daniella";
        String middleName = "";
        
        System.out.println(lastName + ", " + firstName + " " + middleName.charAt(0) + "."); */
        
        /*
        String word = "Java";
        String phrase = "I love";
        System.out.println(word.length());
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println(phrase + " " + word);*/
        
        /*        
        String word = "Java";
        System.out.println(word.startsWith("Java"));
        System.out.println(word.endsWith("a")); */
        
        /*
        String word = "Java";
        System.out.println(word.indexOf("a"));
        System.out.println(word.indexOf("a", word.indexOf("a") +1)); */
        
        /*
        String word = "Java ";
        System.out.println(word.isEmpty());
        System.out.println(word.trim());
        
        String word1 = "  b o o k  ";
        word1.trim(); // unused. Need to put in a variable
        System.out.println(word1); */
        
        /*
        String hero = "Superman";
        
        System.out.println(hero.replace(hero, "Batman"));
        
        // charArray
        char[] charArray = hero.toCharArray();
        for (char ch : charArray) {
            System.out.println(ch);
        } */
        
        /*
        // valueOf() -> converting a primitive datatype to a String or vice versa
        int number = 1;
        
        String str = String.valueOf(number);
        System.out.println(str);
        
        String str1 = "100";
        int num = Integer.valueOf(str1);
        System.out.println(num); */
        
        // parsing - different class from primitive DT to String
        String str = "100x";
        int number = Integer.parseInt(str);
        System.out.println(number);
        
        // casting -> same class
        // down casting
        double num = 100;
        int n = (int) num;
        System.out.println(n);
        
        // up casting
        int x = 100;
        double y = x;
        System.out.println(y);
    }
}
