package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        // write your code here
        int count = 0;
        for (long v = 1260; count<=100; v++) {
            int numberOfdigits = Long.toString(Math.abs(v)).length();
            if (numberOfdigits % 2 == 1) {
                continue;
            } else {
                ArrayList<String> permutations = permutation.generatePermutations(String.valueOf(v));

                for (int i=0;i< permutations.size();i++) {
                    // System.out.println(temp);
                    String temp= permutations.get(i);
                    int mid = temp.length() / 2;
                    int firstPart = Integer.parseInt(temp.substring(0, mid));
                    int secondPart = Integer.parseInt(temp.substring(mid, temp.length()));
                     //System.out.print(firstPart+" "+secondPart+" ");
                    if (firstPart%10 ==0&&secondPart%10==0) {
                        continue;
                    }
                    else if((firstPart*secondPart) == v) {
                        System.out.print(v + "  ");

                        count++;

                        break;
                    }
                }

            }
        }


    }
}
