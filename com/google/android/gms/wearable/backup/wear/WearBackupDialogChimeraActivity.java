package com.google.android.gms.wearable.backup.wear;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import baun;
import bbdg;
import ccmq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import fcgf;
import fcoo;
import fcop;
import fcoq;
import fcor;
import fctc;
import xob;

@GmsCoreVeId(0x3FEB9)
public final class WearBackupDialogChimeraActivity extends xob {
    private static final baun j;
    private static final fcoo k;

    static {
        WearBackupDialogChimeraActivity.j = new fcgf(new String[]{"WearBackupDialog"});
        fcop fcop0 = new fcop();
        fcop0.d(0.125f);
        fcop0.b(0.063f);
        fcop0.c(0.094f);
        fcoq fcoq0 = fcop0.a();
        fcop fcop1 = new fcop();
        fcop1.d(0.122f);
        fcop1.b(0.067f);
        fcop1.c(0.056f);
        WearBackupDialogChimeraActivity.k = new fcoo(fcoq0, fcop1.a());
    }

    public static Intent a(String s) {
        return new Intent().setClassName("com.google.android.gms", "com.google.android.gms.wearable.backup.wear.WearBackupDialogActivity").putExtra("dialog_label", s);
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.nH);
        super.onCreate(bundle0);
        WearBackupDialogChimeraActivity.j.j("onCreate", new Object[0]);
        this.setContentView(0x7F0E0E8B);  // layout:wear_backup_dialog_activity
        fcor.b(this, this.findViewById(0x7F0B0FCE), WearBackupDialogChimeraActivity.k);  // id:container
        ((TextView)this.findViewById(0x7F0B1149)).setText(this.getIntent().getStringExtra("dialog_label"));  // id:dialog_label
        ((ImageButton)this.findViewById(0x7F0B1172)).setOnClickListener(new fctc(this));  // id:dismiss_btn
    }
}

