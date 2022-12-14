package com.example.tarea_1;

/**
 * Genera las variables que estan enlazadas a la clase Student
 */
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


    /**
     * Son los datos que pertenecen a Student
     * @param carne
     * @param name
     * @param email
     * @param phone
     * @param nickname
     * @param student_type
     * @param exams
     * @param quices
     * @param homeworks
     * @param p1
     * @param p2
     * @param p3
     */
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
                   String p3) {
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


        int pro1 = Integer.parseInt(p1);
        int pro2 = Integer.parseInt(p2);
        int pro3 = Integer.parseInt(p3);
        int examsI = Integer.parseInt(exams);
        int quicesI = Integer.parseInt(quices);
        int homeworksI = Integer.parseInt(homeworks);

        int promedio_EQT;
        promedio_EQT = (examsI + quicesI + homeworksI)/3;
        String S_p_EQT = String.valueOf(promedio_EQT);

        int promedio_proy;
        promedio_proy = (pro1 + pro2 + pro3)/3;
        String S_p_proj = String.valueOf(promedio_proy);

        int grade;
        grade = (promedio_proy+promedio_EQT)/2;
        String notafinal = String.valueOf(grade);

        this.projectP = S_p_proj;
        this.allP = S_p_EQT;
        this.finalgrade = notafinal;
    }


    /**
     * Son los returns de la clase Student.
     * @return
     */
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
