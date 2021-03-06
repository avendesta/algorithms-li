package dynamic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class LeastPerfectSquareSumCount {
	// recursive algorithm
	static int lps1(int n) {
		if(n<=1)
			return n;
		int i = 1;
		int min = n;
		while(i*i<=n) {
			int c = lps1(n-i*i)+1;
			if(c<min)
				min = c;
			i++;
		}
		return min;
	}
	
	static HashMap<Integer, Integer> table = new HashMap<Integer,Integer>();
	// recursive dynamic algorithm
	static int lps2(int n) {
		if(table.containsKey(n)) {
			return table.get(n);}
		if(n<=1) {
			table.put(n, n);
			return n;
		}
		int i = 1;
		int min = n;
		while(i*i<=n) {
			int c = lps2(n-i*i);
			if(c<min)
				min = c;
			i++;
		}
		table.put(n, min+1);
		return min+1;
	}
	
	// recursive algorithm
	static List<Integer> lps3(int n) {
		List<Integer> s = new ArrayList<Integer>();
		if(n == 0)
			return s;
		if(n == 1) {
			s.add(1);
			return s;
		}
		int i = 1;
		List<Integer> min = new ArrayList<Integer>();
		for(int k = 0; k<n; k++)
			min.add(1);
		while(i*i<=n) {
			List<Integer> c = new ArrayList<Integer>(lps3(n-i*i));
			c.add(i*i);
			if(c.size()<min.size())
				min = c;
			i++;
		}
		return min;
	}
	
	public static void main(String[] args) {
//		System.out.println(lps1(64));
		System.out.println(lps2(7));
		System.out.println(lps3(12));
	}
	
}
