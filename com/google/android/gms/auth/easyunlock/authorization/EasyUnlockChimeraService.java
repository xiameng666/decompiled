package com.google.android.gms.auth.easyunlock.authorization;

import ajkv;
import ajlg;
import ajlh;
import ajli;
import ajlr;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import bahu;
import bblp;
import bboh;
import com.google.android.chimera.Service;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class EasyUnlockChimeraService extends Service {
    public static final bboh a;
    public BluetoothAdapter b;
    private static ajli c;
    private ExecutorService d;
    private Future e;

    static {
        EasyUnlockChimeraService.a = ajlr.a("EasyUnlockService");
    }

    public EasyUnlockChimeraService() {
    }

    EasyUnlockChimeraService(ajkv ajkv0, BluetoothAdapter bluetoothAdapter0, ajlh ajlh0, ExecutorService executorService0) {
        this.b = bluetoothAdapter0;
        this.d = executorService0;
    }

    public static Intent a(Context context0) {
        return new Intent().setClassName(context0, "com.google.android.gms.auth.easyunlock.authorization.InitializerIntentService");
    }

    public static ajli b() {
        synchronized(EasyUnlockChimeraService.class) {
        }
        return EasyUnlockChimeraService.c;
    }

    public static void c(ajli ajli0) {
        synchronized(EasyUnlockChimeraService.class) {
            EasyUnlockChimeraService.c = ajli0;
        }
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        return null;
    }

    @Override  // com.google.android.chimera.Service
    public final void onCreate() {
        this.b = bahu.a(this);
        this.d = new bblp(1, 10);
    }

    @Override  // com.google.android.chimera.Service
    public final void onDestroy() {
        Future future0 = this.e;
        if(future0 != null) {
            future0.cancel(false);
            this.e = null;
        }
        ajli ajli0 = EasyUnlockChimeraService.b();
        if(ajli0 != null) {
            ajli0.a();
            EasyUnlockChimeraService.c(null);
        }
        this.d.shutdown();
    }

    @Override  // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        if(this.e == null || this.e.isDone()) {
            this.e = this.d.submit(new ajlg(this));
        }
        return 1;
    }
}

