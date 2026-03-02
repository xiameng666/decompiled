import android.accounts.Account;
import com.google.android.gms.pay.GetSeMfiPrepaidCardsRequest;
import com.google.android.gms.pay.ProtoSafeParcelable;
import j..time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class dmpp {
    private final azts a;

    public dmpp(azts azts0) {
        this.a = azts0;
    }

    public final Object a(Account[] arr_account, ibrl ibrl0) {
        Object object2;
        dmpk dmpk0;
        if((ibrl0 instanceof dmpk)) {
            dmpk0 = (dmpk)ibrl0;
            int v = dmpk0.e;
            if((v & 0x80000000) == 0) {
                dmpk0 = new dmpk(this, ibrl0);
            }
            else {
                dmpk0.e = v - 0x80000000;
            }
        }
        else {
            dmpk0 = new dmpk(this, ibrl0);
        }
        Object object0 = dmpk0.c;
        Object object1 = ibrx.a;
        switch(dmpk0.e) {
            case 0: {
                ibnx.b(object0);
                object2 = ibpg.T(arr_account).a();
                goto label_20;
            }
            case 1: {
                Object object3 = dmpk0.b;
                object2 = dmpk0.a;
                ibnx.b(object0);
                while(!((Boolean)object0).booleanValue()) {
                label_20:
                    if(((Iterator)object2).hasNext()) {
                        object3 = ((Iterator)object2).next();
                        dmpk0.a = object2;
                        dmpk0.b = object3;
                        dmpk0.e = 1;
                        object0 = this.d(((Account)object3), dmpk0);
                        if(object0 != object1) {
                            continue;
                        }
                        return object1;
                    }
                    object3 = null;
                    break;
                }
                if(((Account)object3) == null) {
                    return ibps.a;
                }
                dmpk0.a = null;
                dmpk0.b = null;
                dmpk0.e = 2;
                Object object4 = this.b(((Account)object3), dmpk0);
                return object4 == object1 ? object1 : object4;
            }
            case 2: {
                ibnx.b(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object b(Account account0, ibrl ibrl0) {
        Object object6;
        Object object5;
        Object object4;
        Object object3;
        Object object2;
        dmpl dmpl0;
        if((ibrl0 instanceof dmpl)) {
            dmpl0 = (dmpl)ibrl0;
            int v = dmpl0.g;
            if((v & 0x80000000) == 0) {
                dmpl0 = new dmpl(this, ibrl0);
            }
            else {
                dmpl0.g = v - 0x80000000;
            }
        }
        else {
            dmpl0 = new dmpl(this, ibrl0);
        }
        Object object0 = dmpl0.e;
        Object object1 = ibrx.a;
        switch(dmpl0.g) {
            case 0: {
                ibnx.b(object0);
                ibuq.e(dylv.c, "MFI_SERVICE_PROVIDERS");
                object2 = account0;
                object3 = new ArrayList(ibpo.q(dylv.c, 10));
                object4 = dylv.c.iterator();
                goto label_27;
            }
            case 1: {
                object3 = dmpl0.d;
                object4 = dmpl0.c;
                object5 = dmpl0.b;
                object6 = dmpl0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            ((Collection)object3).add(((List)object0));
            object3 = object5;
            object2 = object6;
        label_27:
            if(!((Iterator)object4).hasNext()) {
                break;
            }
            Object object7 = ((Iterator)object4).next();
            ibuq.c(((dyna)object7));
            dmpl0.a = object2;
            dmpl0.b = object3;
            dmpl0.c = object4;
            dmpl0.d = object3;
            dmpl0.g = 1;
            Object object8 = this.c(((Account)object2), ((dyna)object7), dmpl0);
            if(object8 != object1) {
                object6 = object2;
                object0 = object8;
                object5 = object3;
                continue;
            }
            return object1;
        }
        return ibpo.r(((Iterable)object3));
    }

    public final Object c(Account account0, dyna dyna0, ibrl ibrl0) {
        Object object2;
        dmpm dmpm0;
        if((ibrl0 instanceof dmpm)) {
            dmpm0 = (dmpm)ibrl0;
            int v = dmpm0.d;
            if((v & 0x80000000) == 0) {
                dmpm0 = new dmpm(this, ibrl0);
            }
            else {
                dmpm0.d = v - 0x80000000;
            }
        }
        else {
            dmpm0 = new dmpm(this, ibrl0);
        }
        Object object0 = dmpm0.b;
        Object object1 = ibrx.a;
        switch(dmpm0.d) {
            case 0: {
                ibnx.b(object0);
                GetSeMfiPrepaidCardsRequest getSeMfiPrepaidCardsRequest0 = new GetSeMfiPrepaidCardsRequest();
                getSeMfiPrepaidCardsRequest0.a = account0;
                getSeMfiPrepaidCardsRequest0.c = dypl.a(dyna0);
                getSeMfiPrepaidCardsRequest0.b = 1;
                getSeMfiPrepaidCardsRequest0.f = 1;
                evql evql0 = this.a.aM(getSeMfiPrepaidCardsRequest0);
                Duration duration0 = Duration.ofSeconds(60L);
                ibuq.e(duration0, "ofSeconds(...)");
                dmpm0.a = account0;
                dmpm0.d = 1;
                object2 = fsdk.b(evql0, duration0, dmpm0);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                account0 = dmpm0.a;
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
        if(((ProtoSafeParcelable)object2) == null) {
            return ibps.a;
        }
        ibuq.e(dyhf.a, "getDefaultInstance(...)");
        hfuo hfuo0 = ((dyhf)ftqe.d(((ProtoSafeParcelable)object2), ((MessageLite)dyhf.a))).b;
        ibuq.e(hfuo0, "getIndividualSeMfiPrepaidCardResponseList(...)");
        ArrayList arrayList0 = new ArrayList();
        for(Object object3: hfuo0) {
            dykv dykv0 = ((dyhj)object3).c;
            if(dykv0 == null) {
                dykv0 = dykv.a;
            }
            if(dyic.b((dykv0.d == null ? dyib.a : dykv0.d))) {
                arrayList0.add(object3);
            }
        }
        Object object4 = new ArrayList(ibpo.q(arrayList0, 10));
        for(Object object5: arrayList0) {
            dykv dykv1 = ((dyhj)object5).c;
            if(dykv1 == null) {
                dykv1 = dykv.a;
            }
            dylc dylc0 = dykv1.c == null ? dylc.a : dykv1.c;
            ibuq.e(dylc0, "getSePrepaidCardData(...)");
            ((Collection)object4).add(new dmma(account0, dylc0));
        }
        return object4;
    }

    public final Object d(Account account0, ibrl ibrl0) {
        Object object2;
        dmpn dmpn0;
        if((ibrl0 instanceof dmpn)) {
            dmpn0 = (dmpn)ibrl0;
            int v = dmpn0.c;
            if((v & 0x80000000) == 0) {
                dmpn0 = new dmpn(this, ibrl0);
            }
            else {
                dmpn0.c = v - 0x80000000;
            }
        }
        else {
            dmpn0 = new dmpn(this, ibrl0);
        }
        Object object0 = dmpn0.a;
        Object object1 = ibrx.a;
        switch(dmpn0.c) {
            case 0: {
                ibnx.b(object0);
                azts azts0 = this.a;
                dyfx dyfx0 = dyfw.a(((ProtoLiteMessage)dyfv.a).v_newBuilder());
                String s = account0.name;
                ibuq.e(s, "name");
                dyfx0.b(s);
                hfsw hfsw0 = hfsw.a;
                ibuq.e(hfsw0, "getDefaultInstance(...)");
                ibuq.f(hfsw0, "value");
                ProtoLiteBuilder hftp0 = dyfx0.a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                dyfv dyfv0 = (dyfv)hftp0.b_message;
                hfsw0.getClass();
                dyfv0.c = hfsw0;
                dyfv0.b = 19;
                evql evql0 = azts0.ba(dyfx0.a().toBytesArray());
                Duration duration0 = Duration.ofSeconds(60L);
                ibuq.e(duration0, "ofSeconds(...)");
                dmpn0.c = 1;
                object2 = fsdk.b(evql0, duration0, dmpn0);
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
            object2 = null;
        }
        boolean z = false;
        if(((byte[])object2) == null) {
            return Boolean.valueOf(false);
        }
        hftc hftc0 = hftc.a();
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dyfy.a), ((byte[])object2), 0, ((byte[])object2).length, hftc0);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        if(((dyfy)hftv0).b == 18) {
            z = ((Boolean)((dyfy)hftv0).c).booleanValue();
        }
        return Boolean.valueOf(z);
    }

    public final Object e(List list0, ibrl ibrl0) {
        Object object5;
        Object object4;
        dmpo dmpo0;
        if((ibrl0 instanceof dmpo)) {
            dmpo0 = (dmpo)ibrl0;
            int v = dmpo0.e;
            if((v & 0x80000000) == 0) {
                dmpo0 = new dmpo(this, ibrl0);
            }
            else {
                dmpo0.e = v - 0x80000000;
            }
        }
        else {
            dmpo0 = new dmpo(this, ibrl0);
        }
        Object object0 = dmpo0.c;
        Object object1 = ibrx.a;
        switch(dmpo0.e) {
            case 0: {
                ibnx.b(object0);
                Account account0 = ((dmma)ibpo.R(list0)).a;
                LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(list0, 10)), 16));
                for(Object object2: list0) {
                    dyih dyih0 = ((dmma)object2).b.i;
                    if(dyih0 == null) {
                        dyih0 = dyih.a;
                    }
                    linkedHashMap0.put(dyih0.c, object2);
                }
                ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
                for(Object object3: list0) {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dyey.a).v_newBuilder();
                    dylc dylc0 = ((dmma)object3).b;
                    dyna dyna0 = dyna.b(dylc0.c) == null ? dyna.k : dyna.b(dylc0.c);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dyey dyey0 = (dyey)hftp0.b_message;
                    dyey0.b = dyna0.a();
                    String s = (dylc0.i == null ? dyih.a : dylc0.i).c;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dyey dyey1 = (dyey)hftp0.b_message;
                    s.getClass();
                    dyey1.c = s;
                    arrayList0.add(((dyey)hftp0.N_build()));
                }
                azts azts0 = this.a;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)dyfv.a).v_newBuilder();
                String s1 = account0.name;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                dyfv dyfv0 = (dyfv)hftp1.b_message;
                s1.getClass();
                dyfv0.d = s1;
                dyoa dyoa0 = (dyoa)((ProtoLiteMessage)dyoc.a).v_newBuilder();
                if(!dyoa0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)dyoa0).ensureMutable();
                }
                dyoc.c(((dyoc)dyoa0.b_message));
                dyoa0.a(arrayList0);
                dyob dyob0 = dyob.e;
                if(!dyoa0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)dyoa0).ensureMutable();
                }
                dyoc dyoc0 = (dyoc)dyoa0.b_message;
                dyoc0.d = dyob0.a();
                dyoc dyoc1 = (dyoc)((ProtoLiteBuilder)dyoa0).N_build();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                dyfv dyfv1 = (dyfv)hftp1.b_message;
                dyoc1.getClass();
                dyfv1.c = dyoc1;
                dyfv1.b = 2;
                evql evql0 = azts0.ba(((dyfv)hftp1.N_build()).toBytesArray());
                Duration duration0 = Duration.ofSeconds(60L);
                ibuq.e(duration0, "ofSeconds(...)");
                dmpo0.a = list0;
                dmpo0.b = linkedHashMap0;
                dmpo0.e = 1;
                object4 = fsdk.b(evql0, duration0, dmpo0);
                if(object4 != object1) {
                    object5 = linkedHashMap0;
                    break;
                }
                return object1;
            }
            case 1: {
                object5 = dmpo0.b;
                list0 = dmpo0.a;
                ibnx.b(object0);
                object4 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if((object4 instanceof ibnv)) {
            object4 = null;
        }
        if(((byte[])object4) == null) {
            return dmlr.a(list0);
        }
        hftc hftc0 = hftc.a();
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dyfy.a), ((byte[])object4), 0, ((byte[])object4).length, hftc0);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        hfuo hfuo0 = (((dyfy)hftv0).b == 1 ? ((dyoi)((dyfy)hftv0).c) : dyoi.a).b;
        ibuq.e(hfuo0, "getCardUploadResultsList(...)");
        LinkedHashMap linkedHashMap1 = new LinkedHashMap();
        for(Object object6: hfuo0) {
            int v1 = ((dyoh)object6).c;
            Boolean boolean0 = Boolean.valueOf((dyog.b(v1) == null ? dyog.h : dyog.b(v1)) == dyog.b || (dyog.b(v1) == null ? dyog.h : dyog.b(v1)) == dyog.g);
            Object object7 = linkedHashMap1.get(boolean0);
            if(object7 == null) {
                object7 = new ArrayList();
                linkedHashMap1.put(boolean0, object7);
            }
            Object object8 = ((Map)object5).get(((dyoh)object6).b);
            if(object8 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ((List)object7).add(((dmma)object8));
            continue;
        }
        return dmlr.b(linkedHashMap1);
    }
}

