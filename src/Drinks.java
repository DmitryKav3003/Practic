class Duck extends Cat implements Swimmable{
    public void swim(){
        System.out.println("gogogo");
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.swim();
        duck.run();

        Cat cat = new Cat();
        cat.voice();
    }


}
