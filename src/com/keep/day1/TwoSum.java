package com.keep.day1;

import java.util.HashMap;

public class TwoSum {

     int [] indexs =  new int [2];
    public  int[] twoSum(int [] nums, int target){
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for (int i = 0 ; i < nums.length ; i ++){
             if (hash.containsKey(nums[i])){
                 indexs[0] =i;
                 indexs[1] = hash.get(nums[i]);
                 return  indexs;
             }
             hash.put(target-nums[i],i);
        }
        return indexs;
    }

    public static void main(String[] args) {
         int []  nums = new int[]{1,2,1,4,5};
        TwoSum twoSum = new TwoSum();
       for(int i = 0 ;i<twoSum.twoSum(nums,2).length; i ++ ) {
           System.out.println(twoSum.twoSum(nums,2)[i]);
       }
    }

}
