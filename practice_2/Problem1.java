package practice_2;

public class Problem1 {
    public class Student {
        Integer id;
        String name;
        Integer year;

        public Student(Integer id, String name) {
            this.id = id;
            this.name = name;
            this.year = 1;
        }

        public Integer getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public Integer getYear() {
            return this.year;
        }

        public Integer incrementYear() {
            return this.year += 1;
        }
    }

    public static void main(String[] args) {
        Problem1 problem = new Problem1();
        Student student = problem.new Student(1, "Alisher");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Year: " + student.getYear());
        System.out.println("Year incremented: " + student.incrementYear());
    }

}
