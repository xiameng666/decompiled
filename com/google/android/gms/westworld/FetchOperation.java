package com.google.android.gms.westworld;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import ayux;
import ayuy;
import ayvf;
import bbcu;
import bboh;
import com.google.android.gms.chimera.modules.westworld.AppContextProvider;
import ffnr;
import ffoj;
import ffom;
import ffoz;
import ggtj;

public class FetchOperation extends ffoj {
    public ayvf a;
    public ffnr b;
    private static final bboh c;

    static {
        FetchOperation.c = bboh.b("WestworldFetchOp", bbcu.ea);
    }

    static void a(Context context0, ayvf ayvf0, ffnr ffnr0, Intent intent0) {
        synchronized(FetchOperation.class) {
            long v1 = intent0.getLongExtra("android.app.extra.LAST_REPORT_TIME", 0L);
            ayux ayux0 = ayvf0.d("FetchData");
            ayuy ayuy0 = ayvf.b;
            ayux0.a(0L, 1L, ayuy0);
            SharedPreferences sharedPreferences0 = ffoz.d(context0);
            if(v1 == sharedPreferences0.getLong("LAST_REPORT_TIME", 0L)) {
                ayvf0.d("FetchDataSameRequest").a(0L, 1L, ayuy0);
                return;
            }
            sharedPreferences0.edit().putLong("LAST_REPORT_TIME", v1).apply();
            ffnr0.a(intent0);
        }
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(ffom.a()) {
            return;
        }
        Context context0 = AppContextProvider.b();
        try {
            ayux ayux0 = this.a.d("FetchOperationEntered");
            ayuy ayuy0 = ayvf.b;
            ayux0.a(0L, 1L, ayuy0);
            if(ffoz.o()) {
                this.a.d("FetchOperationCanCollect").a(0L, 1L, ayuy0);
                FetchOperation.a(context0, this.a, this.b, intent0);
            }
            else {
                ((ggtj)((ggtj)FetchOperation.c.h()).ar(0x4581)).x("Westworld is disabled.");
            }
        }
        finally {
            this.a.h();
        }
    }
}

