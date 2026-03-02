package com.google.android.chimera.config;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0L)
public abstract class ModuleManager.ModuleInfo extends ModuleManager.BasicModuleInfo {
    @ChimeraApiVersion(added = 0x8AL)
    public final String configurationMode;
    public final ModuleManager.ModuleApkInfo moduleApk;

    public ModuleManager.ModuleInfo(String s, int v, String s1, String s2, ModuleManager.ModuleApkInfo moduleManager$ModuleApkInfo0) {
        super(s, v, s1);
        this.configurationMode = s2;
        this.moduleApk = moduleManager$ModuleApkInfo0;
    }

    public abstract Bundle getMetadata(Context arg1);
}

