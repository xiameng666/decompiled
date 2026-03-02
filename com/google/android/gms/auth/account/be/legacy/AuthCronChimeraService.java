package com.google.android.gms.auth.account.be.legacy;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import adga;
import adiz;
import adja;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import bblp;
import cdui;
import cljp;
import clkq;
import cllb;
import cllc;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import gakj;
import gakk;
import ghom;
import ghon;
import ghor;
import gmcd;
import hpfi;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class AuthCronChimeraService extends GmsTaskChimeraService {
    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final int a(cllr cllr0) {
        String s = cllr0.a;
        if("buffered_logs_update".equals(s)) {
            this.getApplicationContext();
            AuthCronChimeraService.d(gakj.a(this.getApplicationContext()), new gakk(this.getApplicationContext(), "ANDROID_AUTH"), adga.b(this.getApplicationContext()));
            this.getApplicationContext();
            AuthCronChimeraService.d(gakj.a(this.getApplicationContext()), new gakk(this.getApplicationContext(), "KIDS_SUPERVISION"), adga.c(this.getApplicationContext()));
            return 0;
        }
        if("auth_droidguard_recurring_run".equals(s)) {
            gmcd gmcd0 = new bblp(1, 9).e(new adiz(this));
            try {
                return (int)(((Integer)gmcd0.get(((long)(((int)hpfi.a.i().c()))), TimeUnit.SECONDS)));
            }
            catch(InterruptedException | ExecutionException | TimeoutException unused_ex) {
                return 1;
            }
        }
        Log.w("Auth", String.format(Locale.US, "[AuthCronChimeraService] Unknown tag %s", s));
        return 2;
    }

    static void d(gakj gakj0, gakk gakk0, String s) {
        gakk0.b(s);
        gakj0.e(s);
    }

    public static final void e(Context context0) {
        cljp cljp0 = cljp.a(context0);
        long v = hpfi.c();
        cllc cllc0 = cllb.a(0, 30, ((int)hpfi.b()));
        clkq clkq0 = new clkq();
        clkq0.j = "com.google.android.gms.auth.account.be.legacy.AuthCronService";
        clkq0.a = v;
        clkq0.t("auth_droidguard_recurring_run");
        clkq0.b = -1L + v;
        clkq0.v(2);
        clkq0.p = true;
        clkq0.t = cllc0;
        clkq0.x(0, 1);
        clkq0.g(0);
        cljp0.f(clkq0.a());
    }

    public static final void f(long v, int v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghon.a).v_newBuilder();
        ghom ghom0 = ghom.q;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ghon)hftp0.b_message).e = ghom0.av;
        ((ghon)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghor.a).v_newBuilder();
        long v2 = SystemClock.elapsedRealtime() - v;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((ghor)hftv0).b |= 2;
        ((ghor)hftv0).d = v2;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((ghor)hftp1.b_message).c = v1 - 1;
        ((ghor)hftp1.b_message).b |= 1;
        ghor ghor0 = (ghor)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghon ghon0 = (ghon)hftp0.b_message;
        ghor0.getClass();
        ghon0.u = ghor0;
        ghon0.b |= 0x40000;
        ghon ghon1 = (ghon)hftp0.N_build();
        cdui.v().j(((ProtoLiteMessage)ghon1));
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final void fW() {
        adja.a.b(this);
    }
}

