package com.google.android.gms.location.fused.engine.controllers;

import cjhf;
import cjhg;
import cmvf;
import com.google.android.gms.libs.location.validation.platform.GnssStatusListener;
import java.util.function.Consumer;

public final class GnssStatusProviderController..ExternalSyntheticLambda0 implements GnssStatusListener {
    public final cmvf a;

    public GnssStatusProviderController..ExternalSyntheticLambda0(cmvf cmvf0) {
        this.a = cmvf0;
    }

    @Override  // com.google.android.gms.libs.location.validation.platform.GnssStatusListener
    public final void a(cjhg cjhg0, cjhf cjhf0) {
        Consumer consumer0;
        cmvf cmvf0 = this.a;
        synchronized(cmvf0) {
            if(cjhg0 != cmvf0.b) {
                return;
            }
            consumer0 = cmvf0.a;
        }
        if(consumer0 != null) {
            consumer0.accept(cjhf0);
        }
    }
}

