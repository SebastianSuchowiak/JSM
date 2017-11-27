package JSM1;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;


class RandomPerson {

    private final String[] names;
    private final String[] surnames;
    private String[] domains = {"o2", "wp", "gmail", "onet"};
    private String[] xxxs = {"com", "pl"};
    private String[] delimiters = {"", ".", "-", "_"};

    RandomPerson(String[] namesArray, String[] surnamesArray) {
        
        names = namesArray;
        surnames = surnamesArray;
    }

    private Person generate() {
        Random generator = new Random();

        String mail;
        String name = names[generator.nextInt(names.length)];
        String surname = surnames[generator.nextInt(surnames.length)];
        String domain = domains[generator.nextInt(domains.length)];
        String xxx = xxxs[generator.nextInt(xxxs.length)];
        String delimiter = delimiters[generator.nextInt(delimiters.length)];

        if (generator.nextBoolean()) {
            mail = name + delimiter + surname + "@" + domain + "." + xxx;
        } else {
            mail = surname + delimiter + name + "@" + domain + "." + xxx;
        }

        return new Person(name, surname, mail);
    }

    List<Person> factory(int amount) {
        List<Person> people = new ArrayList<>();

        for (int x = 0; x < amount; ++x) {
            people.add(this.generate());
        }

        for (int i = 0; i < amount; i++) {
            for (int j = 1; j < (amount - i); j++) {

                if (people.get(j).before(people.get(j - 1))) {
                    Collections.swap(people, j - 1, j);
                }

            }
        }

        return people;
    }
    
}
