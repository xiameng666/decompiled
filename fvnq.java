public abstract class fvnq {
    protected final fvlt h;
    protected final fybc i;
    protected boolean j;
    protected final fvob k;
    int l;

    public fvnq(fvlt fvlt0, fybc fybc0, fvob fvob0) {
        this.j = false;
        this.h = fvlt0;
        this.i = fybc0;
        this.k = fvob0;
    }

    protected abstract void a();

    protected abstract boolean b(gwvh arg1, ProtoLiteBuilder arg2);

    public final void e() {
        synchronized(this) {
            this.j = true;
            this.a();
        }
    }

    public final boolean f(gwvh gwvh0, ProtoLiteBuilder hftp0) {
        boolean z;
        synchronized(this) {
            if(this.j) {
                return false;
            }
            int v1 = this.l + 1;
            this.l = v1;
            fvob fvob0 = this.k;
            if(fvob0 != null) {
                fvob0.f(v1);
                fvob0.e(gwvh0);
            }
            z = this.b(gwvh0, hftp0);
        }
        return z;
    }
}

