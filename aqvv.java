import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class aqvv implements aqwb {
    public static final baun a;
    public final aqwd b;
    public final String c;
    private final ScheduledExecutorService d;
    private final boolean e;
    private aqzq f;
    private aqzq g;

    static {
        aqvv.a = aqql.a("PlaySetupServiceV2Helper");
    }

    public aqvv(Context context0, ScheduledExecutorService scheduledExecutorService0, String s) {
        aqwd aqwd0 = new aqwd(context0, scheduledExecutorService0);
        super();
        this.e = hqhq.a.j().ax();
        this.b = aqwd0;
        gftb.check(scheduledExecutorService0);
        this.d = scheduledExecutorService0;
        this.c = s;
    }

    public final gmcd a() {
        synchronized(this) {
            if(!this.e) {
                return gmbu.h(new aqvu());
            }
            baun baun0 = aqvv.a;
            baun0.d("Trying to pause app updates for %s", new Object[]{this.c});
            if(this.g != null) {
                baun0.d("Resume updates was requested before, cancelling", new Object[0]);
                this.g.cancel(true);
                this.g = null;
            }
            if(this.f == null) {
                baun0.d("Pause app updates was not requested before, requesting now", new Object[0]);
                aqvs aqvs0 = new aqvs(this);
                int v1 = (int)hqhq.b();
                aqxp aqxp0 = aqxp.a(hqhq.c(), TimeUnit.MILLISECONDS);
                this.f = new aqzq(((gful_cronetEngineProvider)aqvs0), this.d, v1, null, aqxp0);
                this.b.e.add(this);
            }
        }
        return this.f;
    }

    public final gmcd b() {
        synchronized(this) {
            if(!this.e) {
                return gmbu.h(new aqvu());
            }
            baun baun0 = aqvv.a;
            baun0.d("Trying to resume app updates for %s", new Object[]{this.c});
            if(this.f != null) {
                baun0.d("Pause updates was requested before, cancelling", new Object[0]);
                this.f.cancel(true);
                this.f = null;
            }
            if(this.g == null) {
                baun0.d("Resume app updates was not requested before, requesting now", new Object[0]);
                aqvr aqvr0 = new aqvr(this);
                int v1 = (int)hqhq.b();
                aqxp aqxp0 = aqxp.a(hqhq.c(), TimeUnit.MILLISECONDS);
                this.g = new aqzq(((gful_cronetEngineProvider)aqvr0), this.d, v1, null, aqxp0);
                this.b.e.remove(this);
            }
        }
        return this.g;
    }

    @Override  // aqwb
    public final void c() {
    }

    @Override  // aqwb
    public final void d() {
        synchronized(this) {
            if(this.f != null) {
                aqvv.a.d("Service was disconnected and pause updates request was in-flight for %s, re-requesting", new Object[]{this.c});
                this.f = null;
                gmbu.t(this.a(), new aqvt(this), this.d);
            }
        }
    }

    public final void e() {
        synchronized(this) {
            this.b.e();
        }
    }

    public static final Bundle f(String s) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("caller_id", s);
        bundle0.putInt("update_types", -1);
        return bundle0;
    }
}

