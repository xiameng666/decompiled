package com.google.android.gms.constellation;

import android.content.Context;
import android.os.Bundle;
import baun;
import bblf;
import bblg;
import bbvl;
import bbwd;
import bbye;
import bbyu;
import bcqx;
import bcrh;
import cljp;
import clkn;
import clko;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import hrdy;
import hrfi;
import java.util.UUID;

public class RefreshGcmTaskChimeraService extends GmsTaskChimeraService {
    public static final baun a;
    public bcqx b;

    static {
        RefreshGcmTaskChimeraService.a = bcrh.a("refresh_gcm_service");
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final int a(cllr cllr0) {
        String s = cllr0.a;
        baun baun0 = RefreshGcmTaskChimeraService.a;
        baun0.j("On run task %s", new Object[]{s});
        switch(s.hashCode()) {
            case 0x899F7E47: {
                if(s.equals("SERVICE_STATE")) {
                    bbyu.h(this.getApplicationContext()).e();
                    RefreshGcmTaskChimeraService.f(this.getApplicationContext());
                    return 0;
                }
                break;
            }
            case -1222098358: {
                if(s.equals("com.google.android.gms.constellation.checker.RefreshGcmTaskService.tag")) {
                    boolean z = cllr0.b != null && cllr0.b.getBoolean("isRetrySync", false);
                    baun0.h("Running refresh sync", new Object[0]);
                    this.b = bcqx.a(this);
                    UUID uUID0 = UUID.randomUUID();
                    this.b.L(uUID0, (z ? 12 : 7));
                    int v = 10;
                    bblg bblg0 = new bblg(10);
                    bbvl.h();
                    Context context0 = this.getApplicationContext();
                    if(!z) {
                        v = 2;
                    }
                    bbvl.g(context0, uUID0, v, new bbwd(this, new bblf(bblg0), uUID0, z));
                    return 0;
                }
                break;
            }
            case 0xD47D8C31: {
                if(s.equals("CELL_NETWORK")) {
                    bbye.a().b();
                    RefreshGcmTaskChimeraService.d(this.getApplicationContext());
                    return 0;
                }
                break;
            }
            default: {
                return 0;
            }
        }
        return 0;
    }

    public static void d(Context context0) {
        if(bbye.e()) {
            long v = hrdy.a.h().l();
            long v1 = (long)(((double)v) * 0.05);
            long v2 = Math.max(0L, v - v1);
            clkn clkn0 = new clkn();
            clkn0.j = "com.google.android.gms.constellation.checker.RefreshGcmTaskService";
            clkn0.t("CELL_NETWORK");
            clkn0.e(v2, Math.max(1L + v2, v1 + v));
            clkn0.v(1);
            clko clko0 = clkn0.a();
            cljp.a(context0).f(clko0);
            RefreshGcmTaskChimeraService.a.j("Network signals listener scheduled with delay %ds.", new Object[]{v});
            return;
        }
        RefreshGcmTaskChimeraService.a.j("Cellular network signals disabled.", new Object[0]);
    }

    public static void e(Context context0, long v, boolean z) {
        long v1 = Math.max(0L, (v - System.currentTimeMillis()) / 1000L);
        long v2 = Math.max(1L + v1, hrfi.d() / 1000L + v1);
        RefreshGcmTaskChimeraService.a.j("schedule refresh sync task. The service will be kicked off after %d seconds till %d seconds", new Object[]{v1, v2});
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("isRetrySync", z);
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.constellation.checker.RefreshGcmTaskService";
        clkn0.t("com.google.android.gms.constellation.checker.RefreshGcmTaskService.tag");
        clkn0.e(v1, v2);
        clkn0.y(0, 1);
        clkn0.v(1);
        clkn0.p = true;
        clkn0.u = bundle0;
        clko clko0 = clkn0.a();
        cljp.a(context0).f(clko0);
    }

    public static void f(Context context0) {
        bbyu.h(context0);
        if(!bbyu.i(context0).isEmpty()) {
            long v = hrdy.a.h().r();
            long v1 = (long)(((double)v) * 0.05);
            long v2 = Math.max(0L, v - v1);
            clkn clkn0 = new clkn();
            clkn0.j = "com.google.android.gms.constellation.checker.RefreshGcmTaskService";
            clkn0.t("SERVICE_STATE");
            clkn0.e(v2, Math.max(1L + v2, v1 + v));
            clkn0.v(1);
            clko clko0 = clkn0.a();
            cljp.a(context0).f(clko0);
            RefreshGcmTaskChimeraService.a.j("Service state signals listener scheduled with delay %ds.", new Object[]{v});
            return;
        }
        RefreshGcmTaskChimeraService.a.j("Service state signals disabled for all subIds.", new Object[0]);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final void onCreate() {
        RefreshGcmTaskChimeraService.a.j("onCreate", new Object[0]);
        super.onCreate();
    }
}

