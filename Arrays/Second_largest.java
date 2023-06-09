# Second Largest Element in an Array

This Java program takes input from the user and finds the second largest element in the array. It provides a simple and efficient solution to determine the second maximum value within an array of integers.

## Features

- Allows the user to input the size of the array and its elements.
- Finds the second largest element in the array using a linear scan approach.
- Prints the second largest element as the output.

## Usage

1. Make sure you have Java installed on your system.
2. Clone the repository.
3. Compile the Java program.
4. Run the program and follow the prompts to enter the array size and its elements.
5. The program will output the second largest element in the array.

## Contributing

Contributions are welcome! If you find any issues or want to enhance the functionality of the program, feel free to submit a pull request.

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Secondlargest(arr, n));
    }

    static int Secondlargest(int[] arr, int n) {
        int lg = arr[0]; // Initialize largest with the first element
        int slg = -1;
        for (int i =1 ; i < n; i++) { // Start from the second element
            if (arr[i] > lg) {
                slg = lg;
                lg = arr[i];
            }
        }
        return slg;
    }
}


