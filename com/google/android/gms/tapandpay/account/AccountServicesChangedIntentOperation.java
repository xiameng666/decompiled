package com.google.android.gms.tapandpay.account;

import android.content.Intent;
import bbcu;
import bboh;
import cljp;
import clkn;
import clko;
import esgc;

public class AccountServicesChangedIntentOperation extends esgc {
    static {
        bboh.b("TapAndPay", bbcu.aM);
    }

    @Override  // esgc
    protected final void a(Intent intent0) {
        if(!"com.google.android.gms.auth.ACCOUNT_SERVICES_CHANGED".equals(intent0.getAction())) {
            intent0.getAction();
            return;
        }
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
        clkn0.q("paymentsdisabledoneoff.sync");
        clkn0.e(0L, 1L);
        clkn0.y(0, 0);
        clkn0.x(0, 0);
        clkn0.v(1);
        clko clko0 = clkn0.a();
        cljp.a(this).f(clko0);
    }
}

