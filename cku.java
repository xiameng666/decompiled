import java.util.concurrent.CancellationException;

public final class cku {
    public static final float a(ibrt ibrt0) {
        hff hff0 = (hff)ibrt0.get(hff.b);
        float f = hff0 == null ? 1.0f : hff0.a();
        if(f < 0.0f) {
            cjo.b("negative scale factor");
        }
        return f;
    }

    public static final Object b(chn chn0, chi chi0, long v, ibts ibts0, ibrl ibrl0) {
        Object object4;
        Object object3;
        ibvd ibvd2;
        chn chn1;
        ibvd ibvd1;
        ckt ckt0;
        if((ibrl0 instanceof ckt)) {
            ckt0 = (ckt)ibrl0;
            int v1 = ckt0.d;
            if((v1 & 0x80000000) == 0) {
                ckt0 = new ckt(ibrl0);
            }
            else {
                ckt0.d = v1 - 0x80000000;
            }
        }
        else {
            ckt0 = new ckt(ibrl0);
        }
        Object object0 = ckt0.c;
        Object object1 = ibrx.a;
    alab1:
        switch(ckt0.d) {
            case 0: {
                ibnx.b(object0);
                Object object2 = chi0.d(0L);
                cht cht0 = chi0.b(0L);
                ibvd ibvd0 = new ibvd();
                try {
                    if(v == 0x8000000000000000L) {
                        ibvd1 = ibvd0;
                        ckm ckm0 = new ckm(ibvd0, object2, chi0, cht0, chn0, cku.a(ckt0.u()), ibts0);
                        ibvd1 = ibvd0;
                        ckt0.e = chn0;
                        ckt0.a = chi0;
                        ckt0.b = ibts0;
                        ckt0.f = ibvd1;
                        ckt0.d = 1;
                        if(cku.k(chi0, ckm0, ckt0) == object1) {
                            return object1;
                        }
                    }
                    else {
                        ibvd1 = ibvd0;
                        chk chk0 = new chk(object2, chi0.g(), cht0, v, chi0.c(), v, new ckn(chn0));
                        cku.e(chk0, v, cku.a(ckt0.u()), chi0, chn0, ibts0);
                        ibvd1.a = chk0;
                    }
                }
                catch(CancellationException cancellationException0) {
                    chn1 = chn0;
                    ibvd2 = ibvd1;
                    break;
                }
                chn1 = chn0;
                object3 = chi0;
                object4 = ibts0;
                ibvd2 = ibvd1;
                goto label_52;
            }
            case 1: {
                ibvd2 = ckt0.f;
                object4 = ckt0.b;
                object3 = ckt0.a;
                chn1 = ckt0.e;
                goto label_51;
            }
            case 2: {
                ibvd2 = ckt0.f;
                object4 = ckt0.b;
                object3 = ckt0.a;
                chn1 = ckt0.e;
                try {
                label_51:
                    ibnx.b(object0);
                    do {
                    label_52:
                        Object object5 = ibvd2.a;
                        ibuq.c(object5);
                        if(!((chk)object5).d()) {
                            return ibom.a;
                        }
                        float f = cku.a(ckt0.u());
                        try {
                            cko cko0 = new cko(ibvd2, f, ((chi)object3), chn1, ((ibts)object4));
                            ibvd2 = ibvd2;
                            object3 = object3;
                            chn1 = chn1;
                            object4 = object4;
                        }
                        catch(CancellationException cancellationException0) {
                            ibvd2 = ibvd2;
                            chn1 = chn1;
                            break alab1;
                        }
                        ckt0.e = chn1;
                        ckt0.a = object3;
                        ckt0.b = object4;
                        ckt0.f = ibvd2;
                        ckt0.d = 2;
                    }
                    while(cku.k(((chi)object3), cko0, ckt0) != object1);
                    return object1;
                }
                catch(CancellationException cancellationException0) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        chk chk1 = (chk)ibvd2.a;
        if(chk1 != null) {
            chk1.e();
        }
        chk chk2 = (chk)ibvd2.a;
        if(chk2 != null && chk2.e == chn1.b) {
            chn1.d = false;
        }
        throw cancellationException0;
    }

    public static final Object c(float f, float f1, float f2, chl chl0, ibtw ibtw0, ibrl ibrl0) {
        cmc cmc0 = cmv.a;
        Float float0 = new Float(f);
        Float float1 = new Float(f1);
        ibts ibts0 = cmc0.a;
        cht cht0 = (cht)ibts0.a(new Float(f2));
        if(cht0 == null) {
            cht0 = ((cht)ibts0.a(float0)).c();
        }
        ckv ckv0 = new ckv(chl0, cmc0, float0, float1, cht0);
        Object object0 = cku.b(new chn(cmc0, float0, cht0, 56), ckv0, 0x8000000000000000L, new ckp(ibtw0, cmc0), ibrl0);
        ibrx ibrx0 = ibrx.a;
        if(object0 != ibrx0) {
            object0 = ibom.a;
        }
        return object0 == ibrx0 ? object0 : ibom.a;
    }

    public static final Object d(chn chn0, Object object0, chl chl0, boolean z, ibts ibts0, ibrl ibrl0) {
        Object object1 = chn0.a();
        Object object2 = cku.b(chn0, new ckv(chl0, chn0.e, object1, object0, chn0.a), (z ? chn0.b : 0x8000000000000000L), ibts0, ibrl0);
        return object2 == ibrx.a ? object2 : ibom.a;
    }

    public static final void e(chk chk0, long v, float f, chi chi0, chn chn0, ibts ibts0) {
        long v1 = f == 0.0f ? chi0.a() : ((long)(((float)(v - chk0.b)) / f));
        chk0.e = v;
        Object object0 = chi0.d(v1);
        chk0.c.b(object0);
        chk0.d = chi0.b(v1);
        if(chi0.e(v1)) {
            chk0.f = chk0.e;
            chk0.e();
        }
        cku.f(chk0, chn0);
        ibts0.a(chk0);
    }

    public static final void f(chk chk0, chn chn0) {
        chn0.c(chk0.a());
        cht cht0 = chn0.a;
        cht cht1 = chk0.d;
        int v = cht0.b();
        for(int v1 = 0; v1 < v; ++v1) {
            cht0.e(v1, cht1.a(v1));
        }
        chn0.c = chk0.f;
        chn0.b = chk0.e;
        chn0.d = chk0.d();
    }

    public static final Object g(chn chn0, cib cib0, boolean z, ibts ibts0, ibrl ibrl0) {
        Object object0 = chn0.a();
        Object object1 = cku.b(chn0, new cia(cib0, chn0.e, object0, chn0.a), (z ? chn0.b : 0x8000000000000000L), ibts0, ibrl0);
        return object1 == ibrx.a ? object1 : ibom.a;
    }

    public static Object h(float f, float f1, chl chl0, ibtw ibtw0, ibrl ibrl0, int v) {
        if((v & 8) != 0) {
            chl0 = chm.b(0.0f, 0.0f, null, 7);
        }
        return cku.c(f, f1, 0.0f, chl0, ibtw0, ibrl0);
    }

    public static Object i(chn chn0, cib cib0, ibts ibts0, ibrl ibrl0) {
        return cku.g(chn0, cib0, false, ibts0, ibrl0);
    }

    public static Object j(chn chn0, Object object0, chl chl0, boolean z, ibts ibts0, ibrl ibrl0, int v) {
        if((v & 2) != 0) {
            chl0 = chm.b(0.0f, 0.0f, null, 7);
        }
        if((v & 8) != 0) {
            ibts0 = new cks();
        }
        return cku.d(chn0, object0, chl0, ((boolean)(((v & 4) == 0 ? 1 : 0) & ((int)z))), ibts0, ibrl0);
    }

    private static final Object k(chi chi0, ibts ibts0, ibrl ibrl0) {
        return chi0.f() ? ciq.a(ibts0, ibrl0) : gqv.c(new ckq(ibts0), ibrl0);
    }
}

