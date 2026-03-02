package com.google.android.gms.backup.extension.download;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import aqql;
import arsv;
import bbdg;
import bbrc;
import ccmq;
import com.google.android.chimera.IntentOperation;
import hqil;

public class SetupWizardFinishedIntentOperation extends IntentOperation {
    private final aqql a;

    public SetupWizardFinishedIntentOperation() {
        this.a = new aqql(new String[]{"SuWFinishedIO"});
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ccmq.a().a(bbdg.mi);
        arsv arsv0 = new arsv(this);
        if(hqil.n()) {
            if(arsv.k()) {
                int v = bbrc.c();
                try {
                    PackageInfo packageInfo0 = this.getApplicationContext().getPackageManager().getPackageInfo("com.google.android.gms", 0x200000);
                    this.a.j("bundled version: " + packageInfo0.versionCode, new Object[0]);
                    this.a.j("current version: " + v, new Object[0]);
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                    this.a.g("Package manager could not find GMSCore package", packageManager$NameNotFoundException0, new Object[0]);
                    this.a.j("GMSCore has not updated. Returning without any action.", new Object[0]);
                    return;
                }
                if(v > packageInfo0.versionCode) {
                    aqql aqql0 = this.a;
                    aqql0.j("Received SuW finished broadcast", new Object[0]);
                    if(!arsv0.i()) {
                        aqql0.j("Restore token not available... returning", new Object[0]);
                        return;
                    }
                    CustomBackupDownloadStarterTask.d(this);
                    return;
                }
                this.a.j("GMSCore has not updated. Returning without any action.", new Object[0]);
                return;
            }
            this.a.j("Required conditions not met. Returning without any action.", new Object[0]);
            return;
        }
        this.a.j("Custom backup download SUW trigger flag off. Returning without any action.", new Object[0]);
    }
}

