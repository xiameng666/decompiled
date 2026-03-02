package com.google.android.personalsafety.settings.autolock;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import azts;
import bkyf;
import ca;
import cmkm;
import cmkn;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import fzkm;
import fzkq;
import fzkr;
import hxiw;
import ibuq;
import xos;

@GmsCoreVeId(0x3FC7B)
public final class AutoLockSettingsChimeraActivity extends xos {
    public final void a(cmkm cmkm0) {
        Activity activity0 = this.getContainerActivity();
        ibuq.e(activity0, "getContainerActivity(...)");
        cmkn.a(cmkm0, activity0);
    }

    @Override  // xos
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(!fzkr.a(this)) {
            this.finish();
            return;
        }
        Context context0 = this.getApplicationContext();
        ibuq.e(context0, "getApplicationContext(...)");
        Intent intent0 = fzkq.b(context0);
        if(intent0 != null) {
            this.startActivity(intent0);
            this.finish();
            return;
        }
        this.setTitle("Theft protection");
        if(bundle0 == null) {
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.t(0x7F0B0FE4, new fzkm());  // id:content_frame
            ca0.f();
        }
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onCreateOptionsMenu(Menu menu0) {
        ibuq.f(menu0, "menu");
        this.getMenuInflater().inflate(0x7F100011, menu0);  // menu:feedback_menu
        return true;
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        ibuq.f(menuItem0, "item");
        if(menuItem0.getItemId() == 0x7F0B1394) {  // id:feedback_item
            azts azts0 = new azts(this, null);
            bkyf bkyf0 = new bkyf(this);
            bkyf0.a = azts.Z(this.getContainerActivity());
            String s = hxiw.a.b().b();
            if(s.length() > 0) {
                bkyf0.d = s;
            }
            azts0.ab(bkyf0.a());
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }
}

