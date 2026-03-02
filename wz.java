import android.view.View;

public final class wz {
    final wy a;
    final wx b;

    public wz(wy wy0) {
        this.a = wy0;
        this.b = new wx();
    }

    public final View a(int v, int v1, int v2, int v3) {
        wy wy0 = this.a;
        int v4 = wy0.d();
        int v5 = wy0.c();
        View view0 = null;
        int v6 = v;
        while(v6 != v1) {
            View view1 = wy0.e(v6);
            int v7 = wy0.b(view1);
            int v8 = wy0.a(view1);
            wx wx0 = this.b;
            wx0.c(v4, v5, v7, v8);
            wx0.b();
            wx0.a(v2);
            if(!wx0.d()) {
                if(v3 != 0) {
                    wx0.b();
                    wx0.a(v3);
                    if(wx0.d()) {
                        view0 = view1;
                    }
                }
                v6 += (v1 <= v ? -1 : 1);
                continue;
            }
            return view1;
        }
        return view0;
    }

    public final boolean b(View view0) {
        int v = this.a.d();
        int v1 = this.a.c();
        int v2 = this.a.b(view0);
        int v3 = this.a.a(view0);
        this.b.c(v, v1, v2, v3);
        this.b.b();
        this.b.a(0x6003);
        return this.b.d();
    }
}

