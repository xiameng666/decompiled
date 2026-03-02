import j..util.Objects;

public final class eqsz implements Runnable {
    final eqte a;

    public eqsz(eqte eqte0) {
        Objects.requireNonNull(eqte0);
        this.a = eqte0;
        super();
    }

    @Override
    public final void run() {
        this.a.c.b();
    }
}

