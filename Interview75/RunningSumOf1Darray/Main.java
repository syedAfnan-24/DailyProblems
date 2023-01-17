package leetCode.Interview75.RunningSumOf1Darray;

public class Main {
	public static void main(String args[]) {
		int nums[]= {1,1,1,1,1};
		RunningSumSoln ob= new RunningSumSoln();
		
		ob.runningSum(nums);
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
