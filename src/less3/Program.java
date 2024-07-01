package less3;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {

        StudentGroup studentGroup = new StudentGroup();

        Student joseph = new Student("Joseph", 4);
        Student ralph = new Student("Ralph", 1);
        Student alex = new Student("Alex", 2);
        Student william = new Student("William", 3);


        studentGroup.addStudent(joseph);
        studentGroup.addStudent(ralph);
        studentGroup.addStudent(alex);
        studentGroup.addStudent(william);

        // System.out.println("студенты " + studentGroup.students);
        // Iterator<Student> iterator = new StudentGroupIterator(studentGroup);

        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        for(Student student: studentGroup) {
            System.out.println(student);
        }

        ArrayList<Student> arrayList = new ArrayList<>(List.of(joseph, ralph, alex, william));

        System.out.println(arrayList);

        // public int compare(Student o1, Student o2) {
        //     return o1.id - o2.id;
        // }
        Collections.sort(arrayList, (s1, s2) -> s1.id - s2.id);


        System.out.println(arrayList);
    }

}
