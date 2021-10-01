//Create a program/page to take user name as input or as an api param, and display/return the following
//        A random generated id -> Different every time
//        Name that comes as a param
//        Date&Time of the request
/**
 DOCUMENTATION
 Author : Shivam Bankar
 Created on : 30-9-2021
 Company : Avtaar

 This program is a first assignment.
 */

package com.company;

import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Assignment1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = s.next();
        Random random = new Random();      // creating an object of Random class
        int x = random.nextInt(1000);       // Generates random integers between 0 to 999
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println("ID : "+ x);
        System.out.println("Name : "+ name);
        System.out.println("Date and Time : "+ dateFormat.format(date) );
    }
}





