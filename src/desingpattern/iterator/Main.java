package desingpattern.iterator;

public class Main {

    public static void main(String[] args) {
        StudyGroup studyGroup = new StudyGroup();

        Student kim = new Student(0, "Kim");
        studyGroup.addStudent(kim);
        Student lee = new Student(1, "Lee");
        studyGroup.addStudent(lee);
        Student park = new Student(2, "Park");
        studyGroup.addStudent(park);

        Iterator<Student> iterator = studyGroup.iterator();

        while(iterator.hasNext()){
            Student next = iterator.next();
            System.out.println(next.getId()+" | "+ next.getName());
        }


    }
}
