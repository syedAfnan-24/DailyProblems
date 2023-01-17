package leetCode.Interview75.FindPivotIndex;

public class PivotIdxSoln {
	public int pivotIndex(int nums[]) {
		int sum=0;
		for(int i:nums) {
			sum+=i;
		}
		int leftSum=0;
		for(int i=0;i<nums.length;i++) {
			if(leftSum == (sum-leftSum-nums[i])) {
				return i;
			}
			leftSum+=nums[i];
		}
		return -1;
	}
}
