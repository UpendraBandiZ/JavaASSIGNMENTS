package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    class RegularExpression{
        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Enter Sentence:");
            String input = scanner.nextLine();
            String regex = "^[A-Z][A-Za-z0-9\\s]*[.]$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                System.out.println("Sentence begin with Capital and ends with Period.");
            }
            else{
                System.out.println("Sentence either does not begin with Capital or end with Period.");
            }
        }

    }


