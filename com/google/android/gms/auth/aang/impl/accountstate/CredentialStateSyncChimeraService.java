package com.google.android.gms.auth.aang.impl.accountstate;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import aczm;
import adga;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import ghxi;

public class CredentialStateSyncChimeraService extends Service {
    private static final Object a;
    private static aczm b;

    static {
        CredentialStateSyncChimeraService.a = new Object();
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghxi.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ghxi)hftp0.b_message).c = 8;
        ((ghxi)hftp0.b_message).b |= 1;
        adga.p(((ghxi)hftp0.N_build()));
        return CredentialStateSyncChimeraService.b.getSyncAdapterBinder();
    }

    @Override  // com.google.android.chimera.Service
    public final void onCreate() {
        synchronized(CredentialStateSyncChimeraService.a) {
            if(CredentialStateSyncChimeraService.b == null) {
                CredentialStateSyncChimeraService.b = new aczm(this.getApplicationContext());
            }
        }
    }
}

