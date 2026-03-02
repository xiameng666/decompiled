import android.content.Context;
import android.content.Intent;
import com.google.location.nearby.common.fastpair.ProtoWrapper;
import java.util.ArrayList;
import java.util.List;

public final class cysq {
    public final Context a;
    String b;
    public cust c;

    public cysq(Context context0) {
        this.b = null;
        this.c = cyjh.a;
        this.a = context0;
    }

    public static cyxd a(cyxd cyxd0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)cyxd0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)cyxd0));
        Integer integer0 = (int)4360;
        if(!cyxd0.e.contains(integer0)) {
            if(!((cyxc)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((cyxc)hftp0))).ensureMutable();
            }
            cyxd cyxd1 = (cyxd)((cyxc)hftp0).b_message;
            cyxd1.b();
            cyxd1.e.i(4360);
        }
        if(!cyxd0.f.contains(integer0)) {
            ((cyxc)hftp0).k(4360);
        }
        if(!cyxd0.g.contains(integer0)) {
            ((cyxc)hftp0).a(4360);
        }
        return (cyxd)((ProtoLiteBuilder)(((cyxc)hftp0))).N_build();
    }

    public static gged_interceptors b(List list0, List list1, cust cust0) {
        if(!cysq.f(list0, 4360).equals(cysq.f(list1, 4360))) {
            ((ggtj)cust0.d().ar(8098)).x("compareActivePeripherals: active hfp change.");
            return cysq.d(list0);
        }
        if(!cysq.f(list0, 0x110B).equals(cysq.f(list1, 0x110B))) {
            ((ggtj)cust0.d().ar(8097)).x("compareActivePeripherals: active a2dp change.");
            return cysq.d(list0);
        }
        if(hvpp.br() && !cysq.l(list0).equals(cysq.l(list1))) {
            ((ggtj)cust0.d().ar(0x1FA0)).x("compareActivePeripherals: active devices change because of toggle change.");
            return cysq.d(list0);
        }
        return null;
    }

    public static gged_interceptors c(List list0, List list1, cust cust0) {
        if(!cysq.g(list0, 4360).equals(cysq.g(list1, 4360))) {
            ((ggtj)cust0.d().ar(8101)).x("compareConnectedPeripherals: connected hfp change.");
            return cysq.e(list0);
        }
        if(!cysq.g(list0, 0x110B).equals(cysq.g(list1, 0x110B))) {
            ((ggtj)cust0.d().ar(8100)).x("compareConnectedPeripherals: connected a2dp change.");
            return cysq.e(list0);
        }
        if(hvpp.br() && !cysq.l(list0).equals(cysq.l(list1))) {
            ((ggtj)cust0.d().ar(8099)).x("compareConnectedPeripherals: connected devices change because of toggle change.");
            return cysq.e(list0);
        }
        return null;
    }

    public static gged_interceptors d(List list0) {
        return cysq.k(list0, new cysn());
    }

    public static gged_interceptors e(List list0) {
        return cysq.k(list0, new cysl());
    }

    public static ggfp f(List list0, int v) {
        return cysq.m(cysq.k(list0, new cyso(v)));
    }

    public static ggfp g(List list0, int v) {
        return cysq.m(cysq.k(list0, new cysm(v)));
    }

    public final void h(List list0) {
        this.n("com.google.android.gms.nearby.fastpair.service.ACTION_PERIPHERALS_ACTIVE_STATE_CHANGED", list0);
    }

    public final void i(List list0) {
        String s = cyfg.a(this.a);
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Object object0 = null;
        ggqk ggqk0 = ((gged_interceptors)list0).E();
        while(ggqk0.hasNext()) {
            Object object1 = ggqk0.next();
            cyxd cyxd0 = (cyxd)object1;
            if(!cyxd0.i) {
                if((cyxd0.b & 8) != 0) {
                    higy higy0 = higy.b(cyxd0.k) == null ? higy.a : higy.b(cyxd0.k);
                    if(higy.b.equals(higy0)) {
                        arrayList0.add(cyxd0);
                        continue;
                    }
                    else {
                        higy higy1 = higy.b(cyxd0.k) == null ? higy.a : higy.b(cyxd0.k);
                        if(higy.h.equals(higy1)) {
                            arrayList0.add(cyxd0);
                            continue;
                        }
                    }
                }
                if(cyxg.a.contains(Integer.valueOf(cyxd0.j))) {
                    arrayList1.add(cyxd0);
                }
                else {
                    arrayList2.add(cyxd0);
                }
            }
            else if(s != null && cyxd0.c.equals(s)) {
                object0 = cyxd0;
            }
            else {
                ((ggtj)cyjh.a.d().ar(0x205E)).B("PeripheralOrderApplier: %s is filtered because it\'s a WearOs device", fgjo.c(cyxd0.c));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList0);
        arrayList3.addAll(arrayList1);
        arrayList3.addAll(arrayList2);
        if(object0 != null) {
            arrayList3.add(object0);
        }
        this.n("com.google.android.gms.nearby.fastpair.service.ACTION_PERIPHERALS_CONNECTION_STATE_CHANGED", gged_interceptors.i(arrayList3));
    }

    public static boolean j(cyxd cyxd0) {
        return cyxd0.g.contains(Integer.valueOf(4360));
    }

    private static gged_interceptors k(List list0, gftc gftc0) {
        ggdy ggdy0 = new ggdy();
        for(Object object0: list0) {
            cyxd cyxd0 = (cyxd)object0;
            if(gftc0.a(cyxd0)) {
                ggdy0.i(cyxd0);
            }
        }
        return ggdy0.h();
    }

    private static ggfp l(List list0) {
        return cysq.m(cysq.k(list0, new cysp()));
    }

    private static ggfp m(List list0) {
        ggfn ggfn0 = new ggfn();
        ggqk ggqk0 = ((gged_interceptors)list0).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            ggfn0.i(((cyxd)object0).c);
        }
        return ggfn0.h();
    }

    private final void n(String s, List list0) {
        ((ggtj)this.c.d().ar(0x1FB3)).P("notifyPeripheralChange: action %s, peripherals size %s.", s, list0.size());
        ArrayList arrayList0 = new ArrayList(list0.size());
        for(Object object0: list0) {
            arrayList0.add(new ProtoWrapper(((MessageLite)(((cyxd)object0)))));
        }
        Intent intent0 = new Intent(s).putParcelableArrayListExtra("com.google.android.gms.nearby.fastpair.service.KEY_PERIPHERAL_ARRAY_LIST", arrayList0);
        intent0.putExtra("com.google.android.gms.nearby.fastpair.service.KEY_E2ELOG_TIGGER_ID", this.c.a);
        cutr.d(this.a, intent0);
    }
}

