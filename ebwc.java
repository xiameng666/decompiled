import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import j..util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class ebwc {
    public final AccountInfo a;
    public final String b;
    public final domw c;
    public dyra d;
    public edgd e;
    public edqy f;
    public ebst g;
    public bbng h;
    public edse i;
    public long j;
    public edsl k;
    public static final int l;
    private static final bboh m;

    static {
        ebwc.m = bboh.b("Pay", bbcu.cZ);
    }

    public ebwc(AccountInfo accountInfo0, String s, domw domw0) {
        ibuq.f(s, "callingPackage");
        super();
        this.a = accountInfo0;
        this.b = s;
        this.c = domw0;
    }

    public final dyra a() {
        dyra dyra0 = this.d;
        if(dyra0 != null) {
            return dyra0;
        }
        ibuq.j("octopusCardManager");
        return null;
    }

    public final ebst b() {
        ebst ebst0 = this.g;
        if(ebst0 != null) {
            return ebst0;
        }
        ibuq.j("emoneyOperationUtils");
        return null;
    }

    public final Object c(dyiy dyiy0, ibrl ibrl0) {
        edgd edgd1;
        Object object6;
        dylc dylc0;
        boolean z;
        Object object3;
        ebwb ebwb0;
        dyiy dyiy1 = dyiy0;
        if((ibrl0 instanceof ebwb)) {
            ebwb0 = (ebwb)ibrl0;
            int v = ebwb0.c;
            if((v & 0x80000000) == 0) {
                ebwb0 = new ebwb(this, ibrl0);
            }
            else {
                ebwb0.c = v - 0x80000000;
            }
        }
        else {
            ebwb0 = new ebwb(this, ibrl0);
        }
        Object object0 = ebwb0.a;
        Object object1 = ibrx.a;
        switch(ebwb0.c) {
            case 0: {
                ibnx.b(object0);
                hfuo hfuo0 = dyiy1.e;
                ibuq.e(hfuo0, "getTxnHistoryItemListList(...)");
                ArrayList arrayList0 = new ArrayList();
                for(Object object2: hfuo0) {
                    if(((dyix)object2).f != 0L) {
                        arrayList0.add(object2);
                    }
                }
                Iterator iterator1 = arrayList0.iterator();
                if(iterator1.hasNext()) {
                    object3 = iterator1.next();
                    if(iterator1.hasNext()) {
                        long v1 = ((dyix)object3).f;
                        while(true) {
                            Object object4 = iterator1.next();
                            long v2 = ((dyix)object4).f;
                            int v3 = Long.compare(v1, v2);
                            if(v3 < 0) {
                                v1 = v2;
                            }
                            if(v3 < 0) {
                                object3 = object4;
                            }
                            if(iterator1.hasNext()) {
                                continue;
                            }
                            goto label_39;
                        }
                    }
                    else {
                    label_39:
                        if(((dyix)object3) != null) {
                            ebst ebst0 = this.b();
                            fhvz fhvz0 = fhwa.a(0x393D7);
                            fhvz0.c(fhwp.b(this.a.b));
                            long v4 = ((dyix)object3).f;
                            long v5 = ((dyix)object3).g;
                            hfta hfta0 = gjdq.a;
                            gjca gjca0 = gjbz.a(((gjcd)((ProtoLiteMessage)gjce.a).v_newBuilder()));
                            gjca0.i();
                            gjlo gjlo0 = gjln.a(((ProtoLiteMessage)gjma.a).v_newBuilder());
                            gjlo0.c(gtni.j);
                            gjlq gjlq0 = gjlp.a(((ProtoLiteMessage)gjlz.a).v_newBuilder());
                            gjlq0.c();
                            gjls gjls0 = gjlr.a(((ProtoLiteMessage)gjlu.a).v_newBuilder());
                            gjls0.b(((int)(v5 - v4)));
                            gjlq0.b(gjls0.a());
                            ProtoLiteBuilder hftp0 = gjlq0.a;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gjlz gjlz0 = (gjlz)hftp0.b_message;
                            gjlz0.b |= 16;
                            gjlz0.g = v4;
                            gjlo0.d(gjlq0.a());
                            gjca0.h(gjlo0.a());
                            fhvz0.b(new fhvu(hfta0, gjca0.a()));
                            fhwa fhwa0 = fhvz0.a();
                            ebst0.b.a(fhwa0);
                        }
                    }
                }
                else {
                    object3 = null;
                    goto label_39;
                }
                String s = dyiy1.c;
                ibuq.e(s, "getBalance(...)");
                if(s.length() > 0) {
                    String s1 = dyiy1.b;
                    ibuq.e(s1, "getCardId(...)");
                    if(s1.length() > 0) {
                        String s2 = dyiy1.d;
                        ibuq.e(s2, "getCurrency(...)");
                        z = s2.length() > 0;
                    }
                    else {
                        z = false;
                    }
                }
                else {
                    z = false;
                }
                boolean z1 = true;
                hfuo hfuo1 = dyiy1.e;
                ibuq.e(hfuo1, "getTxnHistoryItemListList(...)");
                if(!(hfuo1 instanceof Collection) || !hfuo1.isEmpty()) {
                    for(Object object5: hfuo1) {
                        if(((dyix)object5).e == 0L) {
                            z1 = false;
                            break;
                        }
                        dyiw dyiw0 = ((dyix)object5).i;
                        if(dyiw0 == null) {
                            dyiw0 = dyiw.a;
                        }
                        String s3 = dyiw0.c;
                        ibuq.e(s3, "getEn(...)");
                        if(s3.length() <= 0) {
                            z1 = false;
                            break;
                        }
                    }
                }
                if(!z || !z1) {
                    ((ggtj)ebwc.m.j()).B("Invalid data for card with id %s on tap event", dyiy1.b);
                    this.d(2);
                    return new Status(10, "Invalid JSON for Octopus card tap event");
                }
                dyle dyle0 = dyld.a(((ProtoLiteMessage)dylc.a).v_newBuilder());
                String s4 = dyiy1.b;
                ibuq.e(s4, "getCardId(...)");
                dyle0.e(s4);
                dyle0.d(dyna.i);
                dymi dymi0 = dymh.a(((ProtoLiteMessage)dymg.a).v_newBuilder());
                String s5 = dyiy1.d;
                ibuq.e(s5, "getCurrency(...)");
                dymi0.b(s5);
                String s6 = dyiy1.c;
                ibuq.e(s6, "getBalance(...)");
                dymi0.c(fsgr.b(s6));
                dyle0.c(dymi0.a());
                dylc0 = dyle0.a();
                dyra dyra0 = this.a();
                String s7 = dyiy1.b;
                ibuq.e(s7, "getCardId(...)");
                evql evql0 = dyra0.b(s7, dyfc.b);
                ebwb0.d = dyiy1;
                ebwb0.e = dylc0;
                ebwb0.c = 1;
                object6 = fsdk.a(evql0, ebwb0);
                if(object6 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                dylc dylc1 = ebwb0.e;
                dyiy dyiy2 = ebwb0.d;
                ibnx.b(object0);
                dylc0 = dylc1;
                dyiy1 = dyiy2;
                object6 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if((object6 instanceof ibnv)) {
            ((ggtj)((ggtj)ebwc.m.j()).s(ibnw.a(object6))).B("Failed to get octopus card: %s", dyiy1.b);
            this.d(0);
            return Status.b;
        }
        ibnx.b(object6);
        if(((Optional)object6).isPresent()) {
            ibnx.b(object6);
            Object object7 = ((Optional)object6).get();
            ibuq.e(object7, "get(...)");
            boolean z2 = this.a().q(dylc0, new ebvz());
            hfuo hfuo2 = dyiy1.e;
            ibuq.e(hfuo2, "getTxnHistoryItemListList(...)");
            List list0 = ibxv.j(new ibym(ibpo.aA(hfuo2), new ebwa()));
            edgd edgd0 = this.e;
            if(edgd0 == null) {
                ibuq.j("octopusCardTransactionManager");
                edgd1 = null;
            }
            else {
                edgd1 = edgd0;
            }
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)dylf.a).v_newBuilder();
            ibuq.f(hftp1, "builder");
            dyhh dyhh0 = ((dyja)object7).d;
            if(dyhh0 == null) {
                dyhh0 = dyhh.a;
            }
            hjqn hjqn0 = dyhh0.c == null ? hjqn.a : dyhh0.c;
            ibuq.e(hjqn0, "getGooglePaymentMethodId(...)");
            ibuq.f(hjqn0, "value");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            dylf dylf0 = (dylf)hftp1.b_message;
            hjqn0.getClass();
            dylf0.c = hjqn0;
            dylf0.b |= 1;
            dylc dylc2 = ((dyja)object7).c;
            if(dylc2 == null) {
                dylc2 = dylc.a;
            }
            ibuq.e(dylc2, "getSePrepaidCardData(...)");
            ibuq.f(dylc2, "value");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            dylf dylf1 = (dylf)hftp1.b_message;
            dylc2.getClass();
            dylf1.d = dylc2;
            dylf1.b |= 2;
            ProtoLiteMessage hftv0 = hftp1.N_build();
            ibuq.e(hftv0, "build(...)");
            edgd1.a(((dylf)hftv0), list0);
        }
        this.d(0);
        return Status.b;
    }

    public final void d(int v) {
        ebst ebst0 = this.b();
        ibuq.e(this.a.b, "getAccountName(...)");
        this.e();
        ebst.e(ebst0, this.a.b, 209670, System.currentTimeMillis() - this.j, v, 16);
    }

    public final void e() {
        if(this.h != null) {
            return;
        }
        ibuq.j("clock");
    }
}

