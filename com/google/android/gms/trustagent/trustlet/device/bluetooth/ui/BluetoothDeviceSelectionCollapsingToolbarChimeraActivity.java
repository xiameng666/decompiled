package com.google.android.gms.trustagent.trustlet.device.bluetooth.ui;

import acn;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.activity.result.ActivityResult;
import ca;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import ezby;
import ezhe;
import skp;

@GmsCoreVeId(0x3FE52)
public class BluetoothDeviceSelectionCollapsingToolbarChimeraActivity extends ezby implements acn {
    private ezhe k;

    @Override  // ezby
    public final skp a() {
        return new ezhe();
    }

    @Override  // ezby
    public final String i() {
        return "Coffee-BluetoothDeviceSelectionFragment";
    }

    @Override  // acn
    public final void jN(Object object0) {
        ActivityResult activityResult0 = (ActivityResult)object0;
        this.m();
    }

    @Override  // ezby
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.n();
        this.k = new ezhe();
        ca ca0 = new ca(this.getSupportFragmentManager());
        ca0.G(0x7F0B0FE4, this.k);  // id:content_frame
        ca0.a();
    }

    @Override  // ezby
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        if(menuItem0.getItemId() != 0x102002C) {
            return false;
        }
        this.setResult(0);
        this.getOnBackPressedDispatcher().d();
        return true;
    }

    @Override  // ezbx
    protected final void onStop() {
        this.setResult(-11);
        super.onStop();
    }
}

