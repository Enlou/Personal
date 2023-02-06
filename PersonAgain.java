package coding;

public class PersonAgain {

	public static void main(String[] args) {
		Person x = new Person();
		Person y = new Person();
		Person z = new Person();

		x.name = "Alex";
		x.gender = "Male";
		x.weight = 66.8;
		x.numOfJowa = 2;
				
		y.name = "David";
		y.gender = "Male";
		y.weight = 78;
		y.numOfJowa = 10;
				
		z.name = "OtherPeople";
		z.gender = "Female";
		z.weight = 56;
		z.numOfJowa = 3;
				
		System.out.println(x.name + " " + x.gender + " " + x.weight + " " + x.numOfJowa);
		System.out.println(y.name + " " + y.gender + " " + y.weight + " " + y.numOfJowa);
		System.out.println(z.name + " " + z.gender + " " + z.weight + " " + z.numOfJowa);

	}

}
