package data;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new xin vùng nhớ mới 
		Dog nic = new Dog("NicSon", 2023,0.75);
		nic.bark();
//		ENCAPSULATION : Tính đóng gói thông tin và hành động , gói mọi thứ vào trong class
//		sẽ nhân bản ra Object , Object nào sẽ hành động trong khuôn khổ Object đó
//		SetWeight
		System.out.println("After Weight ");
		nic.setNewWeight(5);
		nic.bark();
		
		int nicYob = nic.getYob();
		System.out.println("Yob : " + nicYob);
	}

}
