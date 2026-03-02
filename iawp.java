import j..util.Objects;

final class iawp implements Runnable {
    final int a;
    final iaxg b;

    public iawp(iaxg iaxg0, int v) {
        this.a = v;
        Objects.requireNonNull(iaxg0);
        this.b = iaxg0;
        super();
    }

    @Override
    public final void run() {
        this.b.f.g(this.a);
    }
}

