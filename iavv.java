import j..util.Objects;

final class iavv implements Runnable {
    final iaku a;
    final iaof_metadata b;
    final iawh c;

    public iavv(iawh iawh0, iaku iaku0, iaof_metadata iaof0) {
        this.a = iaku0;
        this.b = iaof0;
        Objects.requireNonNull(iawh0);
        this.c = iawh0;
        super();
    }

    @Override
    public final void run() {
        this.c.b.e(this.a, this.b);
    }
}

