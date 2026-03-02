package com.google.android.gms.backup.settings.backupnow;

import android.content.Intent;
import aqnb;
import aqql;
import asfu;
import asfv;
import asgb;
import asgc;
import asgv;
import asgw;
import asgy;
import ashc;
import baun;
import bblp;
import com.google.android.chimera.IntentOperation;
import gful_cronetEngineProvider;
import gfus;
import hqil;
import hqkm;
import j..util.Objects;

public class RunCustomBackupsIntentOperation extends IntentOperation {
    private static final baun a;
    private final gful_cronetEngineProvider b;

    static {
        RunCustomBackupsIntentOperation.a = aqql.a("RunCustomBackupsIO");
    }

    public RunCustomBackupsIntentOperation() {
        this.b = gfus.a(((gful_cronetEngineProvider)new ashc(this)));
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(!hqkm.a.b().c()) {
            RunCustomBackupsIntentOperation.a.j("Disabled by flag", new Object[0]);
            return;
        }
        if(intent0 != null && intent0.getAction() != null && Objects.equals(intent0.getAction(), "com.google.android.gms.backup.RUN_CUSTOM_BACKUPS")) {
            RunCustomBackupsIntentOperation.a.j("Running", new Object[0]);
            boolean z = intent0.getBooleanExtra("require_unmetered_network", true);
            RunCustomBackupsIntentOperation.a.j("Creating CustomBackupsManager with requiredUnmetered=%b", new Object[]{Boolean.valueOf(z)});
            new asgy(this, z, false, new asfu(this, ((gful_cronetEngineProvider)new asgv()), ((gful_cronetEngineProvider)new asgv()), false), aqnb.f(this, new bblp(1, 9), true), new asgw(), hqil.a.j().w().b).a(((asfv)this.b.mr()), new asgb(), new asgc());
            RunCustomBackupsIntentOperation.a.j("Finished running", new Object[0]);
            return;
        }
        RunCustomBackupsIntentOperation.a.m("Unsupported action", new Object[0]);
    }
}

