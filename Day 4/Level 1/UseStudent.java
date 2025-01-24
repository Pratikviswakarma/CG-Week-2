// Subject class
class Subject {
    private String name;
    private int marks;

    // Constructor
    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Get subject name
    public String getName() {
        return name;
    }

    // Get marks for the subject
    public int getMarks() {
        return marks;
    }
}

// GradeCalculator class
class GradeCalculator {
    // Calculate the grade based on marks
    public static String calculateGrade(int marks) {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B+";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    // Calculate the overall grade for a student based on all subjects
    public static void calculateOverallGrade(Student student) {
        int totalMarks = 0;
        int numberOfSubjects = student.getSubjectsCount();
        
        for (int i = 0; i < numberOfSubjects; i++) {
            totalMarks += student.getSubject(i).getMarks();
        }
        
        int averageMarks = totalMarks / numberOfSubjects;
        String grade = calculateGrade(averageMarks);
        System.out.println("Overall Grade for " + student.getName() + ": " + grade);
    }
}

// Student class
class Student {
    private String name;
    private Subject[] subjects;
    private int subjectCount;

    // Constructor
    public Student(String name, int maxSubjects) {
        this.name = name;
        this.subjects = new Subject[maxSubjects];
        this.subjectCount = 0;
    }

    // Get student name
    public String getName() {
        return name;
    }

    // Add a subject to the student
    public void addSubject(Subject subject) {
        if (subjectCount < subjects.length) {
            subjects[subjectCount] = subject;
            subjectCount++;
        } else {
            System.out.println("Cannot add more subjects for " + name);
        }
    }

    // Get subject count
    public int getSubjectsCount() {
        return subjectCount;
    }

    // Get a specific subject
    public Subject getSubject(int index) {
        if (index < subjectCount) {
            return subjects[index];
        }
        return null;
    }

    // Display individual subject grades
    public void displayGrades() {
        System.out.println("Grades for " + name + ":");
        for (int i = 0; i < subjectCount; i++) {
            Subject subject = subjects[i];
            String grade = GradeCalculator.calculateGrade(subject.getMarks());
            System.out.println(subject.getName() + ": " + grade);
        }
    }
}

// Main class to demonstrate the scenario
public class UseStudent {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("John", 5);

        // Create subjects and add marks
        Subject math = new Subject("Maths", 90);
        Subject science = new Subject("Science", 85);

        // Add subjects to the student
        student.addSubject(math);
        student.addSubject(science);

        // Display individual subject grades
        student.displayGrades();

        // Calculate and display overall grade
        GradeCalculator.calculateOverallGrade(student);
    }
}
