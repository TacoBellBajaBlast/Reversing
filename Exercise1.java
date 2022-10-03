package Exercise1;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Value to hold the given and reversed number
		int num = 12345;
		int reversed = 0;
		
		//Display the given number
		System.out.println("The given number is: " + num);
		
		//While loop to reverse
		while (num > 0) {
			int hold = num % 10;
			reversed = reversed * 10 + hold;
			num /= 10;
		}
		
		//Display the reversed number
		System.out.println("The reversed number is: " + reversed);
	}
}
