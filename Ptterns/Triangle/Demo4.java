package Ptterns.Triangle;

public class Demo4 {


//creating an array that holds the number of days in a month

        static int[] daysInMonth = {36, 39, 26, 29, 31, 29, 33, 34, 35, 27, 43};

//creating an array that holds week days

        static String[] weekDays = {"Za", "Xo", "Cu", "Vo", "Bi", "Ne", "Ma", "Lu", "Ki"};

// creating an array of the months (there are 11 months)

        static String[] monthNames = {"Ra", "Ta", "Ut", "Ip", "Ok", "Py", "Ar", "Sy", "Du", "Fi", "Gr"};

// creating the main method to execute our Java program

        public static void main(String[] args){

// calling PrintNMonths method

            PrintNMonths(2618, 1, 4);

        }

// creating PrintNMonths method to print Nth months of the calendar starting from a given year and month

        public static void PrintNMonths(int startYear, int startMonth, int numberOfMonths){

// creating integer type variable to store the starting year

            int currentYear = startYear;

// moving to 0th index to starting month

            int currentMonth = startMonth - 1;

// creating for loop to iterate 0th index to the number of month length

            for (int i = 0; i < numberOfMonths; i++) {

// Printing the calendar for the current month and year

                printCalendarForMonth(currentMonth, currentYear);

// Moving to the next index of the month

                currentMonth++;

// Moving to next year if needed, if we reached the end of the year

                if (currentMonth == 11) {

                    currentMonth = 0;

                    currentYear++;

                }

// Separator between months

                System.out.println("=======================================");

            }

        }

// creating Method to print the calendar for one month

        public static void printCalendarForMonth(int monthNum, int year) {

// Geting the number of days in the current month from the array

            int daysInThisMonth = daysInMonth[monthNum];

// Determine which day of the week the month starts on (simplified logic: use month number mod 9)

            int startDay = monthNum % 9;

// Printing the month name and the year

            System.out.println(monthNames[monthNum] + " " + year);

// Printing the top line separator for the calendar table

            System.out.println("+---+---+---+---+---+---+---+---+---+");

// Printing the week day names (Za to Ki) by using enhanced for loop

            for (String day : weekDays) {

// Printing each day with a vertical bar

                System.out.print("| " + day);

            }

// Ending the row of weekday names with a closing vertical bar

            System.out.println("|");

// Printing the bottom line separator below the weekday names

            System.out.println("+---+---+---+---+---+---+---+---+---+");


// Printing empty cells for the days before the first day of the month (leading spaces) by using normal for loop

            for (int i = 0; i < startDay; i++) {

// Printing an empty cell for each missing day

                System.out.print("|   ");

            }


// creating a Variable to keep track of which day of the month we're printing

            int currentDay = 1;

// Starting at the first weekday for this month

            int currentPos = startDay;

// printing each day of the month by using while loop

            while (currentDay <= daysInThisMonth) {

// Printing the day number (formatted to 2 digits) in a cell

                System.out.printf("| %2d", currentDay);

// Moving to the next position (day of the week)

                currentPos++;

// If we've reached the end of the week (9 days), start a new line

                if (currentPos % 9 == 0) { // End of the week, start a new line

// End the current row with a closing vertical bar

                    System.out.println("|");

// Print a line separator

                    System.out.println("+---+---+---+---+---+---+---+---+---+");

                }

// Movinng to the next day

                currentDay++;

            }


// Print empty cells for the remaining positions in the last week, if the month doesn't end on Ki

            while (currentPos % 9 != 0) {

// Print an empty cell for each remaining day

                System.out.print("|   ");

// Move to the next position

                currentPos++;

            }

// Close the last row and print the bottom line separator for the calendar

            System.out.println("|");

            System.out.println("+---+---+---+---+---+---+---+---+---+");

        }

    }

