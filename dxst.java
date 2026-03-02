import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.pay.GetClosedLoopBundleResponse;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.SaveTransitPlcIntentArgs;
import com.google.android.gms.tapandpay.firstparty.SyncDeviceInfoRequest;
import com.google.android.gms.wallet.PaymentData;
import java.io.IOException;
import java.security.SecureRandom;

public final class dxst extends dxmi {
    public final SecureRandom l;
    public fsxo m;
    public gtqs n;
    public static final int o;
    private final dqhz p;
    private final eefp q;
    private final Account r;
    private final String s;
    private final String t;
    private final Context u;
    private final edmw v;
    private final azts w;

    public dxst(Bundle bundle0, dxnc dxnc0, ibrt ibrt0, dmhi dmhi0, dxte dxte0, azts azts0, dmgi dmgi0, etgl etgl0, dqhz dqhz0, eefp eefp0, azts azts1, Account account0, String s, String s1, Context context0, edmw edmw0) {
        super(bundle0, dxnc0, ibrt0, dmhi0, dxte0, azts0, dmgi0, etgl0);
        this.p = dqhz0;
        this.q = eefp0;
        this.w = azts1;
        this.r = account0;
        this.s = s;
        this.t = s1;
        this.u = context0;
        this.v = edmw0;
        this.l = new SecureRandom();
        icck icck0 = lsc.a(this);
        dxsf dxsf0 = new dxsf(this, null);
        icbb.b(icck0, this.e, null, dxsf0, 2);
    }

    public final Object A(ibrl ibrl0) {
        Object object2;
        dxsk dxsk0;
        if((ibrl0 instanceof dxsk)) {
            dxsk0 = (dxsk)ibrl0;
            int v = dxsk0.c;
            if((v & 0x80000000) == 0) {
                dxsk0 = new dxsk(this, ibrl0);
            }
            else {
                dxsk0.c = v - 0x80000000;
            }
        }
        else {
            dxsk0 = new dxsk(this, ibrl0);
        }
        Object object0 = dxsk0.a;
        Object object1 = ibrx.a;
        switch(dxsk0.c) {
            case 0: {
                ibnx.b(object0);
                evql evql0 = this.w.aH(this.r, (this.h.r == null ? hkug.a : this.h.r).d);
                dxsk0.c = 1;
                object2 = fsdk.a(evql0, dxsk0);
                if(object2 != object1) {
                    return (object2 instanceof ibnv) ? null : object2;
                }
                return object1;
            }
            case 1: {
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
                return (object2 instanceof ibnv) ? null : object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object B(Exception exception0, long v, ibrl ibrl0) {
        Object object2;
        dxsm dxsm0;
        if((ibrl0 instanceof dxsm)) {
            dxsm0 = (dxsm)ibrl0;
            int v1 = dxsm0.c;
            if((v1 & 0x80000000) == 0) {
                dxsm0 = new dxsm(this, ibrl0);
            }
            else {
                dxsm0.c = v1 - 0x80000000;
            }
        }
        else {
            dxsm0 = new dxsm(this, ibrl0);
        }
        Object object0 = dxsm0.a;
        Object object1 = ibrx.a;
        switch(dxsm0.c) {
            case 0: {
                ibnx.b(object0);
                a.ae(dxmi.a.j(), "Failed to purchase ticket", exception0);
                dxsm0.c = 1;
                object2 = this.E(v, 2, dxsm0);
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
            Throwable throwable0 = ibnw.a(object2);
            a.ae(dxmi.a.i(), "Reverse purchase failed", throwable0);
            this.h(hagt.bh, hagu.p);
        }
        if(hwue.j()) {
            dxmi.q(this, null, hagt.be, hagu.k, 1);
        }
        return null;
    }

    public final Object C(PaymentData paymentData0, long v, ibrl ibrl0) {
        Object object2;
        dxsn dxsn0;
        if((ibrl0 instanceof dxsn)) {
            dxsn0 = (dxsn)ibrl0;
            int v1 = dxsn0.c;
            if((v1 & 0x80000000) == 0) {
                dxsn0 = new dxsn(this, ibrl0);
            }
            else {
                dxsn0.c = v1 - 0x80000000;
            }
        }
        else {
            dxsn0 = new dxsn(this, ibrl0);
        }
        Object object0 = dxsn0.a;
        Object object1 = ibrx.a;
        switch(dxsn0.c) {
            case 0: {
                ibnx.b(object0);
                eefp eefp0 = this.q;
                String s = paymentData0.g;
                ftem ftem0 = this.h;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftlo.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                eefp0.b.getClass();
                ((ftlo)hftv0).c = eefp0.b;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                s.getClass();
                ((ftlo)hftv1).j = s;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp0.b_message;
                ftem0.getClass();
                ((ftlo)hftv2).i = ftem0;
                ((ftlo)hftv2).b |= 2;
                if(!hftv2.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((ftlo)hftp0.b_message).d = v;
                ftlo ftlo0 = (ftlo)hftp0.N_build();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ftmi.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ftmi ftmi0 = (ftmi)hftp1.b_message;
                ftlo0.getClass();
                ftmi0.d = ftlo0;
                ftmi0.c = 9;
                ftmi ftmi1 = (ftmi)hftp1.N_build();
                evql evql0 = eefp0.e((ftem0.z == null ? fton.a : ftem0.z).c, ftmi1);
                dxsn0.c = 1;
                object2 = fsdk.a(evql0, dxsn0);
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
        if(!(object2 instanceof ibnv)) {
            if(((ftok)object2) != null) {
                ftns ftns0 = ((ftok)object2).b == 12 ? ((ftns)((ftok)object2).c) : ftns.a;
                if(ftns0 != null) {
                    Object object3 = ftns0.b;
                    return object3 == null ? gtrk.a : object3;
                }
            }
            return null;
        }
        Throwable throwable0 = ibnw.a(object2);
        a.ae(dxmi.a.j(), "Failed to purchase ticket for wear", throwable0);
        dxmi.q(this, null, hagt.be, hagu.k, 1);
        return null;
    }

    public final Object D(PaymentData paymentData0, fsyh fsyh0, long v, ibrl ibrl0) {
        long v3;
        heal heal0;
        gmcd gmcd0;
        PaymentData paymentData3;
        Object object5;
        fsyh fsyh3;
        gtfb gtfb0;
        Object object3;
        fsyh fsyh1;
        dxso dxso0;
        PaymentData paymentData1 = paymentData0;
        long v1 = v;
        if((ibrl0 instanceof dxso)) {
            dxso0 = (dxso)ibrl0;
            int v2 = dxso0.d;
            if((v2 & 0x80000000) == 0) {
                dxso0 = new dxso(this, ibrl0);
            }
            else {
                dxso0.d = v2 - 0x80000000;
            }
        }
        else {
            dxso0 = new dxso(this, ibrl0);
        }
        Object object0 = dxso0.b;
        Object object1 = ibrx.a;
        switch(dxso0.d) {
            case 0: {
                ibnx.b(object0);
                if(dxsy.j(this.h)) {
                    dxso0.d = 1;
                    Object object2 = this.C(paymentData1, v1, dxso0);
                    return object2 == object1 ? object1 : object2;
                }
                dxso0.e = paymentData1;
                fsyh1 = fsyh0;
                dxso0.f = fsyh1;
                dxso0.a = v1;
                dxso0.d = 2;
                object3 = this.y(dxso0);
                if(object3 != object1) {
                    goto label_37;
                }
                return object1;
            }
            case 1: {
                ibnx.b(object0);
                return object0;
            }
            case 2: {
                v1 = dxso0.a;
                fsyh fsyh2 = dxso0.f;
                PaymentData paymentData2 = dxso0.e;
                ibnx.b(object0);
                fsyh1 = fsyh2;
                paymentData1 = paymentData2;
                object3 = object0;
            label_37:
                if(((gtfb)object3) == null) {
                    ((ggtj)dxmi.a.j()).x("Could not fetch attestation signal");
                    dxmi.q(this, null, null, hagu.r, 3);
                    return null;
                }
                dxso0.e = paymentData1;
                dxso0.f = fsyh1;
                dxso0.g = (gtfb)object3;
                dxso0.a = v1;
                dxso0.d = 3;
                Object object4 = this.H(dxso0);
                if(object4 != object1) {
                    gtfb0 = (gtfb)object3;
                    fsyh3 = fsyh1;
                    object5 = object4;
                    paymentData3 = paymentData1;
                    goto label_60;
                }
                return object1;
            }
            case 3: {
                v1 = dxso0.a;
                gtfb gtfb1 = dxso0.g;
                fsyh3 = dxso0.f;
                paymentData3 = dxso0.e;
                ibnx.b(object0);
                object5 = ((ibnw)object0).a;
                gtfb0 = gtfb1;
            label_60:
                if((object5 instanceof ibnv)) {
                    ((ggtj)dxmi.a.j()).x("Failed to sync device info");
                    dxmi.q(this, null, null, hagu.d, 3);
                    return null;
                }
                try {
                    dqhz dqhz0 = this.p;
                    gtpx gtpx0 = this.v.a();
                    ProtoLiteBuilder hftp0 = dqhz0.n(this.h, v1, gtfb0, gtpx0);
                    String s = paymentData3.g;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gtrg gtrg0 = (gtrg)hftp0.b_message;
                    s.getClass();
                    gtrg0.p = s;
                    if(fsyh3 == null) {
                        ProtoLiteMessage hftv0 = hftp0.N_build();
                        gmcd0 = dptv.c(dqhz0.b, dpuj.u, ((MessageLite)hftv0), ((MessageLite)gtrk.a), null);
                    }
                    else {
                        String s1 = (fsyh3.i == null ? fsyd.a : fsyh3.i).c;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gtrg gtrg1 = (gtrg)hftp0.b_message;
                        s1.getClass();
                        gtrg1.k = s1;
                        try {
                            heal0 = dqhz.d(fsyh3);
                        }
                        catch(IOException iOException1) {
                            gmcd0 = gmbu.h(iOException1);
                            goto label_96;
                        }
                        if(heal0 != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gtrg)hftp0.b_message).j = heal0;
                            ((gtrg)hftp0.b_message).b |= 8;
                        }
                        ProtoLiteMessage hftv1 = hftp0.N_build();
                        ggeo ggeo0 = ggeo.l("4", "e35");
                        gmcd0 = dptv.c(dqhz0.b, dpuj.u, ((MessageLite)hftv1), ((MessageLite)gtrk.a), ggeo0);
                    }
                label_96:
                    dxso0.e = null;
                    dxso0.f = null;
                    dxso0.g = null;
                    dxso0.a = v1;
                    dxso0.d = 4;
                    object0 = icpu.c(gmcd0, dxso0);
                }
                catch(dpuk dpuk0) {
                    v3 = v1;
                    goto label_119;
                }
                catch(IOException iOException0) {
                    v3 = v1;
                    goto label_127;
                }
                catch(dpui dpui0) {
                    v3 = v1;
                    goto label_135;
                }
                if(object0 != object1) {
                    v3 = v1;
                    return (gtrk)object0;
                }
                return object1;
            }
            case 4: {
                try {
                    v3 = dxso0.a;
                    ibnx.b(object0);
                    return (gtrk)object0;
                }
                catch(dpuk dpuk0) {
                label_119:
                    dxso0.e = null;
                    dxso0.f = null;
                    dxso0.g = null;
                    dxso0.d = 5;
                    object0 = this.B(dpuk0, v3, dxso0);
                    return object0 != object1 ? ((gtrk)object0) : object1;
                }
                catch(IOException iOException0) {
                label_127:
                    dxso0.e = null;
                    dxso0.f = null;
                    dxso0.g = null;
                    dxso0.d = 6;
                    object0 = this.B(iOException0, v3, dxso0);
                    return object0 != object1 ? ((gtrk)object0) : object1;
                }
                catch(dpui dpui0) {
                }
            label_135:
                dxso0.e = null;
                dxso0.f = null;
                dxso0.g = null;
                dxso0.d = 7;
                object0 = this.B(dpui0, v3, dxso0);
                return object0 != object1 ? ((gtrk)object0) : object1;
            }
            case 5: {
                ibnx.b(object0);
                return (gtrk)object0;
            }
            case 6: {
                ibnx.b(object0);
                return (gtrk)object0;
            }
            case 7: {
                ibnx.b(object0);
                return (gtrk)object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object E(long v, int v1, ibrl ibrl0) {
        dxsp dxsp0;
        if((ibrl0 instanceof dxsp)) {
            dxsp0 = (dxsp)ibrl0;
            int v2 = dxsp0.c;
            if((v2 & 0x80000000) == 0) {
                dxsp0 = new dxsp(this, ibrl0);
            }
            else {
                dxsp0.c = v2 - 0x80000000;
            }
        }
        else {
            dxsp0 = new dxsp(this, ibrl0);
        }
        Object object0 = dxsp0.a;
        Object object1 = ibrx.a;
        switch(dxsp0.c) {
            case 0: {
                ibnx.b(object0);
                evql evql0 = this.w.bl(this.r, v1, v, (this.h.r == null ? hkug.a : this.h.r).toBytesArray());
                dxsp0.c = 1;
                Object object2 = fsdk.a(evql0, dxsp0);
                return object2 == object1 ? object1 : object2;
            }
            case 1: {
                ibnx.b(object0);
                return ((ibnw)object0).a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object F(PaymentData paymentData0, long v, ibrl ibrl0) {
        long v3;
        PaymentData paymentData1;
        Object object3;
        Object object2;
        dxsq dxsq0;
        if((ibrl0 instanceof dxsq)) {
            dxsq0 = (dxsq)ibrl0;
            int v1 = dxsq0.d;
            if((v1 & 0x80000000) == 0) {
                dxsq0 = new dxsq(this, ibrl0);
            }
            else {
                dxsq0.d = v1 - 0x80000000;
            }
        }
        else {
            dxsq0 = new dxsq(this, ibrl0);
        }
        Object object0 = dxsq0.b;
        Object object1 = ibrx.a;
        switch(dxsq0.d) {
            case 0: {
                ibnx.b(object0);
                if(v != 0L) {
                    dxsq0.e = paymentData0;
                    dxsq0.d = 1;
                    object2 = this.E(v, 1, dxsq0);
                    if(object2 == object1) {
                        return object1;
                    }
                    goto label_23;
                }
                goto label_27;
            }
            case 1: {
                paymentData0 = dxsq0.e;
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
            label_23:
                if((object2 instanceof ibnv)) {
                    a.ae(dxmi.a.i(), "Reverse outstanding purchase failed", ibnw.a(object2));
                    dxmi.q(this, null, null, hagu.n, 3);
                    return ibom.a;
                }
            label_27:
                long v2 = this.l.nextLong();
                dxsq0.e = paymentData0;
                dxsq0.a = v2;
                dxsq0.d = 2;
                object3 = this.E(v2, 3, dxsq0);
                if(object3 == object1) {
                    return object1;
                }
                paymentData1 = paymentData0;
                v3 = v2;
                goto label_40;
            }
            case 2: {
                v3 = dxsq0.a;
                paymentData1 = dxsq0.e;
                ibnx.b(object0);
                object3 = ((ibnw)object0).a;
            label_40:
                if(ibnw.b(object3)) {
                    dxsq0.e = null;
                    dxsq0.d = 3;
                    return this.G(paymentData1, v3, dxsq0) != object1 ? ibom.a : object1;
                }
                a.ae(dxmi.a.i(), "Reverse newpurchase failed", ibnw.a(object3));
                dxmi.q(this, null, null, hagu.o, 3);
                return ibom.a;
            }
            case 3: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object G(PaymentData paymentData0, long v, ibrl ibrl0) {
        gtrk gtrk0;
        long v3;
        fsyh fsyh0;
        dxst dxst0;
        Object object2;
        long v2;
        PaymentData paymentData1;
        dxsr dxsr0;
        if((ibrl0 instanceof dxsr)) {
            dxsr0 = (dxsr)ibrl0;
            int v1 = dxsr0.e;
            if((v1 & 0x80000000) == 0) {
                dxsr0 = new dxsr(this, ibrl0);
            }
            else {
                dxsr0.e = v1 - 0x80000000;
            }
        }
        else {
            dxsr0 = new dxsr(this, ibrl0);
        }
        Object object0 = dxsr0.c;
        Object object1 = ibrx.a;
        switch(dxsr0.e) {
            case 0: {
                ibnx.b(object0);
                if(this.m == null && dxst.J(this.h)) {
                    ((ggtj)dxmi.a.j()).x("Bundle was unexpectedly null when starting purchase flow. Now attempting to fetch the closed loop bundle container.");
                    paymentData1 = paymentData0;
                    dxsr0.a = paymentData1;
                    dxsr0.f = this;
                    v2 = v;
                    dxsr0.b = v2;
                    dxsr0.e = 1;
                    object2 = this.v(dxsr0);
                    if(object2 != object1) {
                        dxst0 = this;
                        goto label_36;
                    }
                }
                else {
                    paymentData1 = paymentData0;
                    v2 = v;
                    goto label_37;
                }
                return object1;
            }
            case 1: {
                v2 = dxsr0.b;
                dxst dxst1 = dxsr0.f;
                PaymentData paymentData2 = (PaymentData)dxsr0.a;
                ibnx.b(object0);
                object2 = object0;
                paymentData1 = paymentData2;
                dxst0 = dxst1;
            label_36:
                dxst0.m = (fsxo)object2;
            label_37:
                fsxo fsxo0 = this.m;
                if(fsxo0 == null) {
                    fsyh0 = null;
                }
                else {
                    fsyh0 = fsxo0.d;
                    if(fsyh0 == null) {
                        fsyh0 = fsyh.a;
                    }
                }
                dxsr0.a = null;
                dxsr0.f = null;
                dxsr0.b = v2;
                dxsr0.e = 2;
                object0 = this.D(paymentData1, fsyh0, v2, dxsr0);
                if(object0 != object1) {
                    v3 = v2;
                    goto label_54;
                }
                return object1;
            }
            case 2: {
                v3 = dxsr0.b;
                ibnx.b(object0);
            label_54:
                gtrk0 = (gtrk)object0;
                if(gtrk0 == null) {
                    if(hwue.j()) {
                        return ibom.a;
                    }
                    ((ggtj)dxmi.a.j()).x("PurchaseTicketResponse is null");
                    dxmi.q(this, null, null, hagu.k, 3);
                    return ibom.a;
                }
                dxsr0.a = gtrk0;
                dxsr0.b = v3;
                dxsr0.e = 3;
                dyar dyar0 = new dyar(this.s, this.t);
                long v4 = (this.h.r == null ? hkug.a : this.h.r).d;
                ftiz ftiz0 = ftiy.a(((ProtoLiteMessage)ftix.a).v_newBuilder());
                ftiz0.b((this.h.j == null ? gtlg.a : this.h.j).b);
                Object object3 = dyar0.d(String.valueOf(v4), ftiz0.a(), dxsr0);
                if(object3 != object1) {
                    object3 = ibom.a;
                }
                if(object3 != object1) {
                    object3 = ibom.a;
                }
                if(object3 != object1) {
                    dxsr0.a = null;
                    dxsr0.e = 4;
                    return this.x(gtrk0, v3, dxsr0) != object1 ? ibom.a : object1;
                }
                return object1;
            }
            case 3: {
                v3 = dxsr0.b;
                gtrk0 = (gtrk)dxsr0.a;
                ibnx.b(object0);
                dxsr0.a = null;
                dxsr0.e = 4;
                return this.x(gtrk0, v3, dxsr0) != object1 ? ibom.a : object1;
            }
            case 4: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object H(ibrl ibrl0) {
        dxss dxss0;
        if((ibrl0 instanceof dxss)) {
            dxss0 = (dxss)ibrl0;
            int v = dxss0.c;
            if((v & 0x80000000) == 0) {
                dxss0 = new dxss(this, ibrl0);
            }
            else {
                dxss0.c = v - 0x80000000;
            }
        }
        else {
            dxss0 = new dxss(this, ibrl0);
        }
        Object object0 = dxss0.a;
        Object object1 = ibrx.a;
        switch(dxss0.c) {
            case 0: {
                ibnx.b(object0);
                SyncDeviceInfoRequest syncDeviceInfoRequest0 = new SyncDeviceInfoRequest();
                syncDeviceInfoRequest0.a = this.r.name;
                evql evql0 = this.j.cV(syncDeviceInfoRequest0);
                dxss0.c = 1;
                Object object2 = fsdk.a(evql0, dxss0);
                return object2 == object1 ? object1 : object2;
            }
            case 1: {
                ibnx.b(object0);
                return ((ibnw)object0).a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public static final boolean I(ftem ftem0) {
        return hwuq.c() ? (gtlq.b(ftem0.B) == null ? gtlq.a : gtlq.b(ftem0.B)) == gtlq.d : false;
    }

    public static final boolean J(ftem ftem0) {
        return dxsy.j(ftem0) ? false : !dxst.I(ftem0) && !dxst.o(ftem0) && ftem0.p > 0L;
    }

    @Override  // dxmi
    public final gtlg a() {
        gtqs gtqs0 = this.n;
        if(gtqs0 != null) {
            gtlg gtlg0 = gtqs0.b == null ? gtlg.a : gtqs0.b;
            if(gtlg0 != null) {
                return gtlg0;
            }
        }
        gtlg gtlg1 = this.h.j == null ? gtlg.a : this.h.j;
        ibuq.e(gtlg1, "getTopupAmount(...)");
        return gtlg1;
    }

    @Override  // dxmi
    public final gucv b(boolean z) {
        gtqs gtqs0 = this.n;
        if(gtqs0 == null) {
            gtqs0 = gtqs.a;
            ibuq.e(gtqs0, "getDefaultInstance(...)");
        }
        ftem ftem0 = this.h;
        dxnc dxnc0 = this.d;
        ibuq.f(ftem0, "config");
        ibuq.f(gtqs0, "response");
        gulh gulh0 = gulg.a(((gucu)((ProtoLiteMessage)gucv.a).v_newBuilder()));
        gulh0.f();
        gulh0.b(dxnc0.b.c());
        gulh0.h();
        gulb gulb0 = gula.a(((ProtoLiteMessage)gucn.a).v_newBuilder());
        gulb0.c(gudj.b);
        gulf gulf0 = gule.a(((gucs)((ProtoLiteMessage)guct.a).v_newBuilder()));
        gulf0.d();
        gulf0.b(dxnc0.b(ftem0));
        gulb0.b(gulf0.a());
        gulh0.e(gulb0.a());
        gulh0.h();
        gulb gulb1 = gula.a(((ProtoLiteMessage)gucn.a).v_newBuilder());
        gulb1.c(gudj.c);
        gulf gulf1 = gule.a(((gucs)((ProtoLiteMessage)guct.a).v_newBuilder()));
        for(Object object0: gtqs0.c) {
            gulf1.d();
            gtlg gtlg0 = ((gtqr)object0).b;
            if(gtlg0 == null) {
                gtlg0 = gtlg.a;
            }
            ibuq.e(gtlg0, "getAmount(...)");
            String s = ((gtqr)object0).c;
            ibuq.e(s, "getDescription(...)");
            gulf1.c(dxnc.c(gtlg0, s, null));
        }
        gulb1.b(gulf1.a());
        gulh0.e(gulb1.a());
        gulh0.g();
        gtlg gtlg1 = gtqs0.b == null ? gtlg.a : gtqs0.b;
        ibuq.e(gtlg1, "getTotalCost(...)");
        gulh0.d(dxnc0.a(gtlg1, ftem0, z));
        gtlq gtlq0 = gtlq.b(ftem0.B) == null ? gtlq.a : gtlq.b(ftem0.B);
        ibuq.e(gtlq0, "getImplementationType(...)");
        gulh0.c(dxsy.n(hagt.ba, gtlq0, (ftem0.r == null ? hkug.a : ftem0.r).d));
        return gulh0.a();
    }

    @Override  // dxmi
    public final void e() {
        icck icck0 = lsc.a(this);
        dxsl dxsl0 = new dxsl(this, null);
        icbb.b(icck0, this.e, null, dxsl0, 2);
    }

    public final Object r(gtrk gtrk0, long v, ibrl ibrl0) {
        dxsd dxsd0;
        if((ibrl0 instanceof dxsd)) {
            dxsd0 = (dxsd)ibrl0;
            int v1 = dxsd0.d;
            if((v1 & 0x80000000) == 0) {
                dxsd0 = new dxsd(this, ibrl0);
            }
            else {
                dxsd0.d = v1 - 0x80000000;
            }
        }
        else {
            dxsd0 = new dxsd(this, ibrl0);
        }
        Object object0 = dxsd0.b;
        Object object1 = ibrx.a;
        switch(dxsd0.d) {
            case 0: {
                ibnx.b(object0);
                dxsd0.e = gtrk0;
                dxsd0.a = v;
                dxsd0.d = 1;
                object0 = this.z(dxsd0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                v = dxsd0.a;
                gtrk0 = dxsd0.e;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        long v2 = 0L;
        gttd gttd0 = ((fsym)object0) == null ? null : dqjj.A((gtrk0.b == 1 ? ((long)(((Long)gtrk0.c))) : 0L), ((fsym)object0));
        if(gttd0 == null) {
            ggtj ggtj0 = (ggtj)dxmi.a.i();
            if(gtrk0.b == 1) {
                v2 = (long)(((Long)gtrk0.c));
            }
            ggtj0.A("Could not find ticket with accountTicketId %s", v2);
            return null;
        }
        return dlnf.av(this.r, gttd0, this.h.s, v, this.h.u);
    }

    public final Object v(ibrl ibrl0) {
        Object object2;
        dxse dxse0;
        if((ibrl0 instanceof dxse)) {
            dxse0 = (dxse)ibrl0;
            int v = dxse0.c;
            if((v & 0x80000000) == 0) {
                dxse0 = new dxse(this, ibrl0);
            }
            else {
                dxse0.c = v - 0x80000000;
            }
        }
        else {
            dxse0 = new dxse(this, ibrl0);
        }
        Object object0 = dxse0.a;
        Object object1 = ibrx.a;
        switch(dxse0.c) {
            case 0: {
                ibnx.b(object0);
                evql evql0 = this.w.av(this.r, this.h.p);
                dxse0.c = 1;
                object2 = fsdk.a(evql0, dxse0);
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
        if(((GetClosedLoopBundleResponse)object2) != null) {
            byte[] arr_b = ((GetClosedLoopBundleResponse)object2).a;
            if(arr_b == null) {
                throw new IllegalStateException("Required value was null.");
            }
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fsxo.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            ibuq.e(((fsxo)hftv0), "parseFrom(...)");
            return (fsxo)hftv0;
        }
        return null;
    }

    public final Object w(ibrl ibrl0) {
        gfnh gfnh1;
        gfnh gfnh0;
        Object object1;
        Object object0;
        dxsg dxsg0;
        if((ibrl0 instanceof dxsg)) {
            dxsg0 = (dxsg)ibrl0;
            int v = dxsg0.c;
            if((v & 0x80000000) == 0) {
                dxsg0 = new dxsg(this, ibrl0);
            }
            else {
                dxsg0.c = v - 0x80000000;
            }
        }
        else {
            dxsg0 = new dxsg(this, ibrl0);
        }
        try {
            object0 = dxsg0.a;
            object1 = ibrx.a;
            switch(dxsg0.c) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_44;
                }
                case 2: {
                    goto label_46;
                }
            }
        }
        catch(dpuk dpuk0) {
            a.ae(dxmi.a.j(), "Failed to get purchase preview info", dpuk0);
            return null;
        }
        catch(IOException iOException0) {
            a.ae(dxmi.a.j(), "Failed to get purchase preview info", iOException0);
            return null;
        }
        catch(dpui dpui0) {
            a.ae(dxmi.a.j(), "Failed to get purchase preview info", dpui0);
            return null;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ibnx.b(object0);
        try {
            ftem ftem0 = this.h;
            if((ftem0.b & 0x20000) != 0) {
                dxsg0.c = 1;
                dqhz dqhz0 = this.p;
                long v1 = ftem0.q;
                long v2 = ftem0.p;
                String s = (ftem0.t == null ? gtrc.a : ftem0.t).b;
                hkug hkug0 = ftem0.r == null ? hkug.a : ftem0.r;
                fsxo fsxo0 = this.m;
                if(fsxo0 == null) {
                    gfnh0 = null;
                }
                else {
                    gfnh0 = fsxo0.c == null ? gfnh.a : fsxo0.c;
                }
                object0 = icpu.c(jqy.a(new dqhv(dqhz0, v1, v2, s, hkug0, gfnh0, gtps.b(ftem0.u))), dxsg0);
                return object0 == object1 ? object1 : ((gtqs)object0);
            }
            dxsg0.c = 2;
            dqhz dqhz1 = this.p;
            long v3 = ftem0.q;
            long v4 = ftem0.p;
            gtlg gtlg0 = ftem0.j == null ? gtlg.a : ftem0.j;
            hkug hkug1 = ftem0.r == null ? hkug.a : ftem0.r;
            fsxo fsxo1 = this.m;
            if(fsxo1 == null) {
                gfnh1 = null;
            }
            else {
                gfnh1 = fsxo1.c == null ? gfnh.a : fsxo1.c;
            }
            object0 = icpu.c(jqy.a(new dqhw(dqhz1, v3, v4, gtlg0, hkug1, gfnh1, gtps.b(ftem0.u))), dxsg0);
            if(object0 == object1) {
                return object1;
            label_44:
                ibnx.b(object0);
                return (gtqs)object0;
            label_46:
                ibnx.b(object0);
            }
            return (gtqs)object0;
        }
        catch(dpuk dpuk0) {
            a.ae(dxmi.a.j(), "Failed to get purchase preview info", dpuk0);
            return null;
        }
        catch(IOException iOException0) {
            a.ae(dxmi.a.j(), "Failed to get purchase preview info", iOException0);
            return null;
        }
        catch(dpui dpui0) {
            a.ae(dxmi.a.j(), "Failed to get purchase preview info", dpui0);
            return null;
        }
    }

    public final Object x(gtrk gtrk0, long v, ibrl ibrl0) {
        int v3;
        dxsh dxsh0;
        if((ibrl0 instanceof dxsh)) {
            dxsh0 = (dxsh)ibrl0;
            int v1 = dxsh0.c;
            if((v1 & 0x80000000) == 0) {
                dxsh0 = new dxsh(this, ibrl0);
            }
            else {
                dxsh0.c = v1 - 0x80000000;
            }
        }
        else {
            dxsh0 = new dxsh(this, ibrl0);
        }
        Object object0 = dxsh0.a;
        Object object1 = ibrx.a;
        switch(dxsh0.c) {
            case 0: {
                ibnx.b(object0);
                dxsh0.c = 1;
                int v2 = gtrk0.b;
                switch(v2) {
                    case 0: {
                        v3 = 5;
                        break;
                    }
                    case 1: {
                        v3 = 1;
                        break;
                    }
                    case 2: {
                        v3 = 2;
                        break;
                    }
                    case 3: {
                        v3 = 3;
                        break;
                    }
                    case 4: {
                        v3 = 4;
                        break;
                    }
                    default: {
                        v3 = 0;
                    }
                }
                if(v3 == 0) {
                    throw null;
                }
                switch(v3 - 1) {
                    case 0: {
                        object0 = this.r(gtrk0, v, dxsh0);
                        break;
                    }
                    case 1: {
                        Context context0 = this.u;
                        gfsx gfsx0 = (v2 == 2 ? ((gtrh)gtrk0.c) : gtrh.a).c > 0L ? gfsx.l(Long.valueOf((gtrk0.b == 2 ? ((gtrh)gtrk0.c) : gtrh.a).c)) : gfqx.a;
                        String s = (gtrk0.b == 2 ? ((gtrh)gtrk0.c) : gtrh.a).b;
                        ibuq.e(s, "getExternalCardId(...)");
                        gfsx gfsx1 = s.length() > 0 ? gfsx.l((gtrk0.b == 2 ? ((gtrh)gtrk0.c) : gtrh.a).b) : gfqx.a;
                        ftem ftem0 = this.h;
                        hkug hkug0 = ftem0.r == null ? hkug.a : ftem0.r;
                        gtls gtls0 = gtls.b;
                        String s1 = this.r.name;
                        ibuq.e(s1, "name");
                        fton fton0 = fton.a;
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fton0).v_newBuilder();
                        String s2 = (ftem0.z == null ? fton0 : ftem0.z).c;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        s2.getClass();
                        ((fton)hftv0).b |= 1;
                        ((fton)hftv0).c = s2;
                        fton fton1 = ftem0.z;
                        if(fton1 != null) {
                            fton0 = fton1;
                        }
                        long v4 = fton0.d;
                        if(!hftv0.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp0.b_message;
                        ((fton)hftv1).b |= 2;
                        ((fton)hftv1).d = v4;
                        if(!hftv1.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        fton fton2 = (fton)hftp0.b_message;
                        s1.getClass();
                        fton2.b |= 4;
                        fton2.e = s1;
                        ProtoLiteMessage hftv2 = hftp0.N_build();
                        ibuq.e(hftv2, "build(...)");
                        ftfj ftfj0 = (ftfj)((ProtoLiteMessage)ftfk.a).v_newBuilder();
                        if((ftem0.j == null ? gtlg.a : ftem0.j).b > 0L) {
                            ftfj0.a(fscd.c((ftem0.j == null ? gtlg.a : ftem0.j)));
                        }
                        String s3 = ftem0.v;
                        ibuq.e(s3, "getCardArtFifeUrl(...)");
                        guez guez0 = dsgq.b(s3);
                        if(!ftfj0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)ftfj0).ensureMutable();
                        }
                        ftfk ftfk0 = (ftfk)ftfj0.b_message;
                        guez0.getClass();
                        ftfk0.d = guez0;
                        ftfk0.b |= 1;
                        ProtoLiteMessage hftv3 = ((ProtoLiteBuilder)ftfj0).N_build();
                        ibuq.e(hftv3, "build(...)");
                        Object object2 = dlnf.at(context0, v, gfsx0, gfsx1, hkug0, gtls0, ((fton)hftv2), ((ftfk)hftv3));
                        ibuq.e(object2, "newSaveCardCentricIntent(...)");
                        object0 = object2;
                        break;
                    }
                    case 2: {
                        if(hwuq.c()) {
                            SaveTransitPlcIntentArgs saveTransitPlcIntentArgs0 = new SaveTransitPlcIntentArgs();
                            saveTransitPlcIntentArgs0.a = (gtrk0.b == 3 ? ((gtrj)gtrk0.c) : gtrj.a).b;
                            saveTransitPlcIntentArgs0.b = 1;
                            saveTransitPlcIntentArgs0.d = v;
                            saveTransitPlcIntentArgs0.c = ftqe.a(((MessageLite)(this.h.r == null ? hkug.a : this.h.r)));
                            Intent intent0 = dlnf.ay(this.u, saveTransitPlcIntentArgs0);
                            ibuq.e(intent0, "newSaveTransitPlcFragmentIntent(...)");
                            object0 = intent0;
                        }
                        else {
                            object0 = null;
                        }
                        break;
                    }
                    case 3: {
                        object0 = hwiq.d() ? dlnf.A((gtrk0.b == 4 ? ((gtri)gtrk0.c) : gtri.a).b, gtrk0.d) : null;
                        break;
                    }
                    default: {
                        object0 = null;
                    }
                }
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
        if(((Intent)object0) == null) {
            ((ggtj)dxmi.a.i()).x("Intent is null");
            dxmi.q(this, null, null, hagu.l, 3);
            return ibom.a;
        }
        if(hwue.g()) {
            this.j(lsc.a(this), new frxf[]{new frxg(((Intent)object0)), new dxne(((Intent)object0))});
            return ibom.a;
        }
        this.j(lsc.a(this), new frxf[]{new frxg(((Intent)object0))});
        return ibom.a;
    }

    public final Object y(ibrl ibrl0) {
        Object object2;
        dxsi dxsi0;
        if((ibrl0 instanceof dxsi)) {
            dxsi0 = (dxsi)ibrl0;
            int v = dxsi0.c;
            if((v & 0x80000000) == 0) {
                dxsi0 = new dxsi(this, ibrl0);
            }
            else {
                dxsi0.c = v - 0x80000000;
            }
        }
        else {
            dxsi0 = new dxsi(this, ibrl0);
        }
        Object object0 = dxsi0.a;
        Object object1 = ibrx.a;
        switch(dxsi0.c) {
            case 0: {
                ibnx.b(object0);
                String s = hwih.c();
                evql evql0 = this.w.as(this.r, s);
                dxsi0.c = 1;
                object2 = fsdk.a(evql0, dxsi0);
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
        if(((ProtoSafeParcelable)object2) != null) {
            byte[] arr_b = ((ProtoSafeParcelable)object2).a;
            if(arr_b == null) {
                throw new IllegalStateException("Required value was null.");
            }
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gtfb.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (gtfb)hftv0;
        }
        return null;
    }

    public final Object z(ibrl ibrl0) {
        Object object2;
        dxsj dxsj0;
        if((ibrl0 instanceof dxsj)) {
            dxsj0 = (dxsj)ibrl0;
            int v = dxsj0.c;
            if((v & 0x80000000) == 0) {
                dxsj0 = new dxsj(this, ibrl0);
            }
            else {
                dxsj0.c = v - 0x80000000;
            }
        }
        else {
            dxsj0 = new dxsj(this, ibrl0);
        }
        Object object0 = dxsj0.a;
        Object object1 = ibrx.a;
        switch(dxsj0.c) {
            case 0: {
                ibnx.b(object0);
                evql evql0 = this.w.ax(this.r);
                dxsj0.c = 1;
                object2 = fsdk.a(evql0, dxsj0);
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
        return ((ProtoSafeParcelable)object2) != null ? dqjj.j(((ProtoSafeParcelable)object2).a) : null;
    }
}

