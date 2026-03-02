package com.google.android.gms.common.nativesandbox.isolation;

import a;
import android.content.Context;
import android.os.Binder;
import android.os.IBinder.DeathRecipient;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import baxh;
import baxi;
import bbcu;
import bboh;
import ccjg;
import ccjl;
import cjkd;
import com.google.android.chimera.ModuleContext;
import com.google.android.chimera.config.InvalidConfigException;
import ggtj;
import ibuq;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import java.util.Map;
import jeb.synthetic.FIN;
import wyc;
import wzt;

public final class RemoteLibManager extends cjkd {
    private static final bboh a;
    private final Context b;
    private final Map c;

    static {
        RemoteLibManager.a = bboh.b("RemoteLibMgr", bbcu.gM);
    }

    public RemoteLibManager(Context context0) {
        ibuq.f(context0, "appContext");
        super();
        this.b = context0;
        this.c = new LinkedHashMap();
    }

    @Override  // cjke
    public final IBinder a(String s, ParcelFileDescriptor parcelFileDescriptor0, String s1, String s2, IBinder iBinder0) {
        wzt wzt0;
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        ibuq.f(s, "libPath");
        ibuq.f(s1, "moduleId");
        ibuq.f(s2, "implClassName");
        ibuq.f(iBinder0, "client");
        String s3 = parcelFileDescriptor0 == null ? s : "/proc/self/fd/" + parcelFileDescriptor0.getFd();
        baxh baxh0 = (baxh)this.c.get(s);
        if(baxh0 == null) {
            try {
                wzt0 = wyc.f().i(ModuleContext.requireModuleContext(this.b).getContainerContext(), s1, null);
            }
            catch(InvalidConfigException invalidConfigException0) {
                a.e(RemoteLibManager.a.i(), "Failed to load isolated module %s", s1, invalidConfigException0);
                baxh0 = null;
                goto label_37;
            }
            if(wzt0 == null) {
                ((ggtj)RemoteLibManager.a.i()).B("Failed to load isolated module %s", s1);
                baxh0 = null;
            }
            else {
                ClassLoader classLoader0 = wzt0.b.getClassLoader();
                ibuq.e(classLoader0, "getClassLoader(...)");
                Binder binder0 = RemoteLibManager.e(classLoader0, s2);
                if(binder0 == null) {
                    ((ggtj)RemoteLibManager.a.i()).x("cannot create binder stub for isolation");
                    baxh0 = null;
                }
                else {
                    String s4 = binder0.getInterfaceDescriptor();
                    if(s4 == null) {
                        ((ggtj)RemoteLibManager.a.i()).B("Binder stub %s missing interface descriptor", s2);
                        baxh0 = null;
                    }
                    else if(this.load(s3)) {
                        wzt0.c.a();
                        baxh0 = new baxh(wzt0, new ccjg(new ccjl(binder0), s4), new LinkedHashMap());
                    }
                    else {
                        ((ggtj)RemoteLibManager.a.i()).B("failed to dynamically load lib %s", s3);
                        baxh0 = null;
                    }
                }
            }
        label_37:
            if(baxh0 == null) {
                baxh0 = null;
            }
            else {
                this.c.put(s, baxh0);
            }
        }
        if(baxh0 == null) {
            ((ggtj)RemoteLibManager.a.i()).B("failed to create library connection for %s", s);
            FIN.finallyExec$NT(v);
            return null;
        }
        Map map0 = baxh0.c;
        if(!map0.containsKey(iBinder0)) {
            baxi baxi0 = () -> {
                __monitor_enter(this);
                int v = FIN.finallyOpen$NT();
                ibuq.f(s, "libPath");
                ibuq.f(iBinder0, "client");
                Map map0 = this.c;
                baxh baxh0 = (baxh)map0.get(s);
                if(baxh0 == null) {
                    ((ggtj)RemoteLibManager.a.i()).B("library %s is not connected", s);
                    FIN.finallyExec$NT(v);
                    return;
                }
                Map map1 = baxh0.c;
                Object object0 = map1.remove(iBinder0);
                if(object0 != null) {
                    iBinder0.unlinkToDeath(((IBinder.DeathRecipient)object0), 0);
                    if(map1.isEmpty()) {
                        baxh0.b.close();
                        this.unload(s);
                        baxh0.a.c.b();
                        map0.remove(s);
                        FIN.finallyCodeBegin$NT(v);
                        return;
                    }
                    FIN.finallyExec$NT(v);
                    return;
                }
                throw new IllegalStateException("client is not connected to library " + s);
            };
            iBinder0.linkToDeath(baxi0, 0);
            map0.put(iBinder0, baxi0);
            FIN.finallyCodeBegin$NT(v);
            return baxh0.b;
        }
        throw new IllegalStateException("client is already connected");
    }

    // Detected as a lambda impl.
    @Override  // cjke
    public final void c(String s, IBinder iBinder0) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        ibuq.f(s, "libPath");
        ibuq.f(iBinder0, "client");
        Map map0 = this.c;
        baxh baxh0 = (baxh)map0.get(s);
        if(baxh0 == null) {
            ((ggtj)RemoteLibManager.a.i()).B("library %s is not connected", s);
            FIN.finallyExec$NT(v);
            return;
        }
        Map map1 = baxh0.c;
        Object object0 = map1.remove(iBinder0);
        if(object0 != null) {
            iBinder0.unlinkToDeath(((IBinder.DeathRecipient)object0), 0);
            if(map1.isEmpty()) {
                baxh0.b.close();
                this.unload(s);
                baxh0.a.c.b();
                map0.remove(s);
                FIN.finallyCodeBegin$NT(v);
                return;
            }
            FIN.finallyExec$NT(v);
            return;
        }
        throw new IllegalStateException("client is not connected to library " + s);
    }

    @Override  // cjke
    public final void d() {
        System.loadLibrary("isolation_mgr_jni");
    }

    private static final Binder e(ClassLoader classLoader0, String s) {
        try {
            Class class0 = classLoader0.loadClass(s).asSubclass(Binder.class);
            ibuq.e(class0, "asSubclass(...)");
            Constructor constructor0 = class0.getConstructor(null);
            ibuq.e(constructor0, "getConstructor(...)");
            return (Binder)constructor0.newInstance(null);
        }
        catch(LinkageError linkageError0) {
            a.e(RemoteLibManager.a.i(), "Failed to instantiate Binder class %s", s, linkageError0);
            return null;
        }
        catch(ClassCastException classCastException0) {
            a.e(RemoteLibManager.a.i(), "Failed to instantiate Binder class %s", s, classCastException0);
            return null;
        }
        catch(ReflectiveOperationException reflectiveOperationException0) {
            a.e(RemoteLibManager.a.i(), "Failed to instantiate Binder class %s", s, reflectiveOperationException0);
            return null;
        }
    }

    public final native boolean load(String arg1) {
    }

    public final native void unload(String arg1) {
    }
}

