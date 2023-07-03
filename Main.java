package HW8;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jon");
        Student student2 = new Student("Alex", new Address("Nizhnevartovsk", "86"));
        Student student3 = new Student("Tanya", null);

        printStudentInfo(student1);
        printStudentInfo(student2);
        printStudentInfo(student3);
    }

    public static void printStudentInfo(Student student) {
        System.out.print("Student name: " + student.getName());
        student.getAddress().ifPresent(address -> System.out.println(", Address: " + address.getCity() + ", " + address.getRegion()));
        System.out.println();
    }
}