public class Switch {
    public static void main(String[] args) {
        int month = 9;
        String monthName;

        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
            case 10:
                monthName = "October";

            case 11:
                monthName = "November";
            case 12:
                monthName = "December";
                // break;
            default:
                monthName = "Invalid month";
                break;
        }

        System.out.println("The month is " + monthName);
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}