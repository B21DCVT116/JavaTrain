
class person {

    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return name + " - " + address;
    }
}

class student extends person {

    private int credits;

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public student(String name, String address, int credits) {
        super(name, address);
        this.credits = credits;
    }

    public void study() {
        this.credits++;
    }

    public void credits() {
        System.out.println("Study credits " + credits);
    }
}

public class INHERITANCE008 {

    public static void main(String[] args) {
        student stu = new student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028", 0);
        System.out.println(stu.toString());
        stu.credits();
        stu.study();
        stu.credits();
    }
}
