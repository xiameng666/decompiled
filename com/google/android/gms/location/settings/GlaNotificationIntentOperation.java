package com.google.android.gms.location.settings;

import a;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import bayn;
import bbcu;
import bbdg;
import bboh;
import ccmq;
import cjer_LocationSettings;
import cnur;
import cnvh;
import cnvz;
import com.google.android.chimera.IntentOperation;
import evuh;
import gktk;
import ibuq;

public final class GlaNotificationIntentOperation extends IntentOperation {
    private static final bboh a;

    static {
        GlaNotificationIntentOperation.a = bboh.b("GlaNotification", bbcu.g);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ibuq.f(intent0, "intent");
        ccmq.a().a(bbdg.iX);
        boolean z = cjer_LocationSettings.s(this, "gps");
        boolean z1 = cjer_LocationSettings.s(this, "network");
        try {
            this.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
        catch(SecurityException securityException0) {
            a.ae(GlaNotificationIntentOperation.a.j(), "GLA notification unable to close system dialogs", securityException0);
        }
        bayn bayn0 = bayn.f(this);
        ibuq.c(bayn0);
        bayn0.m(-1302891281, evuh.cA);
        cnvz.c().f(new cnvh());
        String s = intent0.getAction();
        if(s != null) {
            switch(s.hashCode()) {
                case 0xA44A39EF: {
                    if(s.equals("com.google.android.gms.location.settings.GLA_NOTIFICATION_LEARN_MORE_CLICKED")) {
                        cnur.b(z, z1, gktk.d);
                        Intent intent1 = new Intent("android.intent.action.VIEW");
                        intent1.setData(Uri.parse("https://support.google.com/android/?p=location_accuracy"));
                        intent1.setFlags(0x10000000);
                        this.startActivity(intent1);
                        return;
                    }
                    break;
                }
                case 0xD2779042: {
                    if(s.equals("com.google.android.gms.location.settings.GLA_NOTIFICATION_SETTINGS_CLICKED")) {
                        cnur.b(z, z1, gktk.c);
                        Intent intent2 = new Intent();
                        intent2.setAction("com.google.android.gms.location.settings.LOCATION_ACCURACY");
                        intent2.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.location.settings.LocationAccuracyNonwearableActivity"));
                        intent2.setFlags(0x10000000);
                        this.startActivity(intent2);
                        return;
                    }
                    break;
                }
                case 0x1D896D55: {
                    if(s.equals("com.google.android.gms.location.settings.GLA_NOTIFICATION_CLEARED")) {
                        cnur.b(z, z1, gktk.b);
                        return;
                    }
                    break;
                }
                case 0x6A9FE9A1: {
                    if(s.equals("com.google.android.gms.location.settings.SETUP_WIZARD_MESSAGE_SHOWN")) {
                        cnur.b(z, z1, gktk.e);
                        return;
                    }
                    break;
                }
            }
        }
    }
}

