package p07_FoodShortage;

public class Citizen extends Indentifiable implements Birthable, Buyer {
    private String name;
    private Integer age;
    private Integer food;


    public Citizen(String name, Integer age, String id, String birthdate) {
        super(id, birthdate);
        this.name = name;
        this.age = age;
        this.food = STARTING_FOOD;
    }


    @Override
    public boolean check(String fakeIdEnd) {
        return super.getId().endsWith(fakeIdEnd);
    }

    @Override
    public boolean checkBirthYear(String year) {
        return this.getBirthdate().endsWith(year);
    }

    @Override
    public String getBirthdate() {
        return super.getBirthdate();
    }

    @Override
    public void buyFood() {
        this.food += 10;
    }

    @Override
    public Integer getFood() {
        return this.food;
    }
}
