package wrapperclassApplication;

public class wrapperuse {
	public static void main(String[] args) {
		int arg0=Integer.parseInt(args[0]);
		int arg1=Integer.parseInt(args[1]);
		
		if(arg0>arg1)
			System.out.println("maximum = "+arg0 );
		else
			System.out.println("maximum = "+arg1 );
	}
}
