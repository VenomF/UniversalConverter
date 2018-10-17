
public class Converter {
	
	public static double kgToLb(double kg) {
	    double lbs = kg * 2.2046;
		return lbs;
	}
	
	public static double lbToKg(double lbs) {
	       double kg = lbs / 2.2046;

		return kg;
	}
	
	public static double cmToInch(double cm) {
		return cm;
	}
	
	public static double inchToCm(double inch) {
		return inch;
	}
	
	public static double celsiusToFahrenheit(double c) {
		return c*1.8+32;
	}
	
	public static double fahrenheitToCelsius(double f) {
		return (f-32)/1.8;
	}
	
	public static void main(String[] args) {
		
	}

}
