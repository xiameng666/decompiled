package com.google.android.gms.security.settings;

import android.os.Bundle;
import android.view.MenuItem;
import bbhd;
import bbse;
import bbsh;
import bbsj;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.gms.mdm.settings.AdmSettingsChimeraActivity;
import cqnf;
import elhg;
import ellw;
import elly;
import elmk;
import ggeo;

@GmsCoreVeId(0x3FCC6)
public class SecuritySettingsChimeraActivity extends ellw {
    public bbsj j;
    private boolean k;

    @Override  // avyp
    public final void onCreate(Bundle bundle0) {
        this.hL().o(true);
        super.onCreate(bundle0);
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        switch(menuItem0.getItemId()) {
            case 0x102002C: {
                this.onBackPressed();
                return true;
            }
            case 0x7F0B1F80: {  // id:security_apps_help
                this.l(ggeo.m("isMdmVisible", String.valueOf(this.k), "isVerifyAppsVisible", "true"), bbhd.a());
                return true;
            }
            default: {
                return super.onOptionsItemSelected(menuItem0);
            }
        }
    }

    @Override  // xoi
    public final void onResume() {
        super.onResume();
        if(this.j == null) {
            return;
        }
        new elly(this).start();
    }

    @Override  // avyp
    protected final void q(bbsh bbsh0) {
        bbse bbse0 = bbsh0.K(0x7F150884);  // string:common_mdm_feature_name "Find Hub"
        boolean z = new cqnf(this).d();
        this.k = z;
        if(z) {
            bbsj bbsj0 = new bbsj(this);
            bbsj0.r(0x7F150884);  // string:common_mdm_feature_name "Find Hub"
            bbsj0.p(0x7F151849);  // string:mdm_settings_locate_title "Remotely locate this device"
            bbsj0.m(AdmSettingsChimeraActivity.g(this));
            bbse0.k(bbsj0);
        }
        bbse bbse1 = bbsh0.K(0x7F1529EF);  // string:security_status_section_title "Security Status"
        new elmk(this).start();
        bbsj bbsj1 = new bbsj(this);
        this.j = bbsj1;
        bbsj1.r(0x7F151472);  // string:google_play_protect_title "Google Play Protect"
        this.j.m(elhg.n(this, 2));
        bbse1.k(this.j);
    }
}

