import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.location.fused.GmsFusionScheduler.NlpRestartTracingBroadcastReceiver;

public final class fvxq extends fvxo_SensorRequestDispatcher implements cjeo {
    private final Context s;
    private final Handler t;
    private final Looper u;
    private final TracingBroadcastReceiver v;
    private final cjer_LocationSettings w;

    public fvxq(cmvf cmvf0, cmve_GNSS cmve0, fwcw fwcw0, fwcz fwcz0, fwdf_FLPStepDetector fwdf0, fwcy fwcy0, fwcx fwcx0, fwce_ActivityRecognition fwce0, fwcl fwcl0, fwda_AlwaysAvailablePressureProvider fwda0, fwdy fwdy0, fwcn fwcn0, cjer_LocationSettings cjer0, Context context0, Looper looper0) {
        super(cmvf0, cmve0, fwcw0, fwcz0, fwdf0, fwcy0, fwcx0, fwce0, fwcl0, fwda0, fwdy0, fwcn0, new fvyb_LocationRequestSummary(), new fvyb_LocationRequestSummary(), new fvyb_LocationRequestSummary());
        this.u = looper0;
        this.t = new clht(looper0);
        this.s = context0;
        this.w = cjer0;
        this.v = new GmsFusionScheduler.NlpRestartTracingBroadcastReceiver(this);
    }

    @Override  // fvxo_SensorRequestDispatcher
    public final void a() {
        if(this.isEnabled_) {
            this.w.j(this);
            this.s.unregisterReceiver(this.v);
            if(this.isEnabled_) {
                fwdb fwdb0 = this.c;
                if(fwdb0 != null) {
                    fwdb0.n_requestStop();
                }
                this.isEnabled_ = false;
                this.primaryRequestSummary_.a();
                this.secondaryRequestSummary_.a();
                this.tertiaryRequestSummary_.a();
                this.i = cmuh_unknownRequest.a;
                super.c_dispatchRequests(false);
            }
        }
    }

    @Override  // fvxo_SensorRequestDispatcher
    public final void b() {
        if(!this.isEnabled_) {
            bbre bbre0 = new bbre(this.u);
            this.w.f(this, bbre0);
            IntentFilter intentFilter0 = new IntentFilter("com.google.android.location.internal.server.ACTION_RESTARTED");
            jwe.c(this.s, this.v, intentFilter0, null, this.t, 2);
            if(!this.isEnabled_) {
                this.isEnabled_ = true;
                fwdb fwdb0 = this.c;
                if(fwdb0 != null) {
                    fwdb0.b_requestStart();
                }
                super.c_dispatchRequests(false);
            }
        }
    }

    private final void e(int v) {
        this.d.k_setEnabled(v != 0);
        this.d.i_dispatchIfDirty();
        this.r.k_setEnabled(v != 0);
        this.r.i_dispatchIfDirty();
        this.AlwaysAvailablePressureProvider_.k_setEnabled(v != 0);
        this.AlwaysAvailablePressureProvider_.i_dispatchIfDirty();
        this.h.k_setEnabled(v != 0);
        this.h.i_dispatchIfDirty();
        super.c_dispatchRequests(false);
    }

    @Override  // cjeo
    public final void h(int v, int v1) {
        this.e(v1);
    }

    @Override  // cjeo
    public final void i(int v) {
        this.e(v);
    }
}

