package com.google.android.gms.auth.api.phone.ui;

import aibn;
import aibp;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import bbcu;
import bboh;
import ca;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import hpph;
import hppk;
import im;
import xni;

@GmsCoreVeId(0x3EC7D)
public final class AutofillSettingsChimeraActivity extends xni {
    static {
        bboh.b("SmsRetriever", bbcu.bE);
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(!hppk.i()) {
            this.setContentView(0x7F0E09F7);  // layout:sms_code_autofill_settings_activity
            this.setTitle("SMS verification codes");
            im im0 = this.hL();
            if(im0 != null) {
                im0.B("SMS verification codes");
                im0.o(true);
            }
            if(hpph.e()) {
                aibp aibp0 = new aibp();
                ca ca0 = new ca(this.getSupportFragmentManager());
                ca0.z(0x7F0B188A, aibp0, aibp0.getClass().getName());  // id:main_content
                ca0.a();
                return;
            }
            aibn aibn0 = new aibn();
            ca ca1 = new ca(this.getSupportFragmentManager());
            ca1.z(0x7F0B188A, aibn0, aibn0.getClass().getName());  // id:main_content
            ca1.a();
            return;
        }
        this.startActivity(new Intent("com.google.android.gms.auth.api.phone.ACTION_AUTOFILL_SETTINGS_V31").setPackage("com.google.android.gms"));
        this.finish();
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        if(menuItem0.getItemId() != 0x102002C) {
            return super.onOptionsItemSelected(menuItem0);
        }
        this.finish();
        return true;
    }
}

