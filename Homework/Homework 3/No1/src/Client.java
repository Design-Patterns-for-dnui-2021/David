public class Client {
    public static void main(String[] args) {		
		TVFactory factory = new TVFactory();
		TV haier = factory.produce("Haier");
		haier.play();
		TV hisense = factory.produce("Hisense");
		hisense.play();
	}
}
