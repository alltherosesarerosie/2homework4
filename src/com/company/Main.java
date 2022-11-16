package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList <String> a = arrayList();
        System.out.println(a);
        ArrayList <String> b = arrayList();
        System.out.println(b);
        Collections.reverse(b);

        ArrayList <String> c = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            c.add(a.get((i)));
            c.add(b.get((i)));
        }
        System.out.println("-----------------");
        System.out.println(c);

        System.out.println("-----------------");
        c.sort(Comparator.comparing(String::length));
        System.out.println(c);

    }
    public static ArrayList<String> arrayList(){
        System.out.println("enter 5 words");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String word = sc.nextLine();
            list.add(word);
        }
        return list;
    }







}
