package experiment3;
public final class Vertical extends ScrollDecorator {
	public Vertical(UI component) {
		super(component);
	}

	@Override
	public double scroll() {
		return this.component.scroll();		
	}

	@Override
	public void info() {
		this.component.info();
		System.out.println("Vertical Scroll");
	}
}