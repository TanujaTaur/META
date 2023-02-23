import org.json.JSONArray;
import org.json.JSONObject;
public class EmployeeData
{
 private JSONArray employees;
 public EmployeeData()
 {
  employees = new JSONArray();
 }
 public void addEmployee(String fname, String lname, int id)
 {
  JSONObject employee = new JSONObject();
 employee.put("fname",fname);
 employee.put("lname",lname);
 employee.put("id",id);
 employee.put(employee);
 }
 public JSONObject getEmployee(int id)
 {
 for(int i=0;i<employees.length();i++)
 {
  JSONObject employee = employees.getJSONObject(i);
  if(employee.getInt("id")==id)
{
  return employee;
}
 }
  return null;
 }
 public void updateEmployee(int id,String newFname,String newLname)
 {
  for(int i=0;i<employees.length();i++)
 {
  JSONObject employee = employees.getJSONObject(i);
  if(employee.getInt("id")==id)
 {
  employee.put("fname",newFname);
  employee.put("lname",newLname);
  return;
 }
 }}
 public void deleteEmployee(int id)
 {
 for(int i=0;i<employees.length();i++)
 {
  JSONObject employee = employees.getJSONObject(i);
  if(employee.getInt("id")==id)
  {
  employees.remove(i);
  return;
  }
 }
 }
 public void printEmployeeData()
 {
  System.out.println(employees.toString(2));
 }
 public static void main(String[] args)
 {
  EmployeeData employeeData = new EmployeeData();
  employeeData.addEmployee("John", "Doe", 1);
  employeeData.addEmployee("Jane", "Doe", 2);
  employeeData.addEmployee("Bob", "Smith", 3);
  employeeData.printEmployeeData();
 
  JSONObject employee = employeeData.getEmployee(2);
  System.out.println(employee.toString(2));

  employeeData.updateEmployee(1, "Mike", "Jones");
  employeeData.printEmployeeData();
  
  employeeData.deleteEmployee(3);
  employeeData.printEmployeeData();
 }
}