abstract class Abstraction {
    public String fname = "georgegoldman";
    public int age = 24;
    public abstract void study();
}

class Student extends Abstraction {
    public int graduationYear = 2014;
    public void study() {
        System.out.println("Studying all day long");
    }
}

class Mainmain {
    public static void main(String[] args) {
        Student newStudent = new Student();
        System.out.println("am "+newStudent.fname+" "+newStudent.age);
        System.out.println("i garduated from college in "+newStudent.graduationYear);
        newStudent.study();
    }
}