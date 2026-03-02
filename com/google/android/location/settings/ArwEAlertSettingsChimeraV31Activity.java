package com.google.android.location.settings;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import bbdg;
import ca;
import ccmq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import fxmj;
import fxvq;
import fxvv;
import xos;

@GmsCoreVeId(0x3FAF5)
public class ArwEAlertSettingsChimeraV31Activity extends xos {
    @Override  // xos
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.jj);
        super.onCreate(bundle0);
        this.setTheme(0x7F1603A9);  // style:EewAppThemeSILK
        this.setContentView(0x7F0E00AF);  // layout:arw_ealert_settings_sdk31
        ca ca0 = new ca(this.getSupportFragmentManager());
        ca0.G(0x7F0B1FD4, new fxvq());  // id:settings_fragment_container
        ca0.a();
        fxvv fxvv0 = fxvv.b();
        fxvv.c(((TextView)this.findViewById(0x7F0B0BEA)), fxvv0.a.a);  // id:arw_ealert_settings_how_it_works_title_id
        fxvv.c(((TextView)this.findViewById(0x7F0B0BE7)), fxvv0.a.b);  // id:arw_ealert_settings_detected_title_id
        fxvv.c(((TextView)this.findViewById(0x7F0B0BE6)), fxvv0.a.c);  // id:arw_ealert_settings_detected_text_id
        fxvv.c(((TextView)this.findViewById(0x7F0B0BE9)), fxvv0.a.d);  // id:arw_ealert_settings_how_it_works_body_text_id
        fxvv.c(((TextView)this.findViewById(0x7F0B0BE8)), fxvv0.a.e);  // id:arw_ealert_settings_how_it_works_body_2_text_id
        this.setTitle(fxvv.b().a());
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        if(fxmj.e() && menuItem0.getItemId() == 0x102002C) {
            this.finish();
            return true;
        }
        return false;
    }
}

