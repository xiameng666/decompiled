package com.google.android.gms.instantapps.routing;

import android.content.Intent;
import bbcu;
import bboh;
import bzvj;
import bzyy;
import com.google.android.chimera.IntentOperation;
import hlxi;
import j..util.Objects;

public class ContentFilterChangedIntentOperation extends IntentOperation {
    private bzyy a;

    static {
        bboh.b("CntntFilterChngedIntent", bbcu.bz);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.a = bzvj.a(this).g;
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(intent0 != null && Objects.equals(intent0.getAction(), "com.google.android.finsky.action.CONTENT_FILTERS_CHANGED")) {
            this.a.c(hlxi.m);
        }
    }
}

