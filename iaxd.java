import j..util.Objects;

final class iaxd implements Runnable {
    final iaof_metadata a;
    final iaxf b;

    public iaxd(iaxf iaxf0, iaof_metadata iaof0) {
        this.a = iaof0;
        Objects.requireNonNull(iaxf0);
        this.b = iaxf0;
        super();
    }

    @Override
    public final void run() {
        this.b.a.c(this.a);
    }
}

