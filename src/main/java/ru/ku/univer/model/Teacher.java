package ru.ku.univer.model;

import ru.ku.univer.actions.DoTeacher;
import ru.ku.univer.actions.SameForAll;

public class Teacher implements SameForAll, DoTeacher {
    Student myStudent;
    University teacherWorkPlace;

    public void setMyStudent(Student student1) {
        this.myStudent = student1;
    }

    public void setTeacherWorkPlace(University university1) {
        this.teacherWorkPlace = university1;
    }

    @Override
    public void goToUniversity() {
        System.out.println("I`m a teacher and i go to university every day.");
    }

    @Override
    public void goToCafe() {
        System.out.println("I`m a teacher and i go to cafe every day.");
    }

    @Override
    public void teach() {
        System.out.println("I`m a teacher and i like to teach.");
    }

    @Override
    public void doScience() {
        System.out.println("I`m a teacher and i study my subject.");
    }
}
