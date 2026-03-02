import android.app.Activity;

public final class dmsf implements evqk {
    public final dmsn a;
    public final hkid b;
    public final int c;
    public final hkhr d;
    public final xob e;

    public dmsf(dmsn dmsn0, hkid hkid0, int v, hkhr hkhr0, xob xob0) {
        this.a = dmsn0;
        this.b = hkid0;
        this.c = v;
        this.d = hkhr0;
        this.e = xob0;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        int v2;
        int v = ((hkgq)object0).b;
        if(hkgp.a(v) != 3) {
            int v1 = hkgp.a(v);
            if(v1 != 0) {
                throw new IllegalStateException("Server returned invalid action token: " + (v1 - 1));
            }
            throw null;
        }
        hkid hkid0 = this.b;
        if(hkid0 == hkid.b) {
            v2 = 1;
        }
        else {
            v2 = hkid0 == hkid.g ? 2 : 0;
        }
        etbu etbu0 = new etbu();
        etbu0.d(false);
        hkhr hkhr0 = this.d;
        dmsn dmsn0 = this.a;
        etbu0.e((((hkgq)object0).b == 2 ? ((ByteString)((hkgq)object0).c) : ByteString.b).toByteArray());
        etbu0.n(true);
        etbu0.p(false);
        etbu0.c(this.c);
        etbu0.g(v2);
        etbu0.j(dmsn0.i.c());
        etbu0.h(dmsn0.h.a);
        etbu0.i();
        etbu0.m((hkhr0.d == null ? hjwt.a : hkhr0.d).toBytesArray());
        if(hwfk.c()) {
            etbu0.l((hkhr0.e == null ? hjqn.a : hkhr0.e).toBytesArray());
        }
        Activity activity0 = this.e.getContainerActivity();
        return dmsn0.j.cW(activity0, 301, etbu0);
    }
}

