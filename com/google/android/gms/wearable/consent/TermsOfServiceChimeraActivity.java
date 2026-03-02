package com.google.android.gms.wearable.consent;

import android.os.Bundle;
import bbdg;
import ccmq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import du;
import fdak;
import fdal;
import fdan;
import fdds;

@GmsCoreVeId(0x3FEC1)
public class TermsOfServiceChimeraActivity extends fdak {
    @Override  // fdak
    protected final du g(fdan fdan0) {
        du du0 = new fdds();
        fdds.z(((fdal)du0), fdan0);
        return du0;
    }

    @Override  // fdak
    protected final String l() {
        return "tosFragment";
    }

    @Override  // fdak
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        ccmq.a().a(bbdg.nP);
    }
}

