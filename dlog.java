import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class dlog implements dlok {
    public static final bboh a;
    private final dytd b;
    private final String c;
    private final String d;
    private final String e;
    private final fhwb f;
    private final eczo g;
    private final azts h;

    static {
        dlog.a = bboh.b("Pay", bbcu.cZ);
    }

    public dlog(dytd dytd0, azts azts0, eczo eczo0, String s, String s1, String s2, fhwb fhwb0) {
        this.b = dytd0;
        this.h = azts0;
        this.g = eczo0;
        this.c = s;
        this.d = s1;
        this.e = s2;
        this.f = fhwb0;
    }

    @Override  // dlok
    public final List a() {
        ascv ascv0;
        long v = System.currentTimeMillis();
        long v1 = hwsd.r();
        if(!this.g.a(v1).equals(eczn.e)) {
            return ibps.a;
        }
        String s = UUID.randomUUID().toString();
        ibuq.e(s, "toString(...)");
        List list0 = ibpo.ak(this.e(dyna.e, s), this.e(dyna.h, s));
        fhwb fhwb0 = this.f;
        fhvz fhvz0 = fhwa.a(0x3BB65);
        fhvz0.c(fhwp.b(this.c));
        long v2 = System.currentTimeMillis() - v;
        gjmk gjmk0 = gjmj.a(((ProtoLiteMessage)gjml.a).v_newBuilder());
        hhyy hhyy0 = hhyx.a(((hftr)((ProtoLiteMessage)hhzc.a).v_newBuilder()));
        hfsv hfsv0 = hfsu.a(((ProtoLiteMessage)hfst.a).v_newBuilder());
        hfsv0.c(v2 / 1000L);
        hfsv0.b(((int)(v2 % 1000L * 1000000L)));
        hhyy0.b(hfsv0.a());
        hhza hhza0 = hhyz.a(((ProtoLiteMessage)hhzb.a).v_newBuilder());
        hhza0.b(0);
        hhyy0.c(hhza0.a());
        gjmk0.b(hhyy0.a());
        gjml gjml0 = gjmk0.a();
        fhvz0.b(new fhvu(fhwx.a, gjml0));
        hfta hfta0 = gjdq.a;
        gjca gjca0 = gjbz.a(((gjcd)((ProtoLiteMessage)gjce.a).v_newBuilder()));
        gjca0.i();
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        for(Object object0: list0) {
            gjlo gjlo0 = gjln.a(((ProtoLiteMessage)gjma.a).v_newBuilder());
            dyib dyib0 = ((dykv)object0).d;
            if(dyib0 == null) {
                dyib0 = dyib.a;
            }
            gtni gtni0 = dypl.h((dyna.b(dyib0.b) == null ? dyna.k : dyna.b(dyib0.b)));
            ibuq.e(gtni0, "paySeProtoToTapAndPay(...)");
            gjlo0.c(gtni0);
            arrayList0.add(gjlo0.a());
        }
        gjca0.g(arrayList0);
        fhvz0.b(new fhvu(hfta0, gjca0.a()));
        fhwb0.a(fhvz0.a());
        List list1 = new ArrayList(ibpo.q(list0, 10));
        for(Object object1: list0) {
            asca asca0 = asbz.a(((ProtoLiteMessage)asby.a).v_newBuilder());
            dyib dyib1 = ((dykv)object1).d;
            if(dyib1 == null) {
                dyib1 = dyib.a;
            }
            String s1 = dyib1.c;
            ibuq.e(s1, "getCid(...)");
            asca0.b(s1);
            ascz ascz0 = ascy.a(((ProtoLiteMessage)ascx.a).v_newBuilder());
            ascz0.b(ascs.c);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ascw.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            dyib dyib2 = ((dykv)object1).d;
            if(dyib2 == null) {
                dyib2 = dyib.a;
            }
            dyna dyna0 = dyna.b(dyib2.b) == null ? dyna.k : dyna.b(dyib2.b);
            ibuq.e(dyna0, "getServiceProvider(...)");
            switch(dyna0.ordinal()) {
                case 4: {
                    ascv0 = ascv.b;
                    break;
                }
                case 7: {
                    ascv0 = ascv.c;
                    break;
                }
                default: {
                    ascv0 = ascv.a;
                }
            }
            ibuq.f(ascv0, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((ascw)hftv0).c = ascv0.d;
            boolean z = true;
            ((ascw)hftv0).b |= 1;
            dyib dyib3 = ((dykv)object1).d;
            if(dyib3 == null) {
                dyib3 = dyib.a;
            }
            switch(dyia.a(dyib3.h)) {
                case 0: {
                    z = false;
                    break;
                }
                case 5: {
                    break;
                }
                default: {
                    z = false;
                }
            }
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ascw ascw0 = (ascw)hftp0.b_message;
            ascw0.b |= 2;
            ascw0.d = z;
            ProtoLiteMessage hftv1 = hftp0.N_build();
            ibuq.e(hftv1, "build(...)");
            ibuq.f(((ascw)hftv1), "value");
            ProtoLiteBuilder hftp1 = ascz0.a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ascx ascx0 = (ascx)hftp1.b_message;
            ((ascw)hftv1).getClass();
            ascx0.d = (ascw)hftv1;
            ascx0.c = 2;
            asca0.c(ascz0.a());
            list1.add(asca0.a());
        }
        return list1;
    }

    @Override  // dlok
    public final List b(long v, List list0) {
        dyna dyna0;
        if(!list0.isEmpty()) {
            for(Object object0: list0) {
                asby asby0 = (asby)object0;
                ascx ascx0 = asby0.c == 106 ? ((ascx)asby0.d) : ascx.a;
                if((ascs.b(ascx0.e) == null ? ascs.a : ascs.b(ascx0.e)) != ascs.c) {
                    throw new IllegalArgumentException("Invalid data type");
                }
            }
        }
        if(list0.isEmpty()) {
            return ibps.a;
        }
        azts azts0 = this.h;
        dyfx dyfx0 = dyfw.a(((ProtoLiteMessage)dyfv.a).v_newBuilder());
        dyfx0.b(this.c);
        dyoe dyoe0 = dyod.a(((dyoa)((ProtoLiteMessage)dyoc.a).v_newBuilder()));
        dyob dyob0 = dyob.b;
        ibuq.f(dyob0, "value");
        dyoa dyoa0 = dyoe0.a;
        if(!dyoa0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)dyoa0).ensureMutable();
        }
        dyoc dyoc0 = (dyoc)dyoa0.b_message;
        dyoc0.d = dyob0.a();
        dyoe0.c();
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        for(Object object1: list0) {
            asby asby1 = (asby)object1;
            dyfa dyfa0 = dyez.a(((ProtoLiteMessage)dyey.a).v_newBuilder());
            ascx ascx1 = asby1.c == 106 ? ((ascx)asby1.d) : ascx.a;
            ascw ascw0 = ascx1.c == 2 ? ((ascw)ascx1.d) : ascw.a;
            ascv ascv0 = ascv.b(ascw0.c) == null ? ascv.a : ascv.b(ascw0.c);
            ibuq.e(ascv0, "getServiceProvider(...)");
            switch(ascv0.ordinal()) {
                case 1: {
                    dyna0 = dyna.e;
                    break;
                }
                case 2: {
                    dyna0 = dyna.h;
                    break;
                }
                default: {
                    dyna0 = dyna.a;
                }
            }
            dyfa0.c(dyna0);
            String s = asby1.e;
            ibuq.e(s, "getItemId(...)");
            dyfa0.b(s);
            arrayList0.add(dyfa0.a());
        }
        dyoe0.b(arrayList0);
        dyfx0.g(dyoe0.a());
        azts0.ba(dyfx0.a().toBytesArray()).A(new dloe());
        return ibps.a;
    }

    @Override  // dlok
    public final void c(List list0) {
        hjww hjww0;
        if(!list0.isEmpty()) {
            for(Object object0: list0) {
                asby asby0 = (asby)object0;
                ascx ascx0 = asby0.c == 106 ? ((ascx)asby0.d) : ascx.a;
                if((ascs.b(ascx0.e) == null ? ascs.a : ascs.b(ascx0.e)) != ascs.c) {
                    throw new IllegalArgumentException("Invalid data type");
                }
            }
        }
        if(list0.isEmpty()) {
            return;
        }
        azts azts0 = this.h;
        dyfx dyfx0 = dyfw.a(((ProtoLiteMessage)dyfv.a).v_newBuilder());
        dyfx0.b(this.c);
        dykg dykg0 = dykf.a(((ProtoLiteMessage)dyke.a).v_newBuilder());
        dykd dykd0 = dykd.b;
        ibuq.f(dykd0, "value");
        ProtoLiteBuilder hftp0 = dykg0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dyke dyke0 = (dyke)hftp0.b_message;
        dyke0.d = dykd0.a();
        dymy dymy0 = dymx.a(((ProtoLiteMessage)dymw.a).v_newBuilder());
        dyma dyma0 = dylz.a(((dylx)((ProtoLiteMessage)dyly.a).v_newBuilder()));
        dyma0.e();
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        for(Object object1: list0) {
            asby asby1 = (asby)object1;
            hkjo hkjo0 = hkjn.a(((ProtoLiteMessage)hkjm.a).v_newBuilder());
            hjwz hjwz0 = hjwy.a(((ProtoLiteMessage)hjwx.a).v_newBuilder());
            ascx ascx1 = asby1.c == 106 ? ((ascx)asby1.d) : ascx.a;
            ascw ascw0 = ascx1.c == 2 ? ((ascw)ascx1.d) : ascw.a;
            ascv ascv0 = ascv.b(ascw0.c) == null ? ascv.a : ascv.b(ascw0.c);
            ibuq.e(ascv0, "getServiceProvider(...)");
            switch(ascv0.ordinal()) {
                case 1: {
                    hjww0 = hjww.e;
                    break;
                }
                case 2: {
                    hjww0 = hjww.i;
                    break;
                }
                default: {
                    hjww0 = hjww.a;
                }
            }
            hjwz0.c(hjww0);
            String s = asby1.e;
            ibuq.e(s, "getItemId(...)");
            hjwz0.b(s);
            hkjo0.b(hjwz0.a());
            arrayList0.add(hkjo0.a());
        }
        dyma0.d(arrayList0);
        dyma0.c(gurm.j);
        ArrayList arrayList1 = new ArrayList();
        for(Object object2: list0) {
            asby asby2 = (asby)object2;
            ascx ascx2 = asby2.c == 106 ? ((ascx)asby2.d) : ascx.a;
            if((ascx2.c == 2 ? ((ascw)ascx2.d) : ascw.a).d) {
                arrayList1.add(object2);
            }
        }
        ArrayList arrayList2 = new ArrayList(ibpo.q(arrayList1, 10));
        for(Object object3: arrayList1) {
            arrayList2.add(((asby)object3).e);
        }
        String s1 = (String)ibpo.T(arrayList2);
        if(s1 != null) {
            dyma0.b(s1);
        }
        dymy0.b(dyma0.a());
        dykg0.b(dymy0.a());
        dyfx0.f(dykg0.a());
        azts0.ba(dyfx0.a().toBytesArray()).A(new dlof());
    }

    @Override  // dlok
    public final void d(List list0) {
        if(!list0.isEmpty()) {
            for(Object object0: list0) {
                asby asby0 = (asby)object0;
                ascx ascx0 = asby0.c == 106 ? ((ascx)asby0.d) : ascx.a;
                if((ascs.b(ascx0.e) == null ? ascs.a : ascs.b(ascx0.e)) != ascs.c) {
                    throw new IllegalArgumentException("Invalid data type");
                }
            }
        }
        if(list0.isEmpty()) {
            return;
        }
        ((glyq)new dycl(this.d, this.e).c(dymv.e)).u();
    }

    private final List e(dyna dyna0, String s) {
        try {
            Object object0 = evrg.o(this.b.f(dyna0, 2, 1, s), 60L, TimeUnit.SECONDS);
            ibuq.e(object0, "await(...)");
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: ((Iterable)object0)) {
                dykv dykv0 = ((dyhj)object1).c;
                if(dykv0 == null) {
                    dykv0 = dykv.a;
                }
                if((dykv0.b & 1) != 0) {
                    arrayList0.add(object1);
                }
            }
            ArrayList arrayList1 = new ArrayList(ibpo.q(arrayList0, 10));
            for(Object object2: arrayList0) {
                dykv dykv1 = ((dyhj)object2).c;
                if(dykv1 == null) {
                    dykv1 = dykv.a;
                }
                arrayList1.add(dykv1);
            }
            return ggdx.a(arrayList1);
        }
        catch(InterruptedException interruptedException0) {
            a.ae(dlog.a.j(), "Interrupted while getting local Felica transit cards", interruptedException0);
            return ibps.a;
        }
        catch(ExecutionException executionException0) {
            a.ae(dlog.a.j(), "Failed to get local Felica transit cards", executionException0);
            return ibps.a;
        }
        catch(TimeoutException timeoutException0) {
            a.ae(dlog.a.j(), "Timed out while getting local Felica transit cards", timeoutException0);
            return ibps.a;
        }
    }
}

