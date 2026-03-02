package com.google.android.gms.backup.settings.ui;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.os.Bundle;
import android.os.UserHandle;
import android.os.UserManager;
import androidx.preference.PreferenceScreen;
import aqql;
import asyf;
import aszd;
import gico;

public class BackupAndResetFragment extends aszd {
    private PreferenceScreen ag;
    public PreferenceScreen d;

    static {
        aqql.a("BackupAndResetFragment");
    }

    @Override  // ohv
    public final void D(Bundle bundle0, String s) {
        this.B(0x7F190015);  // xml:backup_and_reset
        PreferenceScreen preferenceScreen0 = this.A();
        this.d = (PreferenceScreen)preferenceScreen0.l("drive_backup");
        this.ag = (PreferenceScreen)preferenceScreen0.l("factory_reset");
    }

    @Override  // atad
    public final gico K() {
        return gico.g;
    }

    @Override  // atad
    public final String L() {
        return "https://support.google.com/mobile/?p=pixel_backup";
    }

    @Override  // atad
    public final String M() {
        return "pixel_backup_reset";
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        if(this.ac()) {
            this.Z(new asyf(this));
        }
        else {
            this.d.P(0x7F1508A6);  // string:common_off "Off"
        }
        Context context0 = this.getContext();
        int v = UserHandle.myUserId();
        int v1 = 0;
        if(((DevicePolicyManager)context0.getSystemService("device_policy")) != null) {
            int v2 = ((UserManager)context0.getSystemService("user")).getUserRestrictionSource("no_factory_reset", UserHandle.of(v));
            if(v2 != 0 && v2 != 1 && ((v2 & 4) != 0 || (v2 & 2) != 0)) {
                v1 = 1;
            }
        }
        this.ag.H(((boolean)(v1 ^ 1)));
        if(v1 != 0) {
            this.ag.P(0x7F150DCD);  // string:disabled_by_admin_summary_text "Controlled by admin"
            return;
        }
        this.ag.n(null);
    }
}

