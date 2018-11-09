public class student {

    public String name;
    public static String university;
    public student (String name) {
        this.name = name;
    }
    public static void printInfo (student student) {
        System.out.println(student.name);
        }

        public void printName() {
            System.out.println(name);
        }

    public static void main(String[] args) {
        student ivan = new student("ivan");
        student igor = new student("Igor");
        student.university = "BSUIR";
        System.out.println(ivan.name);
        System.out.println(ivan.university);
        System.out.println(igor.name);
        System.out.println(igor.university);
        ivan.printName();
        student.printInfo(ivan);
        igor.printInfo(igor);
        igor.printName();

    }
}
