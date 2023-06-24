public class Empwage_OOPS {

    public static final int FULL_TIME = 0;
    public static final int PART_TIME = 1;
    public static final int perHourWage = 400;
    public static int totalEmpHr;
    public static int totalWorkingDay;
    public static double totalWage;


    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program using OOPS concept");
        Attendance uc1 = new Attendance();
        uc1.checkAttendance();

        System.out.println();

        EmpDailyWageUC2 uc2 = new EmpDailyWageUC2();
        double dailyWageFT = uc2.getEmpDailyWage(8);
        System.out.println("FULL TIME emplyoee daily wage is " + dailyWageFT + " Rs");

        double dailyWagePT = uc2.getEmpDailyWage(4);
        System.out.println("PART TIME emplyoee daily wage is " + dailyWagePT + " Rs");

        System.out.println(); // for empty space
    }

    public static class Attendance extends Empwage_OOPS {
        int empHrs = 0;

        public void checkAttendance() {
            double checkEmpAtt = (int) (Math.floor(Math.random() * 10) % 4);
            switch ((int) checkEmpAtt) {
                case PART_TIME :
                    empHrs = 4;
                    break ;
                case FULL_TIME :
                    empHrs = 8;
                default :
                    empHrs = 0;
            }
        }
    }

    //Calculate daily wage
    public static class EmpDailyWageUC2 extends Empwage_OOPS {
        public double getEmpDailyWage(int FullDayHR) {
            return perHourWage * FullDayHR;
        }
    }
}
