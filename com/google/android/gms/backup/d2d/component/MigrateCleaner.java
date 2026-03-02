package com.google.android.gms.backup.d2d.component;

import android.content.Intent;
import aqjk;
import aqjl;
import aqql;
import aqze;
import aqzv;
import aren;
import arfw;
import arsc;
import avzf;
import bakb;
import bakc;
import batl;
import hqhq;
import jwe;

public class MigrateCleaner extends avzf {
    private static final aqql a;

    static {
        MigrateCleaner.a = new aqql(new String[]{"MigrateCleaner"});
    }

    @Override  // avzf
    protected final void b(Intent intent0, int v) {
        if(aqzv.a()) {
            try {
                arfw arfw0 = arfw.a(this);
                batl.j();
                bakc bakc0 = arfw0.a;
                if(bakc0.contains("migration_start_time_millis")) {
                    long v1 = System.currentTimeMillis() - bakc0.getLong("migration_start_time_millis", 0L);
                    if(v1 >= 0L && v1 < arfw0.b) {
                        MigrateCleaner.a.m("MigrateCleaner was run while migration was in progress, skipping.", new Object[0]);
                        return;
                    }
                }
            }
            catch(bakb bakb0) {
                arsc.a(this, 3);
                MigrateCleaner.a.n("Unable to check if migration in progress, skipping.", bakb0, new Object[0]);
                return;
            }
            aqze.e(this);
            aqjk aqjk0 = new aqjk(this);
            aren.b(this, aqjl.a);
            aren.a(this, aqjk0, aqjl.a);
            try {
                String s = new aqjk(this).d();
            }
            catch(SecurityException securityException0) {
                if(!hqhq.a.j().aA()) {
                    throw securityException0;
                }
                arsc.a(this, 4);
                boolean z = jwe.a(this, "android.permission.BACKUP") == 0;
                MigrateCleaner.a.g("Unexpected SecurityException (hasPermission = %b)", securityException0, new Object[]{Boolean.valueOf(z)});
                MigrateCleaner.a.d("D2D transport was not selected, not selecting cloud transport.", new Object[0]);
                return;
            }
            if("com.google.android.gms/.backup.migrate.service.D2dTransport".equals(s)) {
                MigrateCleaner.a.h("D2D transport was selected, selecting cloud transport.", new Object[0]);
                aqjk aqjk1 = new aqjk(this);
                if(!aqjk1.g()) {
                    return;
                }
                aqjk1.a.selectBackupTransport("com.google.android.gms/.backup.BackupTransportService");
                return;
            }
            MigrateCleaner.a.d("D2D transport was not selected, not selecting cloud transport.", new Object[0]);
            return;
        }
        MigrateCleaner.a.h("Not running for non-user 0.", new Object[0]);
    }
}

