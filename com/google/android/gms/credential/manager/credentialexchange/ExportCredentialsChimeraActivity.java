package com.google.android.gms.credential.manager.credentialexchange;

import android.content.Intent;
import android.os.Bundle;
import bbdg;
import bdku;
import bdoj;
import ca;
import ccmq;
import ibns;
import ibuq;
import jyu;

public final class ExportCredentialsChimeraActivity extends bdoj {
    public ExportCredentialsChimeraActivity() {
        super(0x7F0E0839);  // layout:pwm_activity_export
    }

    @Override  // bdoj
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.ah);
        super.onCreate(bundle0);
        if(bundle0 == null) {
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.C();
            Intent intent0 = this.getIntent();
            ibuq.e(intent0, "getIntent(...)");
            ibuq.f(intent0, "requestIntent");
            bdku bdku0 = new bdku();
            bdku0.setArguments(jyu.a(new ibns[]{new ibns("request_intent_key", intent0)}));
            ca0.t(0x7F0B14C6, bdku0);  // id:fragment_container_view
            ca0.a();
        }
    }
}

