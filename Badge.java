/*
 * 
 * 
 * 
 * Instructions
In this exercise you'll be writing code to print name badges for factory employees.

Step 1
Employees have an ID, name and department name. Employee badge labels are formatted as follows: 
"[id] - name - DEPARTMENT". Implement the Badge.print() method to return an employee's badge label:
 */


public class Badge {
    public String print(Integer id, String name, String department) {
       
       
        return (id != null ? "[" + id + "] - " : "") + name + " - " + (department == null ? "OWNER" : department.toUpperCase());
    }



    public static void main(String[] args) {
        Badge badge = new Badge();
    System.out.println(badge.print(734, "Ernest Johnny Payne", "Strategic Communication")); // => "[734] - Ernest Johnny Payne - STRATEGIC COMMUNICATION"
    System.out.println(badge.print(null, "Jane Johnson", "Procurement")); // => "Jane Johnson - PROCUREMENT"
    System.out.println(badge.print(254, "Charlotte Hale", null));// => "[254] - Charlotte Hale - OWNER"
    }
}
