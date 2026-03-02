package com.google.android.gms.location.settings;

import android.os.Bundle;
import android.view.MenuItem;
import bbdg;
import ca;
import ccmq;
import cnux;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import xos;

@GmsCoreVeId(0x3FAEB)
public class LocationAccuracyNonwearableChimeraActivity extends xos {
    @Override  // xos
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.ja);
        super.onCreate(bundle0);
        this.setTitle(0x7F1516FA);  // string:location_settings_location_accuracy_activity_title "Location Accuracy"
        ca ca0 = new ca(this.getSupportFragmentManager());
        ca0.G(0x7F0B0FE4, new cnux());  // id:content_frame
        ca0.a();
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        if(menuItem0.getItemId() == 0x102002C) {
            this.finish();
            return true;
        }
        return false;
    }
}

