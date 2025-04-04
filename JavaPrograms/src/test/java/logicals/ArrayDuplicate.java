package logicals;

public class ArrayDuplicate {

	public static void main(String[] args) {
		// create a string array and store into variable
		String[] ar = { "hello", "hi", "hello", "orange", "hello", "yellow", "orange" };

		// check the length of array
		int len = ar.length;
		// printing length
		System.out.println(len);

		for (int i = 0; i < ar.length; i++) {

			for (int j = i + 1; j < ar.length; j++) {

				int count = 0;

				if (ar[i].equals(ar[j])) {     // if it is equals count increase   

					count++;

				//	System.out.println(count);

					if (count == 1) {      // checks 1 0f 1 equals duplicate 

						System.out.println("duplicate");

					} else {

						System.out.println("not a duplicate");
					}

				}
			}

		}

	}

}
