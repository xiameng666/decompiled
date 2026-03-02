package com.google.android.gms.intrusiondetection.ui;

import android.os.Bundle;
import cafl;
import clpg;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import huht;
import ibuq;

@GmsCoreVeId(0x3F6D4)
public final class IntrusionDetectionSettingsChimeraActivity extends cafl {
    public clpg j;

    @Override  // clvw
    public final clpg a() {
        clpg clpg0 = this.j;
        if(clpg0 != null) {
            return clpg0;
        }
        ibuq.j("settingsEnvironmentFactory");
        return null;
    }

    @Override  // cafl
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(!huht.e()) {
            this.finish();
        }
    }
}

