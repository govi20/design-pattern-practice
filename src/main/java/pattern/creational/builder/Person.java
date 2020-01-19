package pattern.creational.builder;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 19-Jan-2020
 */
public class Person {

    // mandatory fields
    private long id;
    private String name;
    private String department;
    private double salary;

    // optional
    private String emailAddress;
    private String phoneNumber;
    private String gender;
    private String city;

    private Person(long id, String name, String department, double salary, String emailAddress, String phoneNumber, String gender, String city) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.city = city;
    }

    @Override
    public String toString( ) {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    static class PersonBuilder {
        // mandatory fields
        private long id;
        private String name;
        private String department;
        private double salary;

        // optional
        private String emailAddress;
        private String phoneNumber;
        private String gender;
        private String city;


        public PersonBuilder(long id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public PersonBuilder setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public PersonBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public PersonBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public PersonBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Person build( ) {
            return new Person(this.id, this.name, this.department, this.salary, this.emailAddress, this.phoneNumber, this.gender, this.city);
        }
    }
}
