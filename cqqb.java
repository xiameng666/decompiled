import j..util.Objects;

final class cqqb implements Runnable {
    final cqqf a;

    public cqqb(cqqf cqqf0) {
        Objects.requireNonNull(cqqf0);
        this.a = cqqf0;
        super();
    }

    @Override
    public final void run() {
        this.a.k.c();
    }
}

