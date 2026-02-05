package lab_1;

public class Problem5 {
    public static void main(String[] args) {
        DragonLaunch dragon = new DragonLaunch();

        // test 1: BBGG - no one will remain
        System.out.println("--- test 1: BBGG ---");
        dragon.kidnap(new Person(Gender.BOY, "Name1"));
        dragon.kidnap(new Person(Gender.BOY, "Name2"));
        dragon.kidnap(new Person(Gender.GIRL, "Name3"));
        dragon.kidnap(new Person(Gender.GIRL, "Name4"));
        dragon.willDragonEatOrNot();

        // test 2: GBGB - 2 people will remain
        System.out.println("\n\n--- test 2: GBGB ---");
        dragon.reset();
        dragon.kidnap(new Person(Gender.GIRL, "Name1"));
        dragon.kidnap(new Person(Gender.BOY, "Name2"));
        dragon.kidnap(new Person(Gender.GIRL, "Name3"));
        dragon.kidnap(new Person(Gender.BOY, "Name4"));
        dragon.willDragonEatOrNot();

        // test 3: BBB - 3 boys will remain
        System.out.println("\n\n--- test 4: BBB ---");
        dragon.reset();
        dragon.kidnap(new Person(Gender.BOY, "Name1"));
        dragon.kidnap(new Person(Gender.BOY, "Name2"));
        dragon.kidnap(new Person(Gender.BOY, "Name3"));
        dragon.willDragonEatOrNot();
    }
}