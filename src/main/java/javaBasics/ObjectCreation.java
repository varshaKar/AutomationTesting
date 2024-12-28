package javaBasics;

public class ObjectCreation {

    public static void main(String[] args) {

        //Syntax of creating an object:
        //ClassName objectName=new ClassName();

        //While defining the objectName, please follow the rules used to declare the variables

        //Here 'new' keyword is responsible for creating the objects
        //new Students() ---> Creating a xerox or photocopy of the class Students in the heap memory
        Students s2 = new Students();

        //With the help of s2, we can access all the variables and methods of the class Students
        s2.name = "ABC"; //All the variable values are stored in the heap memory
        s2.age = 20; //All the variable values are stored in the heap memory
        s2.courseName = "Selenium"; //All the variable values are stored in the heap memory
    }

}
