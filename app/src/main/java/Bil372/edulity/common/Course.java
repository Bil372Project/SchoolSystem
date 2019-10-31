package Bil372.edulity.common;

import Bil372.edulity.enums.CourseType;

public class Course {

    private String name;
    private CourseType type;
    private int teacherId;

    public Course(String name, CourseType type, int teacherId) {
        this.name = name;
        this.type = type;
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CourseType getType() {
        return type;
    }

    public void setType(CourseType type) {
        this.type = type;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
