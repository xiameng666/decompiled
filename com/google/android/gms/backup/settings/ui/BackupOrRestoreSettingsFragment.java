package com.google.android.gms.backup.settings.ui;

import android.os.Bundle;
import androidx.preference.PreferenceScreen;
import aqql;
import aqzi;
import aqzn;
import aspm;
import asyh;
import asyi;
import asyj;
import baun;
import bblp;
import gftb;
import hqlh;
import skp;
import sku;
import xob;

public class BackupOrRestoreSettingsFragment extends skp {
    public BackupOrRestoreBackupPreference ag;
    private RestoreAnytimePreference ah;
    private aspm ai;
    private final aqzi aj;
    public final baun d;

    public BackupOrRestoreSettingsFragment() {
        this.d = aqql.a(this.getClass().getSimpleName());
        this.aj = new aqzi(new bblp(1, 9));
    }

    @Override  // ohv
    public final void D(Bundle bundle0, String s) {
        if(hqlh.a.b().l()) {
            this.B(0x7F190018);  // xml:backup_or_restore_settings_v2
        }
        else {
            this.B(0x7F190017);  // xml:backup_or_restore_settings
        }
        PreferenceScreen preferenceScreen0 = this.A();
        BackupOrRestoreBackupPreference backupOrRestoreBackupPreference0 = (BackupOrRestoreBackupPreference)preferenceScreen0.l("backup");
        gftb.check(backupOrRestoreBackupPreference0);
        this.ag = backupOrRestoreBackupPreference0;
        backupOrRestoreBackupPreference0.o = new asyh(this);
        RestoreAnytimePreference restoreAnytimePreference0 = (RestoreAnytimePreference)preferenceScreen0.l("restore");
        gftb.check(restoreAnytimePreference0);
        this.ah = restoreAnytimePreference0;
        if(!hqlh.e()) {
            this.ah.T(false);
            return;
        }
        if(hqlh.d()) {
            this.ah.R(0x7F1504B4);  // string:backup_or_restore_title_restore_android_switch "Copy data using Android Switch"
        }
        boolean z = aqzn.a(this.requireContext());
        RestoreAnytimePreference restoreAnytimePreference1 = this.ah;
        restoreAnytimePreference1.o = new asyi(this, z);
        if(z != restoreAnytimePreference1.a) {
            restoreAnytimePreference1.a = z;
            restoreAnytimePreference1.d();
        }
        if(sku.a(this.requireContext())) {
            this.ag.I(0x7F08051B);  // drawable:gs_cloud_upload_rond100_vd_theme_24
            this.ah.I(0x7F08051F);  // drawable:gs_compare_arrows_rond100_vd_theme_24
        }
        this.ai = new aspm(this.requireContext());
    }

    public final void K(int v) {
        if(hqlh.f()) {
            this.ai.g(v);
        }
    }

    @Override  // du
    public final void onDestroy() {
        super.onDestroy();
        this.aj.a();
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        asyj asyj0 = new asyj(this);
        this.aj.b(asyj0);
    }

    @Override  // ohv
    public final void onStart() {
        super.onStart();
        PreferenceScreen preferenceScreen0 = this.A();
        if(preferenceScreen0 != null) {
            xob xob0 = (xob)this.requireContext();
            CharSequence charSequence0 = preferenceScreen0.r;
            if(charSequence0 != null) {
                xob0.setTitle(charSequence0);
            }
        }
    }
}

