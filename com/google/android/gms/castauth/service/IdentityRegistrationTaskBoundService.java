package com.google.android.gms.castauth.service;

import ProtoLiteMessage;
import a;
import acrv;
import adnw;
import adoe;
import adoh;
import android.content.Context;
import android.os.Bundle;
import avlq;
import avls;
import avlz;
import avoz;
import avpa;
import avqg;
import azts;
import azzc;
import bbdg;
import bboh;
import ccmq;
import cljp;
import clkn;
import cllc;
import cllr;
import com.google.android.gms.auth.account.device.AddCastCertificateToDeviceAccountRequest;
import com.google.android.gms.chimera.modules.castauth.AppContextProvider;
import com.google.android.gms.common.Feature;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import evrg;
import gfqs;
import gfug;
import ggtj;
import gkjc;
import gkjr;
import gkjs;
import gkjt;
import gkju;
import ibnn;
import ibns;
import ibnv;
import ibnw;
import ibnx;
import ibnz;
import ibuk;
import ibuq;
import java.security.cert.X509Certificate;
import jyu;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IdentityRegistrationTaskBoundService extends GmsTaskBoundService {
    public static final bboh a;
    public static final ibnn b;
    private final gfug c;
    private adnw d;
    private avls e;

    static {
        IdentityRegistrationTaskBoundService.a = avqg.a("IdentityRegistrationTaskBoundService");
        IdentityRegistrationTaskBoundService.b = new ibnz(new avoz());
    }

    public IdentityRegistrationTaskBoundService() {
        this(null, 1, null);
    }

    public IdentityRegistrationTaskBoundService(gfug gfug0) {
        ibuq.f(gfug0, "stopWatch");
        super();
        this.c = gfug0;
    }

    public IdentityRegistrationTaskBoundService(gfug gfug0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            gfug0 = new gfug(gfqs.a);
        }
        this(gfug0);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        Object object3;
        Object object2;
        String s;
        ccmq.a().a(bbdg.rB);
        bboh bboh0 = IdentityRegistrationTaskBoundService.a;
        ((ggtj)bboh0.h()).B("Start run %s", cllr0.a);
        gfug gfug0 = this.c;
        gfug0.e();
        Bundle bundle0 = cllr0.b;
        if(bundle0 == null) {
            s = "";
        }
        else {
            s = bundle0.getString("deviceId");
            if(s == null) {
                s = "";
            }
        }
        Object object0 = null;
        Long long0 = bundle0 == null ? null : bundle0.getLong("anlyticsSessionId");
        adnw adnw0 = this.d;
        if(adnw0 == null) {
            adnw0 = new adoh(AppContextProvider.a());
        }
        this.d = adnw0;
        avls avls0 = this.e;
        if(avls0 == null) {
            Object object1 = avlz.a();
            if(!(object1 instanceof ibnv)) {
                object0 = object1;
            }
            avls0 = (avls)object0;
        }
        this.e = avls0;
        gfug0.f();
        gkjs gkjs0 = gkjs.a;
        gkju gkju0 = gkjt.a(((ProtoLiteMessage)gkjs0).v_newBuilder());
        gkju0.c(gkjr.b);
        gkjs gkjs1 = gkju0.a();
        avlq.e(gkjc.e, gkjs1, long0);
        avls avls1 = this.e;
        if(avls1 != null) {
            X509Certificate[] arr_x509Certificate = avls1.d();
            if(arr_x509Certificate != null) {
                ((ggtj)bboh0.h()).x("Starting register device Id and certificates with the IdDid.");
                byte[][] arr2_b = avpa.a(arr_x509Certificate);
                try {
                    object2 = new AddCastCertificateToDeviceAccountRequest(s, arr2_b);
                }
                catch(Throwable throwable0) {
                    object2 = ibnx.a(throwable0);
                }
                Throwable throwable1 = ibnw.a(object2);
                if(throwable1 == null) {
                    AddCastCertificateToDeviceAccountRequest addCastCertificateToDeviceAccountRequest0 = (AddCastCertificateToDeviceAccountRequest)object2;
                    try {
                        adnw adnw1 = this.d;
                        ibuq.c(adnw1);
                        azzc azzc0 = new azzc();
                        azzc0.c = new Feature[]{acrv.f};
                        azzc0.a = new adoe(((adoh)adnw1), addCastCertificateToDeviceAccountRequest0);
                        azzc0.d = 0x67B;
                        object3 = (String)evrg.n(((azts)adnw1).jn(azzc0.a()));
                    }
                    catch(Throwable throwable2) {
                        object3 = ibnx.a(throwable2);
                    }
                    Throwable throwable3 = ibnw.a(object3);
                    if(throwable3 == null) {
                        ibuq.c(((String)object3));
                        if(((String)object3).length() == 0) {
                            gkju gkju1 = gkjt.a(((ProtoLiteMessage)gkjs.a).v_newBuilder());
                            gkju1.c(gkjr.g);
                            gkju1.b(this.c.d().toMillis());
                            gkjs gkjs2 = gkju1.a();
                            avlq.e(gkjc.f, gkjs2, long0);
                            ((ggtj)IdentityRegistrationTaskBoundService.a.i()).x("Empty IdDid; Failed to identify with GMS core.");
                            return 1;
                        }
                        ((ggtj)IdentityRegistrationTaskBoundService.a.h()).x("Success register device Id and certificates with the IdDid.");
                        gkju gkju2 = gkjt.a(((ProtoLiteMessage)gkjs.a).v_newBuilder());
                        gkju2.c(gkjr.b);
                        gkju2.b(this.c.d().toMillis());
                        gkjs gkjs3 = gkju2.a();
                        avlq.e(gkjc.f, gkjs3, long0);
                        Context context0 = AppContextProvider.a();
                        ibuq.e(context0, "getApplicationContext(...)");
                        ibuq.f(context0, "context");
                        ibuq.f(s, "deviceId");
                        ibuq.f(((String)object3), "idDid");
                        ((ggtj)PostIdDidTaskBoundService.a.h()).B("Start scheduling %s", "PostIdDidTaskBoundService");
                        clkn clkn0 = new clkn();
                        clkn0.e(0L, 1L);
                        clkn0.w(new ibuk(PostIdDidTaskBoundService.class).b());
                        clkn0.p = true;
                        clkn0.t("PostIdDidTaskBoundService");
                        clkn0.y(0, 0);
                        clkn0.t = (cllc)PostIdDidTaskBoundService.b.a();
                        clkn0.v(2);
                        clkn0.u = jyu.a(new ibns[]{new ibns("deviceId", s), new ibns("idDid", ((String)object3)), new ibns("anlyticsSessionId", long0)});
                        cljp.a(context0).f(clkn0.a());
                        ((ggtj)PostIdDidTaskBoundService.a.h()).B("Scheduled %s", "PostIdDidTaskBoundService");
                        return 0;
                    }
                    if((throwable3 instanceof InterruptedException)) {
                        Thread.currentThread().interrupt();
                    }
                    a.ae(IdentityRegistrationTaskBoundService.a.i(), "Failed to identify with GMS core.", throwable3);
                    gkju gkju3 = gkjt.a(((ProtoLiteMessage)gkjs.a).v_newBuilder());
                    gkju3.c(gkjr.f);
                    gkju3.b(this.c.d().toMillis());
                    gkjs gkjs4 = gkju3.a();
                    avlq.e(gkjc.f, gkjs4, long0);
                    return 1;
                }
                a.ae(IdentityRegistrationTaskBoundService.a.i(), "Failed to create addCastCertificateToDeviceAccountRequest.", throwable1);
                gkju gkju4 = gkjt.a(((ProtoLiteMessage)gkjs.a).v_newBuilder());
                gkju4.c(gkjr.e);
                gkju4.b(this.c.d().toMillis());
                gkjs gkjs5 = gkju4.a();
                avlq.e(gkjc.f, gkjs5, long0);
                return 1;
            }
        }
        ((ggtj)bboh0.i()).x("No cast credentials available on the device.");
        gkju gkju5 = gkjt.a(((ProtoLiteMessage)gkjs0).v_newBuilder());
        gkju5.c(gkjr.d);
        gkjs gkjs6 = gkju5.a();
        avlq.e(gkjc.f, gkjs6, long0);
        return 1;
    }
}

