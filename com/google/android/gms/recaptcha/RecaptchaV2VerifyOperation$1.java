package com.google.android.gms.recaptcha;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.google.android.gms.common.api.Status;
import ejpa;
import j..util.Objects;

public class RecaptchaV2VerifyOperation.1 extends ResultReceiver {
    final ejpa a;

    public RecaptchaV2VerifyOperation.1(ejpa ejpa0) {
        Objects.requireNonNull(ejpa0);
        this.a = ejpa0;
        super(null);
    }

    @Override  // android.os.ResultReceiver
    protected final void onReceiveResult(int v, Bundle bundle0) {
        try {
            if(v == 0) {
                Status status0 = new Status(0);
                RecaptchaResultData recaptchaResultData0 = new RecaptchaResultData(bundle0.getString("token"));
                this.a.a.a(status0, recaptchaResultData0);
                return;
            }
            Status status1 = new Status(bundle0.getInt("errorCode", 13), bundle0.getString("error", ""));
            this.a.j(status1);
        }
        catch(RemoteException unused_ex) {
        }
    }
}

