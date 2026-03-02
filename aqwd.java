import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class aqwd extends clil {
    public static final Intent a;
    public static final baun b;
    public final gmch c;
    public final CopyOnWriteArraySet d;
    public final CopyOnWriteArraySet e;
    private final Object f;
    private final Context g;
    private gmcu h;

    static {
        aqwd.a = new Intent().setPackage("com.android.vending").setAction("com.android.vending.setup.IPlaySetupServiceV2.BIND");
        aqwd.b = aqql.a("PlaySetupServiceV2Proxy");
    }

    public aqwd(Context context0, ScheduledExecutorService scheduledExecutorService0) {
        super("backup");
        this.f = new Object();
        this.h = new gmcu();
        this.d = new CopyOnWriteArraySet();
        this.e = new CopyOnWriteArraySet();
        this.g = context0;
        gftb.check(scheduledExecutorService0);
        this.c = gmcn.b(scheduledExecutorService0);
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        Object object1;
        aqwd.b.d("Service connected", new Object[0]);
        synchronized(this.f) {
            gmcu gmcu0 = this.h;
            if(iBinder0 == null) {
                object1 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.android.vending.setup.IPlaySetupServiceV2");
                object1 = (iInterface0 instanceof sow) ? ((sow)iInterface0) : new sow(iBinder0);
            }
            gmcu0.q(object1);
        }
        for(Object object2: this.e) {
            ((aqwb)object2).c();
        }
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        aqwd.b.d("Service disconnected", new Object[0]);
        this.e();
        synchronized(this.f) {
            this.h = new gmcu();
        }
        ArrayList arrayList0 = new ArrayList(this.d);
        int v2 = arrayList0.size();
        for(int v = 0; v < v2; ++v) {
            ((gmcu)arrayList0.get(v)).r(new aqwc());
        }
        for(Object object0: this.e) {
            ((aqwb)object0).d();
        }
    }

    public final gmcd c() {
        synchronized(this.f) {
            if(this.h != null && this.h.isDone()) {
                gmcu gmcu0 = this.h;
                if(gmcu0.isDone() && !gmcu0.isCancelled()) {
                    try {
                        gmcu0.u();
                    }
                    catch(InterruptedException | ExecutionException unused_ex) {
                        aqwd.b.d("Binding to the service", new Object[0]);
                        this.h = new gmcu();
                        this.f();
                        return this.h;
                    }
                }
                return this.h;
            }
            aqwd.b.d("Binding to the service", new Object[0]);
            this.h = new gmcu();
            this.f();
        }
        return this.h;
    }

    public final void d(gmcu gmcu0) {
        this.d.add(gmcu0);
        gmbu.t(gmcu0, new aqwa(this, gmcu0), this.c);
    }

    public final void e() {
        aqwd.b.d("Unbinding from the service", new Object[0]);
        try {
            bbic.a().b(this.g, this);
        }
        catch(IllegalArgumentException | IllegalStateException exception0) {
            aqwd.b.l(exception0);
        }
    }

    public final void f() {
        synchronized(this.f) {
            bbic bbic0 = bbic.a();
            Context context0 = this.g;
            if(!bbic0.d(context0, aqwd.a, this, 1)) {
                aqwd.b.f("Couldn\'t bind to the service", new Object[0]);
                try {
                    bbic.a().b(context0, this);
                }
                catch(IllegalArgumentException | IllegalStateException exception0) {
                    aqwd.b.l(exception0);
                }
                this.h.r(new IllegalStateException("Service is not ready"));
            }
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName0) {
        aqwd.b.d("Service binding died", new Object[0]);
        this.e();
        aqvw aqvw0 = new aqvw(this);
        long v = hqhq.a.j().t();
        gmbu.t(this.c.h(aqvw0, v, TimeUnit.MILLISECONDS), new aqvz(this), this.c);
    }
}

