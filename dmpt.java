import android.accounts.Account;
import j..time.Duration;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class dmpt {
    private final azts a;

    public dmpt(azts azts0) {
        this.a = azts0;
    }

    public final Object a(Account[] arr_account, ibrl ibrl0) {
        Object object3;
        dmpq dmpq0;
        if((ibrl0 instanceof dmpq)) {
            dmpq0 = (dmpq)ibrl0;
            int v = dmpq0.d;
            if((v & 0x80000000) == 0) {
                dmpq0 = new dmpq(this, ibrl0);
            }
            else {
                dmpq0.d = v - 0x80000000;
            }
        }
        else {
            dmpq0 = new dmpq(this, ibrl0);
        }
        Object object0 = dmpq0.b;
        Object object1 = ibrx.a;
        Object object2 = null;
        switch(dmpq0.d) {
            case 0: {
                ibnx.b(object0);
                object3 = ibpg.T(arr_account).a();
                goto label_24;
            }
            case 1: {
                object3 = dmpq0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            if(((List)object0).isEmpty()) {
                object0 = null;
            }
            if(((List)object0) != null) {
                object2 = (List)object0;
                break;
            }
        label_24:
            if(!((Iterator)object3).hasNext()) {
                break;
            }
            Object object4 = ((Iterator)object3).next();
            dmpq0.a = object3;
            dmpq0.d = 1;
            object0 = this.b(((Account)object4), dmpq0);
            if(object0 != object1) {
                continue;
            }
            return object1;
        }
        return object2 == null ? ibps.a : object2;
    }

    public final Object b(Account account0, ibrl ibrl0) {
        Object object2;
        dmpr dmpr0;
        if((ibrl0 instanceof dmpr)) {
            dmpr0 = (dmpr)ibrl0;
            int v = dmpr0.d;
            if((v & 0x80000000) == 0) {
                dmpr0 = new dmpr(this, ibrl0);
            }
            else {
                dmpr0.d = v - 0x80000000;
            }
        }
        else {
            dmpr0 = new dmpr(this, ibrl0);
        }
        Object object0 = dmpr0.b;
        Object object1 = ibrx.a;
        switch(dmpr0.d) {
            case 0: {
                ibnx.b(object0);
                dyfx dyfx0 = dyfw.a(((ProtoLiteMessage)dyfv.a).v_newBuilder());
                String s = account0.name;
                ibuq.e(s, "name");
                dyfx0.b(s);
                dyhp dyhp0 = dyho.a(((ProtoLiteMessage)dyhn.a).v_newBuilder());
                dyhp0.b(dyfc.c);
                dyfx0.d(dyhp0.a());
                byte[] arr_b = dyfx0.a().toBytesArray();
                evql evql0 = this.a.ba(arr_b);
                Duration duration0 = Duration.ofSeconds(60L);
                ibuq.e(duration0, "ofSeconds(...)");
                dmpr0.a = account0;
                dmpr0.d = 1;
                object2 = fsdk.b(evql0, duration0, dmpr0);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                account0 = dmpr0.a;
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if((object2 instanceof ibnv)) {
            object2 = null;
        }
        if(((byte[])object2) == null) {
            return ibps.a;
        }
        hftc hftc0 = hftc.a();
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dyfy.a), ((byte[])object2), 0, ((byte[])object2).length, hftc0);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        hfuo hfuo0 = (((dyfy)hftv0).b == 4 ? ((dyhq)((dyfy)hftv0).c) : dyhq.a).d;
        ibuq.e(hfuo0, "getOctopusPaymentMethodList(...)");
        ArrayList arrayList0 = new ArrayList();
        for(Object object3: hfuo0) {
            ibuq.c(((dyja)object3));
            dylc dylc0 = ((dyja)object3).c;
            if(dylc0 == null) {
                dylc0 = dylc.a;
            }
            dyng dyng0 = dylc0.h == null ? dyng.a : dylc0.h;
            dyir dyir0 = dyng0.b == 8 ? ((dyir)dyng0.c) : dyir.a;
            if((dyiv.b(dyir0.d) == null ? dyiv.m : dyiv.b(dyir0.d)) == dyiv.b) {
                arrayList0.add(object3);
            }
        }
        Object object4 = new ArrayList(ibpo.q(arrayList0, 10));
        for(Object object5: arrayList0) {
            dylc dylc1 = ((dyja)object5).c;
            if(dylc1 == null) {
                dylc1 = dylc.a;
            }
            ibuq.e(dylc1, "getSePrepaidCardData(...)");
            ((Collection)object4).add(new dmma(account0, dylc1));
        }
        return object4;
    }

    public final Object c(Account account0, List list0, ibrl ibrl0) {
        Object object4;
        Object object3;
        dmps dmps0;
        if((ibrl0 instanceof dmps)) {
            dmps0 = (dmps)ibrl0;
            int v = dmps0.e;
            if((v & 0x80000000) == 0) {
                dmps0 = new dmps(this, ibrl0);
            }
            else {
                dmps0.e = v - 0x80000000;
            }
        }
        else {
            dmps0 = new dmps(this, ibrl0);
        }
        Object object0 = dmps0.c;
        Object object1 = ibrx.a;
        switch(dmps0.e) {
            case 0: {
                ibnx.b(object0);
                LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(list0, 10)), 16));
                for(Object object2: list0) {
                    linkedHashMap0.put(((dmma)object2).b.d, object2);
                }
                azts azts0 = this.a;
                dyfx dyfx0 = dyfw.a(((ProtoLiteMessage)dyfv.a).v_newBuilder());
                String s = account0.name;
                ibuq.e(s, "name");
                dyfx0.b(s);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dyjn.a).v_newBuilder();
                ibuq.f(hftp0, "builder");
                List list1 = DesugarCollections.unmodifiableList(((dyjn)hftp0.b_message).b);
                ibuq.e(list1, "getCardIdsList(...)");
                new hfxu(list1);
                Set set0 = linkedHashMap0.keySet();
                ibuq.f(set0, "values");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                dyjn dyjn0 = (dyjn)hftp0.b_message;
                hfuo hfuo0 = dyjn0.b;
                if(!hfuo0.c()) {
                    dyjn0.b = ProtoLiteMessage.E(hfuo0);
                }
                hfrj.E(set0, dyjn0.b);
                ProtoLiteMessage hftv0 = hftp0.N_build();
                ibuq.e(hftv0, "build(...)");
                ibuq.f(((dyjn)hftv0), "value");
                ProtoLiteBuilder hftp1 = dyfx0.a;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                dyfv dyfv0 = (dyfv)hftp1.b_message;
                ((dyjn)hftv0).getClass();
                dyfv0.c = (dyjn)hftv0;
                dyfv0.b = 21;
                evql evql0 = azts0.ba(dyfx0.a().toBytesArray());
                Duration duration0 = Duration.ofSeconds(60L);
                ibuq.e(duration0, "ofSeconds(...)");
                dmps0.a = list0;
                dmps0.b = linkedHashMap0;
                dmps0.e = 1;
                object3 = fsdk.b(evql0, duration0, dmps0);
                if(object3 != object1) {
                    object4 = linkedHashMap0;
                    break;
                }
                return object1;
            }
            case 1: {
                object4 = dmps0.b;
                list0 = dmps0.a;
                ibnx.b(object0);
                object3 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if((object3 instanceof ibnv)) {
            object3 = null;
        }
        if(((byte[])object3) == null) {
            return dmlr.a(list0);
        }
        hftc hftc0 = hftc.a();
        ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dyfy.a), ((byte[])object3), 0, ((byte[])object3).length, hftc0);
        ProtoLiteMessage.P_makeImmutable(hftv1);
        dyjo dyjo0 = ((dyfy)hftv1).b == 20 ? ((dyjo)((dyfy)hftv1).c) : dyjo.a;
        ibuq.e(dyjo0, "getParkOctopusCardsResponse(...)");
        hfuo hfuo1 = dyjo0.b;
        ibuq.e(hfuo1, "getSuccessCardIdsList(...)");
        ArrayList arrayList0 = new ArrayList(ibpo.q(hfuo1, 10));
        for(Object object5: hfuo1) {
            Object object6 = ((Map)object4).get(((String)object5));
            if(object6 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            arrayList0.add(((dmma)object6));
            continue;
        }
        hfuo hfuo2 = dyjo0.c;
        ibuq.e(hfuo2, "getFailureCardIdsList(...)");
        ArrayList arrayList1 = new ArrayList(ibpo.q(hfuo2, 10));
        for(Object object7: hfuo2) {
            Object object8 = ((Map)object4).get(((String)object7));
            if(object8 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            arrayList1.add(((dmma)object8));
            continue;
        }
        return new dmls(arrayList0, arrayList1);
    }
}

