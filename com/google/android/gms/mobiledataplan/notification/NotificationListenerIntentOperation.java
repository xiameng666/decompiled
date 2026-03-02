package com.google.android.gms.mobiledataplan.notification;

import android.content.Intent;
import android.service.notification.StatusBarNotification;
import bayn;
import bbcu;
import bbdg;
import bboh;
import ccmq;
import com.google.android.chimera.IntentOperation;
import crxn;
import evuh;
import ggtj;
import gizm;
import gpnc;
import gpnd;
import hhct;

public class NotificationListenerIntentOperation extends IntentOperation {
    private static final bboh a;

    static {
        NotificationListenerIntentOperation.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ccmq.a().a(bbdg.pW);
        long v = intent0.getLongExtra("NOTIFICATION_LOGGING_NOTIFICATION_ID", 0L);
        int v1 = intent0.getIntExtra("NOTIFICATION_ACTION", 0);
        switch(v1) {
            case 0: {
                crxn.c().z(intent0, gizm.j, "MDP_Notification", hhct.ag);
                return;
            }
            case 1: {
                crxn.c().z(intent0, gizm.x, "MDP_UiAction", hhct.cw);
                bayn bayn0 = bayn.f(this);
                if(bayn0 != null && v != 0L) {
                    evuh evuh0 = evuh.bh;
                    bayn0.o("com.google.android.gms.mobiledataplan.NOTIFICATION_TAG", ((int)v), evuh0);
                    StatusBarNotification[] arr_statusBarNotification = bayn0.D();
                    boolean z = false;
                    for(int v2 = 0; v2 < arr_statusBarNotification.length; ++v2) {
                        StatusBarNotification statusBarNotification0 = arr_statusBarNotification[v2];
                        if(((long)statusBarNotification0.getId()) != v && statusBarNotification0.getId() != 0) {
                            z = true;
                        }
                    }
                    if(!z) {
                        bayn0.o("com.google.android.gms.mobiledataplan.NOTIFICATION_TAG", 0, evuh0);
                    }
                }
                return;
            }
            default: {
                ((ggtj)NotificationListenerIntentOperation.a.j()).R("Invalid background intent for notification action type %s. ID: %s", new gpnd(gpnc.a, v1), new gpnd(gpnc.a, v));
            }
        }
    }
}

