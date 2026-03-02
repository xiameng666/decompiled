public final class jav {
    public static final long a;
    public static final long b;
    public static final long c;
    public static final jkg d;

    static {
        jav.a = jlq.e(14);
        jav.b = jlq.e(0);
        jav.c = hll.h;
        jav.d = jke.a(hll.a);
    }

    public static final long a(long v, long v1, float f) {
        if((v & 0xFF00000000L) != 0L && (v1 & 0xFF00000000L) != 0L) {
            if((v & 0xFF00000000L) == 0L || (v1 & 0xFF00000000L) == 0L) {
                jld.a("Cannot perform operation for Unspecified type.");
            }
            if(!jlr.b(jlp.c(v), jlp.c(v1))) {
                jld.a(("Cannot perform operation for " + jlr.a(jlp.c(v)) + " and " + jlr.a(jlp.c(v1))));
            }
            return jlq.f(v & 0xFF00000000L, jma.b(jlp.a(v), jlp.a(v1), f));
        }
        return ((jlp)jav.c(new jlp(v), new jlp(v1), f)).b;
    }

    public static final jat b(jat jat0, long v, hlf hlf0, float f, long v1, jeu jeu0, jem jem0, jen jen0, jdz jdz0, String s, long v2, jjk jjk0, jkh jkh0, jii jii0, long v3, jjz jjz0, hmt hmt0, ixs ixs0, hpe hpe0) {
        long v9;
        long v8;
        long v7;
        jkh jkh1;
        long v6;
        long v5;
        long v4 = v;
        jem jem1 = jem0;
        jen jen1 = jen0;
        String s1 = s;
        jjk jjk1 = jjk0;
        jjz jjz1 = jjz0;
        hmt hmt1 = hmt0;
        if(Long.compare(v1 & 0xFF00000000L, 0L) == 0) {
            v5 = v1;
            goto label_12;
        }
        else {
            v5 = v1;
            if(jlp.e(v5, jat0.b)) {
            label_12:
                if(hlf0 != null) {
                label_17:
                    if(jem1 != null && !ibuq.m(jem1, jat0.d) || (jeu0 != null && !ibuq.m(jeu0, jat0.c) || jdz0 != null && jdz0 != jat0.f)) {
                        jkh1 = jkh0;
                        v7 = v3;
                        v6 = v4;
                    }
                    else if((v2 & 0xFF00000000L) == 0L) {
                        v6 = v4;
                        goto label_23;
                    }
                    else {
                        v6 = v4;
                        if(jlp.e(v2, jat0.h)) {
                        label_23:
                            if(jjz1 != null && !ibuq.m(jjz1, jat0.m) || (!ibuq.m(hlf0, jat0.a.c()) || hlf0 != null && f != jat0.a.a() || jen1 != null && !ibuq.m(jen1, jat0.e) || s1 != null && !ibuq.m(s1, jat0.g) || jjk1 != null && !ibuq.m(jjk1, jat0.i))) {
                                jkh1 = jkh0;
                                v7 = v3;
                            }
                            else if(jkh0 != null) {
                                jkh1 = jkh0;
                                if(ibuq.m(jkh1, jat0.j)) {
                                    goto label_30;
                                }
                                else {
                                    v7 = v3;
                                }
                            }
                            else {
                                jkh1 = null;
                            label_30:
                                if(jii0 != null && !ibuq.m(jii0, jat0.k)) {
                                    v7 = v3;
                                }
                                else if(v3 != 16L) {
                                    v7 = v3;
                                    if(ibog.c(v7, jat0.l)) {
                                        goto label_36;
                                    }
                                }
                                else {
                                    v7 = 16L;
                                label_36:
                                    if((hmt1 == null || ibuq.m(hmt1, jat0.n)) && (ixs0 == null || ibuq.m(ixs0, jat0.o)) && (hpe0 == null || ibuq.m(hpe0, jat0.p))) {
                                        return jat0;
                                    }
                                }
                            }
                        }
                        else {
                            jkh1 = jkh0;
                            v7 = v3;
                        }
                    }
                    v8 = v7;
                    v9 = v6;
                }
                else if(v4 == 16L) {
                    v4 = 16L;
                    goto label_17;
                }
                else if(!ibog.c(v4, jat0.a.b())) {
                    jkh1 = jkh0;
                    v8 = v3;
                    v9 = v4;
                }
                else {
                    goto label_17;
                }
            }
            else {
                jkh1 = jkh0;
                v8 = v3;
                v9 = v4;
            }
        }
        jkg jkg0 = hlf0 == null ? jke.a(v9) : jke.b(hlf0, f);
        jkg jkg1 = jat0.a.d(jkg0);
        jdz jdz1 = jdz0 == null ? jat0.f : jdz0;
        if((v5 & 0xFF00000000L) == 0L) {
            v5 = jat0.b;
        }
        jeu jeu1 = jeu0 == null ? jat0.c : jeu0;
        if(jem1 == null) {
            jem1 = jat0.d;
        }
        if(jen1 == null) {
            jen1 = jat0.e;
        }
        if(s1 == null) {
            s1 = jat0.g;
        }
        long v10 = (v2 & 0xFF00000000L) == 0L ? jat0.h : v2;
        if(jjk1 == null) {
            jjk1 = jat0.i;
        }
        jkh jkh2 = jkh1 == null ? jat0.j : jkh1;
        jii jii1 = jii0 == null ? jat0.k : jii0;
        if(Long.compare(v8, 16L) == 0) {
            v8 = jat0.l;
        }
        if(jjz1 == null) {
            jjz1 = jat0.m;
        }
        if(hmt1 == null) {
            hmt1 = jat0.n;
        }
        ixs ixs1 = jat0.o == null ? ixs0 : jat0.o;
        return hpe0 == null ? new jat(jkg1, v5, jeu1, jem1, jen1, jdz1, s1, v10, jjk1, jkh2, jii1, v8, jjz1, hmt1, ixs1, jat0.p) : new jat(jkg1, v5, jeu1, jem1, jen1, jdz1, s1, v10, jjk1, jkh2, jii1, v8, jjz1, hmt1, ixs1, hpe0);
    }

    public static final Object c(Object object0, Object object1, float f) {
        return ((double)f) < 0.5 ? object0 : object1;
    }
}

