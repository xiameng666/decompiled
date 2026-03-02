package com.google.android.gms.instantapps.routing;

import adqe;
import android.accounts.Account;
import android.content.Intent;
import bbcu;
import bboh;
import bzvj;
import caae;
import cljp;
import clkn;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.instantapps.AppContextProvider;
import hlxi;
import j..util.Objects;

public class AccountChangedIntentOperation extends IntentOperation {
    static {
        bboh.b("AccChngedIntent", bbcu.bz);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(intent0 != null && Objects.equals(intent0.getAction(), "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE") && bzvj.a(this).r.a()) {
            caae caae0 = bzvj.a(this).c;
            Account account0 = caae0.a();
            if(account0 != null) {
                for(Object object0: adqe.c(intent0)) {
                    if(((Account)object0).name.equals(account0.name)) {
                        caae0.c();
                    }
                }
            }
            cljp cljp0 = cljp.a(AppContextProvider.a());
            clkn clkn0 = new clkn();
            clkn0.j = "com.google.android.gms.instantapps.routing.DomainFilterUpdateService";
            clkn0.t(DomainFilterUpdateChimeraService.d(hlxi.k.a()));
            clkn0.x(0, 0);
            clkn0.y(0, 1);
            clkn0.e(15L, 120L);
            clkn0.v(1);
            cljp0.f(clkn0.a());
        }
    }
}

