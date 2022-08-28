package org.string;

public class StringTypes {
	public static void main(String[] args) {
		String s1="Arun";
		String s2="Benze";
		String a1 = s1.concat(s2);
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(a1));
		
		StringBuffer s3 = new StringBuffer("Arun");
		StringBuffer s4 = new StringBuffer("Benze");
		StringBuffer a2 = s3.append(s4);
		
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(a2));
		
	StringBuilder s5 = new StringBuilder("Arun");
	StringBuilder s6 = new StringBuilder("Benz");
	StringBuilder a3 = s5.append(s6);
	
	System.out.println(System.identityHashCode(s5));
	System.out.println(System.identityHashCode(s6));
	System.out.println(System.identityHashCode(a3));
		
		
		
		
		
		
	
		
		
		
		
		
		
	}

}
