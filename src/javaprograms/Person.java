package javaprograms;

/**
 * Person
 */

public class Person {
    // Instance variables (fields)
    String firstName;
    String lastName;
    int age;

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");//firstName is set to empty string
        person.setFirstName("");
        person.setAge(10);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullName= " + person.getFullName());

    }




    //*Method named getFirstName without any parameters, it needs to return the value of the firstName
//field.
    public String getFirstName() {
        return getFirstName();


    }
    //*Method named getLastName without any parameters, it needs to return the value of the lastName
    //field.
    public String getLastName(){

        return getLastName();
    }
    //*Method named getAge without any parameters, it needs to return the value of the age field.
    public int getAge(){
        return getAge();

    }
    //*Method named setFirstName with one parameter of type String, it needs to set the value of the
    //firstName field.
    public void setFirstName(String firstName){
          this.firstName = firstName;


    }
    //*Method named setLastName with one parameter of type String, it needs to set the value of the
    //lastName field.
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    //*Method named setAge with one parameter of type int, it needs to set the value of the age field. If
    //the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
    public void setAge(int age){
        if(age < 0 || age > 100){
            this.age = 0;
        }else{
            this.age = age;
        }


    }
    //*Method named isTeen without any parameters, it needs to return true if the value of the age field is
    //greater than 12 and less than 20, otherwise, return false.
    public boolean isTeen(){
        return age > 12 && age < 20;

    }

    //*Method named getFullName without any parameters, it needs to return the full name of the person.
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";

        } else if (firstName.isEmpty()) {
            return firstName;
        } else if (lastName.isEmpty()) {
            return lastName;
        } else {
            return firstName + "" + lastName;

        }
        //It is showing error I don't know why




    }

}

