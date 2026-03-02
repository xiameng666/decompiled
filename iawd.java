import j..util.Objects;

final class iawd implements Runnable {
    final Object a;
    final iawg b;

    public iawd(iawg iawg0, Object object0) {
        this.a = object0;
        Objects.requireNonNull(iawg0);
        this.b = iawg0;
        super();
    }

    @Override
    public final void run() {
        this.b.a.c(this.a);
    }
}

