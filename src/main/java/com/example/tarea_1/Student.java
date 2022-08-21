package com.example.tarea_1;

public class Student {
    private String name;
    private int carne;
    private String email;
    private int exams;
    private int examsP;
    private int finalgrade;
    private int homeworks;
    private int homeworksP;
    private String nickname;
    private int p1;
    private int p2;
    private int p3;
    private int phone;
    private int projectP;
    private int quices;
    private int quicesP;
    private String student_type;

    public Student(String name, int carne, String email, int exams, int examsP, int finalgrade, int homeworks, int homeworksP, String nickname, int p1, int p2, int p3, int phone, int proyectP, int quices, int quicesP, String student_type) {
        this.name = name;
        this.carne = carne;
        this.email = email;
        this.exams = exams;
        this.examsP = examsP;
        this.finalgrade = finalgrade;
        this.homeworks = homeworks;
        this.homeworksP = homeworksP;
        this.nickname = nickname;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.phone = phone;
        this.projectP = projectP;
        this.quices = quices;
        this.quicesP = quicesP;
        this.student_type = student_type;
    }

    public String getName() {
        return name;
    }

    public int getCarne() {
        return carne;
    }

    public String getEmail() {
        return email;
    }

    public int getExams() {
        return exams;
    }

    public int getExamsP() {
        return examsP;
    }

    public int getFinalgrade() {
        return finalgrade;
    }

    public int getHomeworks() {
        return homeworks;
    }

    public int getHomeworksP() {
        return homeworksP;
    }

    public String getNickname() {
        return nickname;
    }

    public int getP1() {
        return p1;
    }

    public int getP2() {
        return p2;
    }

    public int getP3() {
        return p3;
    }

    public int getPhone() {
        return phone;
    }

    public int getProjectP() {
        return projectP;
    }

    public int getQuices() {
        return quices;
    }

    public int getQuicesP() {
        return quicesP;
    }

    public String getStudent_type() {
        return student_type;
    }
}
