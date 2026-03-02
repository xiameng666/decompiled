package com.google.android.gms.adsidentity.init;

import android.content.Intent;
import android.util.Log;
import bbdg;
import ccmq;
import cljp;
import clkm;
import clkn;
import clkq;
import clkr;
import clks;
import clkz;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.adsidentity.service.AdservicesStatusService;
import hotp;
import hrwd;

public class ExternalChangeIntentReceiver extends IntentOperation {
    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ccmq.a().a(bbdg.uf);
        if(intent0 != null) {
            String s = intent0.getAction();
            if(s != null && s.equals("com.google.android.gms.phenotype.com.google.android.gms.adsidentity.COMMITTED")) {
                Log.i("AdservicesStatusTask", "scheduling task by handle intent");
                if(hotp.a.d().H()) {
                    cljp cljp1 = cljp.a(this);
                    clkn clkn0 = new clkn();
                    clkn0.e(0L, 0L);
                    cljp1.f(clkn0.a());
                    Log.i("AdservicesStatusTask", "One-off debugging task scheduled.");
                }
                else if(hotp.o()) {
                    if(hrwd.m()) {
                        cljp cljp0 = cljp.a(this);
                        clks clks0 = new clks();
                        clks0.w(AdservicesStatusService.class.getName());
                        clks0.q("AdservicesStatusTask");
                        clks0.v(2);
                        clks0.l(false);
                        clks0.a = clkz.j;
                        cljp0.f(clks0.a());
                        return;
                    }
                    clkq clkq0 = new clkq();
                    clkq0.w(AdservicesStatusService.class.getName());
                    clkq0.t("AdservicesStatusTask");
                    clkq0.j(clkm.h);
                    clkq0.v(1);
                    clkq0.p = true;
                    clkq0.y(2, 2);
                    clkr clkr0 = clkq0.a();
                    cljp.a(this).f(clkr0);
                }
            }
        }
    }
}

