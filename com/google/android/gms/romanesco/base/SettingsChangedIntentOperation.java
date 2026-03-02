package com.google.android.gms.romanesco.base;

import android.content.Intent;
import avzf;
import bbcu;
import bboh;
import ekbl;
import ekex;
import hxtm;

public class SettingsChangedIntentOperation extends avzf {
    static {
        bboh.b("ROM_SettingsChangeOp", bbcu.bN);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0, boolean z) {
        ekbl.b(this).a.j();
        if(hxtm.d()) {
            ekex.b(this.getApplicationContext());
        }
    }
}

