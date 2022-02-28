package cuadro;

public class Suelo {

	
	public String material;
	public String pattern;
	public double lenght;
	public double width;
	public String color;
	public boolean isDirty;
	public boolean isScratched;
	public boolean isOld;
	
	
	
	public Suelo() {
		
		this.material="";
		this.pattern="";
		this.lenght=0.0;
		this.width=0.0;
		this.isDirty=false;
		this.isOld=false;
		this.isScratched=false;
		
				
	}
	public Suelo(boolean isDirty, boolean isOld, boolean isScratched) {
		this.isDirty = isDirty;
		this.isOld = isOld;
		this.isScratched = isScratched;
		
	}
	
	public Suelo(double lenght, double width) {	
		this.lenght=lenght;
		this.width= width;
		
	}
	
}
