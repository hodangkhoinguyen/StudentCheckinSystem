import java.io.Serializable;
import java.util.ArrayList;

public class Data implements Serializable {
    private ArrayList<Student> languageArtStudent = new ArrayList<Student>();
    private ArrayList<Student> mathStudent = new ArrayList<Student>();
    private ArrayList<Student> stemStudent = new ArrayList<Student>();    
    private ArrayList<Tutor> tutorList = new ArrayList<Tutor>();

    public ArrayList<Student> getLanguageArtStudent() {
        return languageArtStudent;
    }

    public void setLanguageArtStudent(ArrayList<Student> languageArtStudent) {
        this.languageArtStudent = languageArtStudent;
    }

    
    public ArrayList<Student> getMathStudent() {
        return mathStudent;
    }

    public void setMathStudent(ArrayList<Student> mathStudent) {
        this.mathStudent = mathStudent;
    }

    
    public ArrayList<Student> getStemStudent() {
        return stemStudent;
    }

    public void setStemStudent(ArrayList<Student> stemStudent) {
        this.stemStudent = stemStudent;
    }

    
    public ArrayList<Tutor> getTutorList() {
        return tutorList;
    }

    public void setTutorList(ArrayList<Tutor> tutorList) {
        this.tutorList = tutorList;
    }

    public Data() {

    }

}
