 class Main
 {
 public static void main(String[] args)
 {
 System.out.println("Welcome to Java program to add two binary numbers");
 Scanner scnr = new Scanner(System.in);
 System.out.println("Please enter first binary number");
 String first = scnr.nextLine(); 
System.out.println("Please enter second binary number"); 
String second = scnr.nextLine();
 String addition = add(first, second);
 System.out.println("addition of two binary number is : " + addition);
 String sum = sum(first, second); 
System.out.println("Sum of two binary number is : " + sum); 
 }
}

