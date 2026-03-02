import java.util.HashMap;
import java.util.HashSet;

public final class dvis implements kar {
    public final dvit a;
    public final gged_interceptors b;

    public dvis(dvit dvit0, gged_interceptors gged0) {
        this.a = dvit0;
        this.b = gged0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        guvk guvk1;
        guus guus1;
        gfsx gfsx0;
        gged_interceptors gged0 = this.b;
        dvit dvit0 = this.a;
        if(dvit0.i.b) {
            ggdy ggdy0 = new ggdy();
            int v = gged0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                gvej gvej0 = (gvej)gged0.get(v1);
                if(gvei.a(gvej0.c) == 3 && (gvej0.b & 1) != 0) {
                    gged_interceptors gged1 = fsih.a((gvej0.f == null ? gveu.a : gvej0.f));
                    ggdy ggdy1 = new ggdy();
                    int v2 = gged1.size();
                    for(int v3 = 0; v3 < v2; ++v3) {
                        guvd guvd0 = (guvd)gged1.get(v3);
                        if(guvc.a(guvd0.c) == 3) {
                            ggdy1.i(Long.valueOf(guvd0.b));
                        }
                    }
                    ggdy0.k(ggdy1.h());
                }
            }
            gged_interceptors gged2 = ggdy0.h();
            ggdy ggdy2 = new ggdy();
            int v4 = ((gged_interceptors)object0).size();
            for(int v5 = 0; v5 < v4; ++v5) {
                gveb gveb0 = (gveb)((gged_interceptors)object0).get(v5);
                if(gveb0.b == 2) {
                    Long long0 = (long)((gvdy)gveb0.c).d;
                    if(gged2.contains(long0)) {
                        ggdy2.i(long0);
                    }
                }
            }
            if(!ggdy2.h().isEmpty()) {
                dybi dybi0 = new dybi(ggdy2.h());
                dvit0.h.e(dybi0, gmap.a);
            }
        }
        Throwable throwable0 = null;
        if(hwvv.c()) {
            HashMap hashMap0 = new HashMap();
            int v6 = gged0.size();
            int v7 = 0;
            while(v7 < v6) {
                gvej gvej1 = (gvej)gged0.get(v7);
                if(gvei.a(gvej1.c) == 3 && (gvej1.b & 1) != 0) {
                    gveu gveu0 = gvej1.f == null ? gveu.a : gvej1.f;
                    int v8 = gveu0.b;
                    int v9 = gvet.a(v8);
                    if(v9 == 0) {
                        throw null;
                    }
                    if(v9 - 1 == 0) {
                        guze guze0 = v8 == 1 ? ((guze)gveu0.c) : guze.a;
                        if(((guze0.d == null ? guvk.a : guze0.d).b & 0x1000) != 0) {
                            guze guze1 = gveu0.b == 1 ? ((guze)gveu0.c) : guze.a;
                            guvk guvk0 = guze1.d == null ? guvk.a : guze1.d;
                            gfsx0 = gfsx.m((guvk0.y == null ? guvt.a : guvk0.y));
                            goto label_57;
                        }
                    }
                    gfsx0 = gfqx.a;
                label_57:
                    if(gfsx0.i()) {
                        String s = gvej1.d;
                        guvs guvs0 = guvs.b(((guvt)gfsx0.d()).c);
                        if(guvs0 == null) {
                            guvs0 = guvs.c;
                        }
                        hashMap0.put(s, guvs0);
                    }
                }
                ++v7;
            }
            HashMap hashMap1 = new HashMap();
            int v10 = ((gged_interceptors)object0).size();
            for(int v11 = 0; v11 < v10; ++v11) {
                gveb gveb1 = (gveb)((gged_interceptors)object0).get(v11);
                if(gveb1.b == 3) {
                    String s1 = ((gvdz)gveb1.c).c;
                    if(hashMap0.containsKey(s1)) {
                        guvs guvs1 = (guvs)hashMap0.get(s1);
                        gvdz gvdz0 = gveb1.b == 3 ? ((gvdz)gveb1.c) : gvdz.a;
                        if(guvs1.equals((guvs.b(gvdz0.d) == null ? guvs.c : guvs.b(gvdz0.d))) && !hashMap1.containsKey(s1)) {
                            gvdz gvdz1 = gveb1.b == 3 ? ((gvdz)gveb1.c) : gvdz.a;
                            hashMap1.put(s1, (guvs.b(gvdz1.d) == null ? guvs.c : guvs.b(gvdz1.d)));
                        }
                    }
                }
            }
            if(!hashMap1.isEmpty()) {
                dybb dybb0 = new dybb(ggeo.k(hashMap1));
                bblp bblp0 = new bblp(1, 10);
                dvit0.h.e(dybb0, bblp0);
            }
        }
        HashMap hashMap2 = new HashMap();
        int v12 = gged0.size();
        int v13 = 0;
        while(v13 < v12) {
            gvej gvej2 = (gvej)gged0.get(v13);
            if(gvei.a(gvej2.c) == 3 && (gvej2.b & 1) != 0) {
                String s2 = gvej2.d;
                gveu gveu1 = gvej2.f == null ? gveu.a : gvej2.f;
                ggdy ggdy3 = new ggdy();
                int v14 = gveu1.b;
                int v15 = gvet.a(v14);
                int v16 = v15 - 1;
                if(v15 == 0) {
                    throw throwable0;
                }
                switch(v16) {
                    case 0: {
                        guze guze2 = v14 == 1 ? ((guze)gveu1.c) : guze.a;
                        if(((guze2.d == null ? guvk.a : guze2.d).b & 0x2000) != 0) {
                            guze guze3 = gveu1.b == 1 ? ((guze)gveu1.c) : guze.a;
                            guus guus2 = (guze3.d == null ? guvk.a : guze3.d).z;
                            guus1 = guus2 == null ? guus.a : guus2;
                            goto label_165;
                        }
                        break;
                    }
                    case 1: {
                        guyb guyb0 = v14 == 2 ? ((guyb)gveu1.c) : guyb.a;
                        if(((guyb0.d == null ? guvk.a : guyb0.d).b & 0x2000) != 0) {
                            guyb guyb1 = gveu1.b == 2 ? ((guyb)gveu1.c) : guyb.a;
                            guus guus3 = (guyb1.d == null ? guvk.a : guyb1.d).z;
                            guus1 = guus3 == null ? guus.a : guus3;
                            goto label_165;
                        }
                        break;
                    }
                    case 2: {
                        guzn guzn0 = v14 == 3 ? ((guzn)gveu1.c) : guzn.a;
                        if(((guzn0.d == null ? guvk.a : guzn0.d).b & 0x2000) != 0) {
                            guzn guzn1 = gveu1.b == 3 ? ((guzn)gveu1.c) : guzn.a;
                            guus guus4 = (guzn1.d == null ? guvk.a : guzn1.d).z;
                            guus1 = guus4 == null ? guus.a : guus4;
                            goto label_165;
                        }
                        break;
                    }
                    case 3: {
                        guwx guwx0 = v14 == 4 ? ((guwx)gveu1.c) : guwx.a;
                        if(((guwx0.d == null ? guvk.a : guwx0.d).b & 0x2000) != 0) {
                            guwx guwx1 = gveu1.b == 4 ? ((guwx)gveu1.c) : guwx.a;
                            guus guus5 = (guwx1.d == null ? guvk.a : guwx1.d).z;
                            guus1 = guus5 == null ? guus.a : guus5;
                            goto label_165;
                        }
                        break;
                    }
                    case 4: {
                        guxg guxg0 = v14 == 5 ? ((guxg)gveu1.c) : guxg.a;
                        if(((guxg0.d == null ? guvk.a : guxg0.d).b & 0x2000) != 0) {
                            guxg guxg1 = gveu1.b == 5 ? ((guxg)gveu1.c) : guxg.a;
                            guus guus6 = (guxg1.d == null ? guvk.a : guxg1.d).z;
                            guus1 = guus6 == null ? guus.a : guus6;
                            goto label_165;
                        }
                        break;
                    }
                    case 5: {
                        gvbb gvbb0 = v14 == 6 ? ((gvbb)gveu1.c) : gvbb.a;
                        if(((gvbb0.d == null ? guvk.a : gvbb0.d).b & 0x2000) != 0) {
                            gvbb gvbb1 = gveu1.b == 6 ? ((gvbb)gveu1.c) : gvbb.a;
                            guus guus7 = (gvbb1.d == null ? guvk.a : gvbb1.d).z;
                            guus1 = guus7 == null ? guus.a : guus7;
                            goto label_165;
                        }
                        break;
                    }
                    default: {
                        if(v16 == 7) {
                            guxp guxp0 = v14 == 8 ? ((guxp)gveu1.c) : guxp.a;
                            if(((guxp0.d == null ? guvk.a : guxp0.d).b & 0x2000) != 0) {
                                guxp guxp1 = gveu1.b == 8 ? ((guxp)gveu1.c) : guxp.a;
                                guus guus0 = (guxp1.d == null ? guvk.a : guxp1.d).z;
                                guus1 = guus0 == null ? guus.a : guus0;
                                goto label_165;
                            }
                        }
                    }
                }
                guus1 = guus.a;
            label_165:
                for(Object object1: guus1.d) {
                    guur guur0 = (guur)object1;
                    if(guuq.a(guur0.c) == 3) {
                        ggdy3.i(guur0.b);
                    }
                }
                hashMap2.put(s2, ggdy3.h());
            }
            ++v13;
            throwable0 = throwable0;
        }
        HashMap hashMap3 = new HashMap();
        int v17 = ((gged_interceptors)object0).size();
        for(int v18 = 0; v18 < v17; ++v18) {
            gveb gveb2 = (gveb)((gged_interceptors)object0).get(v18);
            if(gveb2.b == 4) {
                String s3 = ((gvdx)gveb2.c).c;
                if(hashMap2.containsKey(s3) && (ggia.i(((gged_interceptors)hashMap2.get(s3)), (gveb2.b == 4 ? ((gvdx)gveb2.c) : gvdx.a).d) && !hashMap3.containsKey(s3))) {
                    hashMap3.put(s3, gged_interceptors.i((gveb2.b == 4 ? ((gvdx)gveb2.c) : gvdx.a).d));
                }
            }
        }
        if(!hashMap3.isEmpty()) {
            dybk dybk0 = new dybk(ggeo.k(hashMap3));
            bblp bblp1 = new bblp(1, 10);
            dvit0.h.e(dybk0, bblp1);
        }
        HashSet hashSet0 = new HashSet();
        int v19 = gged0.size();
        for(int v20 = 0; v20 < v19; ++v20) {
            gvej gvej3 = (gvej)gged0.get(v20);
            switch((gvei.a(gvej3.c) == 0 ? 1 : gvei.a(gvej3.c)) - 2) {
                case 1: {
                    gveu gveu2 = gvej3.f == null ? gveu.a : gvej3.f;
                    int v21 = gveu2.b;
                    int v22 = gvet.a(v21);
                    if(v22 == 0) {
                        throw throwable0;
                    }
                    switch(v22 - 1) {
                        case 0: {
                            guvk guvk2 = (v21 == 1 ? ((guze)gveu2.c) : guze.a).d;
                            guvk1 = guvk2 == null ? guvk.a : guvk2;
                            break;
                        }
                        case 1: {
                            guvk guvk3 = (v21 == 2 ? ((guyb)gveu2.c) : guyb.a).d;
                            guvk1 = guvk3 == null ? guvk.a : guvk3;
                            break;
                        }
                        case 2: {
                            guvk guvk4 = (v21 == 3 ? ((guzn)gveu2.c) : guzn.a).d;
                            guvk1 = guvk4 == null ? guvk.a : guvk4;
                            break;
                        }
                        case 3: {
                            guvk guvk5 = (v21 == 4 ? ((guwx)gveu2.c) : guwx.a).d;
                            guvk1 = guvk5 == null ? guvk.a : guvk5;
                            break;
                        }
                        case 4: {
                            guvk guvk6 = (v21 == 5 ? ((guxg)gveu2.c) : guxg.a).d;
                            guvk1 = guvk6 == null ? guvk.a : guvk6;
                            break;
                        }
                        case 5: {
                            guvk guvk7 = (v21 == 6 ? ((gvbb)gveu2.c) : gvbb.a).d;
                            guvk1 = guvk7 == null ? guvk.a : guvk7;
                            break;
                        }
                        case 6: {
                            guvk guvk8 = (v21 == 7 ? ((guyz)gveu2.c) : guyz.a).d;
                            guvk1 = guvk8 == null ? guvk.a : guvk8;
                            break;
                        }
                        case 7: {
                            guvk guvk9 = (v21 == 8 ? ((guxp)gveu2.c) : guxp.a).d;
                            guvk1 = guvk9 == null ? guvk.a : guvk9;
                            break;
                        }
                        case 8: {
                            guvk guvk10 = (v21 == 10 ? ((guxy)gveu2.c) : guxy.a).d;
                            guvk1 = guvk10 == null ? guvk.a : guvk10;
                            break;
                        }
                        case 9: {
                            guvk guvk11 = (v21 == 11 ? ((gvci)gveu2.c) : gvci.a).d;
                            guvk1 = guvk11 == null ? guvk.a : guvk11;
                            break;
                        }
                        case 10: {
                            guvk guvk12 = (v21 == 12 ? ((guzc)gveu2.c) : guzc.a).d;
                            guvk1 = guvk12 == null ? guvk.a : guvk12;
                            break;
                        }
                        default: {
                            guvk1 = guvk.a;
                        }
                    }
                    if((guvk1.b & 0x8000) == 0) {
                        hashSet0.add(gvej3.d);
                        break;
                    }
                    break;
                }
                case 2: {
                    hashSet0.add(gvej3.d);
                }
            }
        }
        HashSet hashSet1 = new HashSet();
        int v23 = ((gged_interceptors)object0).size();
        for(int v24 = 0; v24 < v23; ++v24) {
            gveb gveb3 = (gveb)((gged_interceptors)object0).get(v24);
            if(gveb3.b == 6) {
                String s4 = ((gvea)gveb3.c).c;
                if(hashSet0.contains(s4)) {
                    hashSet1.add(s4);
                }
            }
        }
        if(!hashSet1.isEmpty()) {
            dyaw dyaw0 = new dyaw(hashSet1);
            bblp bblp2 = new bblp(1, 10);
            dvit0.h.e(dyaw0, bblp2);
        }
    }
}

