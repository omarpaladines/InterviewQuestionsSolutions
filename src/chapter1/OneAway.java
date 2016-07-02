// Problem 1.5 CTCI

package chapter1;

public class OneAway {
	
	// Assumes s is the longer string
	public boolean oneEdit (String s, String t, int bulb) {
		int diff = 0;
		int shift = 0;
		for (int i = 0; i < t.length(); i++) {
			if (s.charAt(i+shift) != t.charAt(i)) {
				if (diff == 1) return false;
				diff++;
				if (bulb == 1) shift++;
			}
		}
		return true;
	}
	
	
	public boolean oneEdit (String s, String t) {
		int sLength = s.length();
		int tLength = t.length();
		if (sLength > tLength + 1 || tLength > sLength + 1) 
			return false;
		
		if (sLength == tLength) {
			return oneEdit(s,t, 0);
		} else {
			if (sLength == tLength + 1) return oneEdit(s,t,1);
			return oneEdit(t,s, 1);
		}
	}

}
