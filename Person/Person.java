
//TRY TO PUT ALL SETTERS IN ONE CONSTRUCTOR WHICH CAN BE USED IN MAIN PROGRAM


public class Person {
    private String firstName, lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0 && age <= 100){
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public boolean isTeen(){
        if(this.age <= 12 || this.age >= 20){
            return false;
        }
        return true;
    }

    public String getFullName(){
        if(this.firstName.isEmpty() && this.lastName.isEmpty()){
            return "";
        }

        if(this.lastName.isEmpty()){
            return this.firstName;
        }

        if(this.firstName.isEmpty()){
            return this.lastName;
        }
        return this.firstName+" "+this.lastName;
    }
}
