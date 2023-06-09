// Remove Duplicates from Array

// This Java program removes duplicates from an array of integers and prints the resulting unique elements. It prompts the user to enter the size of the array and its elements, and then applies a removal algorithm to eliminate any duplicates.

// The code utilizes a removeDuplicates method that iterates through the array, comparing each element with its adjacent element. If a duplicate is found, it skips storing it in the array by incrementing the position of the next unique element. The updated length of the array is returned.

// The program provides an efficient solution for removing duplicates from an array, ensuring that only the unique elements remain in the resulting array.

// Feel free to use and modify this code according to your needs.

// Usage:

// Enter the size of the array.
//Enter the elements of the array.
//The program will remove duplicates and display the resulting unique element


import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int len = RemoveDub(arr,n);
        for(int i=0;i<len;i++){
            System.out.println(arr[i]);
        }
    }

    static int RemoveDub(int[] arr,int n){
        int i=1;
        for(int j=1;j<n;j++){
            if(arr[j-1]!=arr[j]){
                arr[i++] = arr[j];
            }
        }
        return i;
    }
}
