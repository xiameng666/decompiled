package com.google.android.gms.constellation.checker;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import baun;
import bbdg;
import bbll;
import bbxc;
import bbxe;
import bbxf;
import bbxj;
import bbzr;
import bcbs;
import bcpv;
import bcqx;
import bcrc;
import bcrh;
import ccmp;
import com.google.android.chimera.IntentOperation;
import gmfx;
import hrfi;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class PeriodicClientStateChecker extends IntentOperation {
    public static ScheduledFuture a;
    public static final baun b;
    public Context c;
    public bbxc d;
    private final ScheduledExecutorService e;

    static {
        PeriodicClientStateChecker.b = bcrh.a("periodic_client_state_checker");
    }

    public PeriodicClientStateChecker() {
        this.e = new bbll(1, 9);
    }

    @Override  // com.google.android.chimera.IntentOperation
    final void init(Context context0) {
        this.c = context0;
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.c = this.getApplicationContext();
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        long v3;
        baun baun0 = PeriodicClientStateChecker.b;
        baun0.j("onHandleIntent", new Object[0]);
        hrfi hrfi0 = hrfi.a;
        if(!hrfi0.e().r()) {
            baun0.h("periodic client state checker is disabled.", new Object[0]);
            return;
        }
        UUID uUID0 = UUID.randomUUID();
        bcqx bcqx0 = bcqx.a(this.c);
        this.d = new bbxc(bcqx0);
        long v = bbzr.b().a(this.c).c();
        long v1 = v <= 0L ? System.currentTimeMillis() : v + hrfi0.e().d() * 1000L;
        long v2 = System.currentTimeMillis();
        if(v1 <= v2) {
            if(bbxe.b(bbzr.b().a(this.c))) {
                bcpv.a(this.c);
                if(bcpv.b(this.c)) {
                    v3 = v2;
                }
                else {
                    v3 = v2;
                    this.d.a(uUID0, 6, new bcrc(gmfx.u, false), v3);
                    uUID0 = uUID0;
                }
                this.d.b(uUID0, 6, v3);
                new ccmp().a(bbdg.ep);
                bbxf bbxf0 = new bbxf(this, uUID0, v3);
                if(!bbxj.c(this.c).f() && hrfi0.e().k()) {
                    Class class0 = PeriodicClientStateChecker.class;
                    synchronized(class0) {
                        if(PeriodicClientStateChecker.a != null && !PeriodicClientStateChecker.a.isDone() && !PeriodicClientStateChecker.a.isCancelled()) {
                            PeriodicClientStateChecker.a.cancel(false);
                        }
                        long v5 = hrfi0.e().f();
                        PeriodicClientStateChecker.a = ((bbll)this.e).g(bbxf0, v5, TimeUnit.MILLISECONDS);
                    }
                }
                else {
                    bbxf0.run();
                }
            }
            else if(hrfi.i()) {
                bcqx0.J(uUID0, 6, new bcrc(gmfx.v, false));
            }
            SharedPreferences.Editor sharedPreferences$Editor0 = ((bcbs)bbzr.b().a(this.c)).c.edit();
            sharedPreferences$Editor0.putLong("last_client_state_check_timestamp_millis", System.currentTimeMillis());
            sharedPreferences$Editor0.apply();
        }
        else if(hrfi.i()) {
            this.d.a(uUID0, 6, new bcrc(String.format(Locale.US, "nextCheckTime: %d, currentTimeMillis: %d", v1, v2), gmfx.w, false), v2);
        }
        if(hrfi.g()) {
            bbxj.c(this.c).h(uUID0.toString(), "PERIODIC_CLIENT_STATE_TRIGGER");
        }
    }
}

