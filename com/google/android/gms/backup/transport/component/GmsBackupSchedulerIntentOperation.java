package com.google.android.gms.backup.transport.component;

import android.content.Intent;
import aqql;
import atmv;
import bbdg;
import bbpz;
import ccmq;
import com.google.android.chimera.IntentOperation;
import hqgx;
import hqkm;

public class GmsBackupSchedulerIntentOperation extends IntentOperation {
    private static final aqql a;
    private static final String b;

    static {
        GmsBackupSchedulerIntentOperation.a = new aqql(new String[]{"GmsBackupSchedulerIO"});
        GmsBackupSchedulerIntentOperation.b = bbpz.f("com.google.android.gms.backup");
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ccmq.a().a(bbdg.mi);
        String s = intent0 == null ? null : intent0.getAction();
        if(s != null) {
            if(s.equals("com.google.android.gms.backup.ACTION_BACKUP_NETWORK_SETTINGS_CHANGED")) {
                GmsBackupSchedulerIntentOperation.a.j("Network settings changed, re-scheduling tasks", new Object[0]);
                GmsBackupSchedulerChimeraService.a(this);
                CustomBackupNewScheduleLoggingTask.d(this);
                atmv.a(this);
                return;
            }
            if(!s.equals(GmsBackupSchedulerIntentOperation.b)) {
                goto label_17;
            }
            if(hqkm.a.b().d()) {
                GmsBackupSchedulerIntentOperation.a.j("Phenotype updated, attempting to schedule custom backup logging", new Object[0]);
                CustomBackupNewScheduleLoggingTask.d(this);
            }
            if(hqgx.a.c().v()) {
                GmsBackupSchedulerIntentOperation.a.j("Phenotype updated, attempting to schedule backup tasks", new Object[0]);
                atmv.a(this);
                return;
            label_17:
                GmsBackupSchedulerIntentOperation.a.m("Intent not supported: " + s, new Object[0]);
            }
        }
    }
}

