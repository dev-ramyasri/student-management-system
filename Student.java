class Student {
    int id;
    String name;
    int marks;

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.id = 1;
        s1.name = "Ramyasri";
        s1.marks = 95;

        s1.display();
    }
}
