package com.google.android.gms.nearby.fastpair.sass.device.connection.ui;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import cyjh;
import ggtj;

public class SassProcessChimeraService extends BoundService {
    @Override  // com.google.android.chimera.BoundService
    public final IBinder onBind(Intent intent0) {
        ((ggtj)cyjh.a.d().ar(0x1F33)).x("SassProcessChimeraService onBind");
        return null;
    }

    @Override  // com.google.android.chimera.BoundService
    public final boolean onUnbind(Intent intent0) {
        ((ggtj)cyjh.a.d().ar(0x1F34)).x("SassProcessChimeraService onUnbind");
        return false;
    }
}

