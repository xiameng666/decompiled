import j..util.Objects;

final class iazy implements Runnable {
    final Runnable a;
    final iall b;
    final ibbd c;

    public iazy(ibbd ibbd0, Runnable runnable0, iall iall0) {
        this.a = runnable0;
        this.b = iall0;
        Objects.requireNonNull(ibbd0);
        this.c = ibbd0;
        super();
    }

    @Override
    public final void run() {
        gftb.z(this.c.l, "executor");
        iavo iavo0 = new iavo(this.a, this.c.l);
        iavp iavp0 = this.c.q;
        if(iavp0.b != this.b) {
            iavo0.a();
            return;
        }
        iavp0.a.add(iavo0);
    }
}

