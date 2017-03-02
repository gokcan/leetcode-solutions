/* 
* @Author Gökcan Degirmenci - Skylifee7
*
* FizzBuzz is a classical, entry-level Algorithms question that tries to output "1 to n" indices 
* If the current indice is multiples of three it should output “Fizz” instead of the number 
* and for the multiples of five it outputs “Buzz”. 
* For numbers which are multiples of both three and five output “FizzBuzz”.
*/

public class Solution {
    public ArrayList<String> fizzBuzz(int n) {
        
       ArrayList<String> output = new ArrayList<String>();
        
       for (int i=1; i<=n; i++) {
            
            if (i%3 == 0 && i%5 == 0) 
                output.add("FizzBuzz");
            else 
                if (i%3 == 0)
                    output.add("Fizz");
                else 
                    if (i%5 == 0) 
                        output.add("Buzz");
                    else 
                        output.add("" + i);
            
        }
        
    return output;
        
    }
}
