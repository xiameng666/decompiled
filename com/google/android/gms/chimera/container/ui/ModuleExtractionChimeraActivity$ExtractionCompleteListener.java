package com.google.android.gms.chimera.container.ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;
import xni;

class ModuleExtractionChimeraActivity.ExtractionCompleteListener extends ResultReceiver {
    private final WeakReference a;

    public ModuleExtractionChimeraActivity.ExtractionCompleteListener(Handler handler0, xni xni0) {
        super(handler0);
        this.a = new WeakReference(xni0);
    }

    @Override  // android.os.ResultReceiver
    protected final void onReceiveResult(int v, Bundle bundle0) {
        xni xni0 = (xni)this.a.get();
        if(xni0 != null && !xni0.getSupportFragmentManager().B) {
            xni0.setResult(-1);
            xni0.finish();
        }
    }
}

