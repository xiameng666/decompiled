package com.google.android.gms.wearable.backup.wear;

import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import baun;
import bbdg;
import ccmq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import fcgf;
import fcsr;
import gze;
import xob;

@GmsCoreVeId(0x3FEB8)
public final class WearBackupComposeConfirmationChimeraActivity extends xob {
    private static final baun j;

    static {
        WearBackupComposeConfirmationChimeraActivity.j = new fcgf(new String[]{"WearBackupComposeConfirmation"});
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.nF);
        super.onCreate(bundle0);
        WearBackupComposeConfirmationChimeraActivity.j.j("onCreate", new Object[0]);
        ComposeView composeView0 = new ComposeView(this, null, 0, 6, null);
        composeView0.a(new gze(-334201173, true, new fcsr(this)));
        this.setContentView(composeView0);
    }
}

