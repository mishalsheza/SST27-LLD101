class Aviary {public 
    void release(Flyable b){
        b.fly();
        System.out.println("Released");
    }

    void releaseNonFlyable(NonFlyable b){
        b.walk();
        System.out.println("Released");
    }}