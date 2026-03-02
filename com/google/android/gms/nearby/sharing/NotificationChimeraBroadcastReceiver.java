package com.google.android.gms.nearby.sharing;

import ProtoLiteBuilder;
import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import bbnk;
import cjpa;
import cjpd;
import com.google.android.chimera.IntentOperation;
import cumi;
import cuqn;
import dcid;
import dcie;
import dcif;
import dcmf;
import dcou;
import dcpn;
import dcpt;
import dcvz;
import ddlj;
import ddst;
import djat;
import evql;
import gyqq;
import gyqr;
import gysp;
import hvqs;
import j..util.Objects;
import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class NotificationChimeraBroadcastReceiver extends IntentOperation {
    public dcmf a;
    public cuqn b;
    private ddlj c;

    public NotificationChimeraBroadcastReceiver() {
    }

    NotificationChimeraBroadcastReceiver(dcmf dcmf0, cuqn cuqn0, ddlj ddlj0) {
        this.a = dcmf0;
        this.b = cuqn0;
        this.c = ddlj0;
    }

    @Override  // android.content.ContextWrapper
    protected final void attachBaseContext(Context context0) {
        super.attachBaseContext(context0);
        this.a = cumi.f(this);
        this.b = new cuqn(this);
        this.c = new ddlj(this.getApplicationContext(), bbnk.a);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ShareTarget shareTarget0;
        long v1;
        if(!hvqs.bg()) {
            return;
        }
        String s = intent0.getAction();
        boolean z = false;
        if(s == null) {
            dcvz.a.b().p("Received unexpected broadcast with no action", new Object[0]);
            return;
        }
        if("com.google.android.gms.nearby.sharing.ACTION_DISMISS".equals(s) && "nearby_sharing_alert".equals(intent0.getStringExtra("channel_id"))) {
            ddlj ddlj0 = this.c;
            long v = System.currentTimeMillis();
            if(v - cjpd.b(ddlj0.a(), "most_recent_notification_dismissed_timestamp", 0L) < TimeUnit.SECONDS.toMillis(hvqs.a.aT().ac())) {
                v1 = TimeUnit.SECONDS.toMillis(hvqs.I()) + v;
                z = true;
            }
            else {
                v1 = v + hvqs.J();
            }
            cjpa cjpa0 = ddlj0.a().c();
            cjpa0.g("most_recent_notification_dismissed_timestamp", v);
            cjpa0.e("enable_long_timeout_for_hide_dismissed_notification", z);
            cjpd.g(cjpa0);
            String s1 = DateFormat.getDateTimeInstance().format(new Date(v1));
            dcpn dcpn0 = ddlj0.b;
            ProtoLiteBuilder hftp0 = dcpt.L(30);
            gyqq gyqq0 = gyqq.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gysp gysp0 = (gysp)hftp0.b_message;
            gyqq0.getClass();
            gysp0.G = gyqq0;
            gysp0.c |= 2;
            dcpn0.i(new dcou(((gysp)hftp0.N_build())));
            dcvz.a.b().h("User dismissed the fast init notification. Not showing the notification until %s.", s1);
            return;
        }
        if("com.google.android.gms.nearby.sharing.ACTION_DISMISS".equals(s) && "nearby_sharing_privacy".equals(intent0.getStringExtra("channel_id"))) {
            dcpn dcpn1 = dcpn.f(this);
            ProtoLiteBuilder hftp1 = dcpt.L(33);
            gyqr gyqr0 = gyqr.a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gysp gysp1 = (gysp)hftp1.b_message;
            gyqr0.getClass();
            gysp1.H = gyqr0;
            gysp1.c |= 8;
            dcpn1.i(new dcou(((gysp)hftp1.N_build())));
        }
        if(s.equals("com.google.android.gms.nearby.sharing.ACTION_STOP_SHOW_PRIVACY_NOTIFICATION") && Objects.equals(intent0.getStringExtra("channel_id"), "nearby_sharing_privacy")) {
            djat.a(this.getApplicationContext(), true);
            this.b.e("nearby_sharing", intent0.getIntExtra("notification_id", -1));
            return;
        }
        byte[] arr_b = intent0.getByteArrayExtra("share_target_bytes");
        if(arr_b != null) {
            try {
                shareTarget0 = (ShareTarget)ddst.b(arr_b, ShareTarget.CREATOR);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                dcvz.a.b().f(illegalArgumentException0).p("Received unexpected broadcast with invalid share target", new Object[0]);
                return;
            }
            int v2 = intent0.getIntExtra("notification_id", -1);
            switch(s) {
                case "com.google.android.gms.nearby.sharing.ACTION_ACCEPT": {
                    this.a.b(shareTarget0).A(new dcid(this, v2));
                    return;
                }
                case "com.google.android.gms.nearby.sharing.ACTION_CANCEL": 
                case "com.google.android.gms.nearby.sharing.ACTION_DISMISS": {
                    if(shareTarget0.f) {
                        this.a.c(shareTarget0);
                    }
                    else {
                        evql evql0 = this.a.G();
                        evql0.b(new dcie(this, shareTarget0));
                        evql0.A(new dcif());
                    }
                    break;
                }
                case "com.google.android.gms.nearby.sharing.ACTION_CLICK_ACTION": {
                    PendingIntent pendingIntent0 = (PendingIntent)intent0.getParcelableExtra("share_pending_intent");
                    try {
                        if(pendingIntent0 != null) {
                            pendingIntent0.send();
                        }
                        this.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                    }
                    catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
                        dcvz.a.b().f(pendingIntent$CanceledException0).p("Failed to send pendingIntent.", new Object[0]);
                    }
                    break;
                }
                case "com.google.android.gms.nearby.sharing.ACTION_OPEN": {
                    this.a.p(shareTarget0);
                    break;
                }
                case "com.google.android.gms.nearby.sharing.ACTION_REJECT": {
                    this.a.u(shareTarget0);
                }
            }
            this.b.e("nearby_sharing", v2);
            return;
        }
        dcvz.a.b().p("Received unexpected broadcast with no share target", new Object[0]);
    }
}

