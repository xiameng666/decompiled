package com.google.android.gms.security.snet;

import android.content.Context;
import android.content.Intent;
import bbcu;
import bboh;
import cljp;
import clkm;
import clkq;
import clkr;
import cllj;
import com.google.android.chimera.IntentOperation;
import elhb;
import elng;
import hrvh;
import hrwu;
import hxvy;
import java.util.concurrent.TimeUnit;

public class SnetGcmSchedulerChimeraIntentService extends IntentOperation {
    public static final int a = 0;
    private static final String b = "SnetGcmSchedulerChimeraIntentService";

    static {
        bboh.b("SnetGcmSchedulerChimeraIntentService", bbcu.dX);
    }

    public static void a(Context context0) {
        context0.startService(IntentOperation.getStartIntent(context0, SnetGcmSchedulerChimeraIntentService.class, "com.google.android.gms.security.snet.ACTION_SET_EVENT_LOG_COLLECTOR_PERIOD"));
    }

    public static void b(Context context0) {
        context0.startService(IntentOperation.getStartIntent(context0, SnetGcmSchedulerChimeraIntentService.class, "com.google.android.gms.security.snet.ACTION_SET_IDLE_PERIOD"));
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(intent0 != null) {
            String s = intent0.getAction();
            if("com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR_RUN".equals(s)) {
                Intent intent1 = elhb.b(this, SnetChimeraService.class);
                intent1.setAction("com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR");
                this.startService(intent1);
                return;
            }
            if("com.google.android.gms.security.snet.ACTION_SET_EVENT_LOG_COLLECTOR_PERIOD".equals(s)) {
                elng elng0 = new elng(this);
                hxvy hxvy0 = hxvy.a;
                long v = TimeUnit.HOURS.toMillis(hxvy0.f().c());
                elng0.g("snet_saved_wake_interval_ms", v);
                clkq clkq0 = new clkq();
                clkq0.j = elhb.c(SnetNormalTaskChimeraService.class);
                clkq0.t("event_log_collector_runner");
                clkq0.p = true;
                clkq0.v(1);
                clkq0.x(0, 1);
                clkq0.y(0, 1);
                if(hrwu.i()) {
                    clkq0.e(v / 1000L, ((long)(hrvh.b() * ((double)(v / 1000L)))), cllj.a);
                }
                else {
                    clkq0.a = v / 1000L;
                    clkq0.b = TimeUnit.MINUTES.toSeconds(hxvy0.f().b());
                }
                cljp cljp0 = cljp.a(this);
                if(cljp0 != null) {
                    cljp0.f(clkq0.a());
                }
            }
            else {
                if("com.google.android.gms.security.snet.ACTION_IDLE_RUN".equals(s)) {
                    Intent intent2 = elhb.b(this, SnetChimeraService.class);
                    intent2.setAction("com.google.android.gms.security.snet.ACTION_IDLE_MODE");
                    this.startService(intent2);
                    return;
                }
                if("com.google.android.gms.security.snet.ACTION_SET_IDLE_PERIOD".equals(s)) {
                    long v1 = TimeUnit.HOURS.toMillis(hxvy.a.f().d());
                    new elng(this).g("snet_idle_mode_gcm_interval_ms", v1);
                    clkq clkq1 = new clkq();
                    clkq1.j = elhb.c(SnetIdleTaskChimeraService.class);
                    clkq1.t("snet_idle_runner");
                    clkq1.p = true;
                    clkq1.v(1);
                    clkq1.y(2, 2);
                    clkq1.x(1, 1);
                    clkq1.i(true);
                    if(hrwu.i()) {
                        clkq1.j(clkm.a(v1 / 1000L));
                    }
                    else {
                        clkq1.a = v1 / 1000L;
                    }
                    clkr clkr0 = clkq1.a();
                    cljp cljp1 = cljp.a(this);
                    if(cljp1 != null) {
                        cljp1.f(clkr0);
                    }
                }
            }
        }
    }
}

