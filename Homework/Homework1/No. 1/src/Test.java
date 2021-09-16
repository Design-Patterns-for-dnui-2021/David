public class Test {
    public static void main(String[] args) {
		Person person1 = new Person("David");
		Person person2 = new Person("Russell");
		Person person3 = new Person("Ren");
		
		person1.registerObserver(person2);
		person1.registerObserver(person3);		
		
		person2.registerObserver(person1);
		person2.registerObserver(person3);
		
		person3.registerObserver(person1);
		person3.registerObserver(person2); 
		
		person1.beat();
		person2.beat();
		person3.beat();
	}
}
