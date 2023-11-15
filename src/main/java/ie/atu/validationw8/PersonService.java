package ie.atu.validationw8;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    public void savePerson(Person person) {
        System.out.println("Person saved: " + person);
    }

    public Person getPersonByEmplyeeId(String employeeId) {
        return new Person();
    }
}
