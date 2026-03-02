import j..util.Objects;

final class iawt implements Runnable {
    final int a;
    final iaxg b;

    public iawt(iaxg iaxg0, int v) {
        this.a = v;
        Objects.requireNonNull(iaxg0);
        this.b = iaxg0;
        super();
    }

    @Override
    public final void run() {
        this.b.f.k(this.a);
    }
}

