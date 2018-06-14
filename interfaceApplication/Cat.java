package interfaceApplication;

public class Cat implements Animals {

	@Override
	public void speak() {
		System.out.println("cat`s sound");
		
	}

	@Override
	public void eat() {
       		
		System.out.print("cat`s food");
	}
	
	public static void main(String args[])
    {
   	Cat obj = new Cat();
   	 obj.speak();
   	 obj.eat();
    }
	
	
	
	

}
