package leetCode.DataStructures.TwoSum;

public class Main {
	public static void main(String args[]) {
		int nums[]= {3,2,4};
		int target = 6;
		Solution obj = new Solution();
		int result[] = obj.twoSum(nums, target);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}
}
