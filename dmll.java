import android.accounts.Account;
import android.content.Context;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class dmll {
    private final String a;
    private final ibrt b;
    private final Context c;

    public dmll(String s, ibrt ibrt0, Context context0) {
        this.a = s;
        this.b = ibrt0;
        this.c = context0;
    }

    static Object a(dmll dmll0, long v, String s, String s1, fsww fsww0, hkke hkke0, Account account0, ibrl ibrl0) {
        dmlh dmlh0;
        if((ibrl0 instanceof dmlh)) {
            dmlh0 = (dmlh)ibrl0;
            int v1 = dmlh0.d;
            if((v1 & 0x80000000) == 0) {
                dmlh0 = new dmlh(dmll0, ibrl0);
            }
            else {
                dmlh0.d = v1 - 0x80000000;
            }
        }
        else {
            dmlh0 = new dmlh(dmll0, ibrl0);
        }
        Object object0 = dmlh0.b;
        Object object1 = ibrx.a;
        switch(dmlh0.d) {
            case 0: {
                ibnx.b(object0);
                dmlh0.e = s;
                dmlh0.f = s1;
                dmlh0.g = fsww0;
                dmlh0.h = hkke0;
                dmlh0.a = v;
                dmlh0.d = 1;
                object0 = dmll0.b(account0, dmlh0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                v = dmlh0.a;
                hkke0 = dmlh0.h;
                fsww0 = dmlh0.g;
                s1 = dmlh0.f;
                s = dmlh0.e;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        dpuj dpuj0 = dpuj.bq;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkkf.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        hkkm hkkm0 = hkkl.a(((ProtoLiteMessage)hkkk.a).v_newBuilder());
        hkkm0.b(v);
        hkkk hkkk0 = hkkm0.a();
        ibuq.f(hkkk0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkkf hkkf0 = (hkkf)hftp0.b_message;
        hkkk0.getClass();
        hkkf0.g = hkkk0;
        hkkf0.b |= 2;
        ibuq.f(s, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkkf hkkf1 = (hkkf)hftp0.b_message;
        s.getClass();
        hkkf1.c = s;
        ibuq.f(s1, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkkf hkkf2 = (hkkf)hftp0.b_message;
        s1.getClass();
        hkkf2.d = s1;
        List list0 = DesugarCollections.unmodifiableList(hkkf2.e);
        ibuq.e(list0, "getPersoResultCommandsList(...)");
        new hfxu(list0);
        hfuo hfuo0 = fsww0.e;
        ibuq.e(hfuo0, "getApduCommandsList(...)");
        ArrayList arrayList0 = new ArrayList(ibpo.q(hfuo0, 10));
        for(Object object2: hfuo0) {
            Object object3 = dmlg.a.kt(((fswu)object2));
            if(object3 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            arrayList0.add(((hkkh)object3));
            continue;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkkf hkkf3 = (hkkf)hftp0.b_message;
        hfuo hfuo1 = hkkf3.e;
        if(!hfuo1.c()) {
            hkkf3.e = ProtoLiteMessage.E(hfuo1);
        }
        hfrj.E(arrayList0, hkkf3.e);
        ibuq.f(hkke0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkkf hkkf4 = (hkkf)hftp0.b_message;
        hkkf4.f = hkke0.a();
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hkkg.a).v_newBuilder();
        ibuq.f(hftp1, "builder");
        ProtoLiteMessage hftv1 = hftp1.N_build();
        ibuq.e(hftv1, "build(...)");
        Object object4 = dptv.e(((dmhi)object0), dpuj0, ((MessageLite)(((hkkf)hftv0))), ((MessageLite)(((hkkg)hftv1))));
        ibuq.e(object4, "blockingCall(...)");
        return object4;
    }

    public final Object b(Account account0, ibrl ibrl0) {
        dmli dmli0;
        if((ibrl0 instanceof dmli)) {
            dmli0 = (dmli)ibrl0;
            int v = dmli0.d;
            if((v & 0x80000000) == 0) {
                dmli0 = new dmli(this, ibrl0);
            }
            else {
                dmli0.d = v - 0x80000000;
            }
        }
        else {
            dmli0 = new dmli(this, ibrl0);
        }
        Object object0 = dmli0.b;
        Object object1 = ibrx.a;
        switch(dmli0.d) {
            case 0: {
                ibnx.b(object0);
                dmli0.a = account0;
                dmli0.d = 1;
                dmlk dmlk0 = new dmlk(this.c, account0, null);
                object0 = icbd.a(this.b, dmlk0, dmli0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                account0 = dmli0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((String)object0) != null) {
            return new dmhi(((String)object0), account0.name, this.a, this.c);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    static Object c(dmll dmll0, long v, String s, String s1, Account account0, ibrl ibrl0) {
        dmlj dmlj0;
        if((ibrl0 instanceof dmlj)) {
            dmlj0 = (dmlj)ibrl0;
            int v1 = dmlj0.d;
            if((v1 & 0x80000000) == 0) {
                dmlj0 = new dmlj(dmll0, ibrl0);
            }
            else {
                dmlj0.d = v1 - 0x80000000;
            }
        }
        else {
            dmlj0 = new dmlj(dmll0, ibrl0);
        }
        Object object0 = dmlj0.b;
        Object object1 = ibrx.a;
        switch(dmlj0.d) {
            case 0: {
                ibnx.b(object0);
                dmlj0.e = s;
                dmlj0.f = s1;
                dmlj0.a = v;
                dmlj0.d = 1;
                object0 = dmll0.b(account0, dmlj0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                v = dmlj0.a;
                s1 = dmlj0.f;
                s = dmlj0.e;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        dpuj dpuj0 = dpuj.bp;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkki.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        hkkm hkkm0 = hkkl.a(((ProtoLiteMessage)hkkk.a).v_newBuilder());
        hkkm0.b(v);
        hkkk hkkk0 = hkkm0.a();
        ibuq.f(hkkk0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkki hkki0 = (hkki)hftp0.b_message;
        hkkk0.getClass();
        hkki0.e = hkkk0;
        hkki0.b |= 1;
        ibuq.f(s, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkki hkki1 = (hkki)hftp0.b_message;
        s.getClass();
        hkki1.c = s;
        ibuq.f(s1, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkki hkki2 = (hkki)hftp0.b_message;
        s1.getClass();
        hkki2.d = s1;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hkkj.a).v_newBuilder();
        ibuq.f(hftp1, "builder");
        ProtoLiteMessage hftv1 = hftp1.N_build();
        ibuq.e(hftv1, "build(...)");
        Object object2 = dptv.e(((dmhi)object0), dpuj0, ((MessageLite)(((hkki)hftv0))), ((MessageLite)(((hkkj)hftv1))));
        ibuq.e(object2, "blockingCall(...)");
        return object2;
    }
}

