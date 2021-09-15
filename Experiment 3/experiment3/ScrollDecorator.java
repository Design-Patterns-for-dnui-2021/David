package experiment3;
public abstract class ScrollDecorator implements UI {
	protected UI component;
	
	public ScrollDecorator(UI component) {
		this.component = component;
	}
	
	@Override
	public abstract double scroll();
	@Override
	public abstract void info();
}