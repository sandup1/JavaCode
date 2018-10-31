public class Assignment11qb {

    public static void main(String[] args) {
        System.out.println(getWeekNumber("Mon"));
        System.out.println(getWeekNumber("mon"));
        System.out.println(getWeekNumber("Monday"));
        System.out.println(getWeekNumber("monday"));
        System.out.println(getWeekNumber("sunday"));
        System.out.println(getWeekNumber("thursday"));
    }
    public static int getWeekNumber(String week) {

        int weekNumber = 0;

        if (week == null) {
            return weekNumber;
        }

        switch (week.toLowerCase().substring(0, 3)){
            case "sun":
                weekNumber = 0;
                break;
            case "tue":
                weekNumber = 2;
                break;
            case "wed":
                weekNumber = 3;
                break;
            case "thu":
                weekNumber = 4;
                break;
            case "fri":
                weekNumber = 5;
                break;
            case "sat":
                weekNumber = 6;
            default:
                weekNumber = 1;
                break;
        }
        return weekNumber;
    }
}
