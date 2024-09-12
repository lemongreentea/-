public class Year2016 {
    public String solution(int month, int day) {
        int[] daysInMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] daysOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int totalDays = 0;


        for (int i = 1; i < month; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += day;

        int dayOfWeekIndex = (totalDays + 4) % 7;

        return daysOfWeek[dayOfWeekIndex];
    }
    public static void main(String[] args) {
        Year2016 year2016 = new Year2016();
        String day = year2016.solution(5, 24);
        System.out.println(day);
    }
}
