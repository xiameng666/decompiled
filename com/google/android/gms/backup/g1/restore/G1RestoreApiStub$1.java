package com.google.android.gms.backup.g1.restore;

import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import arzj;
import asax;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public class G1RestoreApiStub.1 extends ResultReceiver {
    final asax a;

    public G1RestoreApiStub.1(arzj arzj0, Handler handler0, asax asax0) {
        this.a = asax0;
        Objects.requireNonNull(arzj0);
        super(handler0);
    }

    @Override  // android.os.ResultReceiver
    protected final void onReceiveResult(int v, Bundle bundle0) {
        try {
            if(v == -1) {
                this.a.a(Status.b, ApiMetadata.b);
                return;
            }
            this.a.a(Status.d, ApiMetadata.b);
        }
        catch(RemoteException remoteException0) {
            arzj.a.g("Unable to call back the client.", remoteException0, new Object[0]);
        }
    }
}

