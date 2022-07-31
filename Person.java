public class Person {
    long id = 0;
    String firstName;
    String lastName;

    public long getId(){
        return id;
    }
    public void setId(long someId){
        id = someId;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String someFirstName) {
        firstName = someFirstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String someLastName){
        lastName = someLastName;
    }
    public void printAll(){
        System.out.println("Numarul de ordine este: " + getId());
        System.out.println("Prenumele este: " + getFirstName());
        System.out.println("Numele este: " + getLastName());
        System.out.println();
    }
}
