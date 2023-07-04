package ru.ku.univer.model;

import ru.ku.univer.actions.DoStudent;
import ru.ku.univer.actions.SameForAll;

public class Student implements SameForAll, DoStudent {
    Teacher myTeacher;
    University studentStudyPlace;

    public void setMyTeacher(Teacher teacher1) {
        this.myTeacher = teacher1;
    }

    public void setStudentStudyPlace(University university1) {
        this.studentStudyPlace = university1;
    }

    @Override
    public void goToUniversity() {
        System.out.println("I`m a student and i go to university every day.");
    }

    @Override
    public void goToCafe() {
        System.out.println("I`m a student and i go to cafe every day.");
    }

    @Override
    public void learn() {
        System.out.println("I`m a student and i like to learn.");
    }

    @Override
    public void getGrades() {
        System.out.println("I`m a student and i get good grades.");
    }
}
