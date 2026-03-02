package com.google.android.gms.subscribedfeeds;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import avzf;
import bbcu;
import bbmq;
import bboh;
import bbqa;
import cchj;
import esds;
import ggtj;

public class SubscribedFeedsInitializer extends avzf {
    public static final bboh a;

    static {
        SubscribedFeedsInitializer.a = bboh.b("SubscribedFeeds", bbcu.dZ);
    }

    @Override  // avzf
    protected final void b(Intent intent0, int v) {
        if(!bbqa.d()) {
            esds.a(this);
            Account[] arr_account = cchj.b(this).p("com.google");
            int v1 = 0;
            for(int v2 = 0; v2 < arr_account.length; ++v2) {
                Account account0 = arr_account[v2];
            }
            PackageManager packageManager0 = this.getPackageManager();
            this.e(packageManager0, new ComponentName(this, "com.google.android.gms.subscribedfeeds.GcmReceiverService"), true);
            this.e(packageManager0, new ComponentName(this, "com.google.android.gms.subscribedfeeds.GmsSubscribedFeedsProvider"), true);
            ComponentName componentName0 = new ComponentName(this, "com.google.android.gms.subscribedfeeds.SyncService");
            ComponentName componentName1 = new ComponentName(this, "com.google.android.gms.subscribedfeeds.GmsFeedsSyncService");
            if(!bbqa.c()) {
                ComponentName componentName2 = new ComponentName("com.google.android.gsf", "com.google.android.gsf.subscribedfeeds.SubscribedFeedsSyncAdapterService");
                try {
                    v1 = this.e(packageManager0, componentName2, false);
                }
                catch(IllegalArgumentException unused_ex) {
                }
            }
            int v3 = this.e(packageManager0, componentName0, true) | v1;
            if((this.e(packageManager0, componentName1, true) | v3) != 0) {
                goto label_20;
            }
            if((v & 2) != 0) {
            label_20:
            }
        }
    }

    private final boolean e(PackageManager packageManager0, ComponentName componentName0, boolean z) {
        int v = z ? 1 : 2;
        if(packageManager0.getComponentEnabledSetting(componentName0) == v) {
            return false;
        }
        ((ggtj)((ggtj)SubscribedFeedsInitializer.a.h()).ar(0x3CE5)).P("Setting %s to %d", componentName0, v);
        if(componentName0.getPackageName().equals("com.google.android.gms")) {
            bbmq.K(componentName0, v);
            return true;
        }
        bbmq.H(this, componentName0, v);
        return true;
    }
}

