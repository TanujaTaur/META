import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailValidator
{
 public static void main(String[] args)
 {
 String email = "test01@gmail.com";
 if(isValidEmail(email))
 {
  System.out.println("Valid Email Id");
 }
 else
 {
  System.out.println("Invalid Email Id");
 }
 }
public static boolean isValidEmail(String email)
 {
  String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
  Pattern pattern = Pattern.compile(regex);
  Matcher matcher = pattern.matcher(email);
  return matcher.matches();
 }
}