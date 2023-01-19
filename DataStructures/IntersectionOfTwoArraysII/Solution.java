package leetCode.DataStructures.IntersectionOfTwoArraysII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


//problem #350. Day3
public class Solution {
	public int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> list = new ArrayList<Integer>();
        
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(map1.containsKey(nums1[i])){
                map1.put(nums1[i],map1.get(nums1[i])+1);
            }else{
                map1.put(nums1[i],1);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(map2.containsKey(nums2[i])){
                map2.put(nums2[i],map2.get(nums2[i])+1);
            }else{
                map2.put(nums2[i],1);
            }
        }

        for(int k : map1.keySet()){
            if(map2.containsKey(k)){
                int x = Math.min(map1.get(k),map2.get(k));
                while(x-- > 0){
                    list.add(k);
                }
            }
        }

        int arr[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
	}
}
