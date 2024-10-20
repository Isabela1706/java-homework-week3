package javaprograms;

/**
 * Number of Days In Month
 */

public class NumberOfDaysInMonth {
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Check if the year is within the valid range
        if (year < 1 || year > 9999) {
            return false;
        }

        // Leap year logic
        // A year is a leap year if it is divisible by 4, but not divisible by 100 unless it is divisible by 400.
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    // Method to get the number of days in a month, considering leap years
    public static int getDaysInMonth(int month, int year) {
        // Check if the month and year are within valid ranges
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        // Switch statement to return the number of days in the specified month
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                return 31;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return 30;
            case 2: // February
                // Check if it's a leap year to determine the number of days in February
                if (isLeapYear(year)) {
                    return 29; // Leap year
                } else {
                    return 28; // Non-leap year
                }
            default:
                return -1; // This should never be reached due to the earlier validation
        }
    }

    // Main method to test the functions
    public static void main(String[] args) {
        // Test cases for isLeapYear
        System.out.println(isLeapYear(-1600));  // false
        System.out.println(isLeapYear(1600));   // true
        System.out.println(isLeapYear(2017));   // false
        System.out.println(isLeapYear(2000));   // true

        // Test cases for getDaysInMonth
        System.out.println(getDaysInMonth(1, 2020));   // 31
        System.out.println(getDaysInMonth(2, 2020));   // 29
        System.out.println(getDaysInMonth(2, 2018));   // 28
        System.out.println(getDaysInMonth(-1, 2020));  // -1
        System.out.println(getDaysInMonth(1, -2020));//-1
}
}