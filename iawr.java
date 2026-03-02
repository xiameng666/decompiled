import j..util.Objects;

final class iawr implements Runnable {
    final ialh a;
    final iaxg b;

    public iawr(iaxg iaxg0, ialh ialh0) {
        this.a = ialh0;
        Objects.requireNonNull(iaxg0);
        this.b = iaxg0;
        super();
    }

    @Override
    public final void run() {
        this.b.f.h(this.a);
    }
}

