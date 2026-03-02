package com.google.android.gms.spatula.settings.ui;

import android.os.Bundle;
import bbdg;
import ccmq;
import clpg;
import cmhh;
import cmhi;
import ervh;
import hykh;
import ibuq;

public final class SpatulaSettingsChimeraActivity extends ervh {
    public clpg k;
    public cmhi l;

    @Override  // clvw
    public final clpg a() {
        clpg clpg0 = this.k;
        if(clpg0 != null) {
            return clpg0;
        }
        ibuq.j("settingsEnvironmentFactory");
        return null;
    }

    @Override  // ervh
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.wf);
        super.onCreate(bundle0);
        if(!hykh.c()) {
            this.finish();
        }
        cmhi cmhi0 = this.l;
        if(cmhi0 == null) {
            ibuq.j("gmsCoreMetrics");
            cmhi0 = null;
        }
        cmhh.a(cmhi0, 0x3DBAB, null, 6);
    }
}

