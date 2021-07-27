package desingpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup implements Iterable<Student> {


    private List<Student> group;

    public StudyGroup() {
        this.group = new ArrayList<>();
    }

    public Student getStudent(int index){
        return group.get(index);
    }

    public void addStudent(Student student){
        group.add(student);
    }

    public void removeStudent(int index){
        group.remove(index);
    }

    public int getSize(){
        return group.size();
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudyGroupIterator(this);
    }
}
