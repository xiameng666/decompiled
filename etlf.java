import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.SupervisedUserInfo;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class etlf extends lsb {
    public final frxj a;
    public final frxn b;
    public final ibrt c;
    public final PushTokenizeRequest d;
    public final etih e;
    public final bboh f;
    public List g;
    public final List h;
    public boolean i;
    public etli j;
    public final lqi k;
    public AccountInfo l;
    public esgi m;
    public final lqi n;
    private final fced o;
    private final fcfe p;
    private final PackageManager q;
    private final Application r;
    private final String s;
    private final bbic t;
    private final Map u;
    private final Map v;
    private final azts w;

    public etlf(etho etho0, fced fced0, fcfe fcfe0, ibrt ibrt0, azts azts0, AccountInfo accountInfo0, PushTokenizeRequest pushTokenizeRequest0, esgi esgi0, etih etih0, PackageManager packageManager0, Application application0, String s) {
        ibuq.f(etho0, "devicesFrontendService");
        ibuq.f(fced0, "capabilityClient");
        ibuq.f(fcfe0, "messageClient");
        ibuq.f(ibrt0, "coroutineContext");
        ibuq.f(azts0, "firstPartyPayClient");
        ibuq.f(accountInfo0, "accountInfo");
        ibuq.f(esgi0, "requestContext");
        ibuq.f(packageManager0, "packageManager");
        ibuq.f(application0, "context");
        ibuq.f(s, "callingPackage");
        super();
        this.a = new frxj(new etks(null));
        this.b = new frxn();
        this.o = fced0;
        this.p = fcfe0;
        this.c = ibrt0;
        this.w = azts0;
        this.d = pushTokenizeRequest0;
        this.e = etih0;
        this.q = packageManager0;
        this.r = application0;
        this.s = s;
        this.f = bboh.b("TapAndPay", bbcu.aM);
        this.h = new ArrayList();
        this.t = bbic.a();
        this.u = new LinkedHashMap();
        this.v = new LinkedHashMap();
        this.k = new lqi(null);
        this.l = accountInfo0;
        this.m = esgi0;
        this.n = new lqi(Boolean.valueOf(false));
        this.j();
    }

    public final etks a() {
        return (etks)this.a.a();
    }

    public final Object b(String s, Intent intent0, ibrl ibrl0) {
        etku etku0;
        if((ibrl0 instanceof etku)) {
            etku0 = (etku)ibrl0;
            int v = etku0.c;
            if((v & 0x80000000) == 0) {
                etku0 = new etku(this, ibrl0);
            }
            else {
                etku0.c = v - 0x80000000;
            }
        }
        else {
            etku0 = new etku(this, ibrl0);
        }
        Object object0 = etku0.a;
        Object object1 = ibrx.a;
        switch(etku0.c) {
            case 0: {
                ibnx.b(object0);
                ((ggtj)this.f.h()).x("Checking Wallet Availability with BoundService");
                evqp evqp0 = new evqp();
                etkv etkv0 = new etkv(this, s, evqp0);
                try {
                    if(!this.t.d(this.r, intent0, etkv0, 1)) {
                        evqp0.a(new IOException("Unable to bind to GeneratePaymentCredentialsService to check wallet availability"));
                    }
                }
                catch(SecurityException securityException0) {
                    evqp0.a(securityException0);
                }
                evql evql0 = evrg.m(evqp0.a, 10L, TimeUnit.SECONDS);
                etku0.c = 1;
                object0 = ictn.b(evql0, etku0);
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
        ibuq.e(object0, "await(...)");
        return object0;
    }

    public final Object c(String s, ibrl ibrl0) {
        etkx etkx0;
        if((ibrl0 instanceof etkx)) {
            etkx0 = (etkx)ibrl0;
            int v = etkx0.c;
            if((v & 0x80000000) == 0) {
                etkx0 = new etkx(this, ibrl0);
            }
            else {
                etkx0.c = v - 0x80000000;
            }
        }
        else {
            etkx0 = new etkx(this, ibrl0);
        }
        Object object0 = etkx0.a;
        Object object1 = ibrx.a;
        switch(etkx0.c) {
            case 0: {
                ibnx.b(object0);
                if(!this.d.b(1) || s.length() == 0) {
                    return Boolean.valueOf(true);
                }
                Intent intent0 = new Intent().setClassName(this.s, "com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsService");
                ibuq.e(intent0, "setClassName(...)");
                if(etkt.a(intent0, this.q)) {
                    etkx0.c = 1;
                    Object object2 = this.b(s, intent0, etkx0);
                    return object2 == object1 ? object1 : object2;
                }
                ((ggtj)this.f.h()).x("Checking Wallet Availability without BoundService");
                evqp evqp0 = new evqp();
                try {
                    etif etif0 = new etif(this.e, evqp0);
                    this.e.a.b(s, etif0);
                }
                catch(RemoteException remoteException0) {
                    evqp0.d(remoteException0);
                }
                evql evql0 = evrg.m(evqp0.a, 10L, TimeUnit.SECONDS);
                etkx0.c = 2;
                object0 = ictn.b(evql0, etkx0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                return object0;
            }
            case 2: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.e(object0, "await(...)");
        return object0;
    }

    public final Object e(String s, ftmi ftmi0, ibrl ibrl0) {
        etkz etkz0;
        if((ibrl0 instanceof etkz)) {
            etkz0 = (etkz)ibrl0;
            int v = etkz0.c;
            if((v & 0x80000000) == 0) {
                etkz0 = new etkz(this, ibrl0);
            }
            else {
                etkz0.c = v - 0x80000000;
            }
        }
        else {
            etkz0 = new etkz(this, ibrl0);
        }
        Object object0 = etkz0.a;
        Object object1 = ibrx.a;
        switch(etkz0.c) {
            case 0: {
                ibnx.b(object0);
                byte[] arr_b = ftmi0.toBytesArray();
                evql evql0 = evrg.m(this.p.i(s, "/tapandpay/proxy/v2", arr_b), 10L, TimeUnit.SECONDS);
                etkz0.c = 1;
                object0 = ictn.b(evql0, etkz0);
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
        hftc hftc0 = hftc.a();
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ftok.a), ((byte[])object0), 0, ((byte[])object0).length, hftc0);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        ibuq.e(((ftok)hftv0), "parseFrom(...)");
        return (ftok)hftv0;
    }

    public final Object f(ibrl ibrl0) {
        etla etla0;
        if((ibrl0 instanceof etla)) {
            etla0 = (etla)ibrl0;
            int v = etla0.c;
            if((v & 0x80000000) == 0) {
                etla0 = new etla(this, ibrl0);
            }
            else {
                etla0.c = v - 0x80000000;
            }
        }
        else {
            etla0 = new etla(this, ibrl0);
        }
        Object object0 = etla0.a;
        Object object1 = ibrx.a;
        switch(etla0.c) {
            case 0: {
                ibnx.b(object0);
                this.i = true;
                List list0 = this.h;
                list0.clear();
                SupervisedUserInfo supervisedUserInfo0 = this.d.k;
                if(supervisedUserInfo0 != null && supervisedUserInfo0.c) {
                    List list1 = this.g;
                    if(list1 == null) {
                        ibuq.j("devicesForGaia");
                        list1 = null;
                    }
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object2: list1) {
                        if((((hjxg)object2).b & 0x100) != 0) {
                            arrayList0.add(object2);
                        }
                    }
                    for(Object object3: arrayList0) {
                        list0.add(new etli(((hjxg)object3), null, null, true));
                    }
                }
                else {
                    etli etli0 = this.j;
                    if(etli0 == null) {
                        ibuq.j("currentPhoneTapAndPayDevice");
                        etli0 = null;
                    }
                    list0.add(etli0);
                    if(hyus.g()) {
                        etla0.c = 1;
                        if(this.h(etla0) == object1) {
                            return object1;
                        }
                    }
                    goto label_46;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
            label_46:
                etla0.c = 2;
                if(this.i(etla0) == object1) {
                    return object1;
                }
                goto label_50;
            }
            case 2: {
                ibnx.b(object0);
            label_50:
                etla0.c = 3;
                if(this.g(etla0) == object1) {
                    return object1;
                }
                break;
            }
            case 3: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.l(etks.a(this.a(), true, false, null, null, 14));
        this.i = false;
        icck icck0 = lsc.a(this);
        etlb etlb0 = new etlb(this, null);
        icbb.b(icck0, cclw.e, null, etlb0, 2);
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for(Object object4: this.h) {
            etli etli1 = (etli)object4;
            if(etlf.p(etli1)) {
                arrayList1.add(etli1);
            }
            else {
                arrayList2.add(etli1);
            }
        }
        this.l(etks.a(this.a(), false, false, ethj.a(ggdx.a(arrayList1)), ethj.a(ggdx.a(arrayList2)), 3));
        return ibom.a;
    }

    public final Object g(ibrl ibrl0) {
        NodeParcelable nodeParcelable0;
        hjxg hjxg0;
        dpfi dpfi0;
        Object object2;
        etlc etlc0;
        if((ibrl0 instanceof etlc)) {
            etlc0 = (etlc)ibrl0;
            int v = etlc0.e;
            if((v & 0x80000000) == 0) {
                etlc0 = new etlc(this, ibrl0);
            }
            else {
                etlc0.e = v - 0x80000000;
            }
        }
        else {
            etlc0 = new etlc(this, ibrl0);
        }
        Object object0 = etlc0.c;
        Object object1 = ibrx.a;
        switch(etlc0.e) {
            case 0: {
                ibnx.b(object0);
                List list0 = this.g;
                if(list0 == null) {
                    ibuq.j("devicesForGaia");
                    list0 = null;
                }
                object2 = list0.iterator();
                goto label_30;
            }
            case 1: {
                dpfi0 = (dpfi)etlc0.b;
                hjxg0 = etlc0.f;
                object2 = etlc0.a;
                ibnx.b(object0);
                goto label_44;
            }
            case 2: {
                nodeParcelable0 = (NodeParcelable)etlc0.b;
                hjxg0 = etlc0.f;
                object2 = etlc0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            this.h.add(new etli(hjxg0, nodeParcelable0, null, ((Boolean)object0).booleanValue()));
            while(true) {
            label_30:
                if(!((Iterator)object2).hasNext()) {
                    break alab1;
                }
                Object object3 = ((Iterator)object2).next();
                hjxg0 = (hjxg)object3;
                dpfi0 = (dpfi)this.u.get(new Long(hjxg0.c));
                NodeParcelable nodeParcelable1 = (NodeParcelable)this.v.get(new Long(hjxg0.c));
                if(dpfi0 != null) {
                    String s = hjxg0.d;
                    ibuq.e(s, "getPublicWalletId(...)");
                    etlc0.a = object2;
                    etlc0.f = hjxg0;
                    etlc0.b = dpfi0;
                    etlc0.e = 1;
                    object0 = this.c(s, etlc0);
                    if(object0 == object1) {
                        return object1;
                    }
                label_44:
                    this.h.add(new etli(hjxg0, null, dpfi0, ((Boolean)object0).booleanValue()));
                    continue;
                }
                if(nodeParcelable1 == null) {
                    continue;
                }
                String s1 = hjxg0.d;
                ibuq.e(s1, "getPublicWalletId(...)");
                etlc0.a = object2;
                etlc0.f = hjxg0;
                etlc0.b = nodeParcelable1;
                etlc0.e = 2;
                Object object4 = this.c(s1, etlc0);
                if(object4 != object1) {
                    nodeParcelable0 = nodeParcelable1;
                    object0 = object4;
                    break;
                }
                return object1;
            }
        }
        return ibom.a;
    }

    public final Object h(ibrl ibrl0) {
        hjxg hjxg0;
        dpfi dpfi0;
        Object object3;
        Object object2;
        etld etld0;
        if((ibrl0 instanceof etld)) {
            etld0 = (etld)ibrl0;
            int v = etld0.d;
            if((v & 0x80000000) == 0) {
                etld0 = new etld(this, ibrl0);
            }
            else {
                etld0.d = v - 0x80000000;
            }
        }
        else {
            etld0 = new etld(this, ibrl0);
        }
        Object object0 = etld0.b;
        Object object1 = ibrx.a;
        switch(etld0.d) {
            case 0: {
                ibnx.b(object0);
                eutd eutd0 = new eutd(this.w, null, this.l, 0L);
                ProtoLiteBuilder hftp0 = eutd0.e();
                hfsw hfsw0 = hfsw.a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                dpfb dpfb0 = (dpfb)hftp0.b_message;
                hfsw0.getClass();
                dpfb0.c = hfsw0;
                dpfb0.b = 28;
                evql evql0 = eutd0.f(hftp0, new euss());
                etld0.d = 1;
                object2 = fsdk.a(evql0, etld0);
                if(object2 == object1) {
                    return object1;
                }
                goto label_30;
            }
            case 1: {
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
            label_30:
                if(!ibnw.b(object2)) {
                    ((ggtj)this.f.j()).x("Unable to get devices from Fitbit companion app");
                }
                ibps ibps0 = ibps.a;
                if((object2 instanceof ibnv)) {
                    object2 = ibps0;
                }
                object3 = ((List)object2).iterator();
                goto label_42;
            }
            case 2: {
                dpfi0 = etld0.f;
                hjxg0 = etld0.e;
                object3 = etld0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            this.h.add(new etli(hjxg0, null, dpfi0, ((Boolean)object0).booleanValue()));
            while(true) {
            label_42:
                if(!((Iterator)object3).hasNext()) {
                    return ibom.a;
                }
                Object object4 = ((Iterator)object3).next();
                dpfi0 = (dpfi)object4;
                if(!dpfi0.h) {
                    continue;
                }
                long v1 = dpfi0.j;
                if(v1 != 0L) {
                    this.u.put(new Long(v1), dpfi0);
                    continue;
                }
                hjxj hjxj0 = hjxi.a(((ProtoLiteMessage)hjxg.a).v_newBuilder());
                hjxj0.b(0L);
                String s = dpfi0.b;
                ibuq.e(s, "getName(...)");
                hjxj0.e(s);
                hjxj0.d(gtmv.d);
                hjxj0.c(gtmu.c);
                hjxj0.g();
                hjxj0.f(false);
                hjxg0 = hjxj0.a();
                String s1 = dpfi0.k;
                ibuq.e(s1, "getWalletId(...)");
                etld0.a = object3;
                etld0.e = hjxg0;
                etld0.f = dpfi0;
                etld0.d = 2;
                object0 = this.c(s1, etld0);
                if(object0 != object1) {
                    break;
                }
                break alab1;
            }
        }
        return object1;
    }

    public final Object i(ibrl ibrl0) {
        hjxg hjxg1;
        NodeParcelable nodeParcelable1;
        NodeParcelable nodeParcelable0;
        ibvc ibvc0;
        ibvd ibvd1;
        ibvd ibvd0;
        Object object3;
        Set set0;
        Object object2;
        etle etle0;
        if((ibrl0 instanceof etle)) {
            etle0 = (etle)ibrl0;
            int v = etle0.f;
            if((v & 0x80000000) == 0) {
                etle0 = new etle(this, ibrl0);
            }
            else {
                etle0.f = v - 0x80000000;
            }
        }
        else {
            etle0 = new etle(this, ibrl0);
        }
        Object object0 = etle0.d;
        Object object1 = ibrx.a;
        switch(etle0.f) {
            case 0: {
                ibnx.b(object0);
                evql evql0 = this.o.g("com.google.android.location.fused.wearable.LOCATION_REQUESTOR_CAPABILITY", 0);
                etle0.f = 1;
                object2 = fsdk.a(evql0, etle0);
                if(object2 == object1) {
                    return object1;
                }
                goto label_21;
            }
            case 1: {
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
            label_21:
                if((object2 instanceof ibnv)) {
                    object2 = null;
                }
                if(((fcee)object2) == null) {
                    set0 = ibpu.a;
                }
                else {
                    set0 = ((fcee)object2).b();
                    if(set0 == null) {
                        set0 = ibpu.a;
                    }
                }
                object3 = set0.iterator();
                goto label_45;
            }
            case 2: {
                ibvd0 = etle0.h;
                ibvd1 = etle0.g;
                ibvc0 = (ibvc)etle0.c;
                nodeParcelable0 = (NodeParcelable)etle0.b;
                object3 = etle0.a;
                ibnx.b(object0);
                goto label_78;
            }
            case 3: {
                nodeParcelable1 = (NodeParcelable)etle0.c;
                hjxg hjxg0 = (hjxg)etle0.b;
                Object object4 = etle0.a;
                ibnx.b(object0);
                hjxg1 = hjxg0;
                object3 = object4;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            this.h.add(new etli(hjxg1, nodeParcelable1, null, ((Boolean)object0).booleanValue()));
        alab2:
            while(true) {
            label_45:
                if(!((Iterator)object3).hasNext()) {
                    return ibom.a;
                }
                Object object5 = ((Iterator)object3).next();
                nodeParcelable0 = (NodeParcelable)object5;
                ibvc0 = new ibvc();
                ibvd1 = new ibvd();
                ibvd1.a = "";
                ibvd0 = new ibvd();
                ibvd0.a = "";
                if(nodeParcelable0.d) {
                    String s = nodeParcelable0.a;
                    ibuq.e(s, "getId(...)");
                    ftmk ftmk0 = ftmj.a(((ProtoLiteMessage)ftmi.a).v_newBuilder());
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftku.a).v_newBuilder();
                    ibuq.f(hftp0, "builder");
                    ProtoLiteMessage hftv0 = hftp0.N_build();
                    ibuq.e(hftv0, "build(...)");
                    ibuq.f(((ftku)hftv0), "value");
                    ProtoLiteBuilder hftp1 = ftmk0.a;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ftmi ftmi0 = (ftmi)hftp1.b_message;
                    ((ftku)hftv0).getClass();
                    ftmi0.d = (ftku)hftv0;
                    ftmi0.c = 0x1F;
                    ftmi ftmi1 = ftmk0.a();
                    etle0.a = object3;
                    etle0.b = nodeParcelable0;
                    etle0.c = ibvc0;
                    etle0.g = ibvd1;
                    etle0.h = ibvd0;
                    etle0.f = 2;
                    object0 = this.e(s, ftmi1, etle0);
                    if(object0 == object1) {
                        break alab1;
                    }
                label_78:
                    if(((ftok)object0).f == 0L) {
                        continue;
                    }
                    String s1 = ((ftok)object0).i;
                    ibuq.e(s1, "getWalletId(...)");
                    if(s1.length() == 0) {
                        continue;
                    }
                    if(hyus.d()) {
                        String s2 = ((ftok)object0).j;
                        ibuq.e(s2, "getStableHardwareId(...)");
                        if(s2.length() != 0) {
                            goto label_86;
                        }
                        continue;
                    }
                label_86:
                    List list0 = this.g;
                    if(list0 == null) {
                        ibuq.j("devicesForGaia");
                        list0 = null;
                    }
                    if(!(list0 instanceof Collection) || !list0.isEmpty()) {
                        Iterator iterator0 = list0.iterator();
                        while(iterator0.hasNext()) {
                            Object object6 = iterator0.next();
                            long v1 = ((hjxg)object6).c;
                            long v2 = ((ftok)object0).f;
                            if(v1 != v2) {
                                iterator0 = iterator0;
                                ibvd1 = ibvd1;
                                continue;
                            }
                            this.v.put(new Long(v2), nodeParcelable0);
                            continue alab2;
                        }
                    }
                    ibvc0.a = ((ftok)object0).f;
                    String s3 = ((ftok)object0).i;
                    ibuq.e(s3, "getWalletId(...)");
                    ibvd1 = ibvd1;
                    ibvd1.a = s3;
                    if(hyus.d()) {
                        String s4 = ((ftok)object0).j;
                        ibuq.e(s4, "getStableHardwareId(...)");
                        ibvd0.a = s4;
                    }
                }
                nodeParcelable1 = nodeParcelable0;
                hjxj hjxj0 = hjxi.a(((ProtoLiteMessage)hjxg.a).v_newBuilder());
                hjxj0.b(ibvc0.a);
                ibuq.e(nodeParcelable1.b, "getDisplayName(...)");
                hjxj0.e(nodeParcelable1.b);
                hjxj0.d(gtmv.d);
                hjxj0.c(gtmu.d);
                hjxj0.g();
                hjxj0.f(false);
                String s5 = (String)ibvd1.a;
                ibuq.f(s5, "value");
                ProtoLiteBuilder hftp2 = hjxj0.a;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hjxg hjxg2 = (hjxg)hftp2.b_message;
                s5.getClass();
                hjxg2.b |= 2;
                hjxg2.d = s5;
                if(hyus.d()) {
                    String s6 = (String)ibvd0.a;
                    ibuq.f(s6, "value");
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    hjxg hjxg3 = (hjxg)hftp2.b_message;
                    s6.getClass();
                    hjxg3.b |= 4;
                    hjxg3.e = s6;
                }
                hjxg hjxg4 = hjxj0.a();
                String s7 = (String)ibvd1.a;
                etle0.a = object3;
                etle0.b = hjxg4;
                etle0.c = nodeParcelable1;
                etle0.g = null;
                etle0.h = null;
                etle0.f = 3;
                Object object7 = this.c(s7, etle0);
                if(object7 == object1) {
                    break alab1;
                }
                hjxg1 = hjxg4;
                object0 = object7;
                break;
            }
        }
        return object1;
    }

    public final void j() {
        this.i = true;
        this.l(new etks(null));
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hjxe.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        PushTokenizeRequest pushTokenizeRequest0 = this.d;
        String s = pushTokenizeRequest0.d;
        if(s != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hjxe hjxe0 = (hjxe)hftp0.b_message;
            hjxe0.b |= 1;
            hjxe0.c = s;
        }
        hktu hktu0 = evjq.k(pushTokenizeRequest0.a);
        ibuq.e(hktu0, "tapAndPayCardNetworkToApiPaymentNetwork(...)");
        ibuq.f(hktu0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hjxe hjxe1 = (hjxe)hftp0.b_message;
        hjxe1.d = hktu0.a();
        hjxe1.b |= 2;
        hktv hktv0 = evjq.m(pushTokenizeRequest0.b);
        ibuq.e(hktv0, "tapAndPayTspToApiTsp(...)");
        ibuq.f(hktv0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hjxe hjxe2 = (hjxe)hftp0.b_message;
        hjxe2.e = hktv0.a();
        hjxe2.b |= 4;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        icck icck0 = lsc.a(this);
        etkw etkw0 = new etkw(this, ((hjxe)hftv0), null);
        icbb.b(icck0, this.c, null, etkw0, 2);
    }

    public final void k() {
        this.l(etks.a(this.a(), false, true, null, null, 13));
        this.m();
    }

    public final void l(etks etks0) {
        this.a.b(etks0);
    }

    public final void m() {
        if(this.a().a && this.a().b) {
            this.n.l(Boolean.valueOf(true));
        }
    }

    public final boolean n() {
        if(!this.d.b(2)) {
            return false;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.h) {
            etli etli0 = (etli)object0;
            if((etli0.h != gtmu.c || this.o()) && !etli0.a.i) {
                arrayList0.add(object0);
            }
        }
        return arrayList0.size() > 1;
    }

    public final boolean o() {
        return hyus.a.c().e().b.contains(Integer.valueOf(this.d.b));
    }

    public static final boolean p(etli etli0) {
        ibuq.f(etli0, "device");
        return !etli0.a.i && etli0.i;
    }
}

