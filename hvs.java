public class hvs {
    public final gwq d;
    public final bzd e;

    public hvs() {
        this.d = new gwq(new hvr[16]);
        this.e = new bzd(10);
    }

    public boolean b(byi byi0, hzk hzk0, hvo hvo0, boolean z) {
        Object[] arr_object = this.d.a;
        int v = this.d.b;
        boolean z1 = false;
        for(int v1 = 0; v1 < v; ++v1) {
            z1 = ((hvr)arr_object[v1]).b(byi0, hzk0, hvo0, z) || z1;
        }
        return z1;
    }

    public final void f() {
        gwq gwq0 = this.d;
        int v = gwq0.b;
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            if(((hvr)gwq0.a[v]).b.a == 0) {
                gwq0.c(v);
            }
        }
    }
}

