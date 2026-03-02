import j..util.Objects;

final class absn implements abqj {
    final Runnable a;
    final absp b;

    public absn(absp absp0, Runnable runnable0) {
        this.a = runnable0;
        Objects.requireNonNull(absp0);
        this.b = absp0;
        super();
    }

    @Override  // abqj
    public final void a() {
        this.b.a.post(this.a);
    }
}

