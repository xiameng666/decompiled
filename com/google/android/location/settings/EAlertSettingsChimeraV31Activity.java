package com.google.android.location.settings;

import android.os.Bundle;
import android.view.MenuItem;
import bbdg;
import bbqa;
import ca;
import ccmq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import fxxw;
import fxyo;
import huqb;
import xos;

@GmsCoreVeId(0x3FAF1)
public class EAlertSettingsChimeraV31Activity extends xos {
    @Override  // xos
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.jj);
        super.onCreate(bundle0);
        this.getWindow().addSystemFlags(0x80000);
        if(bbqa.a() && huqb.O()) {
            fxyo fxyo0 = (fxyo)this.getSupportFragmentManager().h("EAlertSettingsFragment");
            if(fxyo0 == null) {
                fxyo0 = new fxyo();
            }
            this.setContentView(0x7F0E030F);  // layout:ealert_settings_sdk31
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.z(0x7F0B1FD4, fxyo0, "EAlertSettingsFragment");  // id:settings_fragment_container
            ca0.a();
            return;
        }
        this.setTheme(0x7F1603A9);  // style:EewAppThemeSILK
        this.setContentView(0x7F0E030F);  // layout:ealert_settings_sdk31
        ca ca1 = new ca(this.getSupportFragmentManager());
        ca1.G(0x7F0B1FD4, new fxxw());  // id:settings_fragment_container
        ca1.a();
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

