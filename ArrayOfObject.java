package ArrayDemo;
import java.util.Scanner;

	class College{
		private int id;
		private String name;
		private String address;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public College(int id, String name, String address) {
			super();
			this.id=id;
			this.name=name;
			this.address=address;
			// TODO Auto-generated constructor stub
		}
	static void getArray() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter no of colleges:");
			int n= sc.nextInt();
			College[] colleges=new College[n];
			for(int i=0;i<n;i++) {
				System.out.println("Enter Id:");
				int id= sc.nextInt();
				System.out.println("Enter Name:");
				String name= sc.next();
				System.out.println("Enter Adress:");
				String address= sc.next();
				colleges[i]=new College(id, name, address);
			}
			for(int i=0;i<n;i++) {
			System.out.println("Id:"+colleges[i].getId());
			System.out.println("Name:"+colleges[i].getName());
			System.out.println("Address:"+colleges[i].getAddress());
		}
		
	}
	}
	public class ArrayOfObject {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		College.getArray();
}
	}

