class StudentArray {
    int id;
    String name;

    StudentArray(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println(id + " - " + name);
    }

    public static void main(String[] args) {
        StudentArray s1 = new StudentArray(1, "Ram");
        StudentArray s2 = new StudentArray(2, "Sita");
        StudentArray s3 = new StudentArray(3, "Raj");

        s1.display();
        s2.display();
        s3.display();
    }
}
