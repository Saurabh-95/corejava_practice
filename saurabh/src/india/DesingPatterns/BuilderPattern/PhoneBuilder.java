package india.DesingPatterns.BuilderPattern;

public class PhoneBuilder 
{
	private String os;
	private int ram;
	private String processor;
	private double display;
	private int battary;
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setDisplay(double display) {
		this.display = display;
		return this;
	}
	public PhoneBuilder setBattary(int battary) {
		this.battary = battary;
		return this;
	}
	
	public Phone getPhone()
	{
		return new Phone(os, ram, processor, display, battary);
		
	}

}
