package com.example.programmers_solution.DP;

import java.util.*;

import static java.lang.Math.min;
public class Number_Tranfer_LVL2 {

    public static int mindepth=999999;
    public static int ans=999999;
    static List<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) {


        System.out.println(solution(10,40,5));
    }
    public static int solution(int x, int y, int n) {
        int answer = 0;


        if(x*2==y || x*3==y || x+n==y)
            return 1;

        int [] arr = new int[y+1] ;
        for(int i=0;i<=y;i++)
            arr[i]=mindepth;
        bfs(x,y,n,0,arr,3);
        bfs(x,y,n,0,arr,2);
        bfs(x,y,n,0,arr,1);
        return answer=mindepth;
    }
    public static void bfs(int cur_sum, int target, int n, int depth, int[] arr, int cal){
        System.out.printf("bfs:::cur_sum=%d, target=%d, target=%d\n", cur_sum, target,target);
        if(cur_sum==target) {
            arr[cur_sum] = min(depth, ans);
            return ;
        }else if(cur_sum>target)
            return;
        if(depth>mindepth)
            return;




        if(cal == 3 && cur_sum*3<=target){
            cur_sum*=3;
            if(arr[cur_sum]!=mindepth){
                ans = min(ans,arr[cur_sum]+1);
                return;
            }
        }else if(cal == 2&& cur_sum*2<=target){
            cur_sum*=2;
            if(arr[cur_sum]!=mindepth){
                ans = min(ans,arr[cur_sum]+1);
                return;
            }
        }else if(cal == 1&& cur_sum+n<=target){
            cur_sum+=n;
            if(arr[cur_sum]!=mindepth){
                ans = min(ans,arr[cur_sum]+1);
                return;
            }
        }

        for(int i=3;i>0;i--){
            bfs(cur_sum,target,n,depth+1,arr,i);
        }



    }

}

