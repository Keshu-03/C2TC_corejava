package Day11.v1;

import Day10.ArrayOperations;

public class UserInterface {

		public static void main(String[] args) {
			try {
				ArrayOperations obj= new ArrayOperations(new int[] {2,4,5,6});
				obj.displayArray();
				System.out.println("The element is: "+obj.getElement(2));
				System.out.println("The element is: "+obj.getElement(10));
			}catch(ArrayIndexOutOfBoundsException ae) {
				System.err.println("Error!..."+ ae.getMessage());
			}
			
		}

	}



