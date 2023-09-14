import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Iterator types: fail-safe and fail-fast | weakly-consistent

public class IteratorClass {
    public static void main(String[] args) {
        StudentCollection studentCollection = new StudentCollection();
        studentCollection.addStudent(new Student("Alice", 20));
        studentCollection.addStudent(new Student("Bob", 30));
        
        Iterator<Student> iterator = studentCollection.getIterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}


class Student {
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    private String name;
    private int age; 
}

class StudentCollection {
    private List<Student> students = new ArrayList<>();
    
    public void addStudent(Student student) {
        students.add(student);
    }

    public Iterator<Student> getIterator() {
        return new StudentIterator();
    }

    private class StudentIterator implements Iterator<Student> {
        private int currentIndex = 0;

        @Override 
        public boolean hasNext() {
            return currentIndex < students.size();
        }

        @Override 
        public Student next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            return students.get(currentIndex++);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Remove operatio is not supported");
        }
    }
}