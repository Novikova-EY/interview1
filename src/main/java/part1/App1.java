package part1;

public class App1 {
    public static void main(String[] args) {
        Person person = Person.builder()
                .firstName("Иван")
                .lastName("Иванов")
                .middleName("Иванович")
                .country("Россия")
                .address("Москва")
                .phone("8-888-888-88-88")
                .age(12)
                .gender("М")
                .build();

        System.out.println(person);
    }
}
