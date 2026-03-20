class University {
    String universityName;
    String location;

    // Constructor
    University(String universityName, String location) {
        this.universityName = universityName;
        this.location = location;
    }

    // Inner class Department
    class Department {
        String deptName;
        String hodName;

        // Constructor
        Department(String deptName, String hodName) {
            this.deptName = deptName;
            this.hodName = hodName;
        }

        // Method to display details
        void displayDetails() {
            // Accessing outer class fields directly
            System.out.println("University Name: " + universityName);
            System.out.println("Location: " + location);
            System.out.println("Department Name: " + deptName);
            System.out.println("Head of Department: " + hodName);
        }
    }
}

public class TestInnerClass {
    public static void main(String[] args) {
        // Create University object
        University uni = new University("KIIT University", "Bhubaneswar");

        // Create Department object using University object
        University.Department dept = uni.new Department("Computer Science", "Dr. Mishra");

        // Display details
        dept.displayDetails();
    }
}
