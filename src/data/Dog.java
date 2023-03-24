//package tức là nơi để khuôn , tức là mỗi khuôn để một nơi 
package data;

public class Dog {
//	class gom tất cả các cái Object có chung đặc điểm
//	Chứa đặc điểm , chi tiết  cái khuôn 
	private String name;
	private int yob;
	private double weight;
	
//	Có khuôn thì cần có phễu để đổ vật liệu vào
//	nhận vật liệu, construct object
//	Phễu là hàm không có giá trị trả về, không void luôn 
//	Mỗi lần call là một lần create vì là tạo ra ( hàm khởi tạo)
//	Mỗi lần gọi là sinh ra một Object mới
	public Dog(String iName, int iYob, double iWeight) {
		name = iName;
		yob = iYob;
		weight = iWeight;
	}
//	Object là một hành động, behaviour , xử lý tính toán xử  lý trên biến từ lúc đúc ra
//	Hàm gọi ( gọi nhìu lần ) các hành động lặp đi lặp lại  trên Object đó
	public void bark() {
//		System.out.println("My name is " + name);
//		System.out.println("My yob is " + yob);
//		%-10s - in ra chuỗi chiếm 10 space căn trái , 4d,4f là chiếm 4 kí tự 
		System.out.printf("Name: %-10s - Yob: %4d - Weight: %4.1f\n",name,yob,weight);
	}
//	Thay đổi info ban đầu 
	public void setNewWeight(double newWeight) {
		weight = newWeight;
		
	}
//	Mặc định là Info sẽ được giấu , khi giao tiếp mới bật ra
//	Chia sẻ Info khi được hỏi , đó gouj là method hàm hành động get()
	
	public int getYob() {
		return yob;
	}
}
