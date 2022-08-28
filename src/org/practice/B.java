package org.practice;

public class B {
	
	
	
	  private int test(int empId) {
		  
		  int res = 0;
		if (empId==10) {
			res=100;
		}
		  if (empId==20) {
			res=8900;
		}
		  if (empId==40) {
			res=78786;
		}
		return res;
		  
	  }
	  public static void main(String[] args) {
		B b = new B();
		int test = b.test(10);
		System.out.println(test);
	}
	  
	}


