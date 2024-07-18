import java.util.Scanner;
class Solution {
    public static int removeDuplicates(int[] nums)
     {
      if(nums.length == 0)
      return 0;
      int i = 0;
      for (int j = 1;j <nums.length; j++)
      {
        if(nums[j]!= nums[i])
        {
            i++;
            nums[i]=nums[j];
        }
      }  
      return i+1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for(int i=0; i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println("Original sorted:");
        printArray(nums);
        int k= removeDuplicates(nums);
        System.out.println("Sorted Array:");
        printArray(nums,k);
        System.out.println("Unique elements (k):"+k);
    }
    public static void printArray(int[] array)
    {
        for(int num:array)
        {
            System.out.print(num + "");
        }
            System.out.println();
        }
        public static void printArray(int[] array, int length)
        {
            for(int i=0;i<length;i++)
            {
              System.out.print(array[i]+"");
            }
            System.out.println();
        }
    }
