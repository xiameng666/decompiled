package com.google.android.gms.mdm.settings;

import android.os.Bundle;
import ca;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import cqnf;
import cqnv;
import hxwm;
import xos;

@GmsCoreVeId(0x3FCC9)
public class QrlSecurityQuestionChimeraActivity extends xos {
    @Override  // xos
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(cqnf.f(this) && hxwm.j()) {
            if(bundle0 == null) {
                ca ca0 = new ca(this.getSupportFragmentManager());
                ca0.t(0x7F0B0FE4, new cqnv());  // id:content_frame
                ca0.f();
            }
            return;
        }
        this.finish();
    }
}

