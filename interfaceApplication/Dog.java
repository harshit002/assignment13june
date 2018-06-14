package interfaceApplication;

public class Dog implements Animals {

	@Override
	public void speak() {
		
		System.out.println("Dog`s sound");
	}

	@Override
	public void eat() 
	{
		System.out.print("Dog`s food");
		
	}
     public static void main(String args[])
     {
    	 Dog obj = new Dog();
    	 obj.speak();
    	 obj.eat();
     }
}
