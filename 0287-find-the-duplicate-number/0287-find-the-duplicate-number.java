import java.util.Scanner;
import java.util.HashSet;
class Solution
 {
    public int findDuplicate(int[] nums)
    {
        HashSet<Integer>seen = new HashSet<>();
        for (int num : nums) 
        {
            if(seen.contains(num))
            {
                return num;
            }
            seen.add(num);
        }
        return -1;
    }
        public static void main(String args[])
        {
             Scanner sc = new Scanner(System.in);
             System.out.print("Enter number of array elements");
             int n = sc.nextInt();
             int[] num = new int[n];
             System.out.println("Input: ");
             for(int i=0; i<n; i++)
             {
                num[i] = sc.nextInt();
             }
             int duplicate = new Solution().findDuplicate(num);
             if(duplicate!= -1)
             {
             System.out.println("Output: "+duplicate);
             }
             else
             {
                System.out.println("No number found.");
             }
        }
       
}