import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.SparseArray;
import androidx.camera.core.impl.MetadataHolderService;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class bam {
    public static final Object a;
    public static final SparseArray b;
    public final bjb c;
    public final Object d;
    public final bap e;
    public final Executor f;
    public final Handler g;
    public final HandlerThread h;
    public bng i;
    public final bdj j;
    public final gmcd k;
    public final biu l;
    public gmcd m;
    public final Integer n;
    public int o;
    public aox p;
    public asi q;
    public bag r;
    public bqp s;

    static {
        bam.a = new Object();
        bam.b = new SparseArray();
    }

    public bam(Context context0, bao bao0) {
        gmcd gmcd0;
        Iterator iterator0;
        int v1;
        Object object3;
        blo blo0 = new blo();
        super();
        this.c = new bjb();
        this.d = new Object();
        boolean z = true;
        this.o = 1;
        this.m = bpt.b(null);
        if(bao0 == null) {
            bao bao1 = bam.f(context0);
            if(bao1 == null) {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as \'camera-camera2\'.");
            }
            this.e = bao1.getCameraXConfig();
        }
        else {
            this.e = ((bux)bao0).a;
        }
        Object object0 = (blk)this.e.m.m(bap.j, null);
        if(object0 == null) {
            object0 = blo0.a(context0);
        }
        Objects.toString(object0);
        bcs.h("CameraX");
        if(object0 == null) {
            object0 = blm.a;
            Objects.toString(object0);
            bcs.h("CameraX");
        }
        bmg bmg0 = blm.b.c;
        synchronized(bmg0.a) {
            if(j..util.Objects.equals(bmg0.b.getAndSet(object0), object0)) {
                goto label_51;
            }
            v1 = bmg0.c + 1;
            bmg0.c = v1;
            if(bmg0.d) {
                goto label_51;
            }
            bmg0.d = true;
            iterator0 = bmg0.f.iterator();
        }
        while(true) {
            if(!iterator0.hasNext()) {
                object3 = bmg0.a;
                __monitor_enter(object3);
                try {
                    if(bmg0.c == v1) {
                        bmg0.d = false;
                        goto label_50;
                    }
                    goto label_98;
                }
                catch(Throwable throwable0) {
                    break;
                }
            label_50:
                __monitor_exit(object3);
            label_51:
                Integer integer0 = (Integer)this.e.m.m(bap.k, Integer.valueOf(-1));
                Executor executor0 = (Executor)this.e.m.m(bap.d, null);
                Handler handler0 = (Handler)this.e.m.m(bap.e, null);
                if(executor0 == null) {
                    executor0 = new azv();
                }
                this.f = executor0;
                if(handler0 == null) {
                    HandlerThread handlerThread0 = new HandlerThread("CameraX-scheduler", 10);
                    this.h = handlerThread0;
                    handlerThread0.start();
                    this.g = Handler.createAsync(handlerThread0.getLooper());
                }
                else {
                    this.h = null;
                    this.g = handler0;
                }
                Integer integer1 = (Integer)blq.c(this.e, bap.f, null);
                this.n = integer1;
                synchronized(bam.a) {
                    if(integer1 != null) {
                        kay.f(integer1.intValue(), 3, 6, "minLogLevel");
                        bam.b.put(integer1.intValue(), Integer.valueOf((bam.b.get(integer1.intValue()) == null ? 1 : ((int)(((Integer)bam.b.get(integer1.intValue())))) + 1)));
                        bam.c();
                    }
                }
                bdj bdj0 = (bdj)j..util.Objects.requireNonNull(((bdj)this.e.m.m(bap.i, bdj.a)));
                bdj0.b();
                bdj bdj1 = (bdj0 instanceof bls) ? ((bls)bdj0).c() : new bmt(bdj0);
                this.j = bdj1;
                this.l = new biu(executor0);
                synchronized(this.d) {
                    if(this.o != 1) {
                        z = false;
                    }
                    kay.d(z, "CameraX.initInternal() should only be called once per instance");
                    this.o = 2;
                    gmcd0 = jqy.a(new bak(this, context0));
                }
                this.k = gmcd0;
                return;
                try {
                label_98:
                    __monitor_exit(object3);
                    iterator0 = bmg0.f.iterator();
                    v1 = bmg0.c;
                    continue;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            Object object2 = iterator0.next();
            ((bmf)object2).a(v1);
        }
        __monitor_exit(object3);
        throw throwable0;
    }

    public final void a(Executor executor0, long v, int v1, Context context0, jqt jqt0) {
        executor0.execute(new baj(this, context0, executor0, v1, jqt0, v));
    }

    public final void b() {
        synchronized(this.d) {
            this.o = 4;
        }
    }

    public static void c() {
        SparseArray sparseArray0 = bam.b;
        if(sparseArray0.size() == 0) {
            bcs.a = 3;
            return;
        }
        if(sparseArray0.get(3) != null) {
            bcs.a = 3;
            return;
        }
        if(sparseArray0.get(4) != null) {
            bcs.a = 4;
            return;
        }
        if(sparseArray0.get(5) != null) {
            bcs.a = 5;
            return;
        }
        if(sparseArray0.get(6) != null) {
            bcs.a = 6;
        }
    }

    public final aox d() {
        aox aox0 = this.p;
        if(aox0 != null) {
            return aox0;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public static final void e(biv biv0) {
        if(Trace.isEnabled()) {
            oyn.c("CX:CameraProvider-RetryStatus", (biv0 == null ? -1 : biv0.a));
        }
    }

    private static bao f(Context context0) {
        Application application0;
        for(Context context1 = bnm.a(context0); true; context1 = ((ContextWrapper)context1).getBaseContext()) {
            application0 = null;
            if(!(context1 instanceof ContextWrapper)) {
                break;
            }
            if((context1 instanceof Application)) {
                application0 = (Application)context1;
                break;
            }
        }
        if((application0 instanceof bao)) {
            return (bao)application0;
        }
        try {
            Context context2 = bnm.a(context0);
            ServiceInfo serviceInfo0 = context2.getPackageManager().getServiceInfo(new ComponentName(context2, MetadataHolderService.class), 640);
            String s = serviceInfo0.metaData == null ? null : serviceInfo0.metaData.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER");
            if(s == null) {
                bcs.a("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as \'camera-camera2\'.");
                return null;
            }
            return (bao)Class.forName(s).getDeclaredConstructor(null).newInstance(null);
        }
        catch(PackageManager.NameNotFoundException | ClassNotFoundException | InstantiationException | InvocationTargetException | NoSuchMethodException | IllegalAccessException | NullPointerException exception0) {
            bcs.b("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", exception0);
            return null;
        }
    }
}

