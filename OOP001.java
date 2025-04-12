class dog {

    private String name;
    private String breed;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printDetailDog(String name, String breed, int age) {
        System.out.println("Name:" + name+"--Breed:" + breed + "--Age:" + age);

    }
}

public class OOP001 {
    public static void main(String[] args) {
        dog dog1 = new dog();
        dog1.setName("Micky");
        dog1.setBreed("Husky");
        dog1.setAge(12);
        dog1.printDetailDog(dog1.getName(), dog1.getBreed(), dog1.getAge());
    }
}
