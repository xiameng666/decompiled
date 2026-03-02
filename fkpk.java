import java.lang.ref.WeakReference;

public final class fkpk {
    public final Object a(fkpl fkpl0, icck icck0, ibrl ibrl0) {
        fkpb fkpb0;
        icck icck1;
        fkpl fkpl4;
        Object object4;
        icta icta0;
        aet aet0;
        fkpl fkpl2;
        fkpl fkpl1;
        aio aio2;
        fkpi fkpi0;
        if((ibrl0 instanceof fkpi)) {
            fkpi0 = (fkpi)ibrl0;
            int v = fkpi0.e;
            if((v & 0x80000000) == 0) {
                fkpi0 = new fkpi(this, ibrl0);
            }
            else {
                fkpi0.e = v - 0x80000000;
            }
        }
        else {
            fkpi0 = new fkpi(this, ibrl0);
        }
        Object object0 = fkpi0.c;
        Object object1 = ibrx.a;
        switch(fkpi0.e) {
            case 0: {
                ibnx.b(object0);
                ain ain0 = new ain(fkpl0.a, fkpl0.b);
                ain0.b(fkpl0.c);
                aio aio0 = ain0.a();
                ain ain1 = new ain(fkpl0.a, "__G3_TS__legacyIcingGlobalDb");
                ain1.b(fkpl0.c);
                aio aio1 = ain1.a();
                gmcd gmcd0 = aip.a(aio0);
                fkpi0.f = fkpl0;
                fkpi0.g = (icqb)icck0;
                fkpi0.a = aio1;
                fkpi0.e = 1;
                Object object2 = icpu.c(gmcd0, fkpi0);
                if(object2 != object1) {
                    aio2 = aio1;
                    object0 = object2;
                    fkpl1 = fkpl0;
                    goto label_35;
                }
                return object1;
            }
            case 1: {
                aio2 = (aio)fkpi0.a;
                icck0 = fkpi0.g;
                fkpl1 = fkpi0.f;
                ibnx.b(object0);
            label_35:
                gmcd gmcd1 = aip.a(aio2);
                fkpi0.f = fkpl1;
                fkpi0.g = (icqb)icck0;
                fkpi0.a = (aet)object0;
                fkpi0.e = 2;
                Object object3 = icpu.c(gmcd1, fkpi0);
                if(object3 != object1) {
                    fkpl2 = fkpl1;
                    aet0 = (aet)object0;
                    object0 = object3;
                    goto label_52;
                }
                return object1;
            }
            case 2: {
                aet aet1 = (aet)fkpi0.a;
                icck0 = fkpi0.g;
                fkpl fkpl3 = fkpi0.f;
                ibnx.b(object0);
                fkpl2 = fkpl3;
                aet0 = aet1;
            label_52:
                icta0 = fkpm.c;
                fkpi0.f = fkpl2;
                fkpi0.g = (icqb)icck0;
                fkpi0.a = aet0;
                fkpi0.b = (aet)object0;
                fkpi0.h = icta0;
                fkpi0.e = 3;
                if(icta0.b(fkpi0) != object1) {
                    object4 = (aet)object0;
                    fkpl4 = fkpl2;
                    icck1 = icck0;
                    goto label_74;
                }
                return object1;
            }
            case 3: {
                icta0 = fkpi0.h;
                Object object5 = fkpi0.b;
                aet0 = (aet)fkpi0.a;
                icqb icqb0 = fkpi0.g;
                fkpl fkpl5 = fkpi0.f;
                ibnx.b(object0);
                icck1 = icqb0;
                fkpl4 = fkpl5;
                object4 = object5;
            label_74:
                try {
                    bxd bxd0 = fkpm.b;
                    String s = fkpl4.b;
                    WeakReference weakReference0 = (WeakReference)bxd0.get(s);
                    fkpb0 = weakReference0 == null ? null : ((fkpb)weakReference0.get());
                    if(fkpb0 == null) {
                        fkpb0 = new fkpb();
                        bxd0.put(s, new WeakReference(fkpb0));
                    }
                }
                finally {
                    icta0.d();
                }
                ibuq.c(aet0);
                ibuq.c(object4);
                fkpi0.f = null;
                fkpi0.g = null;
                fkpi0.a = null;
                fkpi0.b = null;
                fkpi0.h = null;
                fkpi0.e = 4;
                Object object6 = fkok.a.a(aet0, ((aet)object4), fkpb0, icck1, fkpi0);
                return object6 == object1 ? object1 : object6;
            }
            case 4: {
                ibnx.b(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

