package practice_2;

public class Problem2 {
    public class StarTriangle {
        Integer width;

        public StarTriangle(Integer width) {
            this.width = width;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= this.width; i++) {
                for (int j = 1; j <= i; j++) {
                    sb.append("[*]");
                }
                sb.append("\n");
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Problem2 problem = new Problem2();
        StarTriangle small = problem.new StarTriangle(3);
        System.out.println(small.toString());
    }
}
