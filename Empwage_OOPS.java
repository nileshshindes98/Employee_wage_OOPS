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
    }

    public static class Attendance extends Empwage_OOPS {
        public void checkAttendance() {
            double checkEmpAtt = (int) (Math.floor(Math.random() * 10) % 4);
            if (checkEmpAtt == FULL_TIME) {
                System.out.println("FULL TIME Employee is Present ");
            } else if (checkEmpAtt == PART_TIME) {
                System.out.println("PART TIME Employee is Present ");
            } else {
                System.out.println("Employee is Absent ");
            }
        }
    }
}
