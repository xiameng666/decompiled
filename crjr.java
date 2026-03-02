import android.os.SystemClock;

public final class crjr extends crpx {
    private long a;
    private final gful_cronetEngineProvider b;

    public crjr(crqq crqq0) {
        super(crqq0);
        this.a = 0x7FFFFFFFFFFFFFFFL;
        this.b = gfus.a(((gful_cronetEngineProvider)new crjq()));
    }

    @Override  // crpx
    protected final void aM() {
        cljp.a(this.aj()).d("Measurement.PackageMeasurementTaskService.UPLOAD_TASK_TAG", "com.google.android.gms.measurement.PackageMeasurementTaskService");
        super.aM();
    }

    @Override  // crpx
    public final void b() {
        if(((Boolean)this.b.mr()).booleanValue()) {
            synchronized(this) {
                this.a = 0x7FFFFFFFFFFFFFFFL;
                cljp.a(this.aj()).d("Measurement.PackageMeasurementTaskService.UPLOAD_TASK_TAG", "com.google.android.gms.measurement.PackageMeasurementTaskService");
            }
            super.b();
            return;
        }
        super.b();
        cljp.a(this.aj()).d("Measurement.PackageMeasurementTaskService.UPLOAD_TASK_TAG", "com.google.android.gms.measurement.PackageMeasurementTaskService");
    }

    @Override  // crpx
    public final void c(long v) {
        if(hvgi.a.b().a()) {
            this.aA();
            this.aJ().k.b("Scheduling upload, millis", Long.valueOf(v));
            if(v < crcu.F() && !this.e().d()) {
                this.e().c(v);
            }
            this.d(v);
            return;
        }
        super.c(v);
    }

    @Override  // crpx
    public final void d(long v) {
        if(((Boolean)this.b.mr()).booleanValue()) {
            long v1 = SystemClock.elapsedRealtime() + v;
            synchronized(this) {
                if(this.a < v1) {
                    return;
                }
                this.a = v1;
                clkn clkn0 = new clkn();
                clkn0.j = "com.google.android.gms.measurement.PackageMeasurementTaskService";
                clkn0.e(v / 1000L, (v + v) / 1000L + 1L);
                clkn0.t("Measurement.PackageMeasurementTaskService.UPLOAD_TASK_TAG");
                clkn0.v(1);
                clkn0.p = true;
                clko clko0 = clkn0.a();
                cljp.a(this.aj()).f(clko0);
            }
            return;
        }
        clkn clkn1 = new clkn();
        clkn1.j = "com.google.android.gms.measurement.PackageMeasurementTaskService";
        clkn1.e(v / 1000L, (v + v) / 1000L + 1L);
        clkn1.t("Measurement.PackageMeasurementTaskService.UPLOAD_TASK_TAG");
        clkn1.v(1);
        clkn1.p = true;
        clko clko1 = clkn1.a();
        cljp.a(this.aj()).f(clko1);
    }
}

