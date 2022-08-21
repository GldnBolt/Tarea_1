package com.example.tarea_1;

public class Student {
    private String name;
    private String carne;
    private String email;
    private String exams;
    private String examsP;
    private String finalgrade;
    private String homeworks;
    private String homeworksP;
    private String nickname;
    private String p1;
    private String p2;
    private String p3;
    private String phone;
    private String projectP;
    private String quices;
    private String quicesP;
    private String student_type;

    public Student(String name, String carne, String email, String exams, String examsP, String finalgrade, String homeworks, String homeworksP, String nickname, String p1, String p2, String p3, String phone, String projectP, String quices, String quicesP, String student_type) {
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

    public String getCarne() {
        return carne;
    }

    public String getEmail() {
        return email;
    }

    public String getExams() {
        return exams;
    }

    public String getExamsP() {
        return examsP;
    }

    public String getFinalgrade() {
        return finalgrade;
    }

    public String getHomeworks() {
        return homeworks;
    }

    public String getHomeworksP() {
        return homeworksP;
    }

    public String getNickname() {
        return nickname;
    }

    public String getP1() {
        return p1;
    }

    public String getP2() {
        return p2;
    }

    public String getP3() {
        return p3;
    }

    public String getPhone() {
        return phone;
    }

    public String getProjectP() {
        return projectP;
    }

    public String getQuices() {
        return quices;
    }

    public String getQuicesP() {
        return quicesP;
    }

    public String getStudent_type() {
        return student_type;
    }
}
