package leetCode.Interview75.IsSubsequence;

//Proble #392. day 2
public class SolutionWithRecursion {
	public boolean isSubsequence(String s,String t) {
		if(s.length()==0) {
			return true;
		}
		for(int i=0;i<t.length();i++) {
			if(t.charAt(i)==s.charAt(0)) {
				return isSubsequence(s.substring(1),t.substring(i+1));
			}
		}
		return false;
	}
}
