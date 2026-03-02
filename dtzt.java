import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class dtzt implements dtzm {
    public static final bboh a;
    public final String b;
    public final boolean c;
    private final duay d;

    static {
        dtzt.a = bboh.b("Pay", bbcu.cZ);
    }

    public dtzt(duay duay0, String s, boolean z) {
        this.d = duay0;
        this.b = s;
        this.c = z;
    }

    @Override  // dtzm
    public final evql a(String s, Context context0) {
        ibuq.f(s, "callingPackage");
        ibuq.f(context0, "context");
        return fhqu.a(icpu.e(iccl.b(cclw.d), new dtzr(this, s, context0, null)));
    }

    public final Object b(String s, ibrl ibrl0) {
        Object object2;
        dtzo dtzo0;
        if((ibrl0 instanceof dtzo)) {
            dtzo0 = (dtzo)ibrl0;
            int v = dtzo0.c;
            if((v & 0x80000000) == 0) {
                dtzo0 = new dtzo(this, ibrl0);
            }
            else {
                dtzo0.c = v - 0x80000000;
            }
        }
        else {
            dtzo0 = new dtzo(this, ibrl0);
        }
        Object object0 = dtzo0.a;
        Object object1 = ibrx.a;
        switch(dtzo0.c) {
            case 0: {
                ibnx.b(object0);
                evql evql0 = this.d.c(s).e(new duat(this.d, s));
                dtzo0.c = 1;
                object2 = fsdk.a(evql0, dtzo0);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if((object2 instanceof ibnv)) {
            a.ae(dtzt.a.j(), "Failed to fetch browser allowlist", ibnw.a(object2));
            return null;
        }
        ((ggtj)dtzt.a.h()).x("Successfully fetched browser allowlist from RpConfig");
        return object2;
    }

    public final Object c(String s, ibrl ibrl0) {
        Object object2;
        dtzp dtzp0;
        if((ibrl0 instanceof dtzp)) {
            dtzp0 = (dtzp)ibrl0;
            int v = dtzp0.c;
            if((v & 0x80000000) == 0) {
                dtzp0 = new dtzp(this, ibrl0);
            }
            else {
                dtzp0.c = v - 0x80000000;
            }
        }
        else {
            dtzp0 = new dtzp(this, ibrl0);
        }
        Object object0 = dtzp0.a;
        Object object1 = ibrx.a;
        switch(dtzp0.c) {
            case 0: {
                ibnx.b(object0);
                evql evql0 = this.d.b(s);
                dtzp0.c = 1;
                object2 = fsdk.a(evql0, dtzp0);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if((object2 instanceof ibnv)) {
            a.ae(dtzt.a.j(), "Failed to fetch RP allowlist", ibnw.a(object2));
            return null;
        }
        ((ggtj)dtzt.a.h()).x("Successfully fetched rp allowlist from RpConfig");
        return object2;
    }

    public final Object d(String s, ibrl ibrl0) {
        dtzq dtzq0;
        if((ibrl0 instanceof dtzq)) {
            dtzq0 = (dtzq)ibrl0;
            int v = dtzq0.c;
            if((v & 0x80000000) == 0) {
                dtzq0 = new dtzq(this, ibrl0);
            }
            else {
                dtzq0.c = v - 0x80000000;
            }
        }
        else {
            dtzq0 = new dtzq(this, ibrl0);
        }
        Object object0 = dtzq0.a;
        Object object1 = ibrx.a;
        switch(dtzq0.c) {
            case 0: {
                ibnx.b(object0);
                dtzq0.d = s;
                dtzq0.c = 1;
                object0 = this.c(this.b, dtzq0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                s = dtzq0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((List)object0) == null) {
            ((ggtj)dtzt.a.j()).x("Could not fetch RP allowlist");
            return null;
        }
        for(Object object2: ((List)object0)) {
            hkbc hkbc0 = (hkbc)object2;
            hfuo hfuo0 = hkbc0.c;
            ibuq.e(hfuo0, "getAuthenticationSystemsList(...)");
            ArrayList arrayList0 = new ArrayList();
            for(Object object3: hfuo0) {
                if(hkbb.a(((hkba)object3).b) == 5) {
                    arrayList0.add(object3);
                }
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object4: arrayList0) {
                hfuo hfuo1 = ((hkba)object4).c;
                ibuq.e(hfuo1, "getAuthenticationMechanismList(...)");
                ibpo.D(arrayList1, hfuo1);
            }
            ArrayList arrayList2 = new ArrayList();
            for(Object object5: arrayList1) {
                hjzd hjzd0 = (hjzd)object5;
                if(hjzd0.b == 4 && ibuq.m(((hkbl)hjzd0.c).b, s)) {
                    arrayList2.add(object5);
                }
            }
            if(!arrayList2.isEmpty()) {
                Object object6 = hkbc0.d;
                return object6 == null ? hjzr.a : object6;
            }
        }
        ((ggtj)dtzt.a.j()).x("Could not find display info for url");
        return hwfk.Y() && !this.c ? dtzn.a(s) : null;
    }

    public final boolean e(Context context0, String s, List list0) {
        gged_interceptors gged0 = bbms.d(context0, s, "SHA-256");
        ibuq.e(gged0, "getPackageCertificateHistoryHashBytes(...)");
        ArrayList arrayList0 = new ArrayList(ibpo.q(gged0, 10));
        ggqk ggqk0 = gged0.E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            arrayList0.add(bboy.c(((byte[])object0)));
        }
        return !ibpo.av(arrayList0, list0).isEmpty();
    }
}

