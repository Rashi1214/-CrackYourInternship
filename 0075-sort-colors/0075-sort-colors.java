import java.util.Scanner;
class Solution {
    public static void main(String args[])
     {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size:");
      int size = sc.nextInt();
      int[] colors = new int[size];
      System.out.println("Enter array elements:");
      for(int i=0; i<size; i++)
      {
        System.out.println("Enter at index"+i+":");
        colors[i] = sc.nextInt();
      }  
      System.out.println("Before sorting:");
      printArray(colors);
      sortColors(colors);
      System.out.println("After sorting:");
      printArray(colors);
    }
    public static void sortColors(int[] colors)
    {
        int low = 0, mid = 0, high = colors.length - 1;
        while(mid <= high)
        {
            switch (colors[mid])
            {
                case 0:
                swap(colors,low,mid);
                low++;
                mid++;
                break;
                case 1:
                mid++;
                break;
                case 2:
                swap(colors,mid,high);
                high--;
                break;
            }
        }
    }
    public static void swap(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void printArray(int[] array)
    {
        for(int num : array){
            System.out.print(num + "");
        }
    }
}