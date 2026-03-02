package com.google.android.gms.tapandpay.dck;

import android.content.Context;
import android.content.Intent;
import bbcu;
import bboh;
import cclw;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.tapandpay.AppContextProvider;
import eshm;
import eswj;
import ggtj;
import ibuq;
import icbb;
import iccl;

public final class DigitalKeyModuleInitializedIntentOperation extends IntentOperation {
    public final Context a;
    private static final bboh b;

    static {
        DigitalKeyModuleInitializedIntentOperation.b = bboh.b("TapAndPay", bbcu.aM);
    }

    public DigitalKeyModuleInitializedIntentOperation() {
        this.a = AppContextProvider.a();
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ibuq.f(intent0, "intent");
        if(ibuq.m(intent0.getAction(), "com.google.android.gms.dck.action.ACTION_DIGITAL_KEY_MODULE_INITIALIZED")) {
            ((ggtj)DigitalKeyModuleInitializedIntentOperation.b.h()).x("DigitalKeyModuleInitializedIntentOperation: received intent");
            eswj eswj0 = new eswj(this);
            if(eswj0.b()) {
                icbb.b(iccl.b(cclw.a), null, null, new eshm(this, eswj0, null), 3);
            }
        }
    }
}

