public class beln extends lsb {
    public final beih a;
    public final begp b;
    public final lqi c;
    public final bxox d;
    public final boolean e;
    public final bglz f;
    private final lqd g;
    private final lqj h;

    public beln(beih beih0, begp begp0, beli beli0, bglz bglz0, boolean z) {
        this.c = new lqi();
        this.d = new bxox();
        this.a = beih0;
        this.b = begp0;
        lqd lqd0 = beli0.a();
        this.g = lqd0;
        this.e = z;
        this.f = bglz0;
        belk belk0 = new belk(this);
        this.h = belk0;
        lqd0.ih(belk0);
    }

    public final void a(String s, CharSequence charSequence0) {
        this.f.a(s, charSequence0);
        this.b();
    }

    public final void b() {
        if(!bglz.c()) {
            this.d.l(null);
        }
    }

    public final void c(gqlt gqlt0) {
        this.c.l(gqlt0);
    }

    public final boolean e(String s) {
        bedv bedv0 = (bedv)this.g.ij();
        if(s != null && bedv0 != null) {
            Object object0 = bedv0.b;
            if(object0 != null) {
                int v = ((gged_interceptors)object0).size();
                int v1 = 0;
                while(v1 < v) {
                    gqlt gqlt0 = (gqlt)((gged_interceptors)object0).get(v1);
                    ++v1;
                    if(gggq.w(ggch.j(gqlt0.c).m(new bell()).l(new belm()).q(), s)) {
                        this.c(gqlt0);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override  // lsb
    protected final void km() {
        this.g.j(this.h);
    }
}

