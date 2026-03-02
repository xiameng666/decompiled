package com.google.android.gms.backup.settings.component;

import android.content.Intent;
import aqql;
import asqs;
import avzf;
import baun;
import cljp;
import clks;
import clkz;
import clla;
import ggtj;
import hqgu;
import ibuq;

public class SettingsModuleInitIntentOperation extends avzf {
    private static final baun a;

    static {
        SettingsModuleInitIntentOperation.a = aqql.a("SettingsModuleInit");
    }

    @Override  // avzf
    protected final void b(Intent intent0, int v) {
        SettingsModuleInitIntentOperation.a.j("onInitRuntimeState", new Object[0]);
        if(NoBackupNotificationChimeraService.f(this)) {
            NoBackupNotificationChimeraService.d(this, 0, false);
        }
        else {
            NoBackupNotificationChimeraService.a.j("Disabled, not scheduling", new Object[0]);
        }
        hqgu hqgu0 = hqgu.a;
        if(hqgu0.c().f()) {
            clkz clkz0 = clkz.e(((int)hqgu0.c().a()));
            ibuq.e(clkz0, "fromInteger(...)");
            clks clks0 = new clks();
            clks0.w("com.google.android.gms.backup.settings.notifications.BackupNotificationsTask");
            clks0.t("backup_notifications");
            clks0.a = clkz0;
            clks0.l(true);
            clks0.v(2);
            clks0.p = true;
            clla clla0 = clks0.a();
            ((ggtj)asqs.a.h()).x("Scheduled backup notifications task successfully.");
            cljp.a(this).f(clla0);
            return;
        }
        ((ggtj)asqs.a.h()).x("Not scheduling task. Flag is off or device is wearable.");
    }
}

