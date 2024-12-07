class Person {
    String name;
    Person(String name){
        this.name = name;
    }
    void introduce(){
        System.out.println(name);
    }
}

class Student extends Person{
    int studentId;

    Student(String name, int studentId){
        super(name);
        this.studentId = studentId;
    }

    void showStudentId(){
        System.out.println(studentId);
    }
}
