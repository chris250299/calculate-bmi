import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        float weight, height;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        weight = input.nextFloat();
        System.out.println("Enter your height: ");
        height = input.nextFloat();
        float bmi = weight / (height * height);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
