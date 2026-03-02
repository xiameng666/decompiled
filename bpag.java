import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager.OnNetworkActiveListener;
import android.net.ConnectivityManager;
import j..time.Duration;
import j..util.Objects;
import java.util.concurrent.TimeUnit;

@ibnh
final class bpag implements ConnectivityManager.OnNetworkActiveListener, bpad {
    public final Context a;
    public static final int b;
    private static final bboh c;
    private final fgvt d;
    private final ConnectivityManager e;
    private final Object f;
    private volatile cljp g;
    private volatile gmch h;
    private volatile gmcd i;
    private volatile long j;
    private volatile long k;
    private volatile boolean l;

    static {
        bpag.c = bboh.b("LocationReportUploadSch", bbcu.eD);
    }

    public bpag(Context context0, fgvt fgvt0, ConnectivityManager connectivityManager0) {
        this.f = new Object();
        this.i = gmbx.a;
        this.j = 0L;
        this.k = 0L;
        this.l = false;
        this.a = context0;
        this.d = fgvt0;
        this.e = connectivityManager0;
        connectivityManager0.addDefaultNetworkActiveListener(this);
    }

    @Override  // bpad
    public final gmcd a() {
        synchronized(this.f) {
        }
        return this.i;
    }

    @Override  // bpad
    public final void b() {
        synchronized(this.f) {
            this.l = false;
            if(hsxv.r() > 0L) {
                cljp cljp0 = this.f();
                if(cljp0 != null) {
                    cljp0.c("com.google.android.gms.findmydevice.spot.locationreporting.LocationReportUploadGmsTaskService");
                }
            }
            if(hsxv.p() > 0L) {
                this.i.cancel(false);
            }
        }
    }

    @Override  // bpad
    public final void c() {
        this.b();
        long v = this.d.a();
        this.j = Duration.ofSeconds((!hsxl.j() || !bpyc.a(this.a) ? hsxv.a.y().N() : hsxv.a.y().M())).toMillis() + v;
        this.k = v + Duration.ofSeconds(hsxv.a.y().O()).toMillis();
    }

    @Override  // bpad
    public final void d(boolean z, boolean z1) {
        int v = Long.compare(hsxv.r(), 0L);
        long v1 = hsxv.p();
        if(v <= 0 && v1 <= 0L) {
            ((ggtj)((ggtj)((ggtj)bpag.c.i()).o(1, TimeUnit.HOURS)).ar(0x12FE)).x("No sighting batch upload scheduling mechanism is enabled.");
            return;
        }
        this.l = true;
        if(z) {
            this.j = 0L;
            this.k = 0L;
        }
        if(v > 0) {
            cljp cljp0 = this.f();
            if(cljp0 != null) {
                long v2 = Math.max(hsxv.r(), TimeUnit.MILLISECONDS.toSeconds(this.j - this.d.a()));
                long v3 = Math.max(hsxv.a.y().I(), 1L + v2);
                clkn clkn0 = new clkn();
                clkn0.w("com.google.android.gms.findmydevice.spot.locationreporting.LocationReportUploadGmsTaskService");
                clkn0.e(v2, v3);
                clkn0.g(0);
                clkn0.v(2);
                clkn0.q("FMD_SPOT_LRUP");
                cljp0.f(clkn0.a());
            }
        }
        if(v1 > 0L && z1 && this.h(TimeUnit.SECONDS.toMillis(v1)) && (!hsxl.g() || bpxy.a(this.e))) {
            this.g(v1);
        }
    }

    @Override  // bpad
    public final boolean e(String s) {
        if(this.i() && this.e.isDefaultNetworkActive() || this.h(0L)) {
            if(!hsxl.g()) {
                return true;
            }
            return hsxl.f() || !Objects.equals(s, "BATCH_UPLOAD_TRIGGERED_BY_FAST_EXECUTOR_SERVICE_ACTIVE_NETWORK") ? bpxy.a(this.e) : true;
        }
        return false;
    }

    private final cljp f() {
        if(this.g == null) {
            Object object0 = this.f;
            synchronized(object0) {
                if(this.g == null) {
                    this.g = cljp.a(this.a);
                }
                if(this.g == null) {
                    ((ggtj)((ggtj)bpag.c.i()).ar(0x12F6)).x("Failed to get a GmsTaskScheduler instance.");
                }
            }
            return this.g;
        }
        return this.g;
    }

    private final void g(long v) {
        gfsx gfsx0;
        Object object0 = this.f;
        synchronized(object0) {
            if(this.i.isDone()) {
                if(this.h == null) {
                    __monitor_enter(object0);
                    goto label_5;
                }
                goto label_12;
            }
            goto label_30;
        }
        try {
        label_5:
            if(this.h == null) {
                this.h = new bbll(1, 10);
            }
        }
        catch(Throwable throwable1) {
            try {
                __monitor_exit(object0);
                throw throwable1;
            }
            catch(Throwable throwable0) {
                __monitor_exit(object0);
                throw throwable0;
            }
        }
        __monitor_exit(object0);
        try {
        label_12:
            gmch gmch0 = this.h;
            if(hsxv.a.y().aK()) {
                long v1 = TimeUnit.SECONDS.toMillis(1L + v);
                gfsx0 = gfsx.m(new esaa(this.a, 1, "com.google.android.gms.findmydevice.spot.locationreporting.LOCATION_REPORT_BATCH_COLLECTION_WAKELOCK", "WaitForLocationReportUpload", "com.google.android.gms").a("WaitForLocationReportUpload", v1));
            }
            else {
                gfsx0 = gfqx.a;
            }
            this.i = gmch0.h(new bpae(this, v), v, TimeUnit.SECONDS);
            this.i.hB(new bpaf(gfsx0), gmch0);
        }
        catch(Throwable throwable0) {
            __monitor_exit(object0);
            throw throwable0;
        }
        __monitor_exit(object0);
        Context context0 = this.a;
        Intent intent0 = bpsp.a(context0, "com.google.android.gms.findmydevice.spot.locationreporting.WaitForLocationReportUploadIntentOperation", "com.google.android.gms.findmydevice.spot.locationreporting.WAIT_FOR_UPLOAD_SIGHTINGS");
        if(intent0 != null) {
            context0.getApplicationContext().startService(intent0);
        }
        return;
    label_30:
        __monitor_exit(object0);
    }

    private final boolean h(long v) {
        return this.d.a() + v >= this.j;
    }

    private final boolean i() {
        return this.d.a() >= this.k;
    }

    @Override  // android.net.ConnectivityManager$OnNetworkActiveListener
    public final void onNetworkActive() {
        if(this.l && this.i() && (!hsxl.f() || bpxy.a(this.e))) {
            this.g(0L);
        }
    }
}

