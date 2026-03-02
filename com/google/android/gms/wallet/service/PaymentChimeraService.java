package com.google.android.gms.wallet.service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import cjtg;
import cjtn;
import cjts;
import com.google.android.gms.common.internal.GetServiceRequest;
import etgl;
import fbdo;
import fbes;
import fbpc;
import fbqa;
import fbqj;
import fbqs;
import fbqz;
import fbrc;
import fbtb;
import fbts;
import fbtv;
import fbuf;
import fbvw;
import fbwc;
import fbwo;
import fbwq;
import fbwr;
import fbwv;
import fbwy;
import fbxb;
import fbxd;
import fbxg;
import fbxi;
import gamy;
import gapn;
import gaxn;
import gged_interceptors;
import ggnj;
import ifvn;

public class PaymentChimeraService extends cjtg {
    public static final gged_interceptors a;
    private fbwr b;
    private fbwv c;
    private fbqs d;
    private fbuf m;
    private fbxi n;
    private gapn o;
    private fbes p;
    private fbqa q;
    private fbts r;
    private fbrc s;
    private fbqz t;
    private fbpc u;
    private gamy v;

    static {
        PaymentChimeraService.a = gged_interceptors.t("com.google.android.gms.wallet.service.BIND", "com.google.android.gms.wallet.service.ib.IIbService", "com.google.android.gms.wallet.service.ib.UpdatePaymentDetailsService", "org.chromium.intent.action.UPDATE_PAYMENT_DETAILS", "com.google.android.gms.wallet.service.ow.IOwInternalService", "com.google.android.gms.wallet.service.orchestration.IOrchestrationService", "com.google.android.gms.wallet.service.reauth.IReauthService", "com.google.android.gms.wallet.bender3.framework.actions.IActionExecutorService", "org.chromium.intent.action.IS_READY_TO_PAY");
    }

    public PaymentChimeraService() {
        super(4, "com.google.android.gms.wallet.service.BIND", ggnj.a, 3, 9);
        this.b = null;
        this.c = null;
        this.d = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.v = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        fbwr fbwr0 = this.p();
        if(fbwr0 != null) {
            cjtn0.c(fbwr0);
            return;
        }
        cjtn0.b(16, null, null);
    }

    private final IBinder c(Intent intent0) {
        IBinder iBinder0;
        synchronized(this) {
            Context context0 = this.getApplicationContext();
            fbrc fbrc0 = this.j();
            Bundle bundle0 = intent0.getExtras();
            if(bundle0 == null) {
                bundle0 = new Bundle();
            }
            iBinder0 = new ifvn(fbrc0, bundle0, context0);
        }
        return iBinder0;
    }

    private final IBinder d() {
        IBinder iBinder0;
        synchronized(this) {
            iBinder0 = this.i().c.getBinder();
        }
        return iBinder0;
    }

    private final IBinder e() {
        IBinder iBinder0;
        synchronized(this) {
            iBinder0 = this.i().e;
        }
        return iBinder0;
    }

    private final fbes f() {
        if(this.p == null) {
            this.p = new fbes(this.getApplicationContext());
        }
        return this.p;
    }

    private final fbqa g() {
        if(this.q == null) {
            this.q = new fbqa(this.getApplicationContext());
        }
        return this.q;
    }

    private final fbqs h() {
        synchronized(this) {
            if(this.d == null) {
                fbtb fbtb0 = new fbtb(this.j());
                this.getApplicationContext();
                this.d = new fbqj(fbtb0);
            }
        }
        return this.d;
    }

    private final fbqz i() {
        if(this.t == null) {
            this.t = new fbqz(this.getApplicationContext());
        }
        return this.t;
    }

    private final fbrc j() {
        if(this.s == null) {
            this.s = new fbrc(this.getApplicationContext(), this.g(), new etgl(this.getApplicationContext()), this.k(), this.t());
        }
        return this.s;
    }

    private final fbts k() {
        if(this.r == null) {
            fbvw fbvw0 = new fbvw(this.getApplicationContext(), this.f(), new fbwo(this.getApplicationContext(), new etgl(this.getApplicationContext())), this.t());
            this.r = new fbts(this.getApplicationContext(), fbvw0, this.t());
        }
        return this.r;
    }

    private final fbuf o() {
        synchronized(this) {
            if(this.m == null) {
                fbwc fbwc0 = new fbwc(this.k());
                this.getApplicationContext();
                this.m = new fbtv(fbwc0);
            }
        }
        return this.m;
    }

    @Override  // cjtg
    public final IBinder onBind(Intent intent0) {
        String s = intent0.getAction();
        if(s != null) {
            switch(s.hashCode()) {
                case 0x83DF2847: {
                    if(s.equals("com.google.android.gms.wallet.service.ow.IOwInternalService")) {
                        return this.q();
                    }
                    break;
                }
                case -2035121334: {
                    if(s.equals("com.google.android.gms.wallet.service.orchestration.IOrchestrationService")) {
                        return this.o();
                    }
                    break;
                }
                case 0x99DDBFC1: {
                    return s.equals("org.chromium.intent.action.IS_READY_TO_PAY") ? this.c(intent0) : null;
                }
                case 0xE1185007: {
                    return s.equals("org.chromium.intent.action.UPDATE_PAYMENT_DETAILS") ? this.e() : null;
                }
                case -463047518: {
                    if(s.equals("com.google.android.gms.wallet.service.ib.IIbService")) {
                        return this.h();
                    }
                    break;
                }
                case 0xEE8F70A1: {
                    return s.equals("com.google.android.gms.wallet.service.ib.UpdatePaymentDetailsService") ? this.d() : null;
                }
                case 0xF2165F63: {
                    return s.equals("com.google.android.gms.wallet.service.BIND") ? super.onBind(intent0) : null;
                }
                case -216600674: {
                    if(s.equals("com.google.android.gms.wallet.service.reauth.IReauthService")) {
                        return this.r();
                    }
                    break;
                }
                case 0x33AAEB12: {
                    if(s.equals("com.google.android.gms.wallet.bender3.framework.actions.IActionExecutorService")) {
                        return this.s();
                    }
                    break;
                }
                default: {
                    return null;
                }
            }
        }
        return null;
    }

    @Override  // com.google.android.chimera.BoundService
    public final void onCreate() {
        gaxn.a(this.getApplicationContext());
    }

    private final fbwr p() {
        synchronized(this) {
            if(this.b == null) {
                Context context0 = this.getApplicationContext();
                fbts fbts0 = this.k();
                etgl etgl0 = new etgl(this.getApplicationContext());
                if(this.u == null) {
                    this.u = new fbpc();
                }
                fbxb fbxb0 = new fbxb(context0, fbts0, etgl0, this.j(), new cjts(this.getApplicationContext(), this.l, this.e), this.t(), this.g());
                this.getApplicationContext();
                this.b = new fbwr(this.getApplicationContext(), fbxb0);
            }
        }
        return this.b;
    }

    private final fbwv q() {
        synchronized(this) {
            if(this.c == null) {
                fbxd fbxd0 = new fbxd(this.getApplicationContext(), this.f());
                fbxg fbxg0 = new fbxg(new fbwy(this.getApplicationContext(), fbxd0, this.g()));
                this.c = new fbwq(this.getApplicationContext(), fbxg0);
            }
        }
        return this.c;
    }

    private final fbxi r() {
        synchronized(this) {
            if(this.n == null) {
                this.n = new fbxi(this.getApplicationContext());
            }
        }
        return this.n;
    }

    private final gapn s() {
        synchronized(this) {
            if(this.o == null) {
                this.o = new gapn(this.t(), this.getApplicationContext());
            }
        }
        return this.o;
    }

    private final gamy t() {
        if(this.v == null) {
            this.v = fbdo.a(this.getApplicationContext());
        }
        return this.v;
    }
}

