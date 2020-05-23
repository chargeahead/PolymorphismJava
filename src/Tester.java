
public class Tester {
  public static void main(String args[]) {
	  Animal animal = new Animal("grey",20.0);
	  animal.eat();
	  animal.eat("cookie");
	  
	  Animal dog = new Dog("black",30);
	  Animal cat = new Cat("white",20);
	  
	  animal.speak();
	  dog.speak();
	  cat.speak();
  }
}
