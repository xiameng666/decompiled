package com.google.android.chimera.config;

import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0L)
public class ModuleManager.BasicModuleInfo {
    public final String moduleId;
    public final int moduleVersion;
    @ChimeraApiVersion(added = 0x7BL)
    public final String submoduleId;

    public ModuleManager.BasicModuleInfo(String s, int v, String s1) {
        this.moduleId = s;
        this.moduleVersion = v;
        this.submoduleId = s1;
    }

    @ChimeraApiVersion(added = 0x7BL)
    public String requireSubmoduleId() {
        String s = this.submoduleId;
        if(s != null) {
            return s;
        }
        throw new IllegalStateException("The context used to obtain the module info for the " + this.moduleId + " module is not associated with a submoduleId.");
    }
}

