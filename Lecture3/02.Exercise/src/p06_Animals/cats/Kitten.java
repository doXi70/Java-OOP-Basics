package p06_Animals.cats;

public class Kitten extends Cat {
    public Kitten(String name, int age, String gender) {
        super(name, age, gender);
        validateGender();
    }

    // Kittens can only be female!
    private void validateGender() {
        if (!super.gender.equals("Female")) {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    @Override
    public void produceSound() {
        System.out.println("Miau");
    }
}
