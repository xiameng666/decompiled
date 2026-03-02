package com.google.android.gms.backup.settings.component;

import android.content.Context;
import android.content.Intent;
import aqql;
import aqzn;
import avzc;
import awkv;
import baun;
import bbdi;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import hqlh;
import java.util.ArrayList;
import java.util.List;

public class BackupOrRestoreSettingsIntentOperation extends avzc {
    private static final baun a;

    static {
        BackupOrRestoreSettingsIntentOperation.a = aqql.a("BackupGoogleSettingsIO");
    }

    @Override  // avzc
    public final List d() {
        if(!aqzn.b()) {
            BackupOrRestoreSettingsIntentOperation.a.d("Back up or restore entry point is not enabled", new Object[0]);
            return null;
        }
        Context context0 = this.getBaseContext().getApplicationContext();
        List list0 = new ArrayList();
        Intent intent0 = new Intent().setClassName(context0, "com.google.android.gms.backup.component.BackupOrRestoreSettingsActivity");
        bbdi bbdi0 = bbdi.a;
        GoogleSettingsItem googleSettingsItem0 = new GoogleSettingsItem(intent0, -1, 0x7F1504B0, awkv.ba, bbdi0);  // string:backup_or_restore_title "Back up or copy data"
        googleSettingsItem0.e = false;
        googleSettingsItem0.m = "BackupOrRestore";
        googleSettingsItem0.j = true;
        googleSettingsItem0.l = true;
        list0.add(googleSettingsItem0);
        GoogleSettingsItem googleSettingsItem1 = new GoogleSettingsItem(new Intent().setClassName(context0, "com.google.android.gms.backup.component.BackupSettingsCollapsingActivity"), -1, 0x7F1504B1, awkv.bb, bbdi0);  // string:backup_or_restore_title_backup "Back up data"
        googleSettingsItem1.e = false;
        googleSettingsItem1.m = "backup";
        googleSettingsItem1.j = true;
        googleSettingsItem1.l = true;
        list0.add(googleSettingsItem1);
        if(aqzn.a(context0)) {
            GoogleSettingsItem googleSettingsItem2 = new GoogleSettingsItem(new Intent("com.android.setupwizard.START_RESTORE_ANYTIME").setPackage("com.google.android.setupwizard"), -1, (hqlh.d() ? 0x7F1504B4 : 0x7F1504B3), awkv.bc, bbdi0);  // string:backup_or_restore_title_restore_android_switch "Copy data using Android Switch"
            googleSettingsItem2.e = false;
            googleSettingsItem2.m = "restore";
            googleSettingsItem2.j = true;
            googleSettingsItem2.l = true;
            googleSettingsItem2.a("Transfer");
            googleSettingsItem2.a("Restore");
            googleSettingsItem2.a("Data");
            googleSettingsItem2.a("Copy");
            googleSettingsItem2.a("Move");
            googleSettingsItem2.a("Switch");
            googleSettingsItem2.a("Migrate");
            googleSettingsItem2.a("Old");
            googleSettingsItem2.a("Apps");
            googleSettingsItem2.a("Device");
            googleSettingsItem2.a("Install");
            googleSettingsItem2.a("Backup");
            list0.add(googleSettingsItem2);
        }
        return list0;
    }
}

