package leetCode.DataStructures.TwoSum;

import java.util.HashMap;
//Problem #1 day2
public class Solution {
	public int[] twoSum(int nums[],int target) {
		// for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<i;j++){
        //         if((nums[i]+nums[j])==target){
        //             int arr[] = {i,j};
        //             Arrays.sort(arr);
        //             return arr;
        //         }
        //     }
        // }
        // return nums;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			
			int compliment = target - nums[i];
			
			if(map.containsKey(compliment)) {
				return new int[] {map.get(compliment),i};
			}else {
				map.put(nums[i], i);
			}
		}
		return nums;
	}
}
