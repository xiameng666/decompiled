package com.google.android.gms.nearby.sharing;

import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import bbdg;
import ccmq;
import cjoy;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import cuqn;
import dcvz;
import hvrc;
import squ;
import xni;

@GmsCoreVeId(0x3FB97)
public class NotificationActionChimeraActivity extends xni {
    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.az);
        super.onCreate(bundle0);
        cuqn cuqn0 = new cuqn(this);
        Intent intent0 = this.getIntent();
        if(intent0 == null) {
            dcvz.a.e().p("Failed to create NotificationActionActivity, because the intent is null", new Object[0]);
            this.finish();
            return;
        }
        cuqn0.e("nearby_sharing", intent0.getIntExtra("notification_id", -1));
        PendingIntent pendingIntent0 = (PendingIntent)intent0.getParcelableExtra("share_pending_intent");
        if(pendingIntent0 != null) {
            try {
                if(hvrc.a.b().I() && squ.a() && Build.VERSION.SDK_INT >= 34) {
                    pendingIntent0.send(cjoy.a().setPendingIntentBackgroundActivityStartMode((Build.VERSION.SDK_INT < 36 ? 1 : 3)).toBundle());
                }
                else {
                    pendingIntent0.send();
                }
            }
            catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
                dcvz.a.b().f(pendingIntent$CanceledException0).p("Failed to send pendingIntent.", new Object[0]);
            }
        }
        dcvz.a.b().p("NotificationActionActivity create", new Object[0]);
        this.finish();
    }
}

