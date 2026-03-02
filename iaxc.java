import j..util.Objects;

final class iaxc implements Runnable {
    final iaxf a;

    public iaxc(iaxf iaxf0) {
        Objects.requireNonNull(iaxf0);
        this.a = iaxf0;
        super();
    }

    @Override
    public final void run() {
        this.a.a.e();
    }
}

