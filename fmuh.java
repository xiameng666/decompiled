import j..util.Objects;

final class fmuh implements gmbg {
    final fmga a;
    final fmus b;

    public fmuh(fmus fmus0, fmga fmga0) {
        this.a = fmga0;
        Objects.requireNonNull(fmus0);
        this.b = fmus0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        flbj.c("ConvPresenter", "error send in conv: " + this.a.c + ", error: " + throwable0.getMessage());
        fmuf fmuf0 = new fmuf(this);
        this.b.k.post(fmuf0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        fmug fmug0 = new fmug(this);
        this.b.k.post(fmug0);
    }
}

