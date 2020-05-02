import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SortFunctions {

	static int middle;
	static int search_element;
	
	//Reads middle element of the array
	public static double ReadFunction(ArrayList<Integer> array1list) {

		long startTime=System.nanoTime();// initializes the timer
		
		//Sets middle variable equal to the array1list divided by 2
		middle=array1list.get(array1list.size()/2);
		
		//Variable to keep track of when the function stopped
		long stopTime=System.nanoTime();
		
		//Calculates the time it takes to run the Read Function 
		double timer=stopTime-startTime; 
		
		return timer;       

		
	}

	//Searching for specific element in array
	public static double SearchFunction(ArrayList<Integer> array1list, int element) {
		
		//initializes the timer
		long startTime=System.nanoTime();

		int i;

		for(i=0; i<array1list.size(); i++) {
			
			//Searches for the specified element in the array
			if(array1list.get(i)==element) {
				
				//Variable set equal to the element being searched
			    search_element=array1list.get(i);
			}
		}

		long stopTime=System.nanoTime();

		double timer=stopTime-startTime; //Calculates the time it took to run the function 
				
		return timer;       


	}
	
	//Inserts Element into first position of my Array
	public static double InsertFunction(ArrayList<Integer> array1list, int index) {

			long startTime=System.nanoTime(); //initializes the timer
			
			//Adding 230 to the beginning of the array
			array1list.add(0,230);

			long stopTime=System.nanoTime();

			double timer=stopTime-startTime; //calculates time to run function 
			
			return timer;
			
	}

	//Deleting the second element in the array 
	public static double DeleteFunction(ArrayList<Integer> array1list, int position) {

			long startTime=System.nanoTime();
			
			//If array has no elements then it will remove the 0th element
			if(array1list.size()==1) {
				
				array1list.remove(0);
				
			} else {
			
			//Removing the first element of the array 
			array1list.remove(1);
			}
			
			long stopTime=System.nanoTime();

			double timer=stopTime-startTime;
			
			return timer;
		
	}
	
	// Create SelectionSort method 
	public static double SelectionSort(ArrayList<Integer> array1list) {

		long startTime=System.nanoTime();

		for (int i = 0; i < array1list.size(); i++) {
			
			// finding position of smallest number between (i + 1)th element and last element
			int position = i;

			for (int j = i; j < array1list.size(); j++) {
				
				//Sets the position equal to the smallest element in the array
				if (array1list.get(j) < array1list.get(position)) {
					position = j;
				}
			}

			// Swap minimum number (smallest number) to current position on array
			int min = array1list.get(position);
			array1list.set(position, array1list.get(i));
			array1list.set(i, min);	        
		}
		
		long stopTime=System.nanoTime();

		double timer=stopTime-startTime;

		return timer;

	}
	
	
	//Create Recursive Quick Sort Function
	public static ArrayList<Integer> quickSort(ArrayList<Integer> array1list) {
		
	    //long startTime=System.nanoTime();

	    if (array1list.isEmpty()) 
        return array1list; // start with recursion base case
	    
	    // sorted list to return 
	    	ArrayList<Integer> sorted;   
	    
	    	// Integers smaller than pivot
	    ArrayList<Integer> smaller = new ArrayList<Integer>(); 
	    
	    // Integers greater than pivot
	    ArrayList<Integer> greater = new ArrayList<Integer>(); 
	   
	    Integer pivot = array1list.get(0);  // first Integer in list, used as pivot
	    
	    int i;
	    Integer j;     // Variable used for Integers
	    
	    for (i=1;i<array1list.size();i++)
	    {
	        j=array1list.get(i);
	        if (j.compareTo(pivot)<0)   
	           
	        	smaller.add(j);
	        
	        else
	       
	        	greater.add(j);
	    }
	    
	    // Capitalize 'smaller'
	    smaller=quickSort(smaller);  
	    
	    // sorting both halves recursively
	    greater=quickSort(greater);  
	    
	    // add initial pivot to the end of the sorted smaller Integer
	    smaller.add(pivot);         
	    // add the sorted Integers to the smaller ones
	    smaller.addAll(greater);     
	    
	    // assign it to sorted; one could just as well do: return smaller
	    sorted = smaller;            
				
		return sorted;
		
	}
	
	//Creating Quick Sort Main method
	public static double quickSortMain(ArrayList<Integer> array1list) {
		
	        long startTime=System.nanoTime();
	        
	        //Calling the quickSort function with array1list
	        SortFunctions.quickSort(array1list);
		    
	        	long stopTime=System.nanoTime();
			
			double timer=stopTime-startTime;
			
			return timer;
		
	}
	
	// Create InsertionSort Method
	public static double InsertionSort(ArrayList<Integer> array1list) {
		
		long startTime=System.nanoTime();
		
		//temporary variable to keep track of smallest element
		int bar;
		
		//Looping through the array1list 
		for (int i = 1; i < array1list.size(); i++) {
			
			//Nested for loop to check for if the next element is less than i
			for(int j = i ; j > 0 ; j--){
				
				//Comparing the current element to the last element of the arraylist 
				if(array1list.get(j) < array1list.get(j-1)) {
					
					//Setting temporary variable equal to j
					bar = array1list.get(j);
					
					//Inserting last element at its correct position in the sorted array
					array1list.set(j, array1list.get(j-1));
			
					//Copying the value stored in bar to the opening in the array
					array1list.set(j-1,bar);
				}
			}

		}

		long stopTime=System.nanoTime();

		double timer=stopTime-startTime;
		
		return timer;
		
	}

	
	public static ArrayList<Integer> CreateList(int size) {
		
		/*Creating new ArrayList for different values of N*/
		ArrayList<Integer> originalList= new ArrayList<Integer>();
		
		int i;
		
		for(i=0; i<size; i++) {
		
	    Random rand = new Random();

	    // Obtaining a random number.
	    int n = rand.nextInt(10);
	    
	    //Adding each value of n to the originalList
	    originalList.add(n);
	   
		}
		
		return originalList;
	}
	
	
	
	public static void main(String[] args) {

		/*Creating ArrayList*/
		ArrayList<Integer> array1list= new ArrayList<Integer>(); {
		
		//Adding elements to the arraylist 
		array1list.add(3);
		array1list.add(10);
		array1list.add(7);
		array1list.add(5);
		array1list.add(1);
	
		System.out.print("The Array List values are:  ");
		System.out.println(array1list);
		
		System.out.print("Middle:  ");
		
		//Printing out the middle element of the array1list
		SortFunctions.ReadFunction(array1list);
		System.out.println(middle);
		
		System.out.print("Search For 10:  ");
		
		//Searching for 10 in the array1list
		SortFunctions.SearchFunction(array1list, 10);
		System.out.println(search_element);
		
		//Adding 230 to the Oth position of the array1list
		System.out.print("Inserts 230 First:");
		SortFunctions.InsertFunction(array1list, 0);
		System.out.println(array1list);
		
		//Deleting the first element of the array1list  
		System.out.print("Deletes Second:   ");
		SortFunctions.DeleteFunction(array1list, 1);
		System.out.println(array1list);
		
		//Updating array1list before I print out again with Selection Sort Method
		ArrayList<Integer> Unsortedlist= new ArrayList<Integer>(); {
			
		Unsortedlist.addAll(array1list);
		
		System.out.print("Sorted n^2: Selection Sort  ");
		//SortFunctions.SelectionSort(array1list);
		System.out.println(array1list);

		System.out.print("Unsorted Array:  ");
		System.out.println(Unsortedlist);
		
		System.out.print("Sorted < n^2: quickSort  ");
		System.out.println(array1list);

		System.out.print("Unsorted Array:  ");
		System.out.println(Unsortedlist);
		
		System.out.print("Sorted n^2: Insertion Sort  ");
		//SortFunctions.InsertionSort(array1list);
		System.out.println(array1list);
		
		System.out.println();
		System.out.println();
		
		//Creating the first row of table 
		System.out.printf("n\t" + "Read\t\t" + "Search\t\t" + "Insert\t\t" + "Delete\t\t" + 
		"n^2 sort\t\t   " + "< n^2 sort\t\t   " + "Insertion Sort\n");
		
		int i;
		
		int listsize =1;
		
		//Random list for different sizes of N in the table
		ArrayList<Integer> randomlist;
		
		for(i=0; i<5; i++) {
					
		System.out.println();
		
		//Setting randomlist to create the listsize
		randomlist= SortFunctions.CreateList(listsize);
		
		//Prints out table with the name of each function and the time rounded to five decimals in nanoseconds 
		
		System.out.println(listsize + "\t" + (double)Math.round(SortFunctions.ReadFunction(randomlist) * 1000000d/1000000d) + 
		"(ns)\t" + (double)Math.round(SortFunctions.SearchFunction(randomlist, 10) * 1000000d/1000000d) + "(ns)\t" +
		(double)Math.round(SortFunctions.InsertFunction(randomlist, listsize) * 1000000d/1000000d) + "(ns)\t" +
		(double)Math.round(SortFunctions.DeleteFunction(randomlist, 1) * 1000000d/1000000d) + "(ns)\t" +
		(double)Math.round(SortFunctions.SelectionSort(randomlist) * 1000000d/1000000d)+ "(ns)\t    " + 
		(double)Math.round(quickSortMain(randomlist) *  100000d) / 100000d + "(ns)\t\t" +
		(double)Math.round(SortFunctions.InsertionSort(randomlist) * 1000000d/1000000d) + "(ns)");

		
		//Multiple each value of n by 10 
		listsize *= 10;	

				}
	
			}
		
		}
		
	}

}
	




