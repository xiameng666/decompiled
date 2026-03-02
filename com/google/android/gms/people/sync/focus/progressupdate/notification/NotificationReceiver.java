package com.google.android.gms.people.sync.focus.progressupdate.notification;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import efpr;
import efpt;
import efur;
import egig;
import ehdp;
import ehdv;
import giri;
import girs;
import girt;
import giry;
import gisb;
import gise;
import gisr;
import gjhn;
import hxdh;

public final class NotificationReceiver extends TracingBroadcastReceiver {
    public ehdv a;
    private final efur b;

    public NotificationReceiver(efur efur0, ehdv ehdv0) {
        super("people");
        this.b = efur0;
        this.a = ehdv0;
    }

    private static void b(ehdp ehdp0, int v) {
        efpr.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)girt.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        girt girt0 = (girt)hftp0.b_message;
        girt0.b |= 1;
        girt0.c = ehdp0.c;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)girs.a).v_newBuilder();
        gjhn gjhn0 = ehdp0.d;
        int v1 = gjhn0 == gjhn.a ? 3 : 2;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((girs)hftv0).c = v1 - 1;
        ((girs)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((girs)hftv1).d = gjhn0.h;
        ((girs)hftv1).b |= 2;
        int v2 = ehdp0.e;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        if(v2 == 0) {
            throw null;
        }
        ((girs)hftv2).e = v2 - 1;
        ((girs)hftv2).b |= 4;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((girs)hftp1.b_message).f = v - 1;
        ((girs)hftp1.b_message).b |= 8;
        girs girs0 = (girs)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        girt girt1 = (girt)hftp0.b_message;
        girs0.getClass();
        girt1.b();
        girt1.e.add(girs0);
        girt girt2 = (girt)hftp0.N_build();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gise.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        String s = ehdp0.a;
        ProtoLiteMessage hftv3 = hftp2.b_message;
        ((gise)hftv3).b |= 16;
        ((gise)hftv3).g = 80;
        if(s != null) {
            if(!hftv3.isImmutable()) {
                hftp2.ensureMutable();
            }
            gise gise0 = (gise)hftp2.b_message;
            gise0.b |= 0x8000;
            gise0.s = s;
        }
        giri giri0 = (giri)((ProtoLiteMessage)giry.a).v_newBuilder();
        if(!giri0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giri0).ensureMutable();
        }
        giry giry0 = (giry)giri0.b_message;
        girt2.getClass();
        giry0.b();
        giry0.n.add(girt2);
        giry giry1 = (giry)((ProtoLiteBuilder)giri0).N_build();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gisb.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        gisb gisb0 = (gisb)hftp3.b_message;
        giry1.getClass();
        gisb0.f = giry1;
        gisb0.b |= 0x100000;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gise gise1 = (gise)hftp2.b_message;
        gisb gisb1 = (gisb)hftp3.N_build();
        gisb1.getClass();
        gise1.p = gisb1;
        gise1.b |= 0x2000;
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gisr.a).v_newBuilder();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        gisr gisr0 = (gisr)hftp4.b_message;
        gise gise2 = (gise)hftp2.N_build();
        gise2.getClass();
        gisr0.e = gise2;
        gisr0.b |= 4;
        efpt.b(ehdp0.b, hftp4);
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        String s = intent0.getAction();
        if(s == null) {
            egig.b("FSA2_NotificationReceiver", "Should not receive null intent.");
            return;
        }
        ehdp ehdp0 = this.a.n();
        if(s.equals("com.google.android.gms.people.sync.focus.notification.DISMISSED_FOR_SYNC_DOWN")) {
            this.b.v(ehdp0.b);
            NotificationReceiver.b(ehdp0, 8);
            return;
        }
        if(s.equals("com.google.android.gms.people.sync.focus.notification.DISMISSED_FOR_SYNC_UP")) {
            this.b.v(ehdp0.b);
            if(hxdh.a.c().r()) {
                NotificationReceiver.b(ehdp0, 8);
            }
        }
        else if(s.equals("com.google.android.gms.people.sync.focus.notification.TAPPED_FOR_SYNC_DOWN")) {
            Intent intent1 = this.a.f();
            if(intent1 != null) {
                try {
                    context0.startActivity(intent1.setFlags(0x10000000));
                    NotificationReceiver.b(ehdp0, 7);
                }
                catch(ActivityNotFoundException activityNotFoundException0) {
                    egig.l("FSA2_NotificationReceiver", "Activity not found when starting tap intent.", activityNotFoundException0);
                    NotificationReceiver.b(ehdp0, 10);
                }
            }
        }
        else if(s.equals("com.google.android.gms.people.sync.focus.notification.TAPPED_FOR_SYNC_UP")) {
            Intent intent2 = this.a.f();
            if(intent2 != null) {
                try {
                    context0.startActivity(intent2.setFlags(0x10000000));
                    NotificationReceiver.b(ehdp0, 7);
                }
                catch(ActivityNotFoundException activityNotFoundException1) {
                    egig.l("FSA2_NotificationReceiver", "Activity not found when starting tap intent.", activityNotFoundException1);
                    NotificationReceiver.b(ehdp0, 10);
                }
            }
        }
    }
}

