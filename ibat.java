import j..util.Objects;

final class ibat implements Runnable {
    final ibaz a;

    public ibat(ibaz ibaz0) {
        Objects.requireNonNull(ibaz0);
        this.a = ibaz0;
        super();
    }

    @Override
    public final void run() {
        this.a.c.o();
    }
}

