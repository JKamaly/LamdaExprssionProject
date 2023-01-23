package demos;

interface Cab{
	public String bookCan(String source, String destination);
}
/*class ola implements Cab{

	@Override
	public String bookCan(String source, String destination) {
		System.out.println("Ola cab is booked from "+ source+" To "+ destination);
		return ("price: 5000 Rs");
	}
	
}*/
 class Test{
	public static void main(String[] args) {
		Cab cab =( source,  destination)-> {System.out.println("Ola cab is booked from "+ source+" To "+ destination);
			return ("price: 5000 Rs");
			};
		System.out.println(cab.bookCan("Sacramento", "Virgina"));
		
		
	}
 }
