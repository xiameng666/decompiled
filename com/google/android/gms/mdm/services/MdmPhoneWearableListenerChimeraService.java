package com.google.android.gms.mdm.services;

import android.content.Context;
import android.content.Intent;
import bbdg;
import ccmg;
import ccmp;
import com.google.android.chimera.WakefulBroadcastReceiver;
import com.google.android.gms.chimera.modules.security.nonwearable.AppContextProvider;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import cqqt;
import elhb;
import fczm;
import hrle;
import lnw;

public class MdmPhoneWearableListenerChimeraService extends fczm {
    private ccmg a;

    @Override  // fczm
    public final void a(MessageEventParcelable messageEventParcelable0) {
        String s = messageEventParcelable0.b;
        if(s.equals("com.google.android.gms.mdm.ACTION_RING")) {
            Context context0 = AppContextProvider.a();
            cqqt.c("Start ringing requested by Wear.", new Object[0]);
            Intent intent0 = elhb.j(context0);
            intent0.putExtra("remote", false);
            intent0.putExtra("requestorNodeId", messageEventParcelable0.d);
            if(hrle.h()) {
                WakefulBroadcastReceiver.startWakefulService(context0, intent0);
            }
            else {
                lnw.a(context0, intent0);
            }
            this.a.a(bbdg.jV);
            return;
        }
        if(s.equals("com.google.android.gms.mdm.ACTION_CANCEL_RING")) {
            RingChimeraService.g(AppContextProvider.a());
            this.a.a(bbdg.jW);
        }
    }

    @Override  // fczm
    public final void onCreate() {
        super.onCreate();
        this.a = new ccmp();
    }
}

