package com.google.android.location.internal;

import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import bbdg;
import ccmq;
import com.google.android.chimera.Service;
import gzkq;
import lvj;

@Deprecated
public class PendingIntentCallbackChimeraService extends Service {
    lvj a;

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        return null;
    }

    @Override  // com.google.android.chimera.Service
    public final void onCreate() {
        ccmq.a().a(bbdg.iX);
        super.onCreate();
        this.a = lvj.a(this);
    }

    @Override  // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        if(intent0 != null) {
            String s = intent0.getAction();
            String s1 = gzkq.a(s);
            if(s1 == null) {
                Log.w("PICallbackService", "Unknown action: " + s);
            }
            else {
                Intent intent1 = new Intent(intent0);
                intent1.setAction(s1);
                intent1.setComponent(null);
                lvj lvj0 = this.a;
                if(lvj0.e(intent1)) {
                    lvj0.b();
                    return 2;
                }
            }
        }
        return 2;
    }
}

