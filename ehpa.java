import android.content.Intent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class ehpa extends lsb {
    public final ibtw a;
    public final icnj b;
    private static final bboh c;
    private final ehlp d;
    private final hgiq e;
    private final ibts f;
    private final bbpj g;
    private final ehmg h;
    private final icnl i;

    static {
        ehpa.c = bboh.b("ConsumerServicesViewMdl", bbcu.dO);
    }

    public ehpa(ehmg ehmg0, ehlp ehlp0, ibtw ibtw0, hgiq hgiq0, ibts ibts0, bbpj bbpj0) {
        this.h = ehmg0;
        this.d = ehlp0;
        this.a = ibtw0;
        this.e = hgiq0;
        this.f = ibts0;
        this.g = bbpj0;
        icnl icnl0 = icnm.a(new ehnr(false, bbpj0.h(), ibts0));
        this.i = icnl0;
        this.b = new icmp(icnl0);
        icbb.b(lsc.a(this), null, null, new ehos(this, null), 3);
    }

    public final Object a(ehlr ehlr0, ibrl ibrl0) {
        Object object8;
        Object object7;
        Collection collection0;
        Iterator iterator2;
        Iterator iterator1;
        Object object4;
        Object object3;
        ehou ehou0;
        if((ibrl0 instanceof ehou)) {
            ehou0 = (ehou)ibrl0;
            int v = ehou0.g;
            if((v & 0x80000000) == 0) {
                ehou0 = new ehou(this, ibrl0);
            }
            else {
                ehou0.g = v - 0x80000000;
            }
        }
        else {
            ehou0 = new ehou(this, ibrl0);
        }
        Object object0 = ehou0.e;
        Object object1 = ibrx.a;
        switch(ehou0.g) {
            case 0: {
                ibnx.b(object0);
                ArrayList arrayList0 = new ArrayList();
                ArrayList arrayList1 = new ArrayList();
                for(Object object2: ehlr0.a) {
                    if(((ehlx)object2).a == this.e) {
                        arrayList0.add(object2);
                    }
                    else {
                        arrayList1.add(object2);
                    }
                }
                ibns ibns0 = new ibns(arrayList0, arrayList1);
                List list0 = (List)ibns0.a;
                List list1 = (List)ibns0.b;
                if(list0.isEmpty()) {
                    hgiq hgiq0 = this.e;
                    if(hgiq0 != hgiq.a) {
                        ((ggtj)ehpa.c.i()).z("Expected to highlight service: %d, but the service is missing.", hgiq0.a());
                    }
                }
                object3 = ibpo.ao(list1, new ehot());
                object4 = new ArrayList(ibpo.q(list0, 10));
                iterator1 = list0.iterator();
                goto label_42;
            }
            case 1: {
                object4 = ehou0.d;
                iterator1 = (Iterator)ehou0.c;
                Object object5 = (Collection)ehou0.b;
                object3 = ehou0.a;
                ibnx.b(object0);
                while(true) {
                    ((Collection)object4).add(((ehpq)object0));
                    object4 = object5;
                label_42:
                    if(!iterator1.hasNext()) {
                        break;
                    }
                    Object object6 = iterator1.next();
                    ehou0.a = object3;
                    ehou0.b = object4;
                    ehou0.c = iterator1;
                    ehou0.d = object4;
                    ehou0.g = 1;
                    object0 = this.g(((ehlx)object6), true, ehou0);
                    if(object0 == object1) {
                        return object1;
                    }
                    object5 = object4;
                }
                ArrayList arrayList2 = new ArrayList(ibpo.q(((Iterable)object3), 10));
                iterator2 = ((Iterable)object3).iterator();
                collection0 = (List)object4;
                object7 = arrayList2;
                goto label_65;
            }
            case 2: {
                object7 = ehou0.d;
                collection0 = (Collection)ehou0.c;
                iterator2 = (Iterator)ehou0.b;
                object8 = ehou0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            ((Collection)object7).add(((ehpq)object0));
            object7 = object8;
        label_65:
            if(!iterator2.hasNext()) {
                return ibpo.ak(collection0, ((Iterable)object7));
            }
            Object object9 = iterator2.next();
            ehou0.a = object7;
            ehou0.b = iterator2;
            ehou0.c = collection0;
            ehou0.d = object7;
            ehou0.g = 2;
            object0 = this.g(((ehlx)object9), false, ehou0);
            if(object0 == object1) {
                break;
            }
            object8 = object7;
        }
        return object1;
    }

    public final Object b(ibrl ibrl0) {
        ibts ibts1;
        icnl icnl1;
        ehov ehov0;
        if((ibrl0 instanceof ehov)) {
            ehov0 = (ehov)ibrl0;
            int v = ehov0.c;
            if((v & 0x80000000) == 0) {
                ehov0 = new ehov(this, ibrl0);
            }
            else {
                ehov0.c = v - 0x80000000;
            }
        }
        else {
            ehov0 = new ehov(this, ibrl0);
        }
        Object object0 = ehov0.a;
        Object object1 = ibrx.a;
        switch(ehov0.c) {
            case 0: {
                ibnx.b(object0);
                ehnr ehnr0 = new ehnr(true, this.g.h(), this.f);
                this.i.g(ehnr0);
                ehov0.c = 1;
                ehme ehme0 = new ehme(this.h, null);
                object0 = icbd.a(cclw.a, ehme0, ehov0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_22;
            }
            case 1: {
                ibnx.b(object0);
            label_22:
                if((((ehlt)object0) instanceof ehlr)) {
                    icnl icnl0 = this.i;
                    ibts ibts0 = this.f;
                    ehov0.d = icnl0;
                    ehov0.e = (ehpc)ibts0;
                    ehov0.c = 2;
                    object0 = this.a(((ehlr)(((ehlt)object0))), ehov0);
                    if(object0 != object1) {
                        icnl1 = icnl0;
                        ibts1 = ibts0;
                        break;
                    }
                    return object1;
                }
                if(!(((ehlt)object0) instanceof ehls)) {
                    throw new ibnq();
                }
                ehno ehno0 = new ehno(this.f, ehph.a);
                this.i.g(ehno0);
                return ibom.a;
            }
            case 2: {
                ibts1 = ehov0.e;
                icnl1 = ehov0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        icnl1.g(new ehnp(ibts1, ((List)object0)));
        return ibom.a;
    }

    public final Object c(hgiq hgiq0, ibrl ibrl0) {
        ehow ehow0;
        if((ibrl0 instanceof ehow)) {
            ehow0 = (ehow)ibrl0;
            int v = ehow0.c;
            if((v & 0x80000000) == 0) {
                ehow0 = new ehow(this, ibrl0);
            }
            else {
                ehow0.c = v - 0x80000000;
            }
        }
        else {
            ehow0 = new ehow(this, ibrl0);
        }
        Object object0 = ehow0.a;
        Object object1 = ibrx.a;
        switch(ehow0.c) {
            case 0: {
                ibnx.b(object0);
                ehow0.d = hgiq0;
                ehow0.c = 1;
                object0 = ehll.a(this.d, hgiq0, ehow0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                hgiq0 = ehow0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if((((ehlo)object0) instanceof ehln)) {
            ((ggtj)ehpa.c.i()).z("error while fetching control pages for the service %d", hgiq0.a());
            return null;
        }
        ibuq.d(((ehlo)object0), "null cannot be cast to non-null type com.google.android.gms.permissions.serviceinfo.repository.IServiceControlsProvider.ServiceControlsInfo.Collected");
        return ((ehlm)(((ehlo)object0))).a;
    }

    public final Object e(hgiq hgiq0, ibrl ibrl0) {
        ehox ehox0;
        if((ibrl0 instanceof ehox)) {
            ehox0 = (ehox)ibrl0;
            int v = ehox0.c;
            if((v & 0x80000000) == 0) {
                ehox0 = new ehox(this, ibrl0);
            }
            else {
                ehox0.c = v - 0x80000000;
            }
        }
        else {
            ehox0 = new ehox(this, ibrl0);
        }
        Object object0 = ehox0.a;
        Object object1 = ibrx.a;
        switch(ehox0.c) {
            case 0: {
                ibnx.b(object0);
                ehox0.d = hgiq0;
                ehox0.c = 1;
                object0 = this.c(hgiq0, ehox0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                hgiq0 = ehox0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((List)object0) == null) {
            return new ehpi(ehpk.a, null);
        }
        if(((List)object0).size() > 1) {
            bboh bboh0 = ehpa.c;
            ((ggtj)bboh0.i()).F("found %d control pages for simple service %d", ((List)object0).size(), hgiq0.a());
            for(Object object2: ((List)object0)) {
                ((ggtj)bboh0.h()).B("unexpected control page? : %s", ((ehlj)object2).a);
            }
            return new ehpi(ehpk.a, null);
        }
        if(((List)object0).isEmpty()) {
            ((ggtj)ehpa.c.i()).z("found no control pages for simple service %d", hgiq0.a());
            return new ehpi(ehpk.b, null);
        }
        Intent intent0 = ((ehlj)ibpo.R(((List)object0))).d;
        return new ehpi(ehpk.c, intent0);
    }

    public final Object f(ehlx ehlx0, ibrl ibrl0) {
        ehoy ehoy0;
        if((ibrl0 instanceof ehoy)) {
            ehoy0 = (ehoy)ibrl0;
            int v = ehoy0.c;
            if((v & 0x80000000) == 0) {
                ehoy0 = new ehoy(this, ibrl0);
            }
            else {
                ehoy0.c = v - 0x80000000;
            }
        }
        else {
            ehoy0 = new ehoy(this, ibrl0);
        }
        Object object0 = ehoy0.a;
        Object object1 = ibrx.a;
        switch(ehoy0.c) {
            case 0: {
                ibnx.b(object0);
                ehoy0.c = 1;
                object0 = this.e(ehlx0.a, ehoy0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Intent intent0 = ((ehpi)object0).b;
        return intent0 == null ? new ehpj(((ehpi)object0).a, null) : new ehpj(ehpk.c, intent0);
    }

    public final Object g(ehlx ehlx0, boolean z, ibrl ibrl0) {
        boolean z2;
        Object object2;
        ehoz ehoz0;
        ehlx ehlx1 = ehlx0;
        if((ibrl0 instanceof ehoz)) {
            ehoz0 = (ehoz)ibrl0;
            int v = ehoz0.d;
            if((v & 0x80000000) == 0) {
                ehoz0 = new ehoz(this, ibrl0);
            }
            else {
                ehoz0.d = v - 0x80000000;
            }
        }
        else {
            ehoz0 = new ehoz(this, ibrl0);
        }
        Object object0 = ehoz0.b;
        Object object1 = ibrx.a;
        boolean z1 = true;
        switch(ehoz0.d) {
            case 0: {
                ibnx.b(object0);
                ehoz0.e = ehlx1;
                ehoz0.a = z;
                ehoz0.d = 1;
                switch(ehlx1.d.ordinal()) {
                    case 1: {
                        Intent intent0 = ehnm.a(ehlx1.a);
                        object2 = new ehpj(ehpk.c, intent0);
                        break;
                    }
                    case 2: {
                        object2 = this.f(ehlx1, ehoz0);
                        break;
                    }
                    case 3: {
                        Intent intent1 = ehnm.a(ehlx1.a);
                        object2 = new ehpj(ehpk.c, intent1);
                        break;
                    }
                    default: {
                        object2 = new ehpj(ehpk.a, null);
                    }
                }
                if(object2 != object1) {
                    z2 = z;
                    object0 = object2;
                    break;
                }
                return object1;
            }
            case 1: {
                boolean z3 = ehoz0.a;
                ehlx ehlx2 = ehoz0.e;
                ibnx.b(object0);
                z2 = z3;
                ehlx1 = ehlx2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Intent intent2 = ((ehpj)object0).b;
        ehpr ehpr0 = new ehpr(((ehpj)object0).a.e, ((ehpj)object0).a.d, ehlx1.c);
        ehor ehor0 = new ehor(this, ehlx1);
        if(((ehpj)object0).a != ehpk.c) {
            z1 = false;
        }
        return new ehpq(ehlx1.a, ehlx1.b, ehpr0, ehor0, z2, intent2, ehlx1.e, z1);
    }
}

