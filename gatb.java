import j..util.Objects;

public final class gatb {
    public boolean a;
    public boolean b;
    public float c;
    public final int d;
    public final boolean e;
    public final gass f;
    public final gatc g;

    public gatb(gatc gatc0, gass gass0) {
        Objects.requireNonNull(gatc0);
        this.g = gatc0;
        super();
        this.a = true;
        this.f = gass0;
        this.b = gass0.aE();
        this.c = gass0.o();
        this.d = gass0.r();
        this.e = gass0.aN();
        gass0.am(((boolean)(this.a ^ 1)));
    }

    public final long a() {
        return this.f.no();
    }

    public final void b(int v) {
        this.f.ao(v);
    }

    public final void c(boolean z) {
        if(this.a != ((int)z)) {
            this.a = (int)z;
            this.f.am(((boolean)(((int)z) ^ 1)));
        }
    }

    public final boolean d() {
        return this.f.az();
    }
}

