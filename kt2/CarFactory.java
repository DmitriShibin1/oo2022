public class CarFactory {

   String name;
   int age;
   int carsCount;

   public CarFactory(String name, int age, int carsCount) {
   this.name = name;
   this.age = age;
   this.carsCount = carsCount;

   System.out.println("meie tehase nimi on " + this.name);
   System.out.println("meie tehas ilmunud " + this.age + " aastat tagasi");
	   System.out.println("Selle aja jooksul tegime " + this.carsCount +  " autoid");
	   System.out.println("keskmiselt aastas teeme " + (this.carsCount/this.age) + " autoid");
}

   public static void main(String[] args) {

       CarFactory ford = new CarFactory("Ford", 115 , 50000000);
   }
}
