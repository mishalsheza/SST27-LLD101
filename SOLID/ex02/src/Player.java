public class Player {
    private final Decoder decoder;
    private final Renderer renderer;
    private final Cache cache;

    Player(Decoder decoder, Renderer renderer, Cache cache) {
        this.decoder = decoder;
        this.renderer = renderer;
        this.cache = cache;
    }

    void play(byte[] fileBytes) {
        Frame f = decoder.decode(fileBytes);
        cache.store(f);
        renderer.render(f);
        System.out.println("Cached last frame? " + (cache.getLast()!=null));
    }
}