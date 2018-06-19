package p02_MultipleInheritance;

/*
   Obekt koito v sebesi sudurja obekti - composition.
   Edin obekt si predava zaduljeniqta na nqkakuv drug obektt - Delegation.
 */
public class Main {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.weep();

    }
}
