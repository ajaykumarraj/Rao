package hcare;

class FindPrime{
	public void prime(int num) {
		int i;
		for(i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println("It is not a prime number");
				break;
			}
		}
		if(num==i) {
			System.out.println(num+" is a prime number");
		}
	}
}


public class HealthCare {

	public static void main(String[] args) {
		FindPrime obj = new FindPrime();
		obj.prime(11);
	}

}
