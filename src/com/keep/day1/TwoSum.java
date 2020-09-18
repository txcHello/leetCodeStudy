package com.keep.day1;

import org.omg.CORBA.CharSeqHelper;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
          int[] a = new int[]{1,2,4,5};
        int[] indexs = TwoSum.findIndexs(a, 6);
        for (int i= 0  ;i <indexs.length;i++) {
            System.out.println(indexs[i]);
        }

    }

    public  static  int[] findIndexs(int[] nums, int target){

        int[] indexs = new int[2];
        HashMap<Integer,Integer> hash = new HashMap<>();
        for (int i =0 ; i<nums.length ; i++){

            if (hash.containsKey(nums[i])){
                indexs [0]=i;
                indexs[1] =hash.get(nums[i]);
            }
            hash.put(target-nums[i],i);
        }
        return  indexs;
    }


}
