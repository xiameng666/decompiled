import j..util.Objects;

final class hmay implements Runnable {
    final hmho a;
    final hmba b;

    public hmay(hmba hmba0, hmho hmho0) {
        this.a = hmho0;
        Objects.requireNonNull(hmba0);
        this.b = hmba0;
        super();
    }

    @Override
    public final void run() {
        this.b.b.c("Raised contactless aborted event", new Object[0]);
        this.b.a.i(this.a);
    }
}

