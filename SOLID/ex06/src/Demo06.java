public class Demo06 {
    public static void main(String[] args) {
        Aviary aviary = new Aviary();

        Flyable sparrow = new Bird();
        aviary.release(sparrow);

        NonFlyable penguin = new Penguin();
        aviary.releaseNonFlyable(penguin);
    }
}

