package com.company;

public class Main {

    public static void main(String[] args) {
	int[] arr = {1,2,-1,4,80,-6};
	System.out.println(arr);
	InsertionSort(arr);
        for (int value : arr) {
            System.out.print(value + " ");
        }
	System.out.println();
	BubbleSort();
    }
    static void InsertionSort(int[] arr)
    {
        for(int i =1;i<arr.length;i++)
        {
            int curr = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>curr)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
    }
    static void BubbleSort()
    {
        System.out.println("hello");
    }
}
