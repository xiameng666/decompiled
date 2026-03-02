package com.google.android.gms.smartdevice.d2d;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import eqfo;
import erpb;
import j..util.Objects;

public class TargetDirectTransferController.4 extends ResultReceiver {
    final Account a;
    final eqfo b;

    public TargetDirectTransferController.4(eqfo eqfo0, Handler handler0, Account account0) {
        this.a = account0;
        Objects.requireNonNull(eqfo0);
        this.b = eqfo0;
        super(handler0);
    }

    @Override  // android.os.ResultReceiver
    protected final void onReceiveResult(int v, Bundle bundle0) {
        Account account0 = this.a;
        if(account0 != null && v != -1) {
            eqfo.h.d("KidSetupActivity failed with error: %s, removing account.", new Object[]{v});
            erpb.a(this.b.i).m(account0);
            this.b.x(10705, "KidSetupActivity error: " + v, null);
            return;
        }
        this.b.w();
    }
}

