package practice_2;

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
