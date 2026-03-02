import j..util.Objects;

final class crpl implements Runnable {
    final long a;
    final long b;
    final crpm c;

    public crpl(crpm crpm0, long v, long v1) {
        Objects.requireNonNull(crpm0);
        this.c = crpm0;
        super();
        this.a = v;
        this.b = v1;
    }

    @Override
    public final void run() {
        this.c.b.aK().f(new crpk(this));
    }
}

