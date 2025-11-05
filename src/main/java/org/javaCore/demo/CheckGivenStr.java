package org.javaCore.demo;

public class CheckGivenStr {

    public boolean startHi(String str) {

        if(str.startsWith(str)) {
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {

        CheckGivenStr c = new CheckGivenStr();

       System.out.println(c.startHi("hi hello"));
       System.out.println(c.startHi("HI Hello"));
       System.out.println(c.startHi("Hello Everyone"));

    }
}
