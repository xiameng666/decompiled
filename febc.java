import j..util.Objects;

final class febc implements Runnable {
    final febd a;
    private final fewy b;
    private boolean c;

    public febc(febd febd0, fewy fewy0) {
        Objects.requireNonNull(febd0);
        this.a = febd0;
        super();
        this.c = false;
        this.b = fewy0;
    }

    public final void a() {
        this.c = true;
    }

    @Override
    public final void run() {
        if(!this.c) {
            feaq feaq0 = new feaq(this.b);
            this.a.b(feaq0);
        }
    }
}

