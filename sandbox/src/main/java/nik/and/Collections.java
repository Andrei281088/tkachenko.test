package nik.and;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        String[] lang = {"Java","C#", "Ruby", "Phyton"};

        List<String> lang2 = Arrays.asList(lang);

        List<String> lan = new ArrayList<>();
        lan.add("Hello");
        lan.add(", ");
        lan.add("my ");
        lan.add("name ");
        lan.add("is ");
        lan.add("Andrei.");
        lan.add(5, "444 ");
        lan.add(5, "555 ");
        lan.add(5, "666 ");


        for(String i : lan){
            System.out.print(i);
        }

        for(String i : lang){
            System.out.println("I want to learn " + i);
        }

        List  inter = new ArrayList<>();

        inter.add(65);
        inter.add("gfdb");
        inter.add(0.32);
        inter.add(lan.get(1));




        int t = 1;

        for(Object i : inter){

            System.out.println(t + " element = " + i);
            t++;
        }
    }
}

