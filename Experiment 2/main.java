package dnui;
import java.util.ArrayList;

class Stock implements Subject {
	private ArrayList<StockHolder> stockHolders = new ArrayList<StockHolder>();
	private double price = 100;
	private String name = "";
	
	Stock(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public void registlerholder(StockHolder holder) {
		stockHolders.add(holder);
	}
	
	@Override
	public void deleteholder(StockHolder holder) {
		stockHolders.remove(holder);
	}
	
	@Override
	public void notifyholder() {
		for (var : stockHolders) {
			holder.update(name, price);
		}
	}
	
	public void updatePrice(int price) {
		double prev = this.price;
		this.price = price;	
		double percent = Math.abs((price - prev) / prev) * 100;
		if (percent > 5) notifyholder();
	}

   
}

interface Subject {
	public abstract void registerholder(StockHolder holder);
	public abstract void deleteholder(StockHolder  holder);
	public abstract void notifyholder();
}

interface StockHolder {
	public abstract void update(String name, double price);
}
class David implements StockHolder {

	@Override
	public void update(String name, double price) {
		System.out.println("David,");
		System.out.println("Stock name : " + name + " fluctuated more than 5%, here are the new price result " + price);
	}

}
class Russell implements StockHolder {

	@Override
	public void update(String name, double price) {
		System.out.println("Russell,");
		System.out.println("Stock name : " + name + " fluctuated more than 5%, here are the new price result " + price);
	}

}

public class main {

	public static void main(String[] args) {
		StockHolder david = new David(); 
		StockHolder russell = new Russell();
		Stock bpy = new Stock("BPY", 100);
		bpy.registlerholder(david);
		
		Stock tsla = new Stock("TSLA", 100) {};
		tsla.registlerholder(russell);
		
		bpy.updatePrice(95);
		tsla.updatePrice(95);
	}

}
