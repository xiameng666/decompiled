import j..util.Objects;

final class eres implements Runnable {
    final erew a;

    public eres(erew erew0) {
        Objects.requireNonNull(erew0);
        this.a = erew0;
        super();
    }

    @Override
    public final void run() {
        this.a.c.run();
    }
}

