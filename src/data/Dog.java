//package tức là nơi để khuôn , tức là mỗi khuôn để một nơi 
package data;

public class Dog {
//	tạo khung ( khai báo khung )
	private String name;
	private int yob;
	private double weight;
	
	
@Override
	public String toString() {
		return "Dog [name=" + name + ", yob=" + yob + ", weight=" + weight + "]";
	}

	//	Khởi tạo các  một object ( nó như là cái phễu )
	public Dog(String name, int yob, double weight) {
		this.name = name;
		this.yob = yob;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYob() {
		return yob;
	}

	public void setYob(int yob) {
		this.yob = yob;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void bark() {
		System.out.println("go go ...");
		System.out.println("Bark name : "+ name);
	}
	
	
	
	
}
