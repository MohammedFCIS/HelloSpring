package com.tutorialspoint;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution extends t{
}
class t{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalNegSub = 0;
        if(n > 0 && n <= 100){
            int[] allArray = new int[n];
            for(int i = 0; i < n; i ++){
                int nextNum = sc.nextInt();
                if(nextNum >= -10000 && nextNum <= 10000){
                    allArray[i] = nextNum;
                }
                
            }
            for(int i = 0; i < n; i++){
                for(int j = i; j <= n; j++){
                    int currentTotal = 0;
                	int[] tmp = Arrays.copyOfRange(allArray, i,j);
                	for(int t:tmp){
                		currentTotal+= t;                        
                	}
                	if(currentTotal < 0){
                        totalNegSub ++;
                    }
                    
                }
            }
        }
        System.out.println(totalNegSub);
    }
}
