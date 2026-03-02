package com.google.android.location.reporting.service;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import batl;
import bbdg;
import ccmq;
import com.google.android.chimera.Service;
import fxta;
import fxva;

public class ReportingSyncChimeraService extends Service {
    private static final Object a;
    private static fxta b;

    static {
        ReportingSyncChimeraService.a = new Object();
    }

    public static void a(Account account0, Context context0) {
        batl.s(context0);
        context0.getContentResolver();
        ContentResolver.setIsSyncable(account0, "com.google.android.location.reporting", 1);
        ContentResolver.setSyncAutomatically(account0, "com.google.android.location.reporting", true);
    }

    public static void b(Account account0, Context context0) {
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("ignore_settings", true);
        bundle0.putBoolean("expedited", true);
        bundle0.putBoolean("force", true);
        batl.s(context0);
        context0.getContentResolver();
        ContentResolver.requestSync(account0, "com.google.android.location.reporting", bundle0);
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        return ReportingSyncChimeraService.b.getSyncAdapterBinder();
    }

    @Override  // com.google.android.chimera.Service
    public final void onCreate() {
        ccmq.a().a(bbdg.jm);
        synchronized(ReportingSyncChimeraService.a) {
            if(ReportingSyncChimeraService.b == null) {
                fxva.g(this);
                ReportingSyncChimeraService.b = new fxta(this.getApplicationContext());
            }
        }
    }
}

