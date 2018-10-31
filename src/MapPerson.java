
import java.util.*;

public class MapPerson {

    public static void main(String[] args) {
        List<Person> people = Person.createRoster();
        Deque<String>deque = new LinkedList<String>();

        people.sort(Comparator.comparing(Person::getLastName));

        int i = 0;
        Map<Integer, String>map = new HashMap<>();

        for (Person person : people) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
            map.put(i++,person.getFirstName());

        }
        for (int x = 0; x<6; x++){
            System.out.println(map.get(x));
        }

        for (Person person : people) {
            deque.addFirst("");
        }
        // Reverse order iterator
        Iterator reverse = deque.descendingIterator();
        System.out.println(people);
        while (reverse.hasNext())
            System.out.println("\t" + reverse.next());



    }
}
