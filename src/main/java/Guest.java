public class Guest {

    private String firstName;
    private String lastName;
    private int age;


    public Guest(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }
    public String getInfo(){
        return String.format("Dodano nowego gościa: %s %s (%d)",
                this.firstName,this.lastName,this.age);
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }

    public java.lang.String getLastName() {
        return lastName;
    }

    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
