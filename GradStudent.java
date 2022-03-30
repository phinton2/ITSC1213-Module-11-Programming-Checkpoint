import java.util.*;

public class GradStudent extends Student {
    private String undergradDegree;
    public GradStudent(String fName, String lName, int id, String major, double gpa, int credits, String undergradDegree) {
        super(fName, lName, id, major, gpa, credits);
        this.undergradDegree = undergradDegree;
    }
}
