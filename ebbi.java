import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import dagger.internal.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

@cmcs(a = cmcr.a)
public final class ebbi extends ebav {
    public edsq a;
    public String b;
    public Account c;
    public azts d;
    private static final bboh e;
    private final byte[] f;
    private final donp g;

    static {
        ebbi.e = bboh.b("Pay", bbcu.cZ);
    }

    public ebbi(byte[] arr_b, String s, donp donp0, azug azug0) {
        ibuq.f(arr_b, "requestBytes");
        ibuq.f(s, "callingPackage");
        ibuq.f(donp0, "callbacks");
        super("PerformPixOperation", s, azug0);
        this.f = arr_b;
        this.g = donp0;
    }

    @Override  // ebaw
    public final void b(Context context0) {
        ibuq.f(context0, "context");
        try {
            icpu.e(iccl.b(new icds(new bblp(0x7FFFFFFF, 9))), new ebbc(this, context0, null)).get();
        }
        catch(ExecutionException executionException0) {
            Throwable throwable0 = executionException0.getCause();
            if(throwable0 == null) {
                throw executionException0;
            }
            throw throwable0;
        }
    }

    public final Account c() {
        Account account0 = this.c;
        if(account0 != null) {
            return account0;
        }
        ibuq.j("account");
        return null;
    }

    public final edsq d() {
        edsq edsq0 = this.a;
        if(edsq0 != null) {
            return edsq0;
        }
        ibuq.j("pixInviteStatusRepository");
        return null;
    }

    public final Object e(Context context0, String s, ibrl ibrl0) {
        AccountInfo accountInfo0;
        ebbb ebbb0;
        if((ibrl0 instanceof ebbb)) {
            ebbb0 = (ebbb)ibrl0;
            int v = ebbb0.c;
            if((v & 0x80000000) == 0) {
                ebbb0 = new ebbb(this, ibrl0);
            }
            else {
                ebbb0.c = v - 0x80000000;
            }
        }
        else {
            ebbb0 = new ebbb(this, ibrl0);
        }
        Object object0 = ebbb0.a;
        Object object1 = ibrx.a;
        switch(ebbb0.c) {
            case 0: {
                ibnx.b(object0);
                if(s.length() == 0) {
                    evql evql0 = new etgl(context0).j();
                    ebbb0.c = 1;
                    object0 = ictn.b(evql0, ebbb0);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_26;
                }
                else {
                    String s1 = dlmj.b(context0, s);
                    if(s1 == null) {
                        throw new cjuh(5, "Account unavailable.");
                    }
                    accountInfo0 = new AccountInfo(s1, s, 0);
                    break;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
            label_26:
                accountInfo0 = (AccountInfo)object0;
                if(accountInfo0 == null) {
                    throw new cjuh(5, "No active account.");
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        return new eayb(new dola(accountInfo0.b, accountInfo0.a), domv0);
    }

    public final Object g(Context context0, ibrl ibrl0) {
        int v1;
        ftdr ftdr0;
        Object object3;
        ebbe ebbe0;
        if((ibrl0 instanceof ebbe)) {
            ebbe0 = (ebbe)ibrl0;
            int v = ebbe0.d;
            if((v & 0x80000000) == 0) {
                ebbe0 = new ebbe(this, ibrl0);
            }
            else {
                ebbe0.d = v - 0x80000000;
            }
        }
        else {
            ebbe0 = new ebbe(this, ibrl0);
        }
        Object object0 = ebbe0.b;
        Object object1 = ibrx.a;
        switch(ebbe0.d) {
            case 0: {
                ibnx.b(object0);
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ftdr.a), this.f, 0, this.f.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                ibuq.e(((ftdr)hftv0), "parseFrom(...)");
                String s = ((ftdr)hftv0).d;
                ibuq.e(s, "getAccountName(...)");
                ebbe0.a = context0;
                ebbe0.e = (ftdr)hftv0;
                ebbe0.d = 1;
                Object object2 = this.e(context0, s, ebbe0);
                if(object2 == object1) {
                    return object1;
                }
                object3 = context0;
                ftdr0 = (ftdr)hftv0;
                object0 = object2;
                goto label_32;
            }
            case 1: {
                ftdr0 = ebbe0.e;
                object3 = ebbe0.a;
                ibnx.b(object0);
            label_32:
                ((eayb)object0).inject(this);
                switch(ftdr0.b) {
                    case 0: {
                        v1 = 4;
                        break;
                    }
                    case 2: {
                        v1 = 1;
                        break;
                    }
                    case 3: {
                        v1 = 2;
                        break;
                    }
                    case 4: {
                        v1 = 3;
                        break;
                    }
                    default: {
                        v1 = 0;
                    }
                }
                if(v1 == 0) {
                    throw null;
                }
                switch(v1 - 1) {
                    case 0: {
                        ebbe0.a = null;
                        ebbe0.e = null;
                        ebbe0.d = 2;
                        return this.k(ftdr0, ebbe0) != object1 ? ibom.a : object1;
                    }
                    case 1: {
                        ebbe0.a = null;
                        ebbe0.e = null;
                        ebbe0.d = 3;
                        return this.l(ebbe0) != object1 ? ibom.a : object1;
                    }
                    case 2: {
                        goto label_56;
                    }
                }
                throw new cjuh(10, "Operation not supported.");
            label_56:
                if(!dxfj.a()) {
                    throw new cjuh(0, "Request for a disabled operation.");
                }
                ebbe0.a = null;
                ebbe0.e = null;
                ebbe0.d = 4;
                return this.i(ftdr0, ((Context)object3), ebbe0) == object1 ? object1 : ibom.a;
            }
            case 2: 
            case 3: 
            case 4: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object h(ibrl ibrl0) {
        Object object2;
        ebbf ebbf0;
        if((ibrl0 instanceof ebbf)) {
            ebbf0 = (ebbf)ibrl0;
            int v = ebbf0.c;
            if((v & 0x80000000) == 0) {
                ebbf0 = new ebbf(this, ibrl0);
            }
            else {
                ebbf0.c = v - 0x80000000;
            }
        }
        else {
            ebbf0 = new ebbf(this, ibrl0);
        }
        Object object0 = ebbf0.a;
        Object object1 = ibrx.a;
        dxeo dxeo0 = null;
        boolean z = true;
        switch(ebbf0.c) {
            case 0: {
                ibnx.b(object0);
                azts azts0 = this.d;
                if(azts0 == null) {
                    ibuq.j("payClient");
                    azts0 = null;
                }
                evql evql0 = azts0.aK(this.c(), 1);
                ebbf0.c = 1;
                object2 = fsdk.a(evql0, ebbf0);
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
        Throwable throwable0 = ibnw.a(object2);
        if(throwable0 == null) {
            if(((ProtoSafeParcelable)object2) != null) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dxeo.a).v_newBuilder();
                ibuq.f(hftp0, "builder");
                ProtoLiteMessage hftv0 = hftp0.N_build();
                ibuq.e(hftv0, "build(...)");
                dxeo0 = (dxeo)ftqe.c(((ProtoSafeParcelable)object2), ((MessageLite)(((dxeo)hftv0))));
            }
            if(dxeo0 != null) {
                hfuo hfuo0 = dxeo0.b;
                ibuq.e(hfuo0, "getPaymentMethodDataList(...)");
                if(!(hfuo0 instanceof Collection) || !hfuo0.isEmpty()) {
                    Iterator iterator0 = hfuo0.iterator();
                label_40:
                    while(iterator0.hasNext()) {
                        Object object3 = iterator0.next();
                        dxev dxev0 = (dxev)object3;
                        hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
                        ibuq.e(hkhr0, "getPaymentMethod(...)");
                        if(fscr.a(hkhr0)) {
                            hkhr hkhr1 = dxev0.c == null ? hkhr.b : dxev0.c;
                            ibuq.e(hkhr1, "getPaymentMethod(...)");
                            hkid hkid0 = hkid.k;
                            ibuq.f(hkhr1, "<this>");
                            ibuq.f(hkid0, "actionType");
                            hfuo hfuo1 = hkhr1.n;
                            ibuq.e(hfuo1, "getExistingPaymentMethodActionsList(...)");
                            if((hfuo1 instanceof Collection) && hfuo1.isEmpty()) {
                                return Boolean.valueOf(z);
                            }
                            Iterator iterator1 = hfuo1.iterator();
                            while(true) {
                                if(!iterator1.hasNext()) {
                                    return Boolean.valueOf(z);
                                }
                                Object object4 = iterator1.next();
                                hkid hkid1 = hkid.b(((hkhs)object4).c);
                                if(hkid1 == null) {
                                    hkid1 = hkid.z;
                                }
                                if(hkid1 != hkid0) {
                                    continue;
                                }
                                continue label_40;
                            }
                            break;
                        }
                    }
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
        a.ae(ebbi.e.j(), "Error getting payment methods", throwable0);
        return Boolean.valueOf(false);
    }

    public final Object i(ftdr ftdr0, Context context0, ibrl ibrl0) {
        ebbg ebbg0;
        if((ibrl0 instanceof ebbg)) {
            ebbg0 = (ebbg)ibrl0;
            int v = ebbg0.d;
            if((v & 0x80000000) == 0) {
                ebbg0 = new ebbg(this, ibrl0);
            }
            else {
                ebbg0.d = v - 0x80000000;
            }
        }
        else {
            ebbg0 = new ebbg(this, ibrl0);
        }
        Object object0 = ebbg0.b;
        Object object1 = ibrx.a;
        switch(ebbg0.d) {
            case 0: {
                ibnx.b(object0);
                if(ftdr0.b != 4) {
                    throw new cjuh(10, "Buyflow request was empty.");
                }
                String s = ((ftdp)ftdr0.c).b;
                ibuq.e(s, "getPixCode(...)");
                if(s.length() == 0) {
                    throw new cjuh(10, "Pix code in the request was empty.");
                }
                ebbg0.e = ftdr0;
                ebbg0.a = context0;
                ebbg0.d = 1;
                object0 = this.h(ebbg0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                context0 = ebbg0.a;
                ftdr0 = ebbg0.e;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(!((Boolean)object0).booleanValue()) {
            throw new cjuh(10, "User does not have valid Pix Fops.");
        }
        Account account0 = this.c();
        ftdp ftdp0 = ftdr0.b == 4 ? ((ftdp)ftdr0.c) : ftdp.a;
        this.m(new Status(6, null, bbmq.g(context0, new Intent("com.google.android.gms.pay.pix.gboard.PIX_GBOARD_PAYFLOW").setClassName(context0, "com.google.android.gms.pay.main.PayActivity").putExtra("ACCOUNT", account0).putExtra("pix_gboard", true).putExtra("pix_gboard_payflow_request", ftdp0.toBytesArray()), 0xC000000)), null);
        return ibom.a;
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.m(status0, null);
    }

    public final Object k(ftdr ftdr0, ibrl ibrl0) {
        ebbh ebbh0;
        if((ibrl0 instanceof ebbh)) {
            ebbh0 = (ebbh)ibrl0;
            int v = ebbh0.c;
            if((v & 0x80000000) == 0) {
                ebbh0 = new ebbh(this, ibrl0);
            }
            else {
                ebbh0.c = v - 0x80000000;
            }
        }
        else {
            ebbh0 = new ebbh(this, ibrl0);
        }
        Object object0 = ebbh0.a;
        Object object1 = ibrx.a;
        switch(ebbh0.c) {
            case 0: {
                ibnx.b(object0);
                edsq edsq0 = this.d();
                String s = (ftdr0.b == 2 ? ((ftdq)ftdr0.c) : ftdq.a).b;
                ibuq.e(s, "getVendorId(...)");
                Account account0 = this.c();
                ebbh0.c = 1;
                edsp edsp0 = new edsp(edsq0.b.a(account0), s, null);
                Object object2 = icbd.a(edsq0.a, edsp0, ebbh0);
                if(object2 != object1) {
                    object2 = ibom.a;
                }
                if(object2 == object1) {
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
        Status status0 = Status.b;
        ftdx ftdx0 = ftdw.a(((ProtoLiteMessage)ftdv.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftdu.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ftdt ftdt0 = ftdt.b;
        ibuq.f(ftdt0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftdu ftdu0 = (ftdu)hftp0.b_message;
        ftdu0.b = ftdt0.a();
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((ftdu)hftv0), "value");
        ProtoLiteBuilder hftp1 = ftdx0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ftdv ftdv0 = (ftdv)hftp1.b_message;
        ((ftdu)hftv0).getClass();
        ftdv0.c = (ftdu)hftv0;
        ftdv0.b = 1;
        this.m(status0, ftdx0.a());
        return ibom.a;
    }

    public final Object l(ibrl ibrl0) {
        ebbd ebbd0;
        if((ibrl0 instanceof ebbd)) {
            ebbd0 = (ebbd)ibrl0;
            int v = ebbd0.c;
            if((v & 0x80000000) == 0) {
                ebbd0 = new ebbd(this, ibrl0);
            }
            else {
                ebbd0.c = v - 0x80000000;
            }
        }
        else {
            ebbd0 = new ebbd(this, ibrl0);
        }
        Object object0 = ebbd0.a;
        Object object1 = ibrx.a;
        switch(ebbd0.c) {
            case 0: {
                ibnx.b(object0);
                edsq edsq0 = this.d();
                Account account0 = this.c();
                ebbd0.c = 1;
                edsn edsn0 = new edsn(edsq0.b.a(account0), null);
                object0 = icbd.a(edsq0.a, edsn0, ebbd0);
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
        Status status0 = Status.b;
        ftdx ftdx0 = ftdw.a(((ProtoLiteMessage)ftdv.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftds.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.f(((dxfk)object0), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftds ftds0 = (ftds)hftp0.b_message;
        ((dxfk)object0).getClass();
        ftds0.c = (dxfk)object0;
        ftds0.b |= 1;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((ftds)hftv0), "value");
        ProtoLiteBuilder hftp1 = ftdx0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ftdv ftdv0 = (ftdv)hftp1.b_message;
        ((ftds)hftv0).getClass();
        ftdv0.c = (ftds)hftv0;
        ftdv0.b = 2;
        this.m(status0, ftdx0.a());
        return ibom.a;
    }

    private final void m(Status status0, ftdv ftdv0) {
        byte[] arr_b = ftdv0 == null ? null : ftdv0.toBytesArray();
        this.g.b(status0, arr_b);
    }

    @Override  // ebav
    public final ExecutorService r() {
        return new bblp(0x7FFFFFFF, 9);
    }
}

