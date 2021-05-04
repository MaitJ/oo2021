package com.company;

import java.util.ArrayList;

public class Proov {
    public static void main(String[] args) {
        SirgePuhver puhver = new SirgePuhver("testarvud.txt");
        puhver.loeFaili();
        ArrayList<Double[]> sisendid = puhver.getSisendid();
        ArrayList<Double[]> vastused = puhver.arvuta();
        System.out.println(vastused.size());
        for (int i = 0; i < vastused.size(); ++i) {
            for (int j = 0; j < vastused.get(i).length; ++j) {
                System.out.println("i: " + i + " vastused: " + vastused.get(i)[j]);
            }
        }
    }
}
