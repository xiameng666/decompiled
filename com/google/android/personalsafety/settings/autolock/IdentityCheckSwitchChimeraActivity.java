package com.google.android.personalsafety.settings.autolock;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import fzml;
import fzmp;
import fzou;
import ibuq;
import icbb;
import icta;
import lpt;
import xos;

@GmsCoreVeId(0x3FC7A)
public final class IdentityCheckSwitchChimeraActivity extends xos {
    public final icta j;

    public IdentityCheckSwitchChimeraActivity() {
        this.j = new icta();
    }

    @Override  // xos
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(!fzml.a(this)) {
            this.finish();
            return;
        }
        Intent intent0 = fzmp.a(this);
        icbb.b(lpt.a(this), null, null, new fzou(this, intent0, bundle0, null), 3);
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        ibuq.f(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }
}

