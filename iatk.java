import j..util.Objects;

final class iatk implements Runnable {
    final iatm a;

    public iatk(iatm iatm0) {
        Objects.requireNonNull(iatm0);
        this.a = iatm0;
        super();
    }

    @Override
    public final void run() {
        iakk iakk0 = this.a.g;
        this.a.b.e();
        this.a.g = iakk0;
        this.a.b.b();
    }
}

