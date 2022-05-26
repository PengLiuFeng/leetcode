package com.pengliufeng.leetcode.array;

import org.junit.Test;

import java.util.Arrays;

public class NumRescueBoats {

    @Test
    public void test(){
        int[] param = new int[]{3,2,2,1};
        numRescueBoats(param,3);
    }

    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int sum = 0 ;
        int start = 0 ;
        int end = people.length - 1;
        while (start <= end){
            if ((people[start]+people[end]) > limit){
                end--;
            }else {
                start++;
                end--;
            }
            sum++;
        }
        return sum;
    }

    private void sortArray(int[] people) {
        for (int i = 0; i < people.length; i++) {
            for (int j = 0 ; j < people.length-1 ; j++){
                if (people[j] < people[j+1]){
                    int temp = people[j];
                    people[j] = people[j+1];
                    people[j+1] = temp;
                }
            }
        }
    }
}
