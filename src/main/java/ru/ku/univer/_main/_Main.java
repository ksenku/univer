package ru.ku.univer._main;

import ru.ku.univer.actions.DoSomething;
import ru.ku.univer.model.Student;
import ru.ku.univer.model.Teacher;
import ru.ku.univer.model.University;

public class _Main {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Student student1 = new Student();
        University university1 = new University();

        student1.setMyTeacher(teacher1);
        student1.setStudentStudyPlace(university1);
        teacher1.setMyStudent(student1);
        teacher1.setTeacherWorkPlace(university1);
        university1.setStudentName(student1);
        university1.setTeacherName(teacher1);

        DoSomething doSomething = new DoSomething();
        doSomething.doStudent(student1);
        doSomething.doTeacher(teacher1);
    }
}
