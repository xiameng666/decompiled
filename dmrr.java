import android.app.Activity;

public final class dmrr implements evqf {
    public final dmsn a;
    public final xob b;

    public dmrr(dmsn dmsn0, xob xob0) {
        this.a = dmsn0;
        this.b = xob0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        int v = ((hkgq)object0).b;
        if(hkgp.a(v) != 5) {
            int v1 = hkgp.a(v);
            if(v1 != 0) {
                throw new IllegalStateException("Invalid token: " + (v1 - 1));
            }
            throw null;
        }
        hkik hkik0 = v == 4 ? ((hkik)((hkgq)object0).c) : hkik.a;
        Activity activity0 = this.b.getContainerActivity();
        int v2 = hkik0.b;
        byte[] arr_b = hkik0.c.toByteArray();
        this.a.j.db(activity0, this.a.b, v2, arr_b, 404);
    }
}

