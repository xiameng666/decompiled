package com.google.android.gms.kids.settings.flows.onboarding;

import android.os.Bundle;
import bbcu;
import bboh;
import ca;
import cbvj;
import cbvv;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import gaec;
import gajp;
import gajq;
import lso;
import xni;

@GmsCoreVeId(0x3FADD)
public final class OnboardingChimeraActivity extends xni {
    static {
        bboh.b("OnboardingActivity", bbcu.ac);
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        new lso(this, cbvj.a).a(cbvj.class);
        this.setTheme(0x7F160C6A);  // style:Theme.GoogleMaterial3.DayNight
        this.setTheme(new gajq(0x7F16095B, true).a(this.getIntent()));  // style:SudThemeGlifV3.DayNight
        if(gaec.y(this)) {
            int v = gajp.a(this);
            if(v != 0) {
                this.setTheme(v);
            }
        }
        if(bundle0 == null) {
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.u(0x1020002, new cbvv(), "fragment");
            ca0.f();
        }
    }
}

