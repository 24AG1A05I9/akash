class FunctionCallByValue{

	//the value in the main block is copied to the function so it called as Call by value 
	// this call by value occurs only in java
	//call by refereces passes the original value to the function block it will happens in c++,c languesed and not in java
	public static void swap(int a,int b){
		int temp =a;
		a=b;
		b=temp;
		//System.out.println("a =" + a);
		//System.out.println("b =" + b);
	}
	public static void main(String args[]){
		int  a = 5;
		int b=10;
		swap(a,b);

		// this a and b are copied to the function and it doesnot print the changing value in the function
		//System.out.println("a =" + a);
		//System.out.println("b =" + b);
	}
	
}
