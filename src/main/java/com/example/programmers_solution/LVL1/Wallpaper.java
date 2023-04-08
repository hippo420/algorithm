package com.example.programmers_solution.LVL1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Wallpaper {


    public static void main(String[] args) {
        String[] str={
                ".#...", "..#..", "...#."
        };
        String[] str1={
                "..........", ".....#....", "......##..", "...##.....", "....#....."
        };
        String[] str2={
                ".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."
        };
        String[] str3={
                "..", "#."
        };
        solution(str3);
    }

    public static int[] solution(String[] wallpaper) {
        int[] answer = {};

        List<Integer> xPos = new ArrayList<Integer>();
        List<Integer> yPos = new ArrayList<Integer>();

        for(int i=0; i<wallpaper.length;i++)
        {

            if(wallpaper[i].indexOf("#")>=0){
                if(wallpaper[i].indexOf("#") != wallpaper[i].lastIndexOf("#")){
                    if(wallpaper[i].indexOf("#")>=0){
                        xPos.add(i);
                        yPos.add(wallpaper[i].indexOf("#"));
                    }
                    if(wallpaper[i].lastIndexOf("#")>=0){
                        xPos.add(i);
                        yPos.add(wallpaper[i].lastIndexOf("#"));
                    }
                }else{
                    xPos.add(i);
                    yPos.add(wallpaper[i].indexOf("#"));
                }
            }
        }
        int[] result={Collections.min(xPos),Collections.min(yPos),Collections.max(xPos)+1,Collections.max(yPos)+1};

        return answer=result;
    }

}
