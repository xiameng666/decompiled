import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.UserHandle;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

final class iasv implements ServiceConnection, iara {
    public final Intent a;
    public final UserHandle b;
    public Context c;
    private static final Logger d;
    private static volatile Method e;
    private final int f;
    private final Executor g;
    private int h;
    private int i;
    private final iarl j;

    static {
        iasv.d = Logger.getLogger(iasv.class.getName());
    }

    public iasv(Executor executor0, Context context0, Intent intent0, UserHandle userHandle0, int v, iarl iarl0) {
        synchronized(this) {
            this.a = intent0;
            this.f = v;
            this.j = iarl0;
            this.c = context0;
            this.g = executor0;
            this.b = userHandle0;
            this.h = 1;
            this.i = 1;
        }
    }

    @Override  // iara
    public final void a() {
        iapk iapk0;
        DevicePolicyManager devicePolicyManager0;
        boolean z;
        iasv iasv0;
        iasu iasu0;
        UserHandle userHandle0;
        int v;
        Intent intent0;
        Context context0;
        __monitor_enter(this);
        try {
            if(this.h == 1) {
                this.h = 2;
                context0 = this.c;
                intent0 = this.a;
                v = this.f;
                userHandle0 = this.b;
                iasu0 = userHandle0 == null ? iasu.a : iasu.b;
                try {
                    switch(iasu0.ordinal()) {
                        case 0: {
                            iasv0 = this;
                            z = context0.bindService(intent0, iasv0, v);
                            iapk0 = z ? iapk.b : iapk.o.f(iasu0.d + "(" + intent0 + ") returned false");
                            goto label_37;
                        }
                        case 1: {
                            iasv0 = this;
                            z = context0.bindServiceAsUser(intent0, iasv0, v, userHandle0);
                            iapk0 = z ? iapk.b : iapk.o.f(iasu0.d + "(" + intent0 + ") returned false");
                            goto label_37;
                        }
                        case 2: {
                            devicePolicyManager0 = (DevicePolicyManager)context0.getSystemService("device_policy");
                            iasv0 = this;
                            z = devicePolicyManager0.bindDeviceAdminServiceAsUser(null, intent0, iasv0, v, userHandle0);
                            iapk0 = z ? iapk.b : iapk.o.f(iasu0.d + "(" + intent0 + ") returned false");
                            goto label_37;
                        }
                        default: {
                            iasv0 = this;
                            iapk0 = iapk.o.f(iasu0.d + "(" + intent0 + ") returned false");
                            goto label_37;
                        }
                    }
                }
                catch(SecurityException securityException0) {
                    iasv0 = this;
                    iapk0 = iapk.i.e(securityException0).f("SecurityException from " + iasu0.d);
                    goto label_37;
                }
                catch(RuntimeException runtimeException0) {
                    iasv0 = this;
                    goto label_36;
                }
            }
            else {
                iasv0 = this;
            }
            goto label_56;
        }
        catch(Throwable throwable0) {
            goto label_50;
        }
        try {
            iasv0 = this;
            z = context0.bindService(intent0, iasv0, v);
            iapk0 = z ? iapk.b : iapk.o.f(iasu0.d + "(" + intent0 + ") returned false");
            goto label_37;
        }
        catch(SecurityException securityException0) {
            iapk0 = iapk.i.e(securityException0).f("SecurityException from " + iasu0.d);
            goto label_37;
        }
        catch(RuntimeException runtimeException0) {
            goto label_36;
        }
        catch(Throwable throwable0) {
            goto label_51;
        }
        try {
            devicePolicyManager0 = (DevicePolicyManager)context0.getSystemService("device_policy");
            iasv0 = this;
            z = devicePolicyManager0.bindDeviceAdminServiceAsUser(null, intent0, iasv0, v, userHandle0);
            iapk0 = z ? iapk.b : iapk.o.f(iasu0.d + "(" + intent0 + ") returned false");
            goto label_37;
        }
        catch(SecurityException securityException0) {
            iasv0 = this;
            iapk0 = iapk.i.e(securityException0).f("SecurityException from " + iasu0.d);
            goto label_37;
        }
        catch(RuntimeException runtimeException0) {
            iasv0 = this;
            goto label_36;
            try {
                z = devicePolicyManager0.bindDeviceAdminServiceAsUser(null, intent0, iasv0, v, userHandle0);
                iapk0 = z ? iapk.b : iapk.o.f(iasu0.d + "(" + intent0 + ") returned false");
                goto label_37;
            }
            catch(SecurityException securityException0) {
            }
            catch(RuntimeException runtimeException0) {
                goto label_36;
            }
            catch(Throwable throwable0) {
                goto label_51;
            }
            try {
                iapk0 = iapk.i.e(securityException0).f("SecurityException from " + iasu0.d);
                goto label_37;
            label_36:
                iapk0 = iapk.p.e(runtimeException0).f("RuntimeException from " + iasu0.d);
            label_37:
                if(!iapk0.h()) {
                    try {
                        iasv0.c.unbindService(iasv0);
                    }
                    catch(RuntimeException runtimeException1) {
                        iasv.d.logp(Level.FINE, "io.grpc.binder.internal.ServiceBinding", "handleBindServiceFailure", "Could not clean up after bindService() failure.", runtimeException1);
                    }
                    iasv0.h = 4;
                    iass iass0 = () -> {
                        Logger logger0 = iasv.d;
                        logger0.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound ", iapk0);
                        iasv0.c = null;
                        if(iasv0.i != 4) {
                            iasv0.i = 4;
                            logger0.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound - notifying");
                            iasv0.j.n(iapk0);
                        }
                    };
                    iasv0.g.execute(iass0);
                    goto label_45;
                }
                goto label_56;
            }
            catch(Throwable throwable0) {
                goto label_51;
            }
        label_45:
            __monitor_exit(iasv0);
            return;
        }
        catch(Throwable throwable0) {
        label_50:
            iasv0 = this;
            while(true) {
                try {
                label_51:
                    __monitor_exit(iasv0);
                    throw throwable0;
                }
                catch(Throwable throwable0) {
                }
            }
        }
        goto label_51;
    label_56:
        __monitor_exit(iasv0);
    }

    // Detected as a lambda impl.
    public final void b(iapk iapk0) {
        Logger logger0 = iasv.d;
        logger0.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound ", iapk0);
        this.c = null;
        if(this.i != 4) {
            this.i = 4;
            logger0.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound - notifying");
            this.j.n(iapk0);
        }
    }

    final void c(iapk iapk0) {
        Context context0;
        synchronized(this) {
            context0 = this.h == 2 || this.h == 3 ? this.c : null;
            this.h = 4;
        }
        iast iast0 = () -> {
            Logger logger0 = iasv.d;
            logger0.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound ", iapk0);
            this.c = null;
            if(this.i != 4) {
                this.i = 4;
                logger0.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound - notifying");
                this.j.n(iapk0);
            }
        };
        this.g.execute(iast0);
        if(context0 != null) {
            context0.unbindService(this);
        }
    }

    public static List d(PackageManager packageManager0, Intent intent0, UserHandle userHandle0) {
        try {
            if(iasv.e == null) {
                Class class0 = iasv.class;
                synchronized(class0) {
                    if(iasv.e == null) {
                        iasv.e = PackageManager.class.getMethod("queryIntentServicesAsUser", Intent.class, Integer.TYPE, UserHandle.class);
                    }
                }
            }
            return (List)iasv.e.invoke(packageManager0, intent0, ((int)0x10000000), userHandle0);
        }
        catch(ReflectiveOperationException reflectiveOperationException0) {
            throw new gfuz(reflectiveOperationException0);
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName0) {
        this.c(iapk.q.f("onBindingDied: " + componentName0));
    }

    @Override  // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName0) {
        this.c(iapk.o.f("onNullBinding: " + componentName0));
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        boolean z;
        synchronized(this) {
            if(this.h == 2) {
                this.h = 3;
                z = true;
            }
            else {
                z = false;
            }
        }
        if(z && this.i == 1) {
            this.i = 3;
            iasv.d.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyBound", "notify bound - notifying");
            this.j.l(iBinder0);
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        this.c(iapk.q.f("onServiceDisconnected: " + componentName0));
    }
}

