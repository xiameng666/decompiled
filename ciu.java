public final class ciu implements ibts {
    public final gra a;
    public final ciy b;
    public final ibva c;
    public final icck d;

    public ciu(gra gra0, ciy ciy0, ibva ibva0, icck icck0) {
        this.a = gra0;
        this.b = ciy0;
        this.c = ibva0;
        this.d = icck0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        long v = (long)(((Long)object0));
        gui gui0 = (gui)this.a.a();
        long v1 = gui0 == null ? v : ((Number)gui0.a()).longValue();
        icck icck0 = this.d;
        ibva ibva0 = this.c;
        ciy ciy0 = this.b;
        if(Long.compare(ciy0.b, 0x8000000000000000L) == 0 || ibva0.a != cku.a(icck0.c())) {
            ciy0.b = v;
            Object[] arr_object = ciy0.a.a;
            int v3 = ciy0.a.b;
            for(int v4 = 0; v4 < v3; ++v4) {
                ((cit)arr_object[v4]).f = true;
            }
            ibva0.a = cku.a(icck0.c());
        }
        float f = ibva0.a;
        if(f == 0.0f) {
            Object[] arr_object1 = ciy0.a.a;
            int v5 = ciy0.a.b;
            for(int v2 = 0; v2 < v5; ++v2) {
                cit cit0 = (cit)arr_object1[v2];
                cit0.b(cit0.d.a);
                cit0.f = true;
            }
            return ibom.a;
        }
        float f1 = ((float)(v1 - ciy0.b)) / f;
        Object[] arr_object2 = ciy0.a.a;
        int v6 = ciy0.a.b;
        int v8 = 1;
        for(int v7 = 0; v7 < v6; ++v7) {
            cit cit1 = (cit)arr_object2[v7];
            int v9 = cit1.e;
            if(!v9) {
                cit1.h.a(false);
                if(cit1.f) {
                    cit1.f = false;
                    cit1.g = (long)f1;
                }
                long v10 = ((long)f1) - cit1.g;
                cit1.b(cit1.d.d(v10));
                v9 = chh.a(cit1.d, v10);
                cit1.e = v9;
            }
            v8 &= v9;
        }
        ciy0.c.b(Boolean.valueOf(((boolean)(v8 ^ 1))));
        return ibom.a;
    }
}

