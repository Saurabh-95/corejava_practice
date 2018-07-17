package india.DesingPatterns.BuilderPattern;

public class Phone 
{
private String os;
private int ram;
private String processor;
private double display;
private int battary;
public Phone(String os, int ram, String processor, double display, int battary) 
{
	this.os = os;
	this.ram = ram;
	this.processor = processor;
	this.display = display;
	this.battary = battary;
}
@Override
public String toString() {
	return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", display=" + display + ", battary="
			+ battary + "]";
}



}
