import j..util.Objects;

final class fccp implements Runnable {
    final fccr a;

    public fccp(fccr fccr0) {
        Objects.requireNonNull(fccr0);
        this.a = fccr0;
        super();
    }

    @Override
    public final void run() {
        this.a.Q().b.d(this.a.a, this.a.b);
        this.a.b = -1;
        this.a.ad();
    }
}

