package com.google.android.chimera.config;

import com.google.android.chimera.annotation.ChimeraApiVersion;
import xbi;

@ChimeraApiVersion(added = 0x75L)
public abstract class ModuleManager.FeatureRequestListener extends ModuleManager.FeatureRequestProgressListener {
    private ModuleManager.FeatureRequestListener.ListenerWrapper a;

    public void detach() {
        synchronized(this) {
            ModuleManager.FeatureRequestListener.ListenerWrapper moduleManager$FeatureRequestListener$ListenerWrapper0 = this.a;
            if(moduleManager$FeatureRequestListener$ListenerWrapper0 != null) {
                ((xbi)moduleManager$FeatureRequestListener$ListenerWrapper0).a.set(null);
            }
        }
    }

    public void setListenerWrapper(ModuleManager.FeatureRequestListener.ListenerWrapper moduleManager$FeatureRequestListener$ListenerWrapper0) {
        this.a = moduleManager$FeatureRequestListener$ListenerWrapper0;
    }
}

