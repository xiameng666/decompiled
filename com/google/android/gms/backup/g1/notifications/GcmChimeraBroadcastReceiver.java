package com.google.android.gms.backup.g1.notifications;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.content.Intent;
import aqql;
import aryg;
import bsoj;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.chimera.IntentOperation;
import ghyr;
import ghys;
import gicy;
import giek;
import hqiq;
import hqje;

public final class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    private static final aqql b;
    private aryg c;

    static {
        GcmChimeraBroadcastReceiver.b = new aqql(new String[]{GcmChimeraBroadcastReceiver.class.getName()});
    }

    private final void a(Context context0, Intent intent0, boolean z) {
        Intent intent1 = IntentOperation.getStartIntent(context0, NotificationProcessorIntentOperation.class, "com.google.android.gms.backup.g1.notifications.HANDLE_NOTIFICATION");
        if(intent1 == null) {
            if(z) {
                aryg aryg0 = this.c;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giek.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((giek)hftv0).b |= 1;
                ((giek)hftv0).c = false;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((giek)hftp0.b_message).d = 1;
                ((giek)hftp0.b_message).b |= 2;
                giek giek0 = (giek)hftp0.N_build();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ghys ghys0 = (ghys)hftp1.b_message;
                giek0.getClass();
                ghys0.V = giek0;
                ghys0.c |= 0x2000000;
                aryg0.a(((ghys)hftp1.N_build()), ghyr.ap);
            }
            else {
                this.c.d(4);
            }
            GcmChimeraBroadcastReceiver.b.f("Failed to create a NotificationProcessorIntentOperation intent", new Object[0]);
            return;
        }
        intent1.putExtra("notification_intent", intent0);
        GcmChimeraBroadcastReceiver.b.j("Starting intent operation to handle notification", new Object[0]);
        if(z) {
            aryg aryg1 = this.c;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)giek.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            giek giek1 = (giek)hftp2.b_message;
            giek1.b |= 1;
            giek1.c = true;
            giek giek2 = (giek)hftp2.N_build();
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ghys ghys1 = (ghys)hftp3.b_message;
            giek2.getClass();
            ghys1.V = giek2;
            ghys1.c |= 0x2000000;
            aryg1.a(((ghys)hftp3.N_build()), ghyr.ap);
        }
        else {
            aryg aryg2 = this.c;
            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gicy.a).v_newBuilder();
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            gicy gicy0 = (gicy)hftp4.b_message;
            gicy0.b |= 2;
            gicy0.d = true;
            gicy gicy1 = (gicy)hftp4.N_build();
            ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            ghys ghys2 = (ghys)hftp5.b_message;
            gicy1.getClass();
            ghys2.R = gicy1;
            ghys2.c |= 0x200000;
            aryg2.a(((ghys)hftp5.N_build()), ghyr.aa);
        }
        context0.startService(intent1);
    }

    @Override  // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        if(this.c == null) {
            this.c = new aryg(context0);
        }
        if(hqje.B() && "com.google.android.gms.backup.ACTION_NOTIFICATION_ADDED_TO_TRAY".equals(intent0.getAction())) {
            GcmChimeraBroadcastReceiver.b.j("Received action ACTION_NOTIFICATION_ADDED_TO_TRAY", new Object[0]);
            this.a(context0, intent0, true);
            return;
        }
        if(!hqiq.g()) {
            this.c.d(2);
            return;
        }
        bsoj.a(context0.getApplicationContext());
        if(!"gcm".equals(bsoj.e(intent0))) {
            GcmChimeraBroadcastReceiver.b.j("Did not receive GCM", new Object[0]);
            this.c.d(3);
            return;
        }
        GcmChimeraBroadcastReceiver.b.j("Received GCM", new Object[0]);
        this.a(context0, intent0, false);
    }
}

