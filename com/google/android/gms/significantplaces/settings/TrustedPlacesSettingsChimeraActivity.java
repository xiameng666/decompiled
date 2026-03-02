package com.google.android.gms.significantplaces.settings;

import android.os.Bundle;
import android.view.MenuItem;
import bbdg;
import ca;
import ccmq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import epil;
import epmo;
import ibuq;
import xos;

@GmsCoreVeId(0x3FCF5)
public final class TrustedPlacesSettingsChimeraActivity extends xos {
    @Override  // xos
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.wy);
        super.onCreate(bundle0);
        epil.c(this);
        if(bundle0 == null) {
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.G(0x7F0B0FE4, new epmo());  // id:content_frame
            ca0.a();
        }
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        ibuq.f(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            epil.b(this);
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    @Override  // xoi
    protected final void onStart() {
        super.onStart();
        epil.d(this);
    }

    @Override  // xoi
    protected final void onStop() {
        epil.e(this);
        super.onStop();
    }
}

