import java.util.Scanner;

public class oop_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        stud student1 = new stud(22, 44, 88, "nkjiewnn");
        stud student2 = new stud(11, 33, 66, "jkuryfr");
        System.out.println("roll    name    age    marks");
        System.out.println(student1.roll + "  " + student1.name + "   " + student1.age + "    " + student1.marks);
        System.out.println(student2.roll + "  " + student2.name + "   " + student2.age + "    " + student2.marks);

        student1.changed();
        /*
         * int n;
         * System.out.println("how many students?");
         * n = scan.nextInt();
         * for (int i = 1; i <= n; i++) {
         * System.out.println("enter the" + i + " student's name.");
         * student1.name = scan.nextLine();
         * 
         * }
         */
    }
}

class stud {
    int roll, age;
    float marks;
    String name;

    void changed() {
        this.name = "uuuuuuufh";
        System.out.println(name);
    }

    // creating constractor
    stud(int roll, int age, float marks, String name) {
        this.roll = roll;
        this.age = age;
        this.marks = marks;
        this.name = name;
    }
}