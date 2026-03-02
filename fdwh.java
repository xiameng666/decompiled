import j..util.Objects;

final class fdwh {
    public Object a;
    public final long b;
    final fdwg c;
    public final fdyn d;
    public int e;
    public boolean f;
    public final Object g;
    final fdwi h;

    public fdwh(fdwi fdwi0, Object object0, long v, int v1, fdyn fdyn0) {
        Objects.requireNonNull(fdwi0);
        this.h = fdwi0;
        super();
        this.c = new fdwg(this);
        this.g = new Object();
        this.a = object0;
        this.b = v;
        this.d = fdyn0;
        this.e = v1 + 1;
    }

    public final boolean a() {
        synchronized(this.g) {
            if(!this.f) {
                this.f = true;
                this.a = null;
                this.h.a.a.removeCallbacks(this.c);
                this.h.c.a();
                return true;
            }
        }
        return false;
    }
}

