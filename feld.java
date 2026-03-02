import j..util.Objects;

final class feld implements Runnable {
    final fczq a;
    final felm b;

    public feld(felm felm0, fczq fczq0) {
        this.a = fczq0;
        Objects.requireNonNull(felm0);
        this.b = felm0;
        super();
    }

    @Override
    public final void run() {
        feka.a(this.b.b, this.b.v, this.b.c, this.b.q).c(this.a);
    }
}

