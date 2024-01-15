import com.s14d1.positions.HRManager;
import com.s14d1.positions.JuniorDeveloper;
import com.s14d1.positions.MidDeveloper;
import com.s14d1.positions.SeniorDeveloper;

import java.util.ArrayList;
import java.util.List;

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
