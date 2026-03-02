import j..util.Objects;

final class iaws implements Runnable {
    final ialv a;
    final iaxg b;

    public iaws(iaxg iaxg0, ialv ialv0) {
        this.a = ialv0;
        Objects.requireNonNull(iaxg0);
        this.b = iaxg0;
        super();
    }

    @Override
    public final void run() {
        this.b.f.j(this.a);
    }
}

