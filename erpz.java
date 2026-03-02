import j..util.Objects;

final class erpz implements Runnable {
    final erpe a;

    public erpz(erpe erpe0) {
        Objects.requireNonNull(erpe0);
        this.a = erpe0;
        super();
    }

    @Override
    public final void run() {
        this.a.b.a();
    }
}

