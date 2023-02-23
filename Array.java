import java.util.*;
class Array
{
 // Scanner sc= new Scanner(System.in);
 public static int findMaxNumber(Object[] arr)
 {
  int maxNumber = Integer.MIN_VALUE;
  for(Object obj : arr)
  {
   if(obj instanceof Integer)
   {
    int num = (int) obj;
    if(num>maxNumber)
    {
     maxNumber = num;
    }
   }
    else if(obj instanceof Object[])
    {
      int nestedMax = findMaxNumber((Object[])obj);
      if(nestedMax>maxNumber)
       {
        maxNumber = nestedMax;
       }
    }
  }
       return maxNumber;
 }
}