public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year){
        if (year <= 1 || year >= 9999){
            return false;
        } else {
            return year % 4 == 0 && year % 100 == 0 && year % 400 == 0 || year % 4 == 0 && year % 100 != 0;

        }
    }

    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        } else {
            switch (month){
                case 1, 3, 5, 7, 8, 10, 12:
                    return 31;
                case 2:
                    if (isLeapYear(year)){
                        return 29;
                    } else {
                        return 28;
                    }
                case 4, 6, 9, 11:
                    return 30;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));

    }
}
