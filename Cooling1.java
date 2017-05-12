package assignment;

public class Cooling1 {
	public static final double FREEZER_TEMPERATURE = -20;
	public static final double K = 0.001;

	public static void main(String[] args) {
		temperatureTest(70, 0);
		temperatureTest(70, 60); 
		temperatureReport(70);
		timeToCoolTest(70, -10);
		timeToCoolTest(70, -20);
	}

	
	
	public static double temperature(double initialTemperature, int seconds) {
		for(int i = 0; i<=seconds;i++){
			double dt = Math.abs(initialTemperature - FREEZER_TEMPERATURE);
			initialTemperature = initialTemperature-(K*dt);
		}
			
		return initialTemperature; 
	}

	
	
	public static void temperatureReport(double initialTemperature) {
		System.out.println("### Temperature Report");
		for(int i = 0;i<=3600;i++){
			double dt = Math.abs(initialTemperature - FREEZER_TEMPERATURE);
			initialTemperature = initialTemperature-(K*dt);
			if (i == 0) {
				System.out.printf("Minutes = 0" + " current temprature = " + "%5.1f",initialTemperature);
			}
			if (i == 600) {
				System.out.printf("\n" +"Minutes = 10" + " current temprature = " + "%5.1f",initialTemperature);
			}
			if (i == 1200) {
				System.out.printf("\n" +"Minutes = 20" + " current temprature = " + "%5.1f",initialTemperature);
			}
			if (i == 1800) {
				System.out.printf("\n" +"Minutes = 30" + " current temprature = " + "%5.1f",initialTemperature);
			}
			if (i == 2400) {
				System.out.printf("\n" +"Minutes = 40" + " current temprature = " + "%5.1f",initialTemperature);
			}
			if (i == 3000) {
				System.out.printf("\n" +"Minutes = 50" + " current temprature = " + "%5.1f",initialTemperature);
			}
			if (i == 3600) {
				System.out.printf("\n" +"Minutes = 60" + " current temprature = " + "%5.1f",initialTemperature);System.out.println("\n");
			}
		}
	}
	
	 
	
	public static int timeToCool(double initialTemperature, double targetTemperature) {
		if (targetTemperature <= FREEZER_TEMPERATURE){
			return -1;
		}
		int temp = 1;
		int timer = 0;
		for(int i =0;i<temp;i++){
			temp++;
			double dt = Math.abs(initialTemperature - FREEZER_TEMPERATURE);
			initialTemperature = initialTemperature-(K*dt);
			timer++;
			if(initialTemperature <= targetTemperature){
				break;
			}
		}
		return timer; 
	}

	
	public static void timeToCoolTest(double initialTemperature, double targetTemperature) {
		System.out.println("### Time To Cool");
		System.out.println("Initial temperature = " + initialTemperature);
		System.out.println("Target temperature = " + targetTemperature);
		int timeTaken = timeToCool(initialTemperature, targetTemperature);
		System.out.println("Time to cool = " + timeTaken + " seconds\n");
	}

	public static void temperatureTest(double initialTemperature, int seconds) {
		System.out.println("### Temperature Test");
		System.out.println("Initial temperature = " + initialTemperature);
		System.out.println("Seconds = " + seconds);
		double temp = temperature(initialTemperature, seconds);
		System.out.println("Temperature = " + temp + "\n");
	}
}


