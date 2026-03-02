import j..util.Objects;

final class iawz implements Runnable {
    final iapk a;
    final iaxg b;

    public iawz(iaxg iaxg0, iapk iapk0) {
        this.a = iapk0;
        Objects.requireNonNull(iaxg0);
        this.b = iaxg0;
        super();
    }

    @Override
    public final void run() {
        this.b.f.c(this.a);
    }
}

