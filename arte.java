import j..util.Objects;

final class arte implements Runnable {
    final artg a;
    private final artd b;

    public arte(artg artg0, artd artd0) {
        Objects.requireNonNull(artg0);
        this.a = artg0;
        super();
        this.b = artd0;
    }

    @Override
    public final void run() {
        artg artg0 = this.a;
        if(!artg0.g) {
            artg0.b(gfsx.m(this.b));
        }
    }
}

