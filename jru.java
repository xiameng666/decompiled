public final class jru {
    static final boolean[] a;

    static {
        jru.a = new boolean[3];
    }

    static void a(jrp jrp0, jrd jrd0, jro jro0) {
        jro0.q = -1;
        jro0.r = -1;
        int[] arr_v = jrp0.ar;
        if(arr_v[0] != 2 && jro0.ar[0] == 4) {
            int v = jro0.K.f;
            int v1 = jrp0.j() - jro0.M.f;
            jro0.K.h = jrd0.b(jro0.K);
            jro0.M.h = jrd0.b(jro0.M);
            jrd0.f(jro0.K.h, v);
            jrd0.f(jro0.M.h, v1);
            jro0.q = 2;
            jro0.aa = v;
            int v2 = v1 - v;
            jro0.W = v2;
            int v3 = jro0.ad;
            if(v2 < v3) {
                jro0.W = v3;
            }
        }
        if(arr_v[1] != 2 && jro0.ar[1] == 4) {
            int v4 = jro0.L.f;
            int v5 = jrp0.h() - jro0.N.f;
            jro0.L.h = jrd0.b(jro0.L);
            jro0.N.h = jrd0.b(jro0.N);
            jrd0.f(jro0.L.h, v4);
            jrd0.f(jro0.N.h, v5);
            if(jro0.ac > 0 || jro0.ai == 8) {
                jro0.O.h = jrd0.b(jro0.O);
                jrd0.f(jro0.O.h, jro0.ac + v4);
            }
            jro0.r = 2;
            jro0.ab = v4;
            int v6 = v5 - v4;
            jro0.X = v6;
            int v7 = jro0.ae;
            if(v6 < v7) {
                jro0.X = v7;
            }
        }
    }

    public static final boolean b(int v, int v1) {
        return (v & v1) == v1;
    }
}

