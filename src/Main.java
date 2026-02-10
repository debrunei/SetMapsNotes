import static java.lang.IO.println;

void main() {

    Set<String> names = new HashSet<>();
    names.add("Alice");
    names.add("Bob");
    names.add("Alice");

    System.out.println(names);
    System.out.println(names.size());

    Set<String> foods = new HashSet<>();
    foods.add("Calzone");
    foods.add("Deviled eggs");
    foods.add("apple sauce");
    foods.add("Calzone");

    System.out.println(foods);
    System.out.println(foods.size());

    Map<String, String> contacts = new HashMap<>();

    contacts.put("Alice", "555-0101");
    contacts.put("Bob", "555-0202");

    String number = contacts.get("Alice");

    contacts.put("Alice", "555-9999");
    System.out.println(contacts.get("Alice"));

    Map<String, Integer> ages = new HashMap<>();

    ages.put("Rob", 5);
    ages.put("Alice", 29);
    ages.put("Jeff", 1099);

    System.out.println(ages.get("Jeff"));
    println(ages);
    ages.entrySet();

}
