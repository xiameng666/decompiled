package com.google.android.gms.backup.g1.backup;

import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import arvz;
import asah;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public class G1BackupApiStub.1 extends ResultReceiver {
    final asah a;

    public G1BackupApiStub.1(arvz arvz0, Handler handler0, asah asah0) {
        this.a = asah0;
        Objects.requireNonNull(arvz0);
        super(handler0);
    }

    @Override  // android.os.ResultReceiver
    protected final void onReceiveResult(int v, Bundle bundle0) {
        if(v == -1) {
            try {
                this.a.a(Status.b, ApiMetadata.b);
            }
            catch(RemoteException remoteException0) {
                arvz.a.g("Unable to call back the client.", remoteException0, new Object[0]);
            }
        }
    }
}

