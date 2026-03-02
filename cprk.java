import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import j..util.Objects;

public final class cprk {
    private static final String a = "cprk";
    private static Context b;
    private static cppl c;

    static {
    }

    public static cppl a(Context context0) {
        batl.s(context0);
        cppl cppl0 = cprk.c;
        if(cppl0 == null) {
            cppl cppl1 = cprk.e(context0, 0);
            cprk.c = cppl1;
            try {
                int v = cppl1.getRendererType();
            }
            catch(RemoteException remoteException0) {
                throw new cpsi(remoteException0);
            }
            if(v == 2 && !"com.google.android.gms".equals("com.google.android.apps.photos")) {
                try {
                    cprk.c.preInit(new ObjectWrapper(cprk.d(context0, 0)));
                }
                catch(UnsatisfiedLinkError unused_ex) {
                    Log.w(cprk.a, "Caught UnsatisfiedLinkError attempting to load the LATEST renderer\'s native library. Attempting to use the LEGACY renderer instead.");
                    cprk.b = null;
                    cprk.c = cprk.e(context0, 1);
                }
                catch(RemoteException remoteException1) {
                    throw new cpsi(remoteException1);
                }
            }
            try {
                cprk.c.initV2(new ObjectWrapper(((Context)Objects.requireNonNull(cprk.d(context0, 0))).getResources()), 20000000);
                return cprk.c;
            }
            catch(RemoteException remoteException2) {
                throw new cpsi(remoteException2);
            }
        }
        return cppl0;
    }

    private static Context b(Exception exception0, Context context0) {
        Log.e(cprk.a, "Failed to load maps module, use pre-Chimera", exception0);
        return azqk.b(context0);
    }

    private static Object c(Class class0) {
        try {
            return class0.newInstance();
        }
        catch(InstantiationException instantiationException0) {
            throw new IllegalStateException("Unable to instantiate the dynamic class " + class0.getName(), instantiationException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new IllegalStateException("Unable to call the default constructor of " + class0.getName(), illegalAccessException0);
        }
    }

    private static Context d(Context context0, int v) {
        Context context2;
        Context context1 = cprk.b;
        if(context1 == null) {
            try {
                String s = 1 == v ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
                context2 = bjia.f(context0, bjia.a, s).g;
            }
            catch(Exception exception0) {
                if(s.equals("com.google.android.gms.maps_dynamite")) {
                    context2 = cprk.b(exception0, context0);
                }
                else {
                    try {
                        context2 = bjia.f(context0, bjia.a, "com.google.android.gms.maps_dynamite").g;
                    }
                    catch(Exception exception1) {
                        context2 = cprk.b(exception1, context0);
                    }
                }
            }
            cprk.b = context2;
            if(context2 != null) {
                return context2;
            }
            throw new RuntimeException("Unable to load maps module, maps container context is null");
        }
        return context1;
    }

    private static cppl e(Context context0, int v) {
        Object object0;
        Log.i(cprk.a, "Making Creator dynamically");
        ClassLoader classLoader0 = cprk.d(context0, v).getClassLoader();
        try {
            batl.s(classLoader0);
            object0 = cprk.c(classLoader0.loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", classNotFoundException0);
        }
        if(((IBinder)object0) != null) {
            return cppk.asInterface(((IBinder)object0));
        }
        throw new RuntimeException("Unable to load maps module, IBinder for com.google.android.gms.maps.internal.CreatorImpl is null");
    }
}

