public class REUScholarship extends ScholarshipSpecification implements ScholarshipReport {
    String name;
    double minGPA;
    int minCredits;
    
    public REUScholarship(String name, double minGPA, int minCredits) {
        this.name = name;
        this.minGPA = minGPA;
        this.minCredits = minCredits;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getMinGPA() {
        return minGPA;
    }
    public void setMinGPA(double minGPA) {
        this.minGPA = minGPA;
    }
    public int getMinCredits() {
        return minCredits;
    }
    public void setMinCredits(int minCredits) {
        this.minCredits = minCredits;
    }
    public boolean isQualified(Student s) { // edit
        if (s == null) {
            return false;
        }
        if (s.getClass() != UndergradStudent.class) {
            return false;
        }
        return s.getGPA() > 3 && s.getCredits() >= 30;

    }
}
