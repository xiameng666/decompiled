package com.google.android.gms.smartdevice.d2d;

import android.content.Context;
import android.os.Looper;
import bblp;
import bboe;
import cjpa;
import cjpd;
import clht;
import cljp;
import clkn;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import epwe;
import epxo;
import epxp;
import epyt;
import epzg;
import eqln;
import eqrm;
import frpe;
import hyhe;
import hyhh;
import hyim;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class CleanSharedSecretChimeraService extends GmsTaskChimeraService {
    private static final Executor a;
    private static final bboe b;

    static {
        CleanSharedSecretChimeraService.a = new bblp(1, 10);
        CleanSharedSecretChimeraService.b = new epxo();
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final int a(cllr cllr0) {
        epwe epwe0 = epzg.a(this);
        String s = cllr0.a;
        if("cleanSharedSecret".equals(s)) {
            eqrm eqrm0 = new eqrm(this);
            long v = cjpd.b(eqrm0.b, "session", 0L);
            cjpa cjpa0 = eqrm0.b.c();
            cjpa0.j("sharedSecret");
            cjpa0.j("session");
            cjpd.f(cjpa0);
            eqrm0.c.d(3);
            eqrm0.c.c(v);
            eqrm0.c.a();
        }
        if("cleanWorkProfile".equals(s)) {
            cjpa cjpa1 = new eqln(this, new clht(Looper.getMainLooper())).b.c();
            cjpa1.d();
            if(cjpd.g(cjpa1)) {
                eqln.a.d("Managed account state cleared", new Object[0]);
            }
            else {
                eqln.a.f("Failed to clear managed account state", new Object[0]);
            }
            ((frpe)epwe0.b.mr()).b(new Object[0]);
        }
        if("cleanEsimActivation".equals(s)) {
            cjpa cjpa2 = new epyt(this).a.c();
            cjpa2.d();
            cjpd.f(cjpa2);
        }
        return 0;
    }

    public static void d(Context context0) {
        Object object0 = CleanSharedSecretChimeraService.b.a(context0);
        long v = hyhh.a.b().a();
        long v1 = TimeUnit.HOURS.toSeconds(12L) + v;
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.smartdevice.d2d.CleanSharedSecretService";
        clkn0.t("cleanEsimActivation");
        clkn0.e(v, v1);
        clkn0.v(1);
        clkn0.p = true;
        ((cljp)object0).f(clkn0.a());
    }

    public static void e(Context context0) {
        Object object0 = CleanSharedSecretChimeraService.b.a(context0);
        long v = hyhe.a.c().a();
        long v1 = TimeUnit.HOURS.toSeconds(12L) + v;
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.smartdevice.d2d.CleanSharedSecretService";
        clkn0.t("cleanWorkProfile");
        clkn0.e(v, v1);
        clkn0.v(1);
        clkn0.p = true;
        ((cljp)object0).f(clkn0.a());
    }

    public static void f(Context context0) {
        Object object0 = CleanSharedSecretChimeraService.b.a(context0);
        long v = hyim.a.e().o();
        long v1 = TimeUnit.HOURS.toSeconds(1L) + v;
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.smartdevice.d2d.CleanSharedSecretService";
        clkn0.t("cleanSharedSecret");
        clkn0.v(1);
        clkn0.e(v, v1);
        clkn0.p = true;
        ((cljp)object0).f(clkn0.a());
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final void fW() {
        epxp epxp0 = new epxp(this);
        CleanSharedSecretChimeraService.a.execute(epxp0);
    }
}

