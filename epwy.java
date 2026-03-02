import j..util.Objects;

final class epwy implements Runnable {
    final epxa a;

    public epwy(epxa epxa0) {
        Objects.requireNonNull(epxa0);
        this.a = epxa0;
        super();
    }

    @Override
    public final void run() {
        epxa.a.j("Overriding encryption after waiting for source encryption message.", new Object[0]);
        this.a.c();
        this.a.o();
    }
}

