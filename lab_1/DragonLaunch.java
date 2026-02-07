package lab_1;

import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> people;

    public DragonLaunch() {
        people = new Vector<>();
    }

    public Person kidnap(Person p) {
        people.add(p);
        return p;
    }

    public boolean willDragonEatOrNot() {
        if (people.isEmpty()) {
            return false;
        }

        int writeIndex = 0;

        for (int readIndex = 0; readIndex < people.size(); readIndex++) {
            Person current = people.get(readIndex);

            // if current person and last is B-G pair
            if (writeIndex > 0) {
                Person last = people.get(writeIndex - 1);

                if (last.getGender() == Gender.BOY && current.getGender() == Gender.GIRL) {
                    writeIndex--; // remove the last person
                    continue;
                }
            }

            people.set(writeIndex, current);
            writeIndex++;
        }

        people.setSize(writeIndex);

        int remaining = people.size();

        return remaining > 0 ? true : false;
    }

    public void reset() {
        people.clear();
    }
}
