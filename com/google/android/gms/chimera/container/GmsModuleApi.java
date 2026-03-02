package com.google.android.gms.chimera.container;

import a;
import android.content.Context;
import awdk;
import awfg;
import babh;
import bbcu;
import bbmz;
import bboh;
import cliv;
import cliw;
import com.google.android.chimera.container.ModuleApi;
import com.google.android.gms.common.app.BaseApplicationContext;
import java.util.Set;
import wzq;

public class GmsModuleApi extends ModuleApi {
    private static final bboh a;

    static {
        GmsModuleApi.a = bboh.b("GmsModuleApi", bbcu.en);
    }

    @Override  // com.google.android.chimera.container.ModuleApi
    public Set getInstrumentationFilterRules(Context context0) {
        awdk awdk0 = awdk.a(context0);
        return awdk0 == null ? null : awdk0.c;
    }

    @Override  // com.google.android.chimera.container.ModuleApi
    public void onApkLoaded(Context context0) {
        GmsModuleApi.a(context0.getClassLoader().loadClass("com.google.android.gms.chimera.GmsModuleInitializer").getMethod("initializeModuleV0", Context.class, BaseApplicationContext.class), new Object[]{context0, babh.a()});
    }

    @Override  // com.google.android.chimera.container.ModuleApi
    public void onBeforeApkLoad(Context context0, wzq wzq0) {
        awdk awdk0 = awdk.a(context0);
        if(awdk0 != null) {
            awdk0.b(wzq0);
        }
    }

    @Override  // com.google.android.chimera.container.ModuleApi
    public void onModuleLoaded(String s, String s1, Context context0) {
        if(s1 == null) {
            s1 = "com.google.android.gms.chimera.modules." + bbmz.j(s).replace("__", ".").replace('_', '.') + ".AppContextProvider";
        }
        try {
            cliw.a(context0.getClassLoader().loadClass(s1), "setApplicationContextV0", null, true, new cliv[]{new cliv(Context.class, context0)});
        }
        catch(Exception exception0) {
            awfg.e().b(context0, 0x83, s);
            a.e(GmsModuleApi.a.i(), "Failed to set module context for %s.", s, exception0);
            throw exception0;
        }
    }
}

