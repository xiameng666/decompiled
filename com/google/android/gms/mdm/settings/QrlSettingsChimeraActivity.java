package com.google.android.gms.mdm.settings;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import azts;
import bkyf;
import ca;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import cqnf;
import cqpi;
import hxwm;
import xos;

@GmsCoreVeId(0x3FCC8)
public class QrlSettingsChimeraActivity extends xos {
    @Override  // xos
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(!cqnf.f(this)) {
            this.finish();
            return;
        }
        this.setTitle("Remote Lock");
        if(bundle0 == null) {
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.t(0x7F0B0FE4, new cqpi());  // id:content_frame
            ca0.f();
        }
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onCreateOptionsMenu(Menu menu0) {
        if(!hxwm.h()) {
            return super.onCreateOptionsMenu(menu0);
        }
        this.getMenuInflater().inflate(0x7F100011, menu0);  // menu:feedback_menu
        return true;
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        if(menuItem0.getItemId() == 0x7F0B1394) {  // id:feedback_item
            azts azts0 = new azts(this.getContainerActivity(), null);
            bkyf bkyf0 = new bkyf(this);
            bkyf0.a = azts.Z(this.getContainerActivity());
            String s = hxwm.e();
            if(!s.isEmpty()) {
                bkyf0.d = s;
            }
            azts0.ab(bkyf0.a());
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }
}

