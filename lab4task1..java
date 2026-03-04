//1.Create a program with a logic that throws the ArrayIndexOutOfBoundsException while accessing elements in an array.[Hint: Use array and loop and try to access the element beyond the last index.]


class ArrayExceptionDemo
{
    public static void main(String[] args)
    {
        int arr[] = {10, 20, 30, 40, 50};

        // Loop goes beyond last index
        for(int i = 0; i <= arr.length; i++)
        {
            System.out.println("Element at index " + i + " is: " + arr[i]);
        }
    }
}


//output 

Element at index 0 is: 10
Element at index 1 is: 20
Element at index 2 is: 30
Element at index 3 is: 40
Element at index 4 is: 50
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5