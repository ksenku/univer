package ru.ku.univer.actions;

import ru.ku.univer.model.Student;
import ru.ku.univer.model.Teacher;

public class DoSomething {
    public void doStudent(Student student) {
        student.goToUniversity();
        student.goToCafe();
        student.learn();
        student.getGrades();
    }

    public void doTeacher(Teacher teacher) {
        teacher.goToUniversity();
        teacher.goToCafe();
        teacher.teach();
        teacher.doScience();
    }
}


