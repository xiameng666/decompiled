package com.google.android.gms.backup.settings.backupnow;

import asfl;
import asgc;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggfp;
import hqil;
import java.util.Collections;

public class BackUpNowApiChimeraService extends cjtg {
    private final asgc a;

    public BackUpNowApiChimeraService() {
        super(0xAF, "com.google.android.gms.backup.ACTION_BACKUP_NOW", Collections.EMPTY_SET, 0, 10, ggfp.G(hqil.a.j().z().b));
        this.a = new asgc();
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new asfl(this, this.l(), this.a, getServiceRequest0.f, getServiceRequest0.p));
    }
}

