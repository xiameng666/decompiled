import j..util.Objects;

final class iavx implements Runnable {
    final Object a;
    final iawh b;

    public iavx(iawh iawh0, Object object0) {
        this.a = object0;
        Objects.requireNonNull(iawh0);
        this.b = iawh0;
        super();
    }

    @Override
    public final void run() {
        this.b.b.d(this.a);
    }
}

