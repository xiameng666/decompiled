import j..util.Objects;

final class iawc implements Runnable {
    final iaof_metadata a;
    final iawg b;

    public iawc(iawg iawg0, iaof_metadata iaof0) {
        this.a = iaof0;
        Objects.requireNonNull(iawg0);
        this.b = iawg0;
        super();
    }

    @Override
    public final void run() {
        this.b.a.b(this.a);
    }
}

