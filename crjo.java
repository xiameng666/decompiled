import j..util.Objects;

final class crjo implements Runnable {
    final crjp a;

    public crjo(crjp crjp0) {
        Objects.requireNonNull(crjp0);
        this.a = crjp0;
        super();
    }

    @Override
    public final void run() {
        this.a.a.ae();
    }
}

