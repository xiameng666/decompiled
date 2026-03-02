import j..util.Objects;

final class hmaz implements Runnable {
    final hmgp a;
    final hmba b;

    public hmaz(hmba hmba0, hmgp hmgp0) {
        this.a = hmgp0;
        Objects.requireNonNull(hmba0);
        this.b = hmba0;
        super();
    }

    @Override
    public final void run() {
        this.b.b.c("Raised contactless completed event", new Object[0]);
        this.b.a.e(this.a);
    }
}

