import java.util.ArrayList;
import java.util.List;

import com.s14d1.developerCompany.HRManager;
import com.s14d1.developerCompany.JuniorDeveloper;
import com.s14d1.developerCompany.MidDeveloper;
import com.s14d1.developerCompany.SeniorDeveloper;

public class EmployeeDatabase {
    private static List<HRManager> hrManagers = new ArrayList<>();
    private static List<JuniorDeveloper> juniorDevelopers = new ArrayList<>();
    private static List<MidDeveloper> midDevelopers = new ArrayList<>();
    private static List<SeniorDeveloper> seniorDevelopers = new ArrayList<>();

    public EmployeeDatabase() {
    }

    public static void addEmployee(HRManager employee) {
        hrManagers.add(employee);
    }

    public static void addEmployee(JuniorDeveloper employee) {
        juniorDevelopers.add(employee);

    }

    public static void addEmployee(MidDeveloper employee) {
        midDevelopers.add(employee);
    }

    public static void addEmployee(SeniorDeveloper employee) {
        seniorDevelopers.add(employee);
    }

    public static String display() {
        return "{" + "hrManagers:" + hrManagers + "," +
                "juniorDevelopers:" + juniorDevelopers + "," +
                "midDevelopers:" + midDevelopers + "," +
                "seniorDevelopers:" + seniorDevelopers + "," + "}";

    }
}
