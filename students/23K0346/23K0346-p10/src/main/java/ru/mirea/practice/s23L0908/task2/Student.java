package ru.mirea.practice.s23L0908.task2;

import java.util.Comparator;

class Student {
    private String firstName;
    private String lastName;
    private String major;
    private int year;
    private String group;

    public Student(String firstName, String lastName, String major, int year, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.year = year;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{firstName='" + firstName + '\''
                + ", lastName='" + lastName + '\''
                + ", major='" + major + '\''
                + ", year=" + year
                + ", group='" + group + '\''
                + '}';
    }

    public static Comparator<Student> compareByLastName() {
        return new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getLastName().compareTo(s2.getLastName());
            }
        };
    }
}

