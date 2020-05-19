package org.merit.utils.Stats;
import java.util.Arrays;


public class Stats {

	//instance variables
	double mean;
	int mode;
	int median;
	int range;

		//Must contain methods to compute the mean, median, mode, and range
			//int arr[] = {};
			//int n = arr.length;
					
	//static int array[];
	
	//function for calculating mean
	public static double findMean(int a[], int n) {
				
			//find mean of array element
			int sum = 0;
			
			for (int i = 0; i < n; i++)
				sum += a[i];
			
		return (double)sum / (double)n;
	}
		
		//function for calculating median
		public static double findMedian(int a[],int n) {
		
		//first sort the array
			Arrays.sort(a);
			
			//check for even case
			if (n % 2 != 0)
				return (double) a[n / 2];
			
			return (double) (a[(n -1) / 2] + a[n / 2]) / 2.0;
		}
		
		//function for calculating mode
		public static int findMode(int a[]) {
			int maxValue = 0, maxCount = 0;
			
			for (int i = 0; i < a.length; ++i) {
				int count = 0;
				for (int j = 0; j < a.length; ++j) {
					if (a[j] == a[i]) ++count;
				}
				
				if (count > maxCount) {
					maxCount = count;
					maxValue = a[i];
				}
			}
			return maxValue;
			
		}
		
		//function for calculating range
		//function to calculate min from array
		public static int getMin(int a[], int n) 
		{
				int res = a[0];
				for(int i = 1; i < n; i++)
					res = Math.min(res,  a[i]);
				return res;
			}
		
		//function to calculate max from array
		public static int getMax(int a[], int n)
		{
				int res = a[0];
				for(int i = 1; i < n; i++)
					res = Math.max(res,  a[i]);
				return res;
		}
		
		public static int findRange(int a[], int n)
		{
			int max = getMax(a, n);
			int min = getMin(a, n);
			int findRange = max - min;
			return findRange;
		}
	

		//driver program
		public static void main(String args[])
		{
			int a[] = {-30 -1, 0, 3, 7, 8, 10, 12, 16, 20, 25, 27, 28, 32, 60};
			int n = a.length;
			System.out.println("Mean: " + findMean(a, n));
			System.out.println("Median: " + findMedian(a,n));
			System.out.println("Range: " + findRange(a,n));
			System.out.println("Mode: " + findMode(a));
			
		}
			

	//get and set
	public double getMean() {
		return mean;
	}

	public void setMean(double mean) {
		this.mean = mean;
	}

	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}

	public int getMedian() {
		return median;
	}

	public void setMedian(int median) {
		this.median = median;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}
	

	

	
	

}
