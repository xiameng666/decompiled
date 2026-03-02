import j..util.Objects;

final class iaxb implements Runnable {
    final ibfp a;
    final iaxf b;

    public iaxb(iaxf iaxf0, ibfp ibfp0) {
        this.a = ibfp0;
        Objects.requireNonNull(iaxf0);
        this.b = iaxf0;
        super();
    }

    @Override
    public final void run() {
        this.b.a.d(this.a);
    }
}

