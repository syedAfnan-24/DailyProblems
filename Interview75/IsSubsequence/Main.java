package leetCode.Interview75.IsSubsequence;

public class Main {
	public static void main(String args[]) {
		String s="axc";
		String t="ahbgdc";
		Solution obj = new Solution();
		SolutionWithRecursion obj1 = new SolutionWithRecursion();
		System.out.println(obj.isSubsequence(s, t));
		System.out.println(obj1.isSubsequence(s, t));
	}
}
