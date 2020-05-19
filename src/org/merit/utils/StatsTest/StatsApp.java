package org.merit.utils.StatsTest;
import org.merit.utils.Stats.Stats;

public class StatsApp {
	
	//existing methods testMean testMedian testMode testRange - assert with appropriate parameters
	//methods to add: testRange, testIQR, testVariance, testStdDev
	
	public static void TestMean(int a[]) {
		double arrayMean = 15.5;
		
		if (Stats.findMean(a, 0) == arrayMean) {
			System.out.println("Pass");
		}else
			System.out.println("Fail");
			
		}
	
	public static void TestMedian(int a[]) {
		double arrayMedian = 14.0;
		
		if (Stats.findMedian(a, 0) == arrayMedian) {
			System.out.println("Pass");
		}else
			System.out.println("Fail");
			
		}
	
	public static void TestMode(int a[]) {
		double arrayMode = -31;
		
		if (Stats.findMode(a) == arrayMode) {
			System.out.println("Pass");
		}else
			System.out.println("Fail");
			
		}
	
	public static void TestRange(int a[]) {
		double arrayRange = 91;
		
		if (Stats.findRange(a, 0) == arrayRange) {
			System.out.println("Pass");
		}else
			System.out.println("Fail");
			
		}
}
		
	
	
