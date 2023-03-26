package data;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new xin vùng nhớ mới 
		Dog nic = new Dog("NicSon", 2023,0.75);
		Dog ky = new Dog("Kyy",2022,0.98);
		
		System.out.println("Name : " + nic.getName());
		nic.bark();
		
//		ENCAPSULATION : Tính đóng gói thông tin và hành động , gói mọi thứ vào trong class
//		sẽ nhân bản ra Object , Object nào sẽ hành động trong khuôn khổ Object đó
//		SetWeight 
		System.out.println("Weight before changer: " + nic.getWeight());
		nic.setWeight(5);
		System.out.println("Weight after changer: " + nic.getWeight());
		System.out.println("Yob : " + nic.getYob());
		
//		
	}

}
