package com.google.android.gms.constellation.checker;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import baun;
import bbdg;
import bblf;
import bblg;
import bbvl;
import bbxc;
import bbxd;
import bbxe;
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
import gmgy;
import hrfi;
import j..util.concurrent.ThreadLocalRandom;
import java.util.Locale;
import java.util.UUID;

public class PeriodicConsentChecker extends IntentOperation {
    private static final baun a;
    private Context b;
    private bcqx c;

    static {
        PeriodicConsentChecker.a = bcrh.a("periodic_consent_checker");
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        long v1;
        this.b = this.getApplicationContext().getApplicationContext();
        if(!hrfi.a.e().s()) {
            PeriodicConsentChecker.a.h("periodic consent checker is disabled.", new Object[0]);
            return;
        }
        UUID uUID0 = UUID.randomUUID();
        this.c = bcqx.a(this.b);
        bbxc bbxc0 = new bbxc(this.c);
        long v = bbzr.b().a(this.b).a();
        if(v > 0L) {
            v1 = v + hrfi.b() * 1000L;
        }
        else if(hrfi.c() > 0L) {
            v1 = ((bcbs)bbzr.b().a(this.b)).c.getLong("jittered_timestamp_for_initial_consent_check_millis", -1L);
            if(v1 <= 0L) {
                long v2 = hrfi.c();
                if(v2 > 0L) {
                    v1 = ThreadLocalRandom.current().nextLong(v2) + System.currentTimeMillis();
                    SharedPreferences.Editor sharedPreferences$Editor0 = ((bcbs)bbzr.b().a(this.b)).c.edit();
                    sharedPreferences$Editor0.putLong("jittered_timestamp_for_initial_consent_check_millis", v1);
                    sharedPreferences$Editor0.apply();
                }
                else {
                    v1 = System.currentTimeMillis();
                }
            }
        }
        else {
            v1 = System.currentTimeMillis();
        }
        long v3 = System.currentTimeMillis();
        if(v1 <= v3) {
            if(!bbxe.b(bbzr.b().a(this.b))) {
                bcpv.a(this.b);
                if(!bcpv.b(this.b)) {
                    bbxc0.a(uUID0, 5, new bcrc(gmfx.u, false), v3);
                }
                bblg bblg0 = new bblg(10);
                bbxc0.b(uUID0, 5, v3);
                new ccmp().a(bbdg.eo);
                bbvl.h();
                Context context0 = this.b;
                int v4 = gmgy.a(5);
                bblf bblf0 = new bblf(bblg0);
                bbxd bbxd0 = new bbxd(bbxc0, PeriodicConsentChecker.a, uUID0, v4, bblf0, false, v3, null, null);
                uUID0 = uUID0;
                bbvl.g(context0, uUID0, 1, bbxd0);
            }
            else if(hrfi.i()) {
                bbxc0.a(uUID0, 5, new bcrc(gmfx.v, false), v3);
            }
            bbzr.b().a(this.b).q(System.currentTimeMillis());
        }
        else if(hrfi.i()) {
            bbxc0.a(uUID0, 5, new bcrc(String.format(Locale.US, "nextConsentCheckTimeMillis: %d, currentTimeMillis: %d", v1, v3), gmfx.w, false), v3);
        }
        if(hrfi.g()) {
            bbxj.c(this.b).h(uUID0.toString(), "PERIODIC_CLIENT_STATE_TRIGGER");
        }
    }
}

