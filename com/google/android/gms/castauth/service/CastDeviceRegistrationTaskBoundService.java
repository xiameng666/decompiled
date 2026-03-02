package com.google.android.gms.castauth.service;

import ProtoLiteMessage;
import android.content.Context;
import android.os.Bundle;
import avlq;
import avoe;
import avon;
import avop;
import avor;
import avos;
import avot;
import avqg;
import bbdg;
import bboh;
import cclw;
import ccmq;
import cljp;
import clkn;
import cllc;
import cllr;
import com.google.android.gms.chimera.modules.castauth.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import gfqs;
import gfug;
import ggtj;
import gkjc;
import gkjf;
import gkjg;
import gkjh;
import gkji;
import gmcd;
import ibnn;
import ibns;
import ibnv;
import ibnw;
import ibnx;
import ibnz;
import ibrl;
import ibrx;
import ibuk;
import ibuq;
import icck;
import iccl;
import icpu;
import jyu;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CastDeviceRegistrationTaskBoundService extends GmsTaskBoundService {
    public static final bboh a;
    public static final ibnn b;
    public final gfug c;
    private final icck d;

    static {
        CastDeviceRegistrationTaskBoundService.a = avqg.a("CastDeviceRegistrationTaskBoundService");
        CastDeviceRegistrationTaskBoundService.b = new ibnz(new avop());
    }

    public CastDeviceRegistrationTaskBoundService() {
        this(null, null, 3, null);
    }

    public CastDeviceRegistrationTaskBoundService(icck icck0, gfug gfug0) {
        ibuq.f(icck0, "backgroundCoroutineScope");
        ibuq.f(gfug0, "stopWatch");
        super();
        this.d = icck0;
        this.c = gfug0;
    }

    public CastDeviceRegistrationTaskBoundService(icck icck0, gfug gfug0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            icck0 = iccl.b(cclw.b);
        }
        if((v & 2) != 0) {
            gfug0 = new gfug(gfqs.a);
        }
        this(icck0, gfug0);
    }

    public final Object d(avor avor0, Long long0, ibrl ibrl0) {
        Object object2;
        avos avos0;
        if((ibrl0 instanceof avos)) {
            avos0 = (avos)ibrl0;
            int v = avos0.c;
            if((v & 0x80000000) == 0) {
                avos0 = new avos(this, ibrl0);
            }
            else {
                avos0.c = v - 0x80000000;
            }
        }
        else {
            avos0 = new avos(this, ibrl0);
        }
        Object object0 = avos0.a;
        Object object1 = ibrx.a;
        switch(avos0.c) {
            case 0: {
                ibnx.b(object0);
                avon avon0 = avoe.a();
                avos0.d = avor0;
                avos0.e = long0;
                avos0.c = 1;
                object2 = avon0.b(avor0.a, avos0);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                long0 = avos0.e;
                avor0 = avos0.d;
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
        if(((String)object2) != null && ((String)object2).length() != 0) {
            gkji gkji0 = gkjh.a(((ProtoLiteMessage)gkjg.a).v_newBuilder());
            gkji0.d(gkjf.b);
            gkji0.b(avor0.b);
            gkji0.c(this.c.d().toMillis());
            gkjg gkjg0 = gkji0.a();
            avlq.b(gkjc.d, gkjg0, long0);
            Context context0 = AppContextProvider.a();
            ibuq.e(context0, "getApplicationContext(...)");
            ibuq.f(context0, "context");
            ((ggtj)IdentityRegistrationTaskBoundService.a.h()).B("Start scheduling %s", "IdentityRegistrationTaskBoundService");
            clkn clkn0 = new clkn();
            clkn0.e(0L, 1L);
            clkn0.w(new ibuk(IdentityRegistrationTaskBoundService.class).b());
            clkn0.p = true;
            clkn0.t("IdentityRegistrationTaskBoundService");
            clkn0.y(0, 0);
            clkn0.t = (cllc)IdentityRegistrationTaskBoundService.b.a();
            clkn0.v(2);
            clkn0.u = jyu.a(new ibns[]{new ibns("deviceId", ((String)object2)), new ibns("anlyticsSessionId", long0)});
            cljp.a(context0).f(clkn0.a());
            ((ggtj)IdentityRegistrationTaskBoundService.a.h()).B("Scheduled %s", "IdentityRegistrationTaskBoundService");
            return new Integer(0);
        }
        gkji gkji1 = gkjh.a(((ProtoLiteMessage)gkjg.a).v_newBuilder());
        gkji1.d(gkjf.h);
        gkji1.b(avor0.b);
        gkji1.c(this.c.d().toMillis());
        gkjg gkjg1 = gkji1.a();
        avlq.b(gkjc.d, gkjg1, long0);
        return new Integer(1);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final gmcd iL(cllr cllr0) {
        ccmq.a().a(bbdg.rA);
        ((ggtj)CastDeviceRegistrationTaskBoundService.a.h()).B("Start run %s", cllr0.a);
        this.c.e();
        Bundle bundle0 = cllr0.b;
        if(bundle0 != null) {
            bundle0.getString("deviceId");
        }
        avot avot0 = new avot(this, (bundle0 == null ? null : bundle0.getLong("anlyticsSessionId")), null);
        return icpu.e(this.d, avot0);
    }
}

