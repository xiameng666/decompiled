public final class cjt implements ibts {
    public final cke a;

    public cjt(cke cke0) {
        this.a = cke0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        long v = (long)(((Long)object0));
        cke cke0 = this.a;
        long v1 = v - cke0.g;
        cke0.g = v;
        long v2 = ibvr.d(((double)v1) / ((double)cke0.j));
        bzd bzd0 = cke0.l;
        if(bzd0.g()) {
            Object[] arr_object = bzd0.a;
            int v3 = bzd0.b;
            int v4 = 0;
            for(int v5 = 0; v5 < v3; ++v5) {
                cju cju0 = (cju)arr_object[v5];
                cke.s(cju0, v2);
                cju0.c = true;
            }
            clj clj0 = cke0.c;
            if(clj0 != null) {
                clj0.v();
            }
            int v6 = bzd0.b;
            Object[] arr_object1 = bzd0.a;
            ibwm ibwm0 = ibwt.q(0, v6);
            int v7 = ibwm0.a;
            int v8 = ibwm0.b;
            if(v7 <= v8) {
                while(true) {
                    arr_object1[v7 - v4] = arr_object1[v7];
                    if(((cju)arr_object1[v7]).c) {
                        ++v4;
                    }
                    if(v7 == v8) {
                        break;
                    }
                    ++v7;
                }
                ibpg.f(arr_object1, null, v6 - v4, v6);
                bzd0.b -= v4;
            }
            else {
                ibpg.f(arr_object1, null, v6, v6);
                bzd0.b = bzd0.b;
            }
        }
        cju cju1 = cke0.h;
        if(cju1 != null) {
            cju1.g = cke0.d;
            cke.s(cju1, v2);
            cke0.p(cju1.d);
            if(cju1.d == 1.0f) {
                cke0.h = null;
            }
            cke0.o();
        }
        return ibom.a;
    }
}

