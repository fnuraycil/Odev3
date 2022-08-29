public class Main {
    public static void main(String[] args)
    {
        Animal nesne = new Animal();

        nesne.name = "Pati";
        nesne.age = 3 ;

        Dog nesne2 = new Dog();
        nesne2.name = "Herkül";
        nesne2.age = 5;
        nesne2.breed = "cocker";
        nesne2.information();

        Cat nesne3 = new Cat();
        nesne3.name = "Tırmık";
        nesne3.age = 3;
        nesne3.breed = "Sarman";
        nesne3.information();

        Kus nesne4 = new Kus();
        nesne4.name = "Maviş";
        nesne4.age = 1;
        nesne4.konusma = true;
        nesne4.information();

    }
}
