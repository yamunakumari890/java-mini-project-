public class Student {
   private int rollNo;
   private String name;
   private String course;
   private int marks;

   public Student(int rollNo, String name, String course, int marks) {
    this.rollNo = rollNo;
    this.name = name;
    this.course = course;
    this.marks = marks;
   }
   public int getRollNo() { return rollNo; }
   public String getName() { return name; }
   public String getCourse() {return course; }
   public int getMarks() { return marks; }

   public void display() {
    System.out.println("Roll No: " + rollNo);
    System.out.println("Name   : " + name);
    System.out.println("Course : " + course);
    System.out.println("Marks  : " + marks);
    System.out.println("--------------------------");
   }
   public static void main(String[] args) {
        Student s1 = new Student(101, "Yamuna", "Java", 90);
        s1.display();
    }
}
