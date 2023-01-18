package leetCode.DataStructures.MergeSortedArray;

public class Main {

	public static void main(String[] args) {
		int nums1[]= {1,2,3,0,0,0};
		int nums2[]= {2,5,6};
		int m=3;
		int n=3;
		
		Solution obj = new Solution();
		obj.merge(nums1, m, nums2, n);
		for(int i=0;i<nums1.length;i++) {
			System.out.print(nums1[i]+" ");
		}

	}

}
