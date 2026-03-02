package com.google.android.gms.mdm.services;

import android.content.Intent;
import android.os.IBinder;
import bbcu;
import bboh;
import com.google.android.chimera.BoundService;
import cqkb;
import hxwm;

public final class QrlBackupAgentService extends BoundService {
    public static final bboh a;

    static {
        QrlBackupAgentService.a = bboh.b("QrlBackupAgentService", bbcu.dX);
    }

    @Override  // com.google.android.chimera.BoundService
    public final IBinder onBind(Intent intent0) {
        return !hxwm.g() ? null : new cqkb(this);
    }
}

