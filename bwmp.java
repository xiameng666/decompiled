import j..util.Objects;

final class bwmp extends bwzp {
    final bwmx a;

    public bwmp(bwmx bwmx0, gltq gltq0) {
        Objects.requireNonNull(bwmx0);
        this.a = bwmx0;
        super(gltq0);
    }

    @Override  // bwzp
    public final void w() {
        try {
            this.a.r();
        }
        finally {
            this.a.e.release();
        }
    }
}

