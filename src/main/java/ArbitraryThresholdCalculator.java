import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;

public class ArbitraryThresholdCalculator {
	public static double round(double value, int places) {
	    BigDecimal d = new BigDecimal(Double.toString(value));
	    d = d.setScale(places, RoundingMode.HALF_UP);
	    return d.doubleValue();
	}
	
	public static void main(String[] args) {
		double f0, f1, f2;
		double f3 = 0.25;
		
		double threshold1 = 0.25;
		double threshold2 = 0.50;
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a constant f3: ");
		f3 = input.nextDouble();
		System.out.println("Enter threshold 1: ");
		threshold1 = input.nextDouble();
		System.out.println("Enter threshold 2: ");
		threshold2 = input.nextDouble();
		*/
		
		int pointCount = 0;
		int numberOfPointsToPlot = 32;

		Random random = new Random();
	
		System.out.println("f0, f1, f2, f3");

		while(pointCount <= numberOfPointsToPlot) {
			f0 = round(random.nextDouble(), 2);
			f1 = round(random.nextDouble(), 2);			
			f2 = round(random.nextDouble(), 2);
			if(f0 != 0.00 && f1 != 0.00 && f2 != 0.00 &&
			   f0 > f1 &&
			   f3 > f2 &&
			   Math.abs((f0+f1)-(f0+f2)) < threshold1 && 
			   Math.abs((f2+f3)-(f1+f3)) < threshold2 &&
			   f0+f1+f2+f3 == 1.00) {
					System.out.println(f0+", "+f1+", "+f2+", "+f3);
					pointCount++;
			}
		}
	}
}