/**
 * 
 */
package Week04;

/**
 * 
 */
public abstract class Week04Assignment {

	
	private String firstName;
	private String lastName;
	/**
	 * 
	 */
	public Week04Assignment() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	// subtracting the first element from the last element	
   int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; // this creates the Array
   int difference = ages[0] - ages[ages.length - 1]; 
    System.out.println(difference); // this prints out the results of the code
	// longer Array with dynamic indexing and subtracting
	int[] ages2 = new int[9]; 
    ages2[0] = 3; 
    ages2[1] = 9;
    ages2[2] = 23;
    ages2[3] = 64;
    ages2[4] = 2;
    ages2[5] = 8;
    ages2[6] = 28;
    ages2[7] = 93;
    ages2[8] = 66;
	
    difference = ages2[ages2.length - 1] - ages2[0];
    System.out.println(difference);
    
    // time to calculate the average.
    int sum = 0;
    for (int age : ages)    {
    sum += age;	
    }
	double average = (double)  sum / ages.length;
	System.out.println(average);
	
	// loop to iterate and calculate the average number of letters per name
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	int totalLetters = 0;
	for (String name : names)   {
	totalLetters += name.length();	
	double averageLetters = (double)  totalLetters/ names.length;	
	System.out.println(averageLetters);
	// loop to concentrate all names together
     String allNames = " ";
    
     allNames += name + " ";
      allNames = allNames.substring(0, allNames.length() - 1);
     System.out.println(allNames);
	}
     // ascces the last element in the Array
	System.out.println(names[names.length - 1]);
	// access to the first element
	System.out.println(names[0]);
	// creating a new Array
	int[] nameLengths = new int [names.length];
	for (int i = 0; i < names.length; i ++)   {
	nameLengths[i] = names[i].length();
	
	} // sum of the name lengths
	 int totalNameLength = 0;
	 for (int length : nameLengths)   {
		 totalNameLength += length;
	 }
	  System.out.println(totalNameLength);
	}// write a method that takes a String and an int and returns word concatenated to itself n number of times. 
	public static String repeatString(String word, int n)   {
   if ( n == 1 )  {
	 return word;
   }
	return word + repeatString(word, n - 1);
	}


   // creating a method that  takes a first name and last name and returns a full name
   public static String getFullName(String firstName, String lastName)   {
	// time to combine the names
	   return firstName + " " + lastName;
   } // " " allows us to print a space between the words.
   // note nothing is printing due to the System.out.println() method is missing
   // other wise in order to print we would have to define what our firstName and lastName are.
 
   // write a method that takes an Array if integers and returns turn if the sum is greater then 100
     public static boolean isSumGreaterThanHundred(int[] arr)    {
      int sum = 0; 
      // now for the loop that calculates the sum
      for ( int num : arr)    {
    	  sum += num;
      }
      // check if sum is greater the 100
      return sum > 100;
     }

// Write a method that takes an array of double and returns the average of all the elements in the array
     public static double calculateAverage(double[] numbers)   {
       // check if the Array is empty
    	 if ( numbers.length == 0 )    {
    		 throw new IllegalArgumentException(" Array cannot be empty");// this is placed so that our code will run other wise we will get an error message. 		 
    	 }
    	 double sum = 0;
    	 for (double number : numbers)  {
    		sum += number;
    	 }
    	 return sum / numbers.length;
     }
     

    // Write a method that takes two arrays of double and returns true if the average of the elements in the first Array 
// is greater than the average of the elements in the second Array
      public static boolean compareArrayAverages(double[] arr1, double[] arr2) throws Exception {
    	// handles empty arrays or array with different lengths
    	  if ( arr1.length == 0 || arr2.length == 0 || arr1.length != arr2.length)   {
    		throw new Exception(" Arrays must have the same length and not be empty");
    	  }
    	  // calculating time
    	  double sum1 = 0.0, sum2 = 0.0;
    	  for ( int i = 0; i < arr1.length; i ++)   {
    		  sum1 += arr1[i];
    		  sum2 += arr2[i];
    	  }
    	  // to calculate and compare averages efficiently
    	  double average1 = sum1 / arr1.length;
    	  double average2 = sum2 / arr2.length;
    	  return average1 > average2;
      }
  // Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
   //  and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket)   {
    // will return true if it is hot outside and has enough money
    	return isHotOutside && moneyInPocket > 10.50;
    }
  // creating a method of my own to solve a problem
    // let do math cause who doesn't love math
    public static double calculateArea(double length, double width)    {
    	if (length <= 0 || width <= 0)   {
    		throw new IllegalArgumentException("Length and width must be positive numbers");
    	}
    	// time to calculate and return the are
    	return length * width;
    }
}



