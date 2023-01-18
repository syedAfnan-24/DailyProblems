package leetCode.Interview75.IsSubsequence;

//Proble #392. day 2
public class Solution {
	public boolean isSubsequence(String s,String t) {
		if(s.length()==0) {
			return true;
		}
		int idx = 0;
		for(int i=0;i<t.length();i++) {
			if(t.charAt(i)==s.charAt(idx)) {
				idx++;
				if(idx==s.length()) {
					return true;
				}
			}
		}
		return false;
	}
}
