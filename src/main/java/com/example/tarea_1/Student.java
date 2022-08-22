package com.example.tarea_1;

public class Student {
    private String carne;
    private String name;
    private String email;
    private String phone;
    private String nickname;
    private String student_type;
    private String exams;
    private String quices;
    private String homeworks;
    private String p1;
    private String p2;
    private String p3;
    private String projectP;
    private String allP;
    private String finalgrade;



    public Student(String carne,
                   String name,
                   String email,
                   String phone,
                   String nickname,
                   String student_type,
                   String exams,
                   String quices,
                   String homeworks,
                   String p1,
                   String p2,
                   String p3,
                   String projectP,
                   String allP,
                   String finalgrade) {
        this.carne = carne;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.nickname = nickname;
        this.student_type = student_type;
        this.exams = exams;
        this.quices = quices;
        this.homeworks = homeworks;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.projectP = projectP;
        this.allP = allP;
        this.finalgrade = finalgrade;
    }

    public String getCarne() {return carne;}
    public String getName() {return name;}
    public String getEmail() {return email;}
    public String getPhone() {return phone;}
    public String getNickname() {return nickname;}
    public String getStudent_type() {return student_type;}
    public String getExams() {return exams;}
    public String getQuices() {return quices;}
    public String getHomeworks() {return homeworks;}
    public String getP1() {return p1;}
    public String getP2() {return p2;}
    public String getP3() {return p3;}
    public String getProjectP() {return projectP;}
    public String getAllP() {return allP;}
    public String getFinalgrade() {return finalgrade;}
}
