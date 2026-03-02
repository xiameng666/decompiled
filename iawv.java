import j..util.Objects;

final class iawv implements Runnable {
    final ials a;
    final iaxg b;

    public iawv(iaxg iaxg0, ials ials0) {
        this.a = ials0;
        Objects.requireNonNull(iaxg0);
        this.b = iaxg0;
        super();
    }

    @Override
    public final void run() {
        this.b.f.i(this.a);
    }
}

