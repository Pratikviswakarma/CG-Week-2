// Faculty class (Aggregation with University)
class Faculty {
    private String name;

    // Constructor
    public Faculty(String name) {
        this.name = name;
    }

    // Display faculty details
    public void displayFacultyInfo() {
        System.out.println("Faculty: " + name);
    }

    // Get faculty name
    public String getName() {
        return name;
    }
}

// Department class (Composition with University)
class Department {
    private String departmentName;

    // Constructor
    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    // Display department details
    public void displayDepartmentInfo() {
        System.out.println("Department: " + departmentName);
    }

    // Get department name
    public String getDepartmentName() {
        return departmentName;
    }
}

// University class
class University {
    private String universityName;
    private Department[] departments;
    private Faculty[] faculties;
    private int departmentCount;
    private int facultyCount;

    // Constructor
    public University(String universityName, int maxDepartments, int maxFaculties) {
        this.universityName = universityName;
        this.departments = new Department[maxDepartments]; // Fixed size for departments
        this.faculties = new Faculty[maxFaculties];        // Fixed size for faculties
        this.departmentCount = 0;
        this.facultyCount = 0;
    }

    // Add a department to the university (Composition)
    public void addDepartment(Department department) {
        if (departmentCount < departments.length) {
            departments[departmentCount] = department;
            departmentCount++;
        } else {
            System.out.println("Cannot add more departments to " + universityName);
        }
    }

    // Add a faculty to the university (Aggregation)
    public void addFaculty(Faculty faculty) {
        if (facultyCount < faculties.length) {
            faculties[facultyCount] = faculty;
            facultyCount++;
        } else {
            System.out.println("Cannot add more faculties to " + universityName);
        }
    }

    // Display university details
    public void displayUniversityInfo() {
        System.out.println("University: " + universityName);
        System.out.println("Departments:");
        for (int i = 0; i < departmentCount; i++) {
            departments[i].displayDepartmentInfo();
        }
        System.out.println("Faculties:");
        for (int i = 0; i < facultyCount; i++) {
            faculties[i].displayFacultyInfo();
        }
    }

    // Simulate deleting the university (Composition)
    public void deleteUniversity() {
        System.out.println("Deleting University: " + universityName);
        departments = null; // Deleting all departments
        System.out.println("All departments deleted.");
        faculties = null;   // Faculties are not deleted as they exist independently
        System.out.println("Faculties remain unaffected.");
    }
}

// Main class to demonstrate composition and aggregation
public class UseUniversityAndDepartments {
    public static void main(String[] args) {
        // Create a university
        University university = new University("TechVille University", 3, 3);

        // Create departments
        Department csDept = new Department("Computer Science");
        Department mechDept = new Department("Mechanical Engineering");
        Department eeDept = new Department("Electrical Engineering");

        // Create faculties
        Faculty faculty1 = new Faculty("Dr. Alice");
        Faculty faculty2 = new Faculty("Dr. Bob");
        Faculty faculty3 = new Faculty("Dr. Charlie");

        // Add departments to the university
        university.addDepartment(csDept);
        university.addDepartment(mechDept);
        university.addDepartment(eeDept);

        // Add faculties to the university
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);
        university.addFaculty(faculty3);

        // Display university details
        university.displayUniversityInfo();
        System.out.println();

        // Delete the university
        university.deleteUniversity();
    }
}
