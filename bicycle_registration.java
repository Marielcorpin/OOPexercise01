public class bicycle_registration
{
		public static void main(String[] args){
			bicycle bike_1, bike_2, bike1, bike2;
			String tag1, tag2, owner1, owner2;

			bike1=new bicycle();
			bike1.setOwnerName("Mariel Corpin");
			bike2=new bicycle();
			bike2.setOwnerName("Zeinab Harake");

			bike_1=new bicycle();
			bike_1.settagNo("2002-194R");
			bike_2=new bicycle();
			bike_2.settagNo("2022-234T");


			owner1=bike1.getOwnerName();
			owner2=bike2.getOwnerName();

			tag1=bike_1.gettagNo();
			tag2=bike_2.gettagNo();

			System.out.println(owner1+" owns a Bicycle \nWith a tag number: "+tag1 );
			System.out.println(owner2+" also owns a Bicycle \nWith a tag number: "+tag2);
		}
}
