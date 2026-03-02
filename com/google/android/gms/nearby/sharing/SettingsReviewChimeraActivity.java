package com.google.android.gms.nearby.sharing;

import android.os.Bundle;
import bbdg;
import ccmq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import dbwq;
import dclr;
import fyhn;
import gzat;

@GmsCoreVeId(0x3FB98)
public final class SettingsReviewChimeraActivity extends dbwq {
    @Override  // dbwq
    protected final gzat l() {
        return gzat.b;
    }

    @Override  // dbwq
    protected final String m() {
        return "com.google.android.gms.nearby.sharing.SettingsReviewActivity";
    }

    @Override  // dbwq
    public final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.az);
        fyhn.b(this.getContainerActivity());
        super.onCreate(bundle0);
        this.setContentView(0x7F0E09A5);  // layout:sharing_settingsreview_activity
    }

    @Override  // dbwq
    protected final void q(long v) {
        String s = this.getIntent().getStringExtra("referrer_package_name");
        String s1 = this.getIntent().getStringExtra("source_activity");
        boolean z = this.getIntent().getBooleanExtra("initial_enable_status", false);
        this.g().o().b(new dclr(this, z, v, s, s1));
    }
}

