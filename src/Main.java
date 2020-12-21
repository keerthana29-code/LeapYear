public class Main {


    public class LeapYear {

        //Variables

        //purpose: is a leap year
        public static boolean isLeapYear(int year) {
            //Invalid captions (if in range)
            if (year >= 1 && year <= 9999) {
                //purpose
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if(year % 400 == 0) {
                            return true;
                        }
                        else{
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;

        }


    }
}
