package com.google.android.gms.nearby.sharing.receive;

import ade;
import android.os.Bundle;
import bbdg;
import ccmq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import dhjo;
import xni;

@GmsCoreVeId(0x3FB9D)
public final class FileSelectionChimeraActivity extends xni {
    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.az);
        super.onCreate(bundle0);
        this.registerForActivityResult(new ade(), new dhjo(this)).b("*/*");
    }
}

