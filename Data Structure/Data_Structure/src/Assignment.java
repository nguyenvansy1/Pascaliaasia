public class Assignment {
    private String name;
    private int age;

    public Assignment() {
    }

    public Assignment(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static void getStudentByAge(Assignment[] students, int age) {
        for (int i=0;i<students.length;i++) {
            if (students[i].getAge() == age) {
                System.out.println(students[i].getName());
            }
        }
    }
    public static void main(String[] args) {
        Assignment[] students = new Assignment[10];
        students[0] = new Assignment("Anders",25);
        students[1] = new Assignment("Maria",30);
        students[2] = new Assignment("Trujillo",40);
        students[3] = new Assignment("Ana",46);
        students[4] = new Assignment("Moreno",40);
        students[5] = new Assignment("Moreno",42);
        students[6] = new Assignment("Thomas",11);
        students[7] = new Assignment("Christina",27);
        students[8] = new Assignment("Berglund",31);
        students[9] = new Assignment("Hardy",9);
//         for (int i=0; i<students.length;i++) {
//             System.out.print(students[i].getAge()+", ");
//         }

         getStudentByAge(students,40);
    }
}
