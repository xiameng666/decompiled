package com.google.android.gms.trustagent.trustlet.device.bluetooth.ui;

import acn;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import ezbw;

@GmsCoreVeId(0x3FE53)
public class BluetoothDeviceSelectionChimeraActivity extends ezbw implements acn {
    @Override  // acn
    public final void jN(Object object0) {
        ActivityResult activityResult0 = (ActivityResult)object0;
        this.n = false;
    }

    @Override  // ezbw
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Intent intent0 = this.getIntent();
        intent0.setClassName("com.google.android.gms", "com.google.android.gms.trustagent.BluetoothDeviceSelectionCollapsingToolbarActivity");
        this.startActivity(intent0);
        this.finish();
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        if(menuItem0.getItemId() != 0x102002C) {
            return false;
        }
        this.setResult(0);
        this.getOnBackPressedDispatcher().d();
        return true;
    }

    @Override  // ezbw
    protected final void onStop() {
        this.setResult(-11);
        super.onStop();
    }
}

