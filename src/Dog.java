public class Dog extends Animal{

    String breed;
    int humanYears;

    Dog(){
        super();
    }

    public void information() {
        System.out.println("Name : " + name + "\n" +
                "Breed : " + breed + "\n" +
                "Age in calendar years : " + age + "\n" +
                "Age in human years : " + getAgeInHumanYears(5) + "\n" );
    }
}
