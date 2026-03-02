import j..util.Objects;

final class iawe implements Runnable {
    final iapk a;
    final iaof_metadata b;
    final iawg c;

    public iawe(iawg iawg0, iapk iapk0, iaof_metadata iaof0) {
        this.a = iapk0;
        this.b = iaof0;
        Objects.requireNonNull(iawg0);
        this.c = iawg0;
        super();
    }

    @Override
    public final void run() {
        this.c.a.a(this.a, this.b);
    }
}

