import j..util.Objects;

final class flis implements Runnable {
    final flit a;

    public flis(flit flit0) {
        Objects.requireNonNull(flit0);
        this.a = flit0;
        super();
    }

    @Override
    public final void run() {
        this.a.y();
        long v = iact.a.b().b();
        this.a.m.postDelayed(this.a.q, v);
    }
}

