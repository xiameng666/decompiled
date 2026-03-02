package com.google.android.gms.chimera.container;

import android.content.Context;
import android.util.Log;
import awdk;
import bjia;
import com.google.android.chimera.container.ModuleApi;
import gged_interceptors;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Set;
import wxo;
import wys;
import wzq;
import xeb;
import xed;

public class DynamiteModuleApi extends ModuleApi {
    private static boolean a = false;

    static {
    }

    @Override  // com.google.android.chimera.container.ModuleApi
    public Set getInstrumentationFilterRules(Context context0) {
        awdk awdk0 = awdk.a(context0);
        return awdk0 == null ? null : awdk0.c;
    }

    @Override  // com.google.android.chimera.container.ModuleApi
    public void onApkLoaded(Context context0) {
        Method method1;
        Method method0;
        ClassLoader classLoader0 = context0.getClassLoader();
        try {
            Class class0 = classLoader0.loadClass("com.google.android.gms.chimera.DynamiteModuleInitializer");
            method0 = null;
            try {
                method0 = class0.getDeclaredMethod("initializeModuleV2", Context.class, Boolean.TYPE);
                method1 = null;
            }
            catch(NoSuchMethodException unused_ex) {
                method1 = class0.getDeclaredMethod("initializeModuleV1", Context.class);
            }
        }
        catch(Exception exception0) {
            Log.w("DynamiteModuleApi", "Failed to set dynamite application context: " + exception0.toString());
            return;
        }
        if(method0 != null) {
            DynamiteModuleApi.a(method0, new Object[]{context0, Boolean.valueOf(DynamiteModuleApi.a)});
            return;
        }
        if(method1 != null) {
            DynamiteModuleApi.a(method1, new Object[]{context0});
        }
    }

    @Override  // com.google.android.chimera.container.ModuleApi
    public void onBeforeApkLoad(Context context0, wzq wzq0) {
        if((wzq0 instanceof wys)) {
            ((wys)wzq0).c = "com.google.android.gms.chimera.DynamiteModuleInitializer";
            ((wys)wzq0).d = new File(context0.getFilesDir(), ".gms-dynamite-code-cache").getAbsolutePath();
            ((wys)wzq0).e = ((wys)wzq0).a();
        }
        awdk awdk0 = awdk.a(context0);
        if(awdk0 != null) {
            awdk0.b(wzq0);
        }
    }

    public static void setPackageSide(boolean z) {
        DynamiteModuleApi.a = z;
        bjia.g(z);
    }

    @Override  // com.google.android.chimera.container.ModuleApi
    public boolean shouldLoadApkWithoutContainer(xed xed0, int v, xeb xeb0, wxo wxo0) {
        if(!wxo0.i()) {
            return false;
        }
        String s = xeb0.k();
        gged_interceptors gged0 = wxo0.a();
        int v1 = gged0.size();
        int v2 = 0;
        while(v2 < v1) {
            boolean z = s.endsWith(((String)gged0.get(v2)));
            ++v2;
            if(z) {
                return true;
            }
        }
        return false;
    }
}

