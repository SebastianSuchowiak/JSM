package JSM1;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        String[] names = {"Ada", "Adela", "Adelajda", "Adrianna", "Agata", "Agnieszka", "Aldona", "Aleksandra", "Alicja", "Alina", "Amanda", "Amelia", "Anastazja", "Aneta", "Anita", "Anna", "Antonina", "Barbara", "Beata", "Berenika", "Bernadeta", "Blanka", "Bogusława", "Cecylia", "Celina", "Czesława", "Dagmara", "Danuta", "Daria", "Diana", "Dominika", "Dorota", "Edyta", "Eliza", "Elwira", "Emilia", "Eugenia", "Ewa", "Ewelina", "Felicja", "Franciszka", "Gabriela", "Halina", "Hanna", "Helena", "Iga", "Ilona", "Irena", "Irmina", "Iwona", "Izabela", "Jadwiga", "Janina", "Joanna", "Jolanta", "Jowita", "Judyta", "Julia", "Julita", "Justyna", "Kamila", "Karina", "Karolina", "Katarzyna", "Kazimiera", "Kinga", "Klaudia", "Kleopatra", "Kornelia", "Krystyna", "Laura", "Lena", "Leokadia", "Lidia", "Liliana", "Lucyna", "Ludmiła", "Luiza", "Łucja", "Magdalena", "Maja", "Malwina", "Małgorzata", "Marcelina", "Maria", "Marianna", "Mariola", "Marlena", "Marta", "Martyna", "Marzanna", "Marzena", "Matylda", "Melania", "Michalina", "Milena", "Mirosława", "Monika", "Nadia", "Natalia", "Natasza", "Nikola", "Nina", "Olga", "Oliwia", "Otylia", "Pamela", "Patrycja", "Paula", "Paulina", "Regina", "Renata", "Roksana", "Rozalia", "Sabina", "Sandra", "Sara", "Sonia", "Stanisława", "Stefania", "Stella", "Sylwia", "Tamara", "Tatiana", "Teresa", "Urszula", "Weronika", "Wiesława", "Wiktoria", "Wioletta", "Zofia", "Zuzanna", "Zyta", "Adam", "Adolf", "Adrian", "Albert", "Aleksander", "Aleksy", "Alfred", "Amadeusz", "Andrzej", "Antoni", "Arkadiusz", "Arnold", "Artur", "Bartłomiej", "Bartosz", "Benedykt", "Beniamin", "Bernard", "Bogdan", "Bogumił", "Bogusław", "Bolesław", "Borys", "Bronisław", "Cezary", "Cyprian", "Cyryl", "Czesław", "Damian", "Daniel", "Dariusz", "Dawid", "Dionizy", "Dominik", "Donald", "Edward", "Emanuel", "Emil", "Eryk", "Eugeniusz", "Fabian", "Feliks", "Ferdynand", "Filip", "Franciszek", "Fryderyk", "Gabriel", "Gerard", "Grzegorz", "Gustaw", "Henryk", "Herbert", "Hilary", "Hubert", "Ignacy", "Igor", "Ireneusz", "Jacek", "Jakub", "Jan", "Janusz", "Jarosław", "Jerzy", "Joachim", "Józef", "Julian", "Juliusz", "Kacper", "Kajetan", "Kamil", "Karol", "Kazimierz", "Klaudiusz", "Konrad", "Krystian", "Krzysztof", "Lech", "Leon", "Leszek", "Lucjan", "Ludwik", "Łukasz", "Maciej", "Maksymilian", "Marceli", "Marcin", "Marek", "Marian", "Mariusz", "Mateusz", "Michał", "Mieczysław", "Mikołaj", "Miłosz", "Mirosław", "Nikodem", "Norbert", "Olaf", "Olgierd", "Oskar", "Patryk", "Paweł", "Piotr", "Przemysław", "Radosław", "Rafał", "Remigiusz", "Robert", "Roman", "Rudolf", "Ryszard", "Sebastian", "Seweryn", "Sławomir", "Stanisław", "Stefan", "Sylwester", "Szymon", "Tadeusz", "Teodor", "Tomasz", "Wacław", "Waldemar", "Wiesław", "Wiktor", "Witold", "Władysław", "Włodzimierz", "Wojciech", "Zbigniew", "Zdzisław", "Zenon", "Zygmunt"};
        String[] surnames = {"Bak", "Baran", "Cieslak", "Kaczmarek", "Duda", "Dudek", "Kołodziej", "Konieczny", "Krol", "Krupa", "Kubiak", "Lis", "Marciniak", "Mazur", "Mazurek", "Michalak", "Mierczak", "Mroz", "Nowak", "Pawlak", "Pietrzak", "Sikora", "Sobczak", "Stepien", "Szulc", "Szymczak", "Walczak", "Wieczorek", "Wilk", "Wojcik", "Wrobel", "Zajac"};

        List<Person> people = new RandomPerson(names, surnames).factory(1000);

        for (Person person: people) {
            System.out.println(person);
        }
    }
}
