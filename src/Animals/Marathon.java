public class Marathon {
    public static void main(String[] args) {
        Animals[] animals = new Animals[3];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new StrongDog();

        System.out.println(animals[0].swim(1));
        System.out.println(animals[0].jump(2));
        System.out.println(animals[1].run(400));
        System.out.println(animals[1].swim(11));
        System.out.println(animals[2].swim(16));
        System.out.println(animals[2].run(550));
    }
}
