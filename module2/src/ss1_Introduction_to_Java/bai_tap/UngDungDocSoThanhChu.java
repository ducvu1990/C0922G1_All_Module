package ss1_Introduction_to_Java.bai_tap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        int number;
        String stringUnit = "";
        String stringten = "";
        String stringhundred = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        number = scanner.nextInt();
        if (number >= 0 && number <= 20) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eightteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
                case 20:
                    System.out.println("twenty");
                    break;
            }
        } else if (number < 100) {
            int one = number % 10;
            int ten = number / 10;
            switch (one) {
                case 1:
                    stringUnit = "One";
                    break;
                case 2:
                    stringUnit = "Two";
                    break;
                case 3:
                    stringUnit = "Three";
                    break;
                case 4:
                    stringUnit = "four";
                    break;
                case 5:
                    stringUnit = "five";
                    break;
                case 6:
                    stringUnit = "six";
                    break;
                case 7:
                    stringUnit = "Seven";
                    break;
                case 8:
                    stringUnit = "eight";
                    break;
                case 9:
                    stringUnit = "nine";
                    break;
            }
            switch (ten) {
                case 2:
                    stringten = "Twenty";
                    break;
                case 3:
                    stringten = "Thrity";
                    break;
                case 4:
                    stringten = "fourty";
                    break;
                case 5:
                    stringten = "fivety";
                    break;
                case 6:
                    stringten = "sixty";
                    break;
                case 7:
                    stringten = "Seventy";
                    break;
                case 8:
                    stringten = "eighty";
                    break;
                case 9:
                    stringten = "ninety";
                    break;
            }
            System.out.println(stringten + " " + stringUnit);
        } else if (number < 120) {
            int tens = number - 100;
            switch (tens) {
                case 0:
                    System.out.println("One hudred");
                    break;
                case 1:
                    System.out.println("One hundred and one");
                    break;
                case 2:
                    System.out.println(" One hundred and Two");
                    break;
                case 3:
                    System.out.println(" One hundred and Three");
                    break;
                case 4:
                    System.out.println(" One hundred and four");
                    break;
                case 5:
                    System.out.println(" One hundred and five");
                    break;
                case 6:
                    System.out.println("One hundred and six");
                    break;
                case 7:
                    System.out.println(" One hundred and Seven");
                    break;
                case 8:
                    System.out.println(" One hundred and eight");
                    break;
                case 9:
                    System.out.println(" One hundred and nine");
                    break;
                case 10:
                    System.out.println("One hundred and ten");
                    break;
                case 11:
                    System.out.println(" one hundred and eleven");
                    break;
                case 12:
                    System.out.println("one hundred and twelve");
                    break;
                case 13:
                    System.out.println("one hundred and thirteen");
                    break;
                case 14:
                    System.out.println("one hundred and fourteen");
                    break;
                case 15:
                    System.out.println("one hundred and fifteen");
                case 16:
                    System.out.println("one hundred and sixteen");
                    break;
                case 17:
                    System.out.println("one hundred and seventeen");
                    break;
                case 18:
                    System.out.println("one hundred and eightteen");
                    break;
                case 19:
                    System.out.println("one hundred and nineteen");
                    break;
            }
        } else if (number < 1000) {
            int ones = number % 10;
            int tens = (number - (number / 100) * 100) / 10;
            int hundred = number / 100;
            switch (ones) {
                case 1:
                    stringUnit = "One";
                    break;
                case 2:
                    stringUnit = "Two";
                    break;
                case 3:
                    stringUnit = "Three";
                    break;
                case 4:
                    stringUnit = "four";
                    break;
                case 5:
                    stringUnit = "five";
                    break;
                case 6:
                    stringUnit = "six";
                    break;
                case 7:
                    stringUnit = "Seven";
                    break;
                case 8:
                    stringUnit = "eight";
                    break;
                case 9:
                    stringUnit = "nine";
                    break;
            }
            switch (tens) {
                case 2:
                    stringten = "Twenty";
                    break;
                case 3:
                    stringten = "Thrity";
                    break;
                case 4:
                    stringten = "fourty";
                    break;
                case 5:
                    stringten = "fivety";
                    break;
                case 6:
                    stringten = "sixty";
                    break;
                case 7:
                    stringten = "Seventy";
                    break;
                case 8:
                    stringten = "eighty";
                    break;
                case 9:
                    stringten = "ninety";
                    break;
            }
            switch (hundred) {
                case 1:
                    stringhundred = "One hundred and";
                    break;
                case 2:
                    stringhundred = "Two hundred and";
                    break;
                case 3:
                    stringhundred = "Three hundred and";
                    break;
                case 4:
                    stringhundred = "four hundred and";
                    break;
                case 5:
                    stringhundred = "five hundred and";
                    break;
                case 6:
                    stringhundred = "six hundred and";
                    break;
                case 7:
                    stringhundred = "Seven hundred and";
                    break;
                case 8:
                    stringhundred = "eight hundred and";
                    break;
                case 9:
                    stringhundred = "nine hundred and";
                    break;
            }
            System.out.println(stringhundred + " " + stringten + " " + stringUnit);
        }


    }
}
