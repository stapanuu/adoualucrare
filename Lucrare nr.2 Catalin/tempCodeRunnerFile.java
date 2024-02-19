port java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    static class Student {
        private String firstName;
        private String lastName;
        private String email;
        private Date enrollmentDate;
        private Date dateOfBirth;

        public Student(String firstName, String lastName, String email, Date enrollmentDate, Date dateOfBirth) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.enrollmentDate = enrollmentDate;
            this.dateOfBirth = dateOfBirth;
        }

    }

    static class Faculty {
        private String name;
        private String abbreviation;
        private List<Student> students;
        private StudyField studyField;

        public Faculty(String name, String abbreviation, List<Student> students, StudyField studyField) {
            this.name = name;
            this.abbreviation = abbreviation;
            this.students = students;
            this.studyField = studyField;
        }

    }

    enum StudyField {
        MECHANICAL_ENGINEERING,
        SOFTWARE_ENGINEERING,
        FOOD_TECHNOLOGY,
        URBANISM_ARCHITECTURE,
        VETERINARY_MEDICINE
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an operation:");
            System.out.println("1. Faculty operations");
            System.out.println("2. General operations");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    facultyOperations(scanner);
                    break;
                case 2:
                    generalOperations(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
    }

    private static void facultyOperations(Scanner scanner) {
        System.out.println("Faculty operations:");
        System.out.println("1. Create and assign a student to a faculty");
        System.out.println("2. Graduate a student from a faculty");
        System.out.println("3. Display current enrolled students");
        System.out.println("4. Display graduates");
        System.out.println("5. Check if a student belongs to this faculty");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
                // creaza si insemneaza studenti la o facultate
                break;
            case 2:
                // graduati
                break;
            case 3:
                // joska ce mii de lene
                break;
            case 4:
                // arata graduatii
                break;
            case 5:
                // check daca ii graduat mujicu
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private static void generalOperations(Scanner scanner) {
        System.out.println("General operations:");
        System.out.println("1. Create a new faculty");
        System.out.println("2. Search what faculty a student belongs to by a unique identifier");
        System.out.println("3. Display University faculties");
        System.out.println("4. Display all faculties belonging to a field");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
                // creaza facultate noua
                break;
            case 2:
                // salut catalin aici ii multa bataie la cap eu am facut in prima zi de cand ne-ai dat si in ultima zi
                break;
            case 3:
                // arata facultatea universitatilor
                break;
            case 4:
                // arata toate facultatile care is intr-un field
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
