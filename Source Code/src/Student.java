import java.io.Serializable;

/**
 *
 * @author Alpha
 */
public class Student implements Serializable {
    private String name;
    private String group;
    private String course;
    
    public Student(String n, String c) {
        this.name = n;
        this.group = "";
        this.course = c;
    }

    public Student(String n, String g, String c) {
        this.name = n;
        this.group = g;
        this.course = c;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    public void setName(String n) {
        this.name = n;
    }
    
    public void setCourse(String c) {
        this.course = c;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getCourse() {
        return this.course;
    }

    public boolean equalsTo(Student other) {
        return this.getName() == other.getName() && this.getCourse() == other.getCourse();
    }
}
    
