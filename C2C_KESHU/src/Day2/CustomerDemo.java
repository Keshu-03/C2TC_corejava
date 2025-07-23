package Day2;

public class CustomerDemo {
	public static  void main(String[] args) {
		 Customer cus1 = new Customer();
		 Customer cus2 = new Customer(41,"shalini","cuddalore");
		 Customer cus3 = new Customer(21,"keshu");
		
		 //cus1.setId(41);
		 cus2.setId(62);
		// cus1.setName("Shalini");
		 cus2.setName("Ram");
		// cus1.setCity("Cuddalore");
		 System.out.println(cus1);
		 System.out.println(cus2);
		 System.out.println(cus3);
		 System.out.println("Customer 1 city : " + cus1.getCity() + " Customer 1 name : " + cus2.getName() );
		 
	}

}

