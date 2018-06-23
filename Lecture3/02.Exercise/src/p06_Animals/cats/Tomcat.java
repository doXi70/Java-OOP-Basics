package p06_Animals.cats;

public class Tomcat extends Cat {

    public Tomcat(String name, int age, String gender) {
        super(name, age, gender);
        validateGender();
    }

    // Tomcats can only be male!
    private void validateGender() {
        if (!(super.gender.equals("Male"))) {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    @Override
    public void produceSound() {
        System.out.println("Give me one million b***h");
    }

}
