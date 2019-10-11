
public class mainClass {
	
	//Static Variables to keep track of the average runtime in nanoseconds
	static double MiddleRunAvg = 0;
	static double RandomRunAvg = 0;
	static double MedianRunAvg = 0;
	
	public static void main(String[] args) {
		//Print a Header
		System.out.println("----List A Trials----");
		//Print the Trial Header and then run the trial method
		System.out.println("Trial 1");
		listATrial();
		System.out.println("Trial 2");
		listATrial();
		System.out.println("Trial 3");
		listATrial();
		System.out.println("Trial 4");
		listATrial();
		System.out.println("Trial 5");
		listATrial();
		//Print a Header
		System.out.println("----List B Trials----");
		//Print the Trial Header and then run the trial method
		System.out.println("Trial 1");
		listBTrial();
		System.out.println("Trial 2");
		listBTrial();
		System.out.println("Trial 3");
		listBTrial();
		System.out.println("Trial 4");
		listBTrial();
		System.out.println("Trial 5");
		listBTrial();
		//Print a Header
		System.out.println("----List C Trials----");
		//Print the Trial Header and then run the trial method
		System.out.println("Trial 1");
		listCTrial();
		System.out.println("Trial 2");
		listCTrial();
		System.out.println("Trial 3");
		listCTrial();
		System.out.println("Trial 4");
		listCTrial();
		System.out.println("Trial 5");
		listCTrial();
		//Print a Header
		System.out.println("----Average Runtimes----");
		//Calculate and Print the Average Runtimes
		System.out.println("The Middle Element Algorithm: "+MiddleRunAvg/15);
		System.out.println("The Random Element Algorithm: "+RandomRunAvg/15);
		System.out.println("The Median Element Algorithm: "+MedianRunAvg/15);
		
	}
	//A Method that run our 3 algorithms and prints the time results using List A
	private static void listATrial()
	{
		//create a variable to store the timer result
		double runTime;
		//Generate a List of type A
		int[] listA = Lists.getListA();
		//Start the Timer
		Stopwatch myTimer = new Stopwatch();
		//Call the quickSort Algorithm that uses the Middle Element
		quickSortBox.quickSortMiddle(listA, 0, listA.length-1);
		//Stop the timer
		runTime = myTimer.elapsedTime();
		//Print the time result
		System.out.println("Using the middle element: "+ runTime);
		//Add our result to the total runtime
		MiddleRunAvg += runTime;
		//Generate a List of type A
		listA = Lists.getListA();
		//Start the Timer
		Stopwatch myTimer2 = new Stopwatch();
		//Call the quickSort Algorithm that uses the Random Element
		quickSortBox.quickSortRandom(listA, 0, listA.length-1);
		//Stop the timer
		runTime = myTimer2.elapsedTime();
		//Print the time result
		System.out.println("Using a random element: "+ runTime);
		//Add our result to the total runtime
		RandomRunAvg += runTime;
		//Generate a List of type A
		listA = Lists.getListA();
		//Start the Timer
		Stopwatch myTimer3 = new Stopwatch();
		//Call the quickSort Algorithm that uses the Median Element
		quickSortBox.quickSortMedian(listA, 0, listA.length-1);
		//Stop the timer
		runTime = myTimer3.elapsedTime();
		//Print the time result
		System.out.println("Using the median of 3 random elements: "+ runTime);
		//Add our result to the total runtime
		MedianRunAvg += runTime;
	}
	//A Method that run our 3 algorithms and prints the time results using List B
	private static void listBTrial()
	{
		//create a variable to store the timer result
		double runTime;
		//Generate a List of type A
		int[] listB = Lists.getListB();
		//Start the Timer
		Stopwatch myTimer = new Stopwatch();
		//Call the quickSort Algorithm that uses the Middle Element
		quickSortBox.quickSortMiddle(listB, 0, listB.length-1);
		//Stop the timer
		runTime = myTimer.elapsedTime();
		//Print the time result
		System.out.println("Using the middle element: "+ runTime);
		//Add our result to the total runtime
		MiddleRunAvg += runTime;
		//Generate a List of type A
		listB = Lists.getListB();
		//Start the Timer
		Stopwatch myTimer2 = new Stopwatch();
		//Call the quickSort Algorithm that uses the Random Element
		quickSortBox.quickSortRandom(listB, 0, listB.length-1);
		//Stop the timer
		runTime = myTimer2.elapsedTime();
		//Print the time result
		System.out.println("Using a random element: "+ runTime);
		//Add our result to the total runtime
		RandomRunAvg += runTime;
		//Generate a List of type A
		listB = Lists.getListB();
		//Start the Timer
		Stopwatch myTimer3 = new Stopwatch();
		//Call the quickSort Algorithm that uses the Median Element
		quickSortBox.quickSortMedian(listB, 0, listB.length-1);
		//Stop the timer
		runTime = myTimer3.elapsedTime();
		//Print the time result
		System.out.println("Using the median of 3 random elements: "+ runTime);
		//Add our result to the total runtime
		MedianRunAvg += runTime;
	}
	//A Method that run our 3 algorithms and prints the time results using List C
	private static void listCTrial()
	{
		//create a variable to store the timer result
		double runTime;
		//Generate a List of type A
		int[] listC = Lists.getListC();
		//Start the Timer
		Stopwatch myTimer = new Stopwatch();
		//Call the quickSort Algorithm that uses the Middle Element
		quickSortBox.quickSortMiddle(listC, 0, listC.length-1);
		//Stop the timer
		runTime = myTimer.elapsedTime();
		//Print the time result
		System.out.println("Using the middle element: "+ runTime);
		//Add our result to the total runtime
		MiddleRunAvg += runTime;
		//Generate a List of type A
		listC = Lists.getListC();
		//Start the Timer
		Stopwatch myTimer2 = new Stopwatch();
		//Call the quickSort Algorithm that uses the Random Element
		quickSortBox.quickSortRandom(listC, 0, listC.length-1);
		//Stop the timer
		runTime = myTimer2.elapsedTime();
		//Print the time result
		System.out.println("Using a random element: "+ runTime);
		//Add our result to the total runtime
		RandomRunAvg += runTime;
		//Generate a List of type A
		listC = Lists.getListC();
		//Start the Timer
		Stopwatch myTimer3 = new Stopwatch();
		//Call the quickSort Algorithm that uses the Median Element
		quickSortBox.quickSortMedian(listC, 0, listC.length-1);
		//Stop the timer
		runTime = myTimer3.elapsedTime();
		//Print the time result
		System.out.println("Using the median of 3 random elements: "+ runTime);
		//Add our result to the total runtime
		MedianRunAvg += runTime;
	}
	//A Method that simply prints an array with 100 spots per line can be used to verify if a list sorted properly
	@SuppressWarnings("unused")
	private static void printArray(int[] iList)
	{
		int c=0;
		for(int i=0; i<iList.length-1; i++)
		{
			if(c<100){System.out.print(iList[i]+" ");}
			else {System.out.println(); c=0;}
			c++;
		}
	}
}
