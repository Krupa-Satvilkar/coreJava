package inheritance;

class Car{
	   public Car() {}
	   public void vehicleType()
	   {
		System.out.println("Vehicle Type: Car");
	   }
	}
	class Maruti extends Car{
	   public Maruti(){}
	   public void brand()
	   {
		System.out.println("Brand: Maruti");
	   }
	   public void speed()
	   {
		System.out.println("Max: 90Kmph");
	   }
	}
	class Tata extends Maruti{
		public Tata() {}
		public void brand()
		{
			System.out.println("Brand: Tata");
		   }
		   public void speed()
		   {
			System.out.println("Max: 100Kmph");
		   }
	}
	public class multilevel extends Tata{

	   public multilevel()
	   {
		System.out.println("Maruti Model: 800");
	   }
	   public void speed()
	   {
		System.out.println("Max: 80Kmph");
	   }
	   public static void main(String args[])
	   {
		 multilevel obj=new multilevel();
		 obj.vehicleType();
		 obj.brand();
		 obj.speed();
	   }
	}