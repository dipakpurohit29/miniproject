package com.project1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int usernumber = 0;
        do{
            System.out.println("Guess my number(1-100)");
            usernumber = sc.nextInt();
            if(usernumber == myNumber){
                System.out.println("WOOHOOO .. CORRECT NUMBER!!");
                break;
            }
            else if(usernumber > myNumber){
                System.out.println("your number is too large");
            }
            else{
                System.out.println("your number is too small");
            }
        }while(usernumber >=0);

        System.out.println("MY number was : ");
        System.out.println(myNumber);
    }

}
