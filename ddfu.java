import java.util.List;

final class ddfu implements iau {
    final float a;
    final dhf b;
    final dhn c;
    final int d;

    public ddfu(float f, dhf dhf0, dhn dhn0, int v) {
        this.a = f;
        this.b = dhf0;
        this.c = dhn0;
        this.d = v;
        super();
    }

    @Override  // iau
    public final int a(hzg hzg0, List list0, int v) {
        return iat.a(this, hzg0, list0, v);
    }

    @Override  // iau
    public final int b(hzg hzg0, List list0, int v) {
        return iat.b(this, hzg0, list0, v);
    }

    @Override  // iau
    public final int c(hzg hzg0, List list0, int v) {
        return iat.c(this, hzg0, list0, v);
    }

    @Override  // iau
    public final int d(hzg hzg0, List list0, int v) {
        return iat.d(this, hzg0, list0, v);
    }

    @Override  // iau
    public final iav e(iax iax0, List list0, long v) {
        ibuq.f(iax0, "$this$Layout");
        int v1 = list0.size();
        int v2 = 0;
        for(int v3 = 0; v3 < v1; ++v3) {
            ias ias0 = (ias)list0.get(v3);
            if(ibuq.m(hzm.b(ias0), "navigationIcon")) {
                ibq ibq0 = ias0.e(jkp.n(v, 0, 0, 0, 0, 14));
                int v4 = list0.size();
                for(int v5 = 0; v5 < v4; ++v5) {
                    ias ias1 = (ias)list0.get(v5);
                    if(ibuq.m(hzm.b(ias1), "actionIcons")) {
                        ibq ibq1 = ias1.e(jkp.n(v, 0, 0, 0, 0, 14));
                        int v6 = jkp.b(v) == 0x7FFFFFFF ? jkp.b(v) : ibwt.g(jkp.b(v) - ibq0.a - ibq1.a, 0);
                        int v7 = list0.size();
                        for(int v8 = 0; v8 < v7; ++v8) {
                            ias ias2 = (ias)list0.get(v8);
                            if(ibuq.m(hzm.b(ias2), "title")) {
                                ibq ibq2 = ias2.e(jkp.n(v, 0, v6, 0, 0, 12));
                                int v9 = ibq2.ee(hxz.b) == 0x80000000 ? 0 : ibq2.ee(hxz.b);
                                float f = this.a;
                                if(!Float.isNaN(f)) {
                                    v2 = ibvr.c(f);
                                }
                                return iaw.b(iax0, jkp.b(v), v2, new ddft(ibq0, v2, ibq2, this.b, v, ibq1, this.c, this.d, v9));
                            }
                        }
                        jlz.a("Collection contains no element matching the predicate.");
                        throw new ibnm();
                    }
                }
                jlz.a("Collection contains no element matching the predicate.");
                throw new ibnm();
            }
        }
        jlz.a("Collection contains no element matching the predicate.");
        throw new ibnm();
    }
}

