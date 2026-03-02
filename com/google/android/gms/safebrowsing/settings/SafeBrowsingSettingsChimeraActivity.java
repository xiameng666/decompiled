package com.google.android.gms.safebrowsing.settings;

import android.os.Bundle;
import bbdg;
import ca;
import ccmq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import eknh;
import eknt;
import ibuq;
import xos;

@GmsCoreVeId(0x3FCCC)
public final class SafeBrowsingSettingsChimeraActivity extends xos {
    @Override  // xos
    protected final void onCreate(Bundle bundle0) {
        eknt eknt0;
        ccmq.a().a(bbdg.jO);
        super.onCreate(bundle0);
        if(bundle0 == null) {
            String s = this.getIntent().getAction();
            if(s == null) {
                eknt0 = new eknt();
            }
            else if(ibuq.m(s, "com.android.settings.action.SB_APPS")) {
                eknt0 = new eknh();
            }
            else {
                this.finish();
                eknt0 = null;
            }
            if(eknt0 != null) {
                ca ca0 = new ca(this.getSupportFragmentManager());
                ca0.t(0x7F0B0FE4, eknt0);  // id:content_frame
                ca0.f();
            }
        }
    }
}

