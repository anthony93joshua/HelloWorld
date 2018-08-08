package com.a3j;

public class Main {
    static int a =1;

    public  void onCreate(){

      int i =1;
      System.out.println("this is variable "+i);
    }



    public static void main(String[] args) {
	System.out.println("hello "+a);
    Main c = new Main();
    c.onCreate();

    }
}
