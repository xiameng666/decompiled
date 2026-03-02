public final class ixp {
    public static final long a;

    static {
        ixp.a = jlp.a;
    }

    public static final ixo a(ixo ixo0, int v, int v1, long v2, jki jki0, ixr ixr0, jjw jjw0, int v3, int v4, jkk jkk0) {
        long v9;
        int v5 = v;
        int v6 = v1;
        jki jki1 = jki0;
        jjw jjw1 = jjw0;
        int v7 = v3;
        int v8 = v4;
        jkk jkk1 = jkk0;
        if(v5 != 0 && v5 != ixo0.a) {
            v9 = v2;
        }
        else if((v2 & 0xFF00000000L) == 0L) {
            v9 = v2;
            goto label_15;
        }
        else {
            v9 = v2;
            if(jlp.e(v9, ixo0.c)) {
            label_15:
                if((jki1 == null || ibuq.m(jki1, ixo0.d)) && (v6 == 0 || v6 == ixo0.b) && (ixr0 == null || ibuq.m(ixr0, ixo0.e)) && (jjw1 == null || ibuq.m(jjw1, ixo0.f)) && (v7 == 0 || v7 == ixo0.g) && (v8 == 0 || v8 == ixo0.h) && (jkk1 == null || ibuq.m(jkk1, ixo0.i))) {
                    return ixo0;
                }
            }
        }
        long v10 = (v9 & 0xFF00000000L) == 0L ? ixo0.c : v9;
        if(jki1 == null) {
            jki1 = ixo0.d;
        }
        if(v5 == 0) {
            v5 = ixo0.a;
        }
        if(v6 == 0) {
            v6 = ixo0.b;
        }
        ixr ixr1 = ixo0.e != null && ixr0 == null ? ixo0.e : ixr0;
        if(jjw1 == null) {
            jjw1 = ixo0.f;
        }
        if(v7 == 0) {
            v7 = ixo0.g;
        }
        if(v8 == 0) {
            v8 = ixo0.h;
        }
        if(jkk1 == null) {
            jkk1 = ixo0.i;
        }
        return new ixo(v5, v6, v10, jki1, ixr1, jjw1, v7, v8, jkk1);
    }
}

