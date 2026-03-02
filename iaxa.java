import j..util.Objects;

final class iaxa implements Runnable {
    final iaxg a;

    public iaxa(iaxg iaxg0) {
        Objects.requireNonNull(iaxg0);
        this.a = iaxg0;
        super();
    }

    @Override
    public final void run() {
        this.a.f.e();
    }
}

