import j..util.Objects;

final class eqsj implements Runnable {
    final eqsl a;

    public eqsj(eqsl eqsl0) {
        Objects.requireNonNull(eqsl0);
        this.a = eqsl0;
        super();
    }

    @Override
    public final void run() {
        this.a.b.a();
    }
}

