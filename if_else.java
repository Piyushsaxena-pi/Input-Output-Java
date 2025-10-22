import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=input.nextInt();
        System.out.print("Are you female? True/False:  ");
        Boolean bb= input.nextBoolean();
        if(age<5){
            System.out.println("you got 75% discount: ");
        } else if(bb){
            System.out.println("you got 50% discount: ");
        } else if(age>60 && !bb){
            System.out.println("you got 25% discount: ");
        } else {
            System.out.println("you got no discount: ");
        }
    }
}
