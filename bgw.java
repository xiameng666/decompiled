import j..util.Objects;

public final class bgw {
    public final bhe a;
    public final gmcd b;
    public jqt c;
    public jqt d;
    public boolean e;
    public boolean f;
    public gmcd g;
    public final bhd h;
    private final gmcd i;

    public bgw(bhe bhe0, bhd bhd0) {
        this.e = false;
        this.f = false;
        this.a = bhe0;
        this.h = bhd0;
        this.i = jqy.a(new bgu(this));
        this.b = jqy.a(new bgv(this));
    }

    final gmcd a() {
        boj.b();
        return this.i;
    }

    public final void b(bcf bcf0) {
        boj.b();
        this.e = true;
        ((gmcd)Objects.requireNonNull(this.g)).cancel(true);
        this.c.c(bcf0);
        this.d.b(null);
    }

    public final void c() {
        kay.d(this.i.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    public final void d() {
        bhe bhe0 = this.a;
        if(bhe0.k()) {
            throw null;
        }
        if(!bhe0.k()) {
            kay.d(((boolean)(this.b.isDone() ^ 1)), "The callback can only complete once.");
        }
        this.d.b(null);
    }

    public final void e() {
        boj.b();
        if(!this.e && !this.f) {
            this.f = true;
            bhe bhe0 = this.a;
            if(bhe0.f() != null) {
                throw null;
            }
            bbz bbz0 = bhe0.g();
            if(bbz0 != null) {
                bbz0.a();
            }
        }
    }

    public static final void f() {
        boj.b();
        throw null;
    }
}

