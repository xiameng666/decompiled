import jeb.synthetic.FIN;

public final class udt implements ueb {
    public final boolean a;
    private final ueb b;
    private final uay c;
    private int d;
    private boolean e;
    private final udm f;

    public udt(ueb ueb0, boolean z, uay uay0, udm udm0) {
        uqo.f(ueb0);
        this.b = ueb0;
        this.a = z;
        this.c = uay0;
        uqo.f(udm0);
        this.f = udm0;
    }

    @Override  // ueb
    public final int a() {
        return this.b.a();
    }

    @Override  // ueb
    public final Class b() {
        return this.b.b();
    }

    @Override  // ueb
    public final Object c() {
        return this.b.c();
    }

    public final void d() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(!this.e) {
            ++this.d;
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new IllegalStateException("Cannot acquire a recycled resource");
    }

    @Override  // ueb
    public final void e() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(this.d <= 0) {
            if(!this.e) {
                this.e = true;
                this.b.e();
                FIN.finallyCodeBegin$NT(v);
                return;
            }
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
    }

    public final void f() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        int v1 = this.d;
        if(v1 > 0) {
            this.d = v1 - 1;
            FIN.finallyCodeBegin$NT(v);
            if(v1 - 1 == 0) {
                udm udm0 = this.f;
                uay uay0 = this.c;
                udm0.g.d(uay0);
                if(this.a) {
                    udm0.b.d(uay0, this);
                    return;
                }
                udm0.d.a(this, false);
            }
            return;
        }
        throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
    }

    @Override
    public final String toString() {
        boolean z;
        int v1;
        synchronized(this) {
            v1 = this.d;
            z = this.e;
        }
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.f.toString() + ", key=" + this.c + ", acquired=" + v1 + ", isRecycled=" + z + ", resource=" + this.b.toString() + "}";
    }
}

