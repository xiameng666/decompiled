package com.google.android.chimera;

import a;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextParams;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import gftb;
import ggeo;
import java.util.Map;
import wxo;
import wzq;
import xdp;

@ChimeraApiVersion(added = 0L)
public class ModuleContext extends ContextThemeWrapper {
    wxo a;
    private static final ThreadLocal b;
    private static final Object c;
    private ModuleContext d;
    private Context e;
    private wzq f;
    private String g;
    private int h;
    private String i;
    private Resources j;
    private Resources k;
    private ClassLoader l;
    private ggeo m;
    private boolean n;
    private Object o;

    static {
        ModuleContext.b = new ThreadLocal();
        ModuleContext.c = new Object();
    }

    private ModuleContext() {
        super(null);
        this.n = true;
    }

    protected ModuleContext(Context context0, ModuleContext moduleContext0, Resources resources0, boolean z) {
        this(context0, moduleContext0, (moduleContext0.i == null ? moduleContext0.g : moduleContext0.i), resources0, z);
    }

    public ModuleContext(Context context0, ModuleContext moduleContext0, String s, int v, String s1, Resources resources0, wxo wxo0) {
        String s2 = TextUtils.isEmpty(s1) ? null : s1;
        ggeo ggeo0 = moduleContext0.getFulfilledApis();
        this.b(context0, moduleContext0, moduleContext0.f, s, v, s2, (s2 == null ? s : s2), resources0, moduleContext0.l, ggeo0, true, wxo0);
    }

    protected ModuleContext(Context context0, ModuleContext moduleContext0, String s, Resources resources0, boolean z) {
        ggeo ggeo0 = moduleContext0.getFulfilledApis();
        this.b(context0, moduleContext0.d, moduleContext0.f, moduleContext0.g, moduleContext0.h, moduleContext0.i, s, resources0, moduleContext0.l, ggeo0, z, moduleContext0.a);
    }

    private final Context a(String s) {
        return new ModuleContext(super.createAttributionContext(s), this, null, this.j, this.n);
    }

    private final void b(Context context0, ModuleContext moduleContext0, wzq wzq0, String s, int v, String s1, String s2, Resources resources0, ClassLoader classLoader0, Map map0, boolean z, wxo wxo0) {
        Context context1;
        if(s2 == null) {
            context1 = context0;
        }
        else {
            ModuleContext moduleContext1 = ModuleContext.getModuleContext(context0);
            context1 = moduleContext1 == null ? context0.createAttributionContext(s2) : moduleContext1.a(s2);
        }
        this.attachBaseContext(context1);
        this.d = moduleContext0;
        this.e = context0;
        this.f = wzq0;
        this.g = s;
        this.h = v;
        this.i = s1;
        this.l = classLoader0;
        this.m = ggeo.k(map0);
        this.j = resources0;
        Resources resources1 = context0.getResources();
        this.k = resources1;
        this.n = z;
        Resources resources2 = this.j;
        if(resources2 != null && z) {
            resources2.updateConfiguration(resources1.getConfiguration(), this.k.getDisplayMetrics());
        }
        this.a = wxo0;
    }

    private final void c(BroadcastReceiver broadcastReceiver0) {
        if((broadcastReceiver0 instanceof DynamicBroadcastReceiver)) {
            ((DynamicBroadcastReceiver)broadcastReceiver0).setModuleContext(this);
        }
    }

    public static ModuleContext createApkApplicationContext(Context context0, wzq wzq0, Resources resources0, ClassLoader classLoader0, Map map0, wxo wxo0) {
        ModuleContext moduleContext0 = new ModuleContext();
        moduleContext0.b(context0, moduleContext0, wzq0, null, -1, null, "apkappcontext", resources0, classLoader0, map0, true, wxo0);
        return moduleContext0;
    }

    @Override  // android.content.ContextWrapper
    public Context createAttributionContext(String s) {
        String s1 = this.g == null ? this.getAttributionTag() : this.g;
        if(s1 == null) {
            s1 = s;
        }
        if(s1 != null && !s1.equals(s)) {
            Log.w("ModuleContext", a.l(s1, s, "Attribution tag: ", " ignored, replaced with: "));
        }
        return this.a(s1);
    }

    @Override  // android.content.ContextWrapper
    public Context createConfigurationContext(Configuration configuration0) {
        if(this.j != null) {
            try {
                Resources resources0 = this.f.c();
                return new ModuleContext(super.createConfigurationContext(configuration0), this, resources0, false);
            }
            catch(PackageManager.NameNotFoundException | xdp exception0) {
                throw new IllegalStateException("Unable to create Resources for module " + this.f, exception0);
            }
        }
        return new ModuleContext(super.createConfigurationContext(configuration0), this, null, false);
    }

    @Override  // android.content.ContextWrapper
    public Context createContext(ContextParams contextParams0) {
        return new ModuleContext(super.createContext(contextParams0), this, this.j, this.n);
    }

    public Context createCredentialProtectedStorageContext() {
        return new ModuleContext(super.createCredentialProtectedStorageContext(), this, this.j, this.n);
    }

    @Override  // android.content.ContextWrapper
    public Context createDeviceProtectedStorageContext() {
        return new ModuleContext(super.createDeviceProtectedStorageContext(), this, this.j, this.n);
    }

    @Override  // android.content.ContextWrapper
    public Context createDisplayContext(Display display0) {
        if(this.j != null) {
            try {
                Resources resources0 = this.f.c();
                return new ModuleContext(super.createDisplayContext(display0), this, resources0, true);
            }
            catch(PackageManager.NameNotFoundException | xdp exception0) {
                throw new RuntimeException("Failed to create module Resources", exception0);
            }
        }
        return new ModuleContext(super.createDisplayContext(display0), this, null, true);
    }

    public static ModuleContext createModuleApplicationContext(ModuleContext moduleContext0, String s, int v, String s1, wxo wxo0) {
        String s2 = TextUtils.isEmpty(s1) ? null : s1;
        ModuleContext moduleContext1 = new ModuleContext();
        ggeo ggeo0 = moduleContext0.getFulfilledApis();
        moduleContext1.b(moduleContext0.getContainerContext(), moduleContext1, moduleContext0.f, s, v, s2, (s2 == null ? s : s2), moduleContext0.getResources(), moduleContext0.l, ggeo0, false, wxo0);
        return moduleContext1;
    }

    @Override  // android.content.ContextWrapper
    public Context getApplicationContext() {
        return this.d;
    }

    @Override  // android.content.ContextWrapper
    public ApplicationInfo getApplicationInfo() {
        ApplicationInfo applicationInfo0 = (ApplicationInfo)ModuleContext.b.get();
        return applicationInfo0 == null ? super.getApplicationInfo() : applicationInfo0;
    }

    @Override  // android.content.ContextWrapper
    public Context getBaseContext() {
        return this.e;
    }

    @Override  // android.content.ContextWrapper
    public ClassLoader getClassLoader() {
        return this.l;
    }

    public Context getContainerContext() {
        return this.e;
    }

    public Resources getContainerResources() {
        return this.k;
    }

    public ggeo getFulfilledApis() {
        return this.m;
    }

    public wzq getModuleApk() {
        return this.f;
    }

    public static ModuleContext getModuleContext(Context context0) {
        while((context0 instanceof ContextWrapper)) {
            if((context0 instanceof ModuleContext)) {
                return (ModuleContext)context0;
            }
            context0 = ((ContextWrapper)context0).getBaseContext();
        }
        return null;
    }

    public String getModuleId() {
        return this.g;
    }

    public Object getModuleLoaderStrongRefForTesting() {
        return this.o;
    }

    public int getModuleVersion() {
        return this.h;
    }

    @Override  // android.content.ContextWrapper
    public Resources getResources() {
        return this.j == null ? this.k : this.j;
    }

    public String getSubmoduleId() {
        return this.i;
    }

    @Override  // com.google.android.chimera.ContextThemeWrapper
    public Object getSystemService(String s) {
        switch(s.hashCode()) {
            case 0xCA0053BA: {
                if(s.equals("sensor")) {
                    Object object0 = ModuleContext.c;
                    return super.getSystemService(s);
                }
                return super.getSystemService(s);
            }
            case 0xD10BDBF0: {
                return s.equals("window") ? this.e.getSystemService(s) : super.getSystemService(s);
            }
            case 3599307: {
                return s.equals("user") ? this.d.super.getBaseContext().getSystemService(s) : super.getSystemService(s);
            }
            case 0x37AF15: {
                return s.equals("wifi") ? this.d.super.getBaseContext().getSystemService(s) : super.getSystemService(s);
            }
            case 0x714F9FB5: {
                return super.getSystemService(s);
            }
            case 1923312055: {
                return s.equals("connectivity") ? this.d.super.getBaseContext().getSystemService(s) : super.getSystemService(s);
            }
            default: {
                return super.getSystemService(s);
            }
        }
    }

    public boolean getUpdateResourcesConfiguration() {
        return this.n;
    }

    public ApplicationInfo overrideApplicationInfo(ApplicationInfo applicationInfo0) {
        ApplicationInfo applicationInfo1 = (ApplicationInfo)ModuleContext.b.get();
        ModuleContext.b.set(applicationInfo0);
        return applicationInfo1;
    }

    @Override  // android.content.ContextWrapper
    public void registerComponentCallbacks(ComponentCallbacks componentCallbacks0) {
        super.getApplicationContext().registerComponentCallbacks(componentCallbacks0);
    }

    @Override  // android.content.ContextWrapper
    public Intent registerReceiver(BroadcastReceiver broadcastReceiver0, IntentFilter intentFilter0) {
        this.c(broadcastReceiver0);
        return super.registerReceiver(broadcastReceiver0, intentFilter0);
    }

    @Override  // android.content.ContextWrapper
    public Intent registerReceiver(BroadcastReceiver broadcastReceiver0, IntentFilter intentFilter0, int v) {
        this.c(broadcastReceiver0);
        return super.registerReceiver(broadcastReceiver0, intentFilter0, v);
    }

    @Override  // android.content.ContextWrapper
    public Intent registerReceiver(BroadcastReceiver broadcastReceiver0, IntentFilter intentFilter0, String s, Handler handler0) {
        this.c(broadcastReceiver0);
        return super.registerReceiver(broadcastReceiver0, intentFilter0, s, handler0);
    }

    @Override  // android.content.ContextWrapper
    public Intent registerReceiver(BroadcastReceiver broadcastReceiver0, IntentFilter intentFilter0, String s, Handler handler0, int v) {
        this.c(broadcastReceiver0);
        return super.registerReceiver(broadcastReceiver0, intentFilter0, s, handler0, v);
    }

    @ChimeraApiVersion(added = 0x8FL)
    public static ModuleContext requireModuleContext(Context context0) {
        ModuleContext moduleContext0 = ModuleContext.getModuleContext(context0);
        if(moduleContext0 != null) {
            return moduleContext0;
        }
        throw new IllegalArgumentException("Not a module Context");
    }

    public void setModuleLoaderStrongRef(Object object0) {
        gftb.q(this.o == null);
        this.o = object0;
    }

    @Override  // android.content.ContextWrapper
    public void unregisterComponentCallbacks(ComponentCallbacks componentCallbacks0) {
        super.getApplicationContext().unregisterComponentCallbacks(componentCallbacks0);
    }

    @Override  // android.content.ContextWrapper
    public void unregisterReceiver(BroadcastReceiver broadcastReceiver0) {
        if((broadcastReceiver0 instanceof DynamicBroadcastReceiver)) {
            ((DynamicBroadcastReceiver)broadcastReceiver0).setModuleContext(null);
        }
        super.unregisterReceiver(broadcastReceiver0);
    }
}

