import java.util.Scanner;
class Function
{
// public static void main(String[] args)
 
 public static String longetsWord(String input)
 {
  String[] words = input.split(" ");
  String longestWord = "";
  for(String word : words)
  {
   if(word.length()>longestWord.length())
   {
    longestWord = word;
   }
  }
    return longestWord;
 }
}