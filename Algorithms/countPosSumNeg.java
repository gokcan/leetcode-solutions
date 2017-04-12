public class Solution
{
    public static int[] countPositivesSumNegatives(int[] input)
    { 
      if(input == null || input.length==0) 
        return new int[] {};
      
      int length = input.length;
      int countPos = 0
      int sumNeg = 0;
      
      int[] outputArr = new int[2];
      
      for (int i = 0; i<length; i++) { 
          if (input[i]>0)
            countPos++;
          else if (input[i]<0)
            sumNeg += input[i];
      }
      
      return new int[] {countPos, sumNeg};
      
    }
}
