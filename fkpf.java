import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

public final class fkpf {
    public final Object a(fkpg fkpg0, icck icck0, ibrl ibrl0) {
        fkpb fkpb0;
        icck icck3;
        fkpg fkpg4;
        Object object4;
        icta icta0;
        fkpg fkpg2;
        icck icck2;
        aet aet0;
        Executor executor1;
        icck icck1;
        fkpd fkpd0;
        if((ibrl0 instanceof fkpd)) {
            fkpd0 = (fkpd)ibrl0;
            int v = fkpd0.e;
            if((v & 0x80000000) == 0) {
                fkpd0 = new fkpd(this, ibrl0);
            }
            else {
                fkpd0.e = v - 0x80000000;
            }
        }
        else {
            fkpd0 = new fkpd(this, ibrl0);
        }
        Object object0 = fkpd0.c;
        Object object1 = ibrx.a;
        switch(fkpd0.e) {
            case 0: {
                ibnx.b(object0);
                Executor executor0 = fkpg0.c;
                agw agw0 = new agw(fkpg0.a, fkpg0.b);
                agw0.b(executor0);
                gmcd gmcd0 = agy.a(agw0.a());
                fkpd0.f = fkpg0;
                fkpd0.g = (icqb)icck0;
                fkpd0.a = executor0;
                fkpd0.e = 1;
                Object object2 = icpu.c(gmcd0, fkpd0);
                if(object2 != object1) {
                    icck1 = icck0;
                    executor1 = executor0;
                    object0 = object2;
                    goto label_35;
                }
                return object1;
            }
            case 1: {
                Executor executor2 = (Executor)fkpd0.a;
                icqb icqb0 = fkpd0.g;
                fkpg fkpg1 = fkpd0.f;
                ibnx.b(object0);
                icck1 = icqb0;
                executor1 = executor2;
                fkpg0 = fkpg1;
            label_35:
                aey aey0 = ((aet)object0).a();
                if(!aey0.a("LIST_FILTER_QUERY_LANGUAGE") || !aey0.a("VERBATIM_SEARCH")) {
                    ibuq.c(((aet)object0));
                    return new fkny(((aet)object0), fkpg0.c);
                }
                agw agw1 = new agw(fkpg0.a, "__G3_TS__legacyIcingGlobalDb");
                agw1.b(executor1);
                gmcd gmcd1 = agy.a(agw1.a());
                fkpd0.f = fkpg0;
                fkpd0.g = (icqb)icck1;
                fkpd0.a = (aet)object0;
                fkpd0.e = 2;
                Object object3 = icpu.c(gmcd1, fkpd0);
                if(object3 != object1) {
                    aet0 = (aet)object0;
                    object0 = object3;
                    icck2 = icck1;
                    fkpg2 = fkpg0;
                    goto label_59;
                }
                return object1;
            }
            case 2: {
                aet aet1 = (aet)fkpd0.a;
                icck2 = fkpd0.g;
                fkpg fkpg3 = fkpd0.f;
                ibnx.b(object0);
                fkpg2 = fkpg3;
                aet0 = aet1;
            label_59:
                icta0 = fkph.c;
                fkpd0.f = fkpg2;
                fkpd0.g = (icqb)icck2;
                fkpd0.a = aet0;
                fkpd0.b = (aet)object0;
                fkpd0.h = icta0;
                fkpd0.e = 3;
                if(icta0.b(fkpd0) != object1) {
                    object4 = (aet)object0;
                    fkpg4 = fkpg2;
                    icck3 = icck2;
                    goto label_81;
                }
                return object1;
            }
            case 3: {
                icta0 = fkpd0.h;
                Object object5 = fkpd0.b;
                aet0 = (aet)fkpd0.a;
                icqb icqb1 = fkpd0.g;
                fkpg fkpg5 = fkpd0.f;
                ibnx.b(object0);
                icck3 = icqb1;
                fkpg4 = fkpg5;
                object4 = object5;
            label_81:
                try {
                    bxd bxd0 = fkph.b;
                    String s = fkpg4.b;
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
                fkpd0.f = null;
                fkpd0.g = null;
                fkpd0.a = null;
                fkpd0.b = null;
                fkpd0.h = null;
                fkpd0.e = 4;
                Object object6 = fkok.a.a(aet0, ((aet)object4), fkpb0, icck3, fkpd0);
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

