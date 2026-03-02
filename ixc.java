public final class ixc implements ibts {
    public final long a;
    public final float[] b;
    public final ibvb c;
    public final ibva d;

    public ixc(long v, float[] arr_f, ibvb ibvb0, ibva ibva0) {
        this.a = v;
        this.b = arr_f;
        this.c = ibvb0;
        this.d = ibva0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibva ibva0;
        float f3;
        float f2;
        iwc iwc1;
        int v = ((ixk)object0).a;
        long v1 = this.a;
        if(v <= jbk.d(v1)) {
            v = jbk.d(v1);
        }
        int v2 = ((ixk)object0).b;
        if(v2 >= jbk.c(v1)) {
            v2 = jbk.c(v1);
        }
        ibvb ibvb0 = this.c;
        long v3 = jbl.a(((ixk)object0).e(v), ((ixk)object0).e(v2));
        iwc iwc0 = ((ixk)object0).g;
        int v4 = ibvb0.a;
        int v5 = jbk.d(v3);
        int v6 = jbk.c(v3);
        jcf jcf0 = iwc0.b;
        int v7 = jcf0.q().length();
        if(v5 < 0) {
            jie.a("startOffset must be > 0");
        }
        if(v5 >= v7) {
            jie.a("startOffset must be less than text length");
        }
        if(v6 <= v5) {
            jie.a("endOffset must be greater than startOffset");
        }
        if(v6 > v7) {
            jie.a("endOffset must be smaller or equal to text length");
        }
        float[] arr_f = this.b;
        if(arr_f.length - v4 < (v6 - v5) * 4) {
            jie.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int v8 = jcf0.k(v5);
        int v9 = jcf0.k(v6 - 1);
        jbt jbt0 = new jbt(jcf0);
        if(v8 <= v9) {
            while(true) {
                int v10 = Math.max(v5, jcf0.m(v8));
                int v11 = Math.min(v6, jcf0.j(v8));
                float f = jcf0.d(v8);
                float f1 = jcf0.b(v8);
                iwc1 = iwc0;
                int v12 = v4;
                boolean z = true;
                if(jcf0.n(v8) != 1) {
                    z = false;
                }
                while(v10 < v11) {
                    boolean z1 = jcf0.r(v10);
                    if(z && !z1) {
                        f2 = jbt0.a(v10);
                        f3 = jbt0.b(v10 + 1);
                    }
                    else if(z) {
                        f3 = jbt0.c(v10);
                        f2 = jbt0.d(v10 + 1);
                    }
                    else if(z1) {
                        f3 = jbt0.a(v10);
                        f2 = jbt0.b(v10 + 1);
                    }
                    else {
                        f2 = jbt0.c(v10);
                        f3 = jbt0.d(v10 + 1);
                    }
                    arr_f[v12] = f2;
                    arr_f[v12 + 1] = f;
                    arr_f[v12 + 2] = f3;
                    arr_f[v12 + 3] = f1;
                    v12 += 4;
                    ++v10;
                }
                if(v8 == v9) {
                    break;
                }
                ++v8;
                iwc0 = iwc1;
                v4 = v12;
            }
        }
        else {
            iwc1 = iwc0;
        }
        int v13 = ibvb0.a + jbk.b(v3) * 4;
        for(int v14 = ibvb0.a; true; v14 += 4) {
            ibva0 = this.d;
            if(v14 >= v13) {
                break;
            }
            float f4 = ibva0.a;
            arr_f[v14 + 1] += f4;
            arr_f[v14 + 3] += f4;
        }
        ibvb0.a = v13;
        ibva0.a += iwc1.b();
        return ibom.a;
    }
}

