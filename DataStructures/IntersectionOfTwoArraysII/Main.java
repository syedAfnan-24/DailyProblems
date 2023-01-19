package leetCode.DataStructures.IntersectionOfTwoArraysII;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[]= {1,2,2,1};
		int nums2[]= {2,2};
		Solution obj = new Solution();
		int result[] = obj.intersect(nums1, nums2);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]+" ");
		}
	}

}
