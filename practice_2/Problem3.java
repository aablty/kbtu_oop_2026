package practice_2;

public class Problem3 {
    public class Time {
        Integer hour;
        Integer minute;
        Integer second;

        public Time(Integer hour, Integer minute, Integer second) {
            if (!isValid(hour, minute, second)) {
                throw new IllegalArgumentException("Invalid time provided");
            }

            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

        public boolean isValid(Integer hour, Integer minute, Integer second) {
            return (hour >= 0 && hour <= 23) &&
                    (minute >= 0 && minute <= 59) &&
                    (second >= 0 && second <= 59);
        }

        public String toUniversal() {
            return String.format("%02d:%02d:%02d", hour, minute, second);
        }

        public String toStandard() {
            String period = (hour >= 12) ? "PM" : "AM";
            int standardHour = hour % 12;
            if (standardHour == 0)
                standardHour = 12;


            return String.format("%02d:%02d:%02d %s", standardHour, minute, second, period);
        }

        public void add(Time other) {
            Integer totalSeconds = this.hour * 3600 + this.minute * 60 + this.second + other.hour * 3600
                    + other.minute * 60 + other.second;
            this.hour = (totalSeconds / 3600) % 24;
            this.minute = (totalSeconds % 3600) / 60;
            this.second = totalSeconds % 60;
        }
    }

    public static void main(String[] args) {

        Problem3 problem = new Problem3();

        Time t = problem.new Time(23, 5, 6);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());

        Time t2 = problem.new Time(4, 24, 33);
        t.add(t2);
        System.out.println(t.toUniversal());
    }
}
