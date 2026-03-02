package com.google.android.gms.nearby.messages.debug;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import bbic;
import com.google.android.chimera.Service;
import dalq;
import gyus;
import java.util.concurrent.CountDownLatch;

public class DebugPokeChimeraService extends Service {
    public CountDownLatch a;
    private final gyus b;
    private final ServiceConnection c;

    public DebugPokeChimeraService() {
        this.b = new gyus(this);
        this.c = new dalq(this);
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        return this.b;
    }

    @Override  // com.google.android.chimera.Service
    public final void onCreate() {
        this.a = new CountDownLatch(1);
        bbic bbic0 = bbic.a();
        Intent intent0 = new Intent();
        intent0.setAction("com.google.android.gms.nearby.messages.service.ACTION_DEBUG_POKE");
        intent0.setComponent(new ComponentName(this, "com.google.android.gms.nearby.messages.service.NearbyMessagesService"));
        bbic0.d(this, intent0, this.c, 1);
    }

    @Override  // com.google.android.chimera.Service
    public final void onDestroy() {
        bbic.a().b(this, this.c);
        super.onDestroy();
    }
}

