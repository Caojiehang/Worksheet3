import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: Jiehang CAO
 * @Description:
 * @Date: 3:24 PM 2018/10/24
 */
public class CalenderPrint {
    public static void main(String[] args) throws IOException {
        System.out.println("please input year: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int years = bufferedReader.read();
        print(years);

    }

    /**
     * print calender
     */
    public static void print(Integer years) throws IOException {
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "August", "Sept", "Oct", "Nov", "Dec"};
        int[] monthdays = {30, 31, 28, 29};
        boolean isLeapYear = false;
        int yearsdays = 365;
        int week = 0;
        int daysinmonth = 0;
        int sumyearsdays = 0;

        /**
         * leap year or not
         */
        if (years % 4 == 0 && years % 100 != 0 || years % 400 == 0) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }

        /**
         * calculate total days from 1900 - 2018
         */

        for(int k =1900;k<years; k++) {
            if (k % 4 == 0 && k % 100 != 0 || k % 400 == 0) {
                yearsdays = 366;
            } else {
                yearsdays = 365;
            }

            sumyearsdays = sumyearsdays + yearsdays;
        }

        /**
         * print calendar
         */
        for (int i = 0; i < 12; i++) {
            System.out.println(month[i]);
            switch (i + 1) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    daysinmonth = monthdays[1];
                    break;
                case 2:
                    if (isLeapYear) {
                        daysinmonth = monthdays[3];
                    } else {
                        daysinmonth = monthdays[2];
                    }
                    break;
                default:
                    daysinmonth = monthdays[0];
                    break;
            }
            /**
             * sumdays%7 + firstday(0,1,2,3,4,5,6)+1(if know the first day )
             */
            week = ((sumyearsdays % 7 +1)) % 7; // the first day of month





            System.out.println("\nSun\tMon\tTue\tWed\tThu\tFri\tSat");

            for (int k = 0; k < week; k++) {
                System.out.print("\t");
            }
            for (int j = 0; j < daysinmonth; j++) {
                System.out.print(j + 1 + "\t");
                if ((sumyearsdays + j + 1) % 7 == 6) {
                    System.out.print("\n");
                }
            }
            System.out.print("\n");
            sumyearsdays = sumyearsdays + daysinmonth; //total days from 1900.1 to xx.xx
        }

    }





}
