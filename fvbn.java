import j..util.Objects;

final class fvbn implements bbqm {
    final fvbo a;

    public fvbn(fvbo fvbo0) {
        Objects.requireNonNull(fvbo0);
        this.a = fvbo0;
        super();
    }

    @Override  // bbqm
    public final void a() {
        fvbm fvbm0 = new fvbm(this);
        this.a.d.execute(fvbm0);
    }

    @Override  // bbqm
    public final void b() {
        fvbl fvbl0 = new fvbl(this);
        this.a.d.execute(fvbl0);
    }
}

