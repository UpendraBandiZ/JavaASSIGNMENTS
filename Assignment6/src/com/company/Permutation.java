package com.company;
import java.util.ArrayList;
import java.util.Map;

class Permutation{
     static  ArrayList<String> a=new ArrayList<String>();
    public ArrayList<String > generatePermutations(String str)
    {
        int n = str.length();
        ArrayList<String> temp=new ArrayList<String>();

        permute(str, 0, n - 1);
        temp.addAll(a);
        a.removeAll(a);
        return temp;
    }
    static void permute(String str, int l, int r)
    {
        if (l == r)
            a.add( (str));
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        Permutation p=new Permutation();
       ArrayList<String > a2= p.generatePermutations("1260");

       for(String a1:a2){
           System.out.print(a1+" ");
       }

    }
}
