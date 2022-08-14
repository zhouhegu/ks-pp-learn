package com.pp.basic.innerclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

/**
 * @author gupp
 * @date 2022/6/12 15:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private Long studentId;

    private String departmentName;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }


    static class Teacher {
        private Long teacherId;

        private List<Student> studentList;

        public Long getTeacherId() {
            return teacherId;
        }

        public void setTeacherId(Long teacherId) {
            this.teacherId = teacherId;
        }

        public List<Student> getStudentList() {
            return studentList;
        }

        public void setStudentList(List<Student> studentList) {
            this.studentList = studentList;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(1L, "信息学院");
        Student s2 = new Student(2L, "建筑学院");
        Student s3 = new Student(3L, "交通学院");

        Teacher t1 = new Teacher();
        t1.setTeacherId(101L);
        t1.setStudentList(Arrays.asList(s1, s2));
        System.out.println(t1);

        Teacher t2 = new Teacher();
        t2.setTeacherId(202L);
        t2.setStudentList(List.of(s3));
        System.out.println(t2);
    }
}
