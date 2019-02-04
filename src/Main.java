import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		    String[] arrA  = scanner.nextLine().split("\\s"); //input integers with white spaces between them (e.g. 1 2 3 4)
		    String[] arrB = scanner.nextLine().split("\\s"); //input doubles with white spaces between them (e.g. 1.1 2.2 3.3 4.4)
		    String[] arrC = scanner.nextLine().split("\\s"); //input characters with white spaces between them (e.g. H E L L O)
		    String[] strArray = scanner.nextLine().split("\\s"); //input strings with white spaces between them (e.g. once upon a time)
		 
		    Integer[] intArray = new Integer[arrA.length];
		    Double[] doubArray = new Double[arrB.length];
		    Character[] charArray = new Character[arrC.length];
		 
		    for(int i=0;i<arrA.length;i++){intArray[i] = Integer.parseInt(arrA[i]);}
		    for(int i=0;i<arrB.length;i++){doubArray[i] = Double.parseDouble(arrB[i]);}
		    for(int i=0;i<arrC.length;i++){charArray[i]=arrC[i].charAt(0);}
		 
		    printArrayNonGen(intArray);
		    printArrayNonGen(doubArray);
		    printArrayNonGen(charArray);
		    printArrayNonGen(strArray);
		 
		    printArray(intArray);
		    printArray(doubArray);
		    printArray(charArray);
		    printArray(strArray);
		 
		    printArrayGen(intArray);
		    printArrayGen(doubArray);
		    printArrayGen(charArray);
		    printArrayGen(strArray);
		 
		    System.out.println(getMax(intArray));
		    System.out.println(getMax(doubArray));
		    System.out.println(getMax(charArray));
		    System.out.println(getMax(strArray));
		 
		    System.out.println(getMaxGen(intArray));
		    System.out.println(getMaxGen(doubArray));
		    System.out.println(getMaxGen(charArray));
		    System.out.println(getMaxGen(strArray));
		}

	private  static <T> T getMaxGen(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Comparable getMax(Comparable[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	private static <T> void printArrayGen(T[] a) {
		// TODO Auto-generated method stub
		
	}

	private static void printArray(String[] strArray) {
		// TODO Auto-generated method stub
		
	}

	private static void printArray(Character[] charArray) {
		// TODO Auto-generated method stub
		
	}

	private static void printArray(Double[] doubArray) {
		// TODO Auto-generated method stub
		
	}

	private static void printArray(Integer[] intArray) {
		// TODO Auto-generated method stub
		
	}

	private static void printArrayNonGen(Object[] a) {
		// TODO Auto-generated method stub
		
	}


}
