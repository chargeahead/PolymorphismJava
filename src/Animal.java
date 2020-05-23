
public class Animal {
  String color;
  double weight;
  public Animal(String color, double weight) {
	  this.color = color;
	  this.weight = weight;
  }
  public void speak() {
	  System.out.println("Hello from animal. My color is "+color+" my weight is "+weight);
  }
  public void eat() {
	  System.out.println("I am eating food");
  }
  public void eat(String treat) {
	  System.out.println("I am eating treat:"+treat);
  }
}
