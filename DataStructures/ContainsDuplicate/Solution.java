package leetCode.DataStructures.ContainsDuplicate;

import java.util.Arrays;
//Problem 217 Day1
public class Solution {
    public boolean containsDuplicate(int[] nums) {
       
       Arrays.sort(nums);
       for(int i=1;i<nums.length;i++){
           if(nums[i]==nums[i-1]){
               return true;
           }
       }
       return false; 
    }
}
