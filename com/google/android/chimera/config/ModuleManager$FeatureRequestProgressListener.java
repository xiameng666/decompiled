package com.google.android.chimera.config;

import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0L)
@Deprecated
public abstract class ModuleManager.FeatureRequestProgressListener {
    @Deprecated
    public void onRequestComplete() {
    }

    @ChimeraApiVersion(added = 105L)
    public void onRequestComplete(int v) {
        this.onRequestComplete();
    }
}

