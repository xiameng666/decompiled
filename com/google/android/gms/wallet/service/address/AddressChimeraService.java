package com.google.android.gms.wallet.service.address;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import cjup;
import com.google.android.chimera.Service;
import fbdo;
import fbes;
import fboy;
import fbvw;
import ggnj;

public class AddressChimeraService extends Service {
    public fbvw a;

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        if("com.google.android.gms.identity.service.BIND".equals(intent0.getAction())) {
            fboy fboy0 = new fboy(this);
            return new cjup(this, 12, ggnj.a, 3, fboy0);
        }
        return null;
    }

    @Override  // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        Context context0 = this.getApplicationContext();
        this.a = new fbvw(this, new fbes(context0), fbdo.a(context0));
    }
}

