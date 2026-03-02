package com.google.android.gms.autofill.service;

import android.content.Intent;
import android.os.IBinder;
import aopz;
import bbcu;
import bboh;
import com.google.android.chimera.Service;

public final class AutofillImeCoreChimeraService extends Service {
    static {
        bboh.b("AutofillImeCoreService", bbcu.cD);
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        return new aopz(this);
    }
}

