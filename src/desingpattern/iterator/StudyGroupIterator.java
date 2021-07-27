package desingpattern.iterator;

public class StudyGroupIterator implements Iterator<Student> {

    private StudyGroup target;
    private int index;

    public StudyGroupIterator(StudyGroup studyGroup) {
        target = studyGroup;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < target.getSize();
    }

    @Override
    public Student next() {
        Student s = target.getStudent(index);
        index++;
        return s;
    }
}
