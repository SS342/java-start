package com.max.idea;

import java.util.*;

class Main{
    public static void main(String[] argments){

        Random generator = new Random();

        int value = generator.nextInt();

        System.out.println("Random number -> "
            + value);
    }
}
