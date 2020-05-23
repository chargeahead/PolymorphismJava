
public class Dog extends Animal{
	public Dog(String color,double weight) {
		super(color,weight);
	}
	@Override
	public void speak() {
		System.out.println("I am a dog");
	}

}
