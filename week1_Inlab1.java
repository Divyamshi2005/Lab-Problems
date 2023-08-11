class Person {
    String name;
    String gender;
    int age;
    
    Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}

class Student extends Person {
    int classOfStudy;
    String collegeName;
    int yearOfStudy;
    
    Student(String name, String gender, int age, int classOfStudy, String collegeName, int yearOfStudy) {
        super(name, gender, age);
        this.classOfStudy = classOfStudy;
        this.collegeName = collegeName;
        this.yearOfStudy = yearOfStudy;
    }
    
    void display() {
        System.out.println("Student name: " + name);
        System.out.println("Student gender: " + gender);
        System.out.println("Student age: " + age);
        System.out.println("Class of study: " + classOfStudy);
        System.out.println("College name: " + collegeName);
        System.out.println("Year of study: " + yearOfStudy);
    }
}

class Employee extends Person {
    String designation;
    String companyName;
    int experience;
    
    Employee(String name, String gender, int age, String designation, String companyName, int experience) {
        super(name, gender, age);
        this.designation = designation;
        this.companyName = companyName;
        this.experience = experience;
    }
    
    void display() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee gender: " + gender);
        System.out.println("Employee age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Company name: " + companyName);
        System.out.println("Experience: " + experience);
    }
}

class week1_Inlab1 {
    public static void main(String args[]) {
        Student obj = new Student("Anusha", "Female", 19, 1, "KLU", 1);
        obj.display();
        
        Employee obj1 = new Employee("Sowmya", "Female", 45, "H.O.D", "GP", 5);
        obj1.display();
    }
}
