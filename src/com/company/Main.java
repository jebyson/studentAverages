package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sf = new Scanner(new File("/Users/je565/IdeaProjects/studentAverages/src/com/company/StudentScores.in"));

        int maxIndx = -1;
        double i, sum, cnt, average;
        int roundedAverage;

        String [] text = new String[1000];

        while(sf.hasNext())
        {
            maxIndx++;
            text[maxIndx] = sf.nextLine();
        }
        sf.close();

        String [] total = new String[maxIndx + 1];

        for(int b = 0; b <= maxIndx; b++)
        {
            Scanner sc = new Scanner(text[b]);
            String name = sc.next();
            cnt = 0;
            sum = 0;
            average = 0;
            roundedAverage = 0;
            while(sc.hasNextInt())
            {
                cnt++;
                i = sc.nextInt();
                sum += i;
                average = sum/cnt;
                roundedAverage = (int)(Math.round(average));
            }
            total[b] = name + ", average = " + roundedAverage;
        }

        for(int c = 0; c <= maxIndx; c++)
        {
            System.out.println(total[c]);
        }

        /*
        for(int a = 0; a <= maxIndx; a++)
        {
            System.out.println(text[a]);
        }
         */

        /*
        roundedAverageFinal = (int)(roundedAverage);
        roundedAverageFinal = 0;
         */
    }
}
