import j..util.Objects;

final class fdrb implements fdyn {
    public final fdrq a;
    final fdri b;

    public fdrb(fdri fdri0, fdrq fdrq0) {
        Objects.requireNonNull(fdri0);
        this.b = fdri0;
        super();
        this.a = fdrq0;
    }

    @Override  // fdyn
    public final void a(fdwh fdwh0) {
        fdra fdra0 = new fdra(this, fdwh0);
        this.b.b(fdra0);
    }
}

