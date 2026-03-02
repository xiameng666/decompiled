package com.google.android.gms.fonts.service;

import android.content.Context;
import brvf;
import com.google.android.gms.fonts.system.SystemFontsUpdateSchedulerBase;

public class SystemFontsUpdateSchedulerChimeraService extends SystemFontsUpdateSchedulerBase {
    @Override  // com.google.android.gms.fonts.system.SystemFontsUpdateSchedulerBase
    protected final void d() {
        Context context0 = this.getBaseContext().getApplicationContext();
        brvf.a.h(context0);
    }
}

