package pattern.creational.builder;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 19-Jan-2020
 */
public class BuilderClient {
    public static void main(String[] args) {
        Person person1 = new Person.PersonBuilder(12, "Jack Wilshere", "CM", 3400.00)
                .setEmailAddress("jack.wishere@gmail.com")
                .setGender("Male")
                .build();

        Person person2 = new Person.PersonBuilder(12, "Jack Wilshere", "CM", 3400.00)
                .build();

        Person person3 = new Person.PersonBuilder(12, "Jack Wilshere", "CM", 3400.00)
                .setEmailAddress("jack.wishere@gmail.com")
                .setGender("Male")
                .setPhoneNumber("+1 99999999")
                .build();

        System.out.println("person1 = " + person1);
        System.out.println("person2 = " + person2);
        System.out.println("person3 = " + person3);
    }
}
