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
        revArray(arr);
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
    static void ReverseString(String str)
    {
        char[] buffarr = new char[str.length()];
        for(int i =0;i<str.length();i++)
        {
            buffarr[i] = str.charAt(str.length()-1-i);
        }
        String revStr = new String(buffarr);
        System.out.println(revStr);
    }
    static void revArray(int[] A)
    {
        for (int i=0;i<A.length/2;i++)
        {
            int tmp=0;
            tmp=A[A.length-i-1];
            A[A.length-i-1] = A[i];
            A[i] = tmp;
        }
        for(int i : A)
        {
            System.out.print(i + " ");
        }
    }
}
