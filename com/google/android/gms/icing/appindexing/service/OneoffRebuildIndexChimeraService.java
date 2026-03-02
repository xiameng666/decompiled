package com.google.android.gms.icing.appindexing.service;

import MoreObjects;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings.Global;
import batl;
import bbqr;
import bwne;
import bwqx;
import cljp;
import clkn;
import cllb;
import cllc;
import cllr;
import glrw;
import huar;
import hubu;
import java.util.concurrent.TimeUnit;

public class OneoffRebuildIndexChimeraService extends RebuildIndexChimeraService {
    static final cllc a;
    public static final int b;

    static {
        OneoffRebuildIndexChimeraService.a = cllb.a(0, ((int)TimeUnit.MINUTES.toSeconds(30L)), ((int)TimeUnit.DAYS.toSeconds(1L)));
    }

    @Override  // com.google.android.gms.icing.appindexing.service.RebuildIndexChimeraService
    public final int d(cllr cllr0, bwqx bwqx0) {
        batl.s(cllr0.b);
        String s = cllr0.b.getString("packageName");
        int v = cllr0.b.getInt("sourceValue", 0);
        if(s != null && !bbqr.d(s)) {
            if(!bwqx0.e(s, System.currentTimeMillis(), ((glrw)MoreObjects.firstNonNull(glrw.b(v), glrw.a)), true)) {
                bwne.b("Failed to send index request to package %s; will reschedule.", s);
                return 1;
            }
            return 0;
        }
        bwne.g("%s: package name is null or empty.", cllr0.a);
        return 2;
    }

    public static void e(Context context0, String s, glrw glrw0) {
        long v1;
        long v;
        batl.s(s);
        if(!"com.google.android.gms".equals(s)) {
            Intent intent0 = bwqx.a(s);
            if(!bwqx.d(context0, intent0) && !bwqx.c(context0, intent0)) {
                bwne.b("Rebuild index intent missing for package %s.", s);
                return;
            }
        }
        String s1 = s.substring(Math.max(0, s.length() - 0x77));
        Bundle bundle0 = new Bundle();
        bundle0.putString("packageName", s);
        bundle0.putInt("sourceValue", glrw0.a());
        cljp cljp0 = cljp.a(context0);
        if(Settings.Global.getInt(context0.getContentResolver(), "adb_enabled", 0) == 0) {
            v1 = huar.a.d().r();
            v = huar.a.d().p();
        }
        else {
            v = 60L;
            v1 = 30L;
        }
        clkn clkn0 = new clkn();
        clkn0.e(v1, v);
        clkn0.t = OneoffRebuildIndexChimeraService.a;
        clkn0.u = bundle0;
        clkn0.t("OneoffIndexRebuild-" + s1);
        clkn0.p = true;
        clkn0.y(((int)huar.a.d().q()), 1);
        clkn0.x(((int)huar.a.d().ab()), 1);
        clkn0.j = "com.google.android.gms.icing.indexapi.OneoffRebuildIndexService";
        clkn0.v(1);
        if(hubu.l()) {
            clkn0.f(0, 1);
        }
        else {
            clkn0.i(huar.k());
        }
        cljp0.f(clkn0.a());
        bwne.b("Scheduled oneoff index rebuild for %s.", s);
    }
}

