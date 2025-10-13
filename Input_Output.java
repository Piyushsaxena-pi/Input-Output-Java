import java.util.Scanner;
public class Input_Output {
public static void main(String[] args){
    System.out.println("Hello Dear");
    Scanner input= new Scanner(System.in);
    System.out.print("Enter Your Name:");
    String name= input.nextLine();
    System.out.println("Your name is "+name);
    System.out.println("Welcome " +name+ " to the Java Coding");
    System.out.print(name + " What is your age: ");
    int age= input.nextInt();
    System.out.println("Your age is " + age);
    Scanner output= new Scanner(System.in);
    System.out.print("Your father name:");
    String put= output.nextLine();
    System.out.println("Your Father's name is "+put);
    System.out.print("What is the your Dream: ");
    String pub= output.nextLine();
    System.out.println(pub+ "- Your Dream is too Good.");
    System.out.println(" //I hope your dream is fulfill very soon//" );
    }
}
