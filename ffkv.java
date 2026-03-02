import j..util.Objects;

final class ffkv extends ffee {
    final fdiy c;
    final fflv d;

    public ffkv(fflv fflv0, fdiy fdiy0) {
        this.c = fdiy0;
        Objects.requireNonNull(fflv0);
        this.d = fflv0;
        super("recordSwaadlOptIn");
    }

    @Override  // ffee
    public final void a() {
        batl.s(this.d.C);
        this.d.C.f().z(new ffku(this.c));
    }
}

