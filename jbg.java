public final class jbg {
    private final jks a;
    private final jlm b;
    private final jbc c;
    private final jed d;

    public jbg(jed jed0, jks jks0, jlm jlm0) {
        this.d = jed0;
        this.a = jks0;
        this.b = jlm0;
        this.c = new jbc(null);
    }

    public static jbe a(jbg jbg0, String s, jbn jbn0, int v, boolean z, int v1, long v2, boolean z1, int v3) {
        jbe jbe0;
        int v4 = 1;
        int v5 = 0x7FFFFFFF;
        long v6 = (v3 & 0x20) == 0 ? v2 : jkq.k(0, 0, 0, 15);
        jbd jbd0 = new jbd(new iwj(s), ((v3 & 2) == 0 ? jbn0 : jbn.a), ibps.a, ((v3 & 16) == 0 ? v1 : 0x7FFFFFFF), ((boolean)(((v3 & 8) == 0 ? 1 : 0) ^ 1 | ((int)z))), ((v3 & 4) == 0 ? v : 1), ((v3 & 0x80) == 0 ? null : jbg0.a), ((v3 & 0x40) == 0 ? null : jbg0.b), ((v3 & 0x100) == 0 ? null : jbg0.d), v6);
        if((((v3 & 0x200) == 0 ? 1 : 0) & ((int)z1)) == 0) {
            iws iws0 = new iws(jbd0);
            jbe0 = (jbe)jbg0.c.a.d(iws0);
            if(jbe0 == null || jbe0.b.a.c()) {
                jbe0 = null;
            }
        }
        else {
            jbe0 = null;
        }
        if(jbe0 != null) {
            return jbe0.n(jbd0, jkq.e(v6, 0xFFFFFFFFL & ((long)ixn.a(jbe0.b.e)) | ((long)ixn.a(jbe0.b.d)) << 0x20));
        }
        jbn jbn1 = jbo.a(jbd0.b, jbd0.h);
        ixh ixh0 = new ixh(jbd0.a, jbn1, jbd0.c, jbd0.g, jbd0.j);
        long v7 = jbd0.i;
        boolean z2 = jbd0.e;
        if((z2 || jbi.a(jbd0.f)) && jkp.j(v7)) {
            v5 = jkp.b(v7);
        }
        int v8 = v5;
        if(z2 || !jbi.a(jbd0.f)) {
            v4 = jbd0.d;
        }
        int v9 = jkp.d(v7);
        if(v9 != v8) {
            v8 = ibwt.j(ixn.a(ixh0.a()), v9, v8);
        }
        ixe ixe0 = new ixe(ixh0, jko.b(0, v8, 0, jkp.a(v7)), v4, jbd0.f);
        jbe jbe1 = new jbe(jbd0, ixe0, jkq.e(v7, 0xFFFFFFFFL & ((long)(((int)(((float)Math.ceil(ixe0.e)))))) | ((long)(((int)(((float)Math.ceil(ixe0.d)))))) << 0x20));
        iws iws1 = new iws(jbd0);
        jbg0.c.a.e(iws1, jbe1);
        return jbe1;
    }
}

