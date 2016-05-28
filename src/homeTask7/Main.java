package homeTask7;

import homeTask9.ImprovedArrayExtends;

import java.util.Scanner;

/**
 * Created by ��� on 13.03.2016.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ImprovedArrayExtends firstArray = new ImprovedArrayExtends();
        ImprovedArrayExtends secondArray = new ImprovedArrayExtends();

        System.out.println("Fill in the first array: ");
        fillInTheArray(scanner, firstArray);

        secondArray = firstArray;
        /*System.out.println("Fill in the second array: ");
        fillInTheArray(scanner, secondArray);*/

        System.out.println("The first array: " + firstArray.toString());
        System.out.println("The second array: " + secondArray.toString());
        System.out.println("Compare arrays: " + firstArray.equals(secondArray));
        System.out.println("Size of the first array: " + firstArray.size());
        System.out.println("Choose the index of element you want to be printed: ");
        int index = scanner.nextInt();
        System.out.println("The element with index =" + index + " is: " + firstArray.getElement(index));
        System.out.println("Enter the element to check if it contains in the first array: ");
        Object element = scanner.next();
        System.out.println("Element: " + element + " contains in the first array: " + firstArray.contains(element));
        System.out.println("Enter the index of element you want to be removed from the first array: ");
        index = scanner.nextInt();
        firstArray.remove(index);
        System.out.println("Enter the element you want be removed from the first array: ");
        element = scanner.next();
        firstArray.remove(element);
        System.out.println(firstArray);
        System.out.println("Size of the first array: " + firstArray.size());


    }

    private static void fillInTheArray(Scanner scanner, ImprovedArrayExtends firstArray) {
        String line = scanner.nextLine();

        while (line.isEmpty() != true) {
            firstArray.add(line);
            line = scanner.nextLine();
        }
    }
}
