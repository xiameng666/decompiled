import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class lan {
    public final Object a(List list0, lax lax0, ibrl ibrl0) {
        ibvd ibvd1;
        Object object2;
        List list1;
        lak lak0;
        if((ibrl0 instanceof lak)) {
            lak0 = (lak)ibrl0;
            int v = lak0.e;
            if((v & 0x80000000) == 0) {
                lak0 = new lak(this, ibrl0);
            }
            else {
                lak0.e = v - 0x80000000;
            }
        }
        else {
            lak0 = new lak(this, ibrl0);
        }
        Object object0 = lak0.c;
        Object object1 = ibrx.a;
        switch(lak0.e) {
            case 0: {
                ibnx.b(object0);
                ArrayList arrayList0 = new ArrayList();
                lam lam0 = new lam(list0, arrayList0, null);
                lak0.a = arrayList0;
                lak0.e = 1;
                if(lax0.a(lam0, lak0) != object1) {
                    list1 = arrayList0;
                    goto label_24;
                }
                return object1;
            }
            case 1: {
                list1 = (List)lak0.a;
                ibnx.b(object0);
            label_24:
                ibvd ibvd0 = new ibvd();
                object2 = list1.iterator();
                ibvd1 = ibvd0;
                break;
            }
            case 2: {
                object2 = lak0.b;
                ibvd1 = (ibvd)lak0.a;
                try {
                    ibnx.b(object0);
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_40;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(((Iterator)object2).hasNext()) {
            Object object3 = ((Iterator)object2).next();
            ibts ibts0 = (ibts)object3;
            try {
                lak0.a = ibvd1;
                lak0.b = object2;
                lak0.e = 2;
                if(ibts0.a(lak0) != object1) {
                    continue;
                }
            }
            catch(Throwable throwable0) {
            label_40:
                Object object4 = ibvd1.a;
                if(object4 == null) {
                    ibvd1.a = throwable0;
                }
                else {
                    ibnj.b(((Throwable)object4), throwable0);
                }
                continue;
            }
            return object1;
        }
        Throwable throwable1 = (Throwable)ibvd1.a;
        if(throwable1 == null) {
            return ibom.a;
        }
        throw throwable1;
    }

    public static final ibtw b(List list0) {
        ibuq.f(list0, "migrations");
        return new laj(list0, null);
    }
}

