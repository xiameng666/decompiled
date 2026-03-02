import android.app.KeyguardManager;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.mdocstore.types.ProvisioningId;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class duyb extends lsb {
    public static final bboh a;
    public final dtpl b;
    public final bavt c;
    public final dual d;
    public final KeyguardManager e;
    public final icnj f;
    public String g;
    public final icnl h;
    private static final byte[] i;
    private final cqxc j;
    private final fbio k;
    private final WalletCustomTheme l;

    static {
        duyb.a = bboh.b("Pay", bbcu.cZ);
        Charset charset0 = StandardCharsets.UTF_8;
        ibuq.e(charset0, "UTF_8");
        byte[] arr_b = "fakeChallenge".getBytes(charset0);
        ibuq.e(arr_b, "getBytes(...)");
        duyb.i = arr_b;
    }

    public duyb(dtpl dtpl0, bavt bavt0, cqxc cqxc0, dual dual0, fbio fbio0, WalletCustomTheme walletCustomTheme0, KeyguardManager keyguardManager0) {
        this.b = dtpl0;
        this.c = bavt0;
        this.j = cqxc0;
        this.d = dual0;
        this.k = fbio0;
        this.l = walletCustomTheme0;
        this.e = keyguardManager0;
        icnl icnl0 = icnm.a(new duxk(null));
        this.h = icnl0;
        this.f = new icmp(icnl0);
    }

    public final Object a(hkas hkas0, ibrl ibrl0) {
        Object object3;
        hkas hkas1;
        Object object2;
        duxr duxr0;
        if((ibrl0 instanceof duxr)) {
            duxr0 = (duxr)ibrl0;
            int v = duxr0.c;
            if((v & 0x80000000) == 0) {
                duxr0 = new duxr(this, ibrl0);
            }
            else {
                duxr0.c = v - 0x80000000;
            }
        }
        else {
            duxr0 = new duxr(this, ibrl0);
        }
        Object object0 = duxr0.a;
        Object object1 = ibrx.a;
        switch(duxr0.c) {
            case 0: {
                ibnx.b(object0);
                evql evql0 = this.j.c(cram.g);
                duxr0.d = hkas0;
                duxr0.c = 1;
                object2 = fsdk.a(evql0, duxr0);
                if(object2 != object1) {
                    goto label_23;
                }
                return object1;
            }
            case 1: {
                hkas0 = duxr0.d;
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
            label_23:
                ibnx.b(object2);
                gtyb gtyb0 = gtya.a(((ProtoLiteMessage)gtxd.a).v_newBuilder());
                gtyb0.b(gtxb.b);
                byte[] arr_b = gtyb0.a().toBytesArray();
                evql evql1 = this.j.s(((ProvisioningId)object2), arr_b);
                duxr0.d = hkas0;
                duxr0.e = (ProvisioningId)object2;
                duxr0.c = 2;
                if(ictn.b(evql1, duxr0) != object1) {
                    hkas1 = hkas0;
                    object3 = (ProvisioningId)object2;
                    break;
                }
                return object1;
            }
            case 2: {
                object3 = duxr0.e;
                hkas1 = duxr0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.d.d(((ProvisioningId)object3), new duac((hkas1.d == null ? hkau.a : hkas1.d).b));
        ibuq.c(object3);
        return object3;
    }

    public final Object b(String s, ibrl ibrl0) {
        Object object2;
        duxs duxs0;
        if((ibrl0 instanceof duxs)) {
            duxs0 = (duxs)ibrl0;
            int v = duxs0.c;
            if((v & 0x80000000) == 0) {
                duxs0 = new duxs(this, ibrl0);
            }
            else {
                duxs0.c = v - 0x80000000;
            }
        }
        else {
            duxs0 = new duxs(this, ibrl0);
        }
        Object object0 = duxs0.a;
        Object object1 = ibrx.a;
        switch(duxs0.c) {
            case 0: {
                ibnx.b(object0);
                ProvisioningId provisioningId0 = new ProvisioningId(s);
                evql evql0 = this.j.d(provisioningId0, duyb.i);
                duxs0.c = 1;
                object2 = fsdk.a(evql0, duxs0);
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
        ibnx.b(object2);
        return ibom.a;
    }

    public final Object c(ProvisioningId provisioningId0, hkas hkas0, ibrl ibrl0) {
        hjzw hjzw0;
        gtfb gtfb0;
        ProtoSafeParcelable protoSafeParcelable0;
        duxt duxt0;
        if((ibrl0 instanceof duxt)) {
            duxt0 = (duxt)ibrl0;
            int v = duxt0.c;
            if((v & 0x80000000) == 0) {
                duxt0 = new duxt(this, ibrl0);
            }
            else {
                duxt0.c = v - 0x80000000;
            }
        }
        else {
            duxt0 = new duxt(this, ibrl0);
        }
        Object object0 = duxt0.a;
        Object object1 = ibrx.a;
        switch(duxt0.c) {
            case 0: {
                ibnx.b(object0);
                ByteString hfsf0 = hkas0.b;
                ibuq.e(hfsf0, "getIssuerToken(...)");
                dtpl dtpl0 = this.b;
                String s = provisioningId0.a;
                try {
                    String s1 = hwih.c();
                    protoSafeParcelable0 = (ProtoSafeParcelable)evrg.n(dtpl0.d.as(dtpl0.b, s1));
                }
                catch(ExecutionException | InterruptedException exception0) {
                    throw new dtzv("Exception getting attestation signal", exception0, 5);
                }
                try {
                    byte[] arr_b = protoSafeParcelable0.a;
                    gftb.check(arr_b);
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gtfb.a), arr_b, 0, arr_b.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    gtfb0 = (gtfb)hftv0;
                }
                catch(hfur hfur0) {
                    throw new dtzv("Exception parsing attestation signal", hfur0, 5);
                }
                try {
                    dmhi dmhi0 = dtpl0.c;
                    dpuj dpuj0 = dpuj.af;
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hjzv.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp0.b_message;
                    s.getClass();
                    ((hjzv)hftv1).c = s;
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp0.b_message;
                    hfsf0.getClass();
                    ((hjzv)hftv2).b |= 8;
                    ((hjzv)hftv2).e = hfsf0;
                    if(!hftv2.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hjzv hjzv0 = (hjzv)hftp0.b_message;
                    gtfb0.getClass();
                    hjzv0.d = gtfb0;
                    hjzv0.b |= 4;
                    hjzw0 = (hjzw)dptv.e(dmhi0, dpuj0, ((MessageLite)hftp0.N_build()), ((MessageLite)hjzw.a));
                }
                catch(dpuk | IOException exception1) {
                    throw new dtzv("Exception getting challenge", exception1, 5);
                }
                String s2 = hjzw0.b.toStringUtf8();
                byte[] arr_b1 = ghjc.d.q(s2);
                duxt0.d = provisioningId0;
                duxt0.e = hkas0;
                duxt0.c = 1;
                object0 = this.h(provisioningId0, arr_b1, duxt0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                hkas0 = duxt0.e;
                provisioningId0 = duxt0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.b.j(provisioningId0.a, hkas0.b, ((crap)object0).b);
        return ibom.a;
    }

    public final Object e(ibrl ibrl0) {
        Object object2;
        duxu duxu0;
        if((ibrl0 instanceof duxu)) {
            duxu0 = (duxu)ibrl0;
            int v = duxu0.c;
            if((v & 0x80000000) == 0) {
                duxu0 = new duxu(this, ibrl0);
            }
            else {
                duxu0.c = v - 0x80000000;
            }
        }
        else {
            duxu0 = new duxu(this, ibrl0);
        }
        Object object0 = duxu0.a;
        Object object1 = ibrx.a;
        switch(duxu0.c) {
            case 0: {
                ibnx.b(object0);
                azty[] arr_azty = {duyb.m()};
                evql evql0 = this.c.b(arr_azty);
                duxu0.c = 1;
                object2 = fsdk.a(evql0, duxu0);
                if(object2 == object1) {
                    return object1;
                }
                goto label_22;
            }
            case 1: {
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
            label_22:
                ibnx.b(object2);
                if(!((ModuleAvailabilityResponse)object2).a) {
                    duxu0.c = 2;
                    if(this.g(duxu0) == object1) {
                        return object1;
                    }
                }
                return ibom.a;
            }
            case 2: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object f(ibrl ibrl0) {
        Object object2;
        duxv duxv0;
        if((ibrl0 instanceof duxv)) {
            duxv0 = (duxv)ibrl0;
            int v = duxv0.c;
            if((v & 0x80000000) == 0) {
                duxv0 = new duxv(this, ibrl0);
            }
            else {
                duxv0.c = v - 0x80000000;
            }
        }
        else {
            duxv0 = new duxv(this, ibrl0);
        }
        Object object0 = duxv0.a;
        Object object1 = ibrx.a;
        switch(duxv0.c) {
            case 0: {
                ibnx.b(object0);
                fbir fbir0 = GetClientTokenRequest.a();
                fbir0.b(3);
                fbir0.c(this.l);
                GetClientTokenRequest getClientTokenRequest0 = fbir0.a();
                evql evql0 = this.k.f(getClientTokenRequest0);
                duxv0.c = 1;
                object2 = fsdk.a(evql0, duxv0);
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
        ibnx.b(object2);
        return ByteString.copyFrom(((byte[])object2));
    }

    public final Object g(ibrl ibrl0) {
        Object object4;
        evqp evqp1;
        Object object3;
        duxz duxz0;
        if((ibrl0 instanceof duxz)) {
            duxz0 = (duxz)ibrl0;
            int v = duxz0.c;
            if((v & 0x80000000) == 0) {
                duxz0 = new duxz(this, ibrl0);
            }
            else {
                duxz0.c = v - 0x80000000;
            }
        }
        else {
            duxz0 = new duxz(this, ibrl0);
        }
        Object object0 = duxz0.a;
        Object object1 = ibrx.a;
        switch(duxz0.c) {
            case 0: {
                ibnx.b(object0);
                evqp evqp0 = new evqp();
                duxw duxw0 = new duxw(this, evqp0);
                ArrayList arrayList0 = new ArrayList();
                bavv.b(duyb.m(), arrayList0);
                bavw bavw0 = bavv.a(arrayList0, duxw0);
                evql evql0 = this.c.c(bavw0);
                duxz0.d = evqp0;
                duxz0.c = 1;
                Object object2 = fsdk.a(evql0, duxz0);
                if(object2 == object1) {
                    return object1;
                }
                object3 = object2;
                evqp1 = evqp0;
                goto label_30;
            }
            case 1: {
                evqp1 = duxz0.d;
                ibnx.b(object0);
                object3 = ((ibnw)object0).a;
            label_30:
                ibnx.b(object3);
                if(((ModuleInstallResponse)object3).a()) {
                    evqp1.c(null);
                }
                duxz0.d = null;
                duxz0.c = 2;
                object4 = fsdk.a(evqp1.a, duxz0);
                if(object4 == object1) {
                    return object1;
                }
                ibnx.b(object4);
                return ibom.a;
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibnx.b(object0);
        object4 = ((ibnw)object0).a;
        ibnx.b(object4);
        return ibom.a;
    }

    public final Object h(ProvisioningId provisioningId0, byte[] arr_b, ibrl ibrl0) {
        Object object3;
        Object object2;
        duya duya0;
        if((ibrl0 instanceof duya)) {
            duya0 = (duya)ibrl0;
            int v = duya0.c;
            if((v & 0x80000000) == 0) {
                duya0 = new duya(this, ibrl0);
            }
            else {
                duya0.c = v - 0x80000000;
            }
        }
        else {
            duya0 = new duya(this, ibrl0);
        }
        Object object0 = duya0.a;
        Object object1 = ibrx.a;
        switch(duya0.c) {
            case 0: {
                ibnx.b(object0);
                evql evql0 = this.j.q(provisioningId0, arr_b);
                duya0.c = 1;
                object2 = fsdk.a(evql0, duya0);
                if(object2 != object1) {
                    goto label_21;
                }
                return object1;
            }
            case 1: {
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
            label_21:
                ibnx.b(object2);
                evql evql1 = this.j.r(((crap)object2));
                duya0.d = (crap)object2;
                duya0.c = 2;
                if(ictn.b(evql1, duya0) != object1) {
                    object3 = (crap)object2;
                    break;
                }
                return object1;
            }
            case 2: {
                object3 = duya0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.c(object3);
        return object3;
    }

    public final void i() {
        duxk duxk0 = new duxk(null);
        this.h.g(duxk0);
    }

    public final void j(hkas hkas0) {
        ibuq.f(hkas0, "issuer");
        duxk duxk0 = duxk.a(((duxk)this.h.b()), null, null, true, null, null, false, 59);
        this.h.g(duxk0);
        icck icck0 = lsc.a(this);
        duxq duxq0 = new duxq(this, hkas0, null);
        icbb.b(icck0, cclw.d, null, duxq0, 2);
    }

    public final Object k(ibrl ibrl0) {
        Object object3;
        gtxf gtxf1;
        Object object2;
        gtxf gtxf0;
        duxp duxp0;
        if((ibrl0 instanceof duxp)) {
            duxp0 = (duxp)ibrl0;
            int v = duxp0.d;
            if((v & 0x80000000) == 0) {
                duxp0 = new duxp(this, ibrl0);
            }
            else {
                duxp0.d = v - 0x80000000;
            }
        }
        else {
            duxp0 = new duxp(this, ibrl0);
        }
        Object object0 = duxp0.b;
        Object object1 = ibrx.a;
        switch(duxp0.d) {
            case 0: {
                ibnx.b(object0);
                gtxf0 = gtxf.e;
                evql evql0 = this.j.l();
                duxp0.e = gtxf0;
                duxp0.d = 1;
                object2 = fsdk.a(evql0, duxp0);
                if(object2 == object1) {
                    return object1;
                }
                goto label_24;
            }
            case 1: {
                gtxf0 = duxp0.e;
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
            label_24:
                gtxf1 = gtxf0;
                ibnx.b(object2);
                hfuo hfuo0 = ((gtxe)object2).b;
                ibuq.e(hfuo0, "getMdocInfoList(...)");
                object3 = hfuo0.iterator();
                break;
            }
            case 2: {
                object3 = duxp0.a;
                gtxf1 = duxp0.e;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(((Iterator)object3).hasNext()) {
            Object object4 = ((Iterator)object3).next();
            gtxg gtxg0 = (gtxg)object4;
            if((gtxf.b(gtxg0.h) == null ? gtxf.f : gtxf.b(gtxg0.h)) == gtxf1) {
                ibuq.c(gtxg0);
                if(duyb.n(gtxg0)) {
                    gtxb gtxb0 = gtxb.b(fshl.a(gtxg0).c);
                    if(gtxb0 == null) {
                        gtxb0 = gtxb.n;
                    }
                    if(gtxb0 == gtxb.j) {
                        this.b.i(gtxg0.b);
                        this.b.g(gtxg0.b);
                    }
                    String s = gtxg0.b;
                    ibuq.e(s, "getProvisioningIdString(...)");
                    duxp0.e = gtxf1;
                    duxp0.a = object3;
                    duxp0.d = 2;
                    if(this.b(s, duxp0) == object1) {
                        return object1;
                    }
                }
            }
        }
        return ibom.a;
    }

    public final Object l(ibrl ibrl0) {
        gtxf gtxf1;
        Object object3;
        duxx duxx0;
        if((ibrl0 instanceof duxx)) {
            duxx0 = (duxx)ibrl0;
            int v = duxx0.c;
            if((v & 0x80000000) == 0) {
                duxx0 = new duxx(this, ibrl0);
            }
            else {
                duxx0.c = v - 0x80000000;
            }
        }
        else {
            duxx0 = new duxx(this, ibrl0);
        }
        Object object0 = duxx0.a;
        Object object1 = ibrx.a;
        switch(duxx0.c) {
            case 0: {
                ibnx.b(object0);
                gtxf gtxf0 = gtxf.e;
                evql evql0 = this.j.l();
                duxx0.d = gtxf0;
                duxx0.c = 1;
                Object object2 = fsdk.a(evql0, duxx0);
                if(object2 != object1) {
                    object3 = object2;
                    gtxf1 = gtxf0;
                    break;
                }
                return object1;
            }
            case 1: {
                gtxf1 = duxx0.d;
                ibnx.b(object0);
                object3 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibnx.b(object3);
        hfuo hfuo0 = ((gtxe)object3).b;
        ibuq.e(hfuo0, "getMdocInfoList(...)");
        for(Object object4: hfuo0) {
            Object object5 = (gtxg)object4;
            if((gtxf.b(object5.h) == null ? gtxf.f : gtxf.b(object5.h)) == gtxf1) {
                ibuq.c(object5);
                if(!duyb.n(((gtxg)object5))) {
                    return object5;
                }
            }
        }
        return null;
    }

    private static final azty m() {
        List list0 = ibpo.i(new Feature[]{cqwp.a, cqwp.c});
        if(dtqh.a()) {
            list0.add(cqwp.g);
        }
        return new duxn(list0);
    }

    private static final boolean n(gtxg gtxg0) {
        if(hwmp.a.l().G() && (gtxf.b(gtxg0.h) == null ? gtxf.f : gtxf.b(gtxg0.h)) == gtxf.e) {
            return true;
        }
        gtxb gtxb0 = gtxb.b(fshl.a(gtxg0).c);
        if(gtxb0 == null) {
            gtxb0 = gtxb.n;
        }
        int v = gtxb0.ordinal();
        return v == 0 || v == 1 || (v == 9 || v == 11 || v == 13);
    }
}

