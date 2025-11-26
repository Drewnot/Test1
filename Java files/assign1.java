import java.util.Scanner;
public class assign1{

    public static void main(String[] args) {
        System.out.println("\t\t\t\t\tDedan Kimathi University of Technology");
        System.out.println("\t\t\t\t\t\tSchool of Computer Science and IT");
        System.out.println("\t\t\t\t\t\tDepartment of Computer Science");
        System.out.println("\t\t\t\t\t\tAcademic Year: 2024/2025");
        System.out.println("\t\t\t\t\t\tSTUDENT MARKSHEET (SECOND YEAR RESULTS)");

// variable names for full name: fullname_1, full_name_2.....
// var. names for registration numbers will be: regno_1...
//var. names for marks will be from ccs2211 to ccs2218: _1, _2.....

        Scanner input = new Scanner(System.in);

// char grade_1, grade_2, grade_3, grade_4, grade_5;
// string state_1, state_2, state_3, state_4, state_5;

// status and grade variable declarations for the next lesson.


        String regno_1, regno_2, regno_3, regno_4, regno_5;
        String fullname_1, fullname_2, fullname_3, fullname_4, fullname_5;
//for fullnames and reg.numbers
        int ccs2211_1, ccs2211_2, ccs2211_3, ccs2211_4, ccs2211_5;
        int ccs2212_1, ccs2212_2, ccs2212_3, ccs2212_4, ccs2212_5;
        int ccs2213_1, ccs2213_2, ccs2213_3, ccs2213_4, ccs2213_5;
        int ccs2214_1, ccs2214_2, ccs2214_3, ccs2214_4, ccs2214_5;
        int ccs2215_1, ccs2215_2, ccs2215_3, ccs2215_4, ccs2215_5;
        int ccs2216_1, ccs2216_2, ccs2216_3, ccs2216_4, ccs2216_5;
        int ccs2217_1, ccs2217_2, ccs2217_3, ccs2217_4, ccs2217_5;
//7 courses, 5 students
        int ttl_1, ttl_2, ttl_3, ttl_4, ttl_5;
        double avg_1, avg_2, avg_3, avg_4, avg_5;
// for averages and totals

        System.out.print("Enter first student's name: ");
        fullname_1 = input.nextLine();

        System.out.print("Enter first student's registration number: ");
        regno_1 = input.nextLine();
        System.out.println("Enter first student's CCS 2211 marks: ");
        ccs2211_1 = input.nextInt();
        System.out.println("Enter first student's CCS 2212 marks: ");
        ccs2212_1 = input.nextInt();
        System.out.println("Enter first student's CCS 2213 marks: ");
        ccs2213_1 = input.nextInt();
        System.out.println("Enter first student's CCS 2214 marks: ");
        ccs2214_1 = input.nextInt();
        System.out.println("Enter first student's CCS 2215 marks: ");
        ccs2215_1 = input.nextInt();
        System.out.println("Enter first student's CCS 2216 marks: ");
        ccs2216_1 = input.nextInt();
        System.out.println("Enter first student's CCS 2217 marks: ");
        ccs2217_1 = input.nextInt();

        System.out.print("Enter second student's name: ");
        fullname_2 = input.nextLine();

        System.out.println("Enter second student's registration number: ");
        regno_2 = input.nextLine();
        System.out.println("Enter second student's CCS 2211 marks: ");
        ccs2211_2 = input.nextInt();
        System.out.println("Enter second student's CCS 2212 marks: ");
        ccs2212_2 = input.nextInt();
        System.out.println("Enter second student's CCS 2213 marks: ");
        ccs2213_2 = input.nextInt();
        System.out.println("Enter second student's CCS 2214 marks: ");
        ccs2214_2 = input.nextInt();
        System.out.println("Enter second student's CCS 2215 marks: ");
        ccs2215_2 = input.nextInt();
        System.out.println("Enter second student's CCS 2216 marks: ");
        ccs2216_2 = input.nextInt();
        System.out.println("Enter second student's CCS 2217 marks: ");
        ccs2217_2 = input.nextInt();

        System.out.print("Enter third student's name: ");
        fullname_3 = input.nextLine();

        System.out.println("Enter third student's registration number: ");
        regno_3 = input.nextLine();

        System.out.println("Enter third student's CCS 2211 marks: ");
        ccs2211_3 = input.nextInt();
        System.out.println("Enter third student's CCS 2212 marks: ");
        ccs2212_3 = input.nextInt();
        System.out.println("Enter third student's CCS 2213 marks: ");
        ccs2213_3 = input.nextInt();
        System.out.println("Enter third student's CCS 2214 marks: ");
        ccs2214_3 = input.nextInt();
        System.out.println("Enter third student's CCS 2215 marks: ");
        ccs2215_3 = input.nextInt();
        System.out.println("Enter third student's CCS 2216 marks: ");
        ccs2216_3 = input.nextInt();
        System.out.println("Enter third student's CCS 2217 marks: ");
        ccs2217_3 = input.nextInt();

        System.out.print("Enter fourth student's name: ");
        fullname_4 = input.nextLine();

        System.out.println("Enter fourth student's registration number: ");
        regno_4 = input.nextLine();
        System.out.println("Enter fourth student's CCS 2211 marks: ");
        ccs2211_4 = input.nextInt();
        System.out.println("Enter fourth student's CCS 2212 marks: ");
        ccs2212_4 = input.nextInt();
        System.out.println("Enter fourth student's CCS 2213 marks: ");
        ccs2213_4 = input.nextInt();
        System.out.println("Enter fourth student's CCS 2214 marks: ");
        ccs2214_4 = input.nextInt();
        System.out.println("Enter fourth student's CCS 2215 marks: ");
        ccs2215_4 = input.nextInt();
        System.out.println("Enter fourth student's CCS 2216 marks: ");
        ccs2216_4 = input.nextInt();
        System.out.println("Enter fourth student's CCS 2217 marks: ");
        ccs2217_4 = input.nextInt();

        System.out.print("Enter fifth student's name: ");
        fullname_5 = input.nextLine();

        System.out.println("Enter fifth student's registration number: ");
        regno_5 = input.nextLine();
        System.out.println("Enter fifth student's CCS 2211 marks: ");
        ccs2211_5 = input.nextInt();
        System.out.println("Enter fifth student's CCS 2212 marks: ");
        ccs2212_5 = input.nextInt();
        System.out.println("Enter fifth student's CCS 2213 marks: ");
        ccs2213_5 = input.nextInt();
        System.out.println("Enter fifth student's CCS 2214 marks: ");
        ccs2214_5 = input.nextInt();
        System.out.println("Enter fifth student's CCS 2215 marks: ");
        ccs2215_5 = input.nextInt();
        System.out.println("Enter fifth student's CCS 2216 marks: ");
        ccs2216_5 = input.nextInt();
        System.out.println("Enter fifth student's CCS 2217 marks: ");
        ccs2217_5 = input.nextInt();

        ttl_1 = ccs2211_1 + ccs2212_1 + ccs2213_1 + ccs2214_1 + ccs2215_1 + ccs2216_1 + ccs2217_1;
        ttl_2 = ccs2211_2 + ccs2212_2 + ccs2213_2 + ccs2214_2 + ccs2215_2 + ccs2216_2 + ccs2217_2;
        ttl_3 = ccs2211_3 + ccs2212_3 + ccs2213_3 + ccs2214_3 + ccs2215_3 + ccs2216_3 + ccs2217_3;
        ttl_4 = ccs2211_4 + ccs2212_4 + ccs2213_4 + ccs2214_4 + ccs2215_4 + ccs2216_4 + ccs2217_4;
        ttl_5 = ccs2211_5 + ccs2212_5 + ccs2213_5 + ccs2214_5 + ccs2215_5 + ccs2216_5 + ccs2217_5;

        avg_1 = ttl_1 / 7.0;
        avg_2 = ttl_2 / 7.0;
        avg_3 = ttl_3 / 7.0;
        avg_4 = ttl_4 / 7.0;
        avg_5 = ttl_5 / 7.0;


//define the structure for the score sheet
        final String header_form = "| %-16s | %-25s | %-8s | %-8s | %-8s | %-8s | %-8s | %-8s | %-8s | %-8s | %-10s | %-8s | %-6s |\n";
        final String data_form = "| %-16s | %-25s | %-8d | %-8d | %-8d | %-8d | %-8d | %-8d | %-8d | %-8d | %-10.2f | %-8s | %-6s |\n";
        final String separator = "+------------------+---------------------------+----------+----------+----------+----------+----------+----------+----------+----------+------------+----------+--------+\n";

        System.out.printf("Student score sheet");
        System.out.printf(separator);
        System.out.printf(header_form, "Reg Number", "Full Name", "CCS2211", "CCS2212", "CCS2213", "CCS2214", "CCS2215", "CCS2216", "CCS2217", "Totals", "Average", "Status", "Grade");
        System.out.printf(separator);
        System.out.printf(data_form, regno_1, fullname_1, +ccs2211_1, +ccs2212_1, +ccs2213_1, +ccs2214_1, +ccs2215_1, +ccs2216_1, +ccs2217_1, +ttl_1, +avg_1, "null", "null");
        System.out.printf(data_form, regno_2, fullname_2, +ccs2211_2, +ccs2212_2, +ccs2213_2, +ccs2214_2, +ccs2215_2, +ccs2216_2, +ccs2217_2, +ttl_2, +avg_2, "null", "null");
        System.out.printf(data_form, regno_3, fullname_3, +ccs2211_3, +ccs2212_3, +ccs2213_3, +ccs2214_3, +ccs2215_3, +ccs2216_3, +ccs2217_3, +ttl_3, +avg_3, "null", "null");
        System.out.printf(data_form, regno_4, fullname_4, +ccs2211_4, +ccs2212_4, +ccs2213_4, +ccs2214_4, +ccs2215_4, +ccs2216_4, +ccs2217_4, +ttl_4, +avg_4, "null", "null");
        System.out.printf(data_form, regno_5, fullname_5, +ccs2211_5, +ccs2212_5, +ccs2213_5, +ccs2214_5, +ccs2215_5, +ccs2216_5, +ccs2217_5, +ttl_5, +avg_5, "null", "null");
        System.out.printf(separator);
    }}


























































