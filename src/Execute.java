public class Execute{
    public static void main(String[] args) {
        Dog maltese = new Dog();
        maltese.data.setBreed("Maltese");
        maltese.data.setSize("Small");
        maltese.data.setAge(2);
        maltese.data.setColor("white");
        System.out.println(maltese.getInfo());
    }
} 