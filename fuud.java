import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.ArrayList;
import java.util.List;

class fuud extends futv {
    private final List j;

    public fuud(futd futd0) {
        this(futd0, false);
    }

    protected fuud(futd futd0, boolean z) {
        super(futd0);
        this.j = new ArrayList();
    }

    @Override  // fusw
    public final void X(ActivityRecognitionResult activityRecognitionResult0) {
        if(this.b) {
            return;
        }
        this.d.s(activityRecognitionResult0);
        this.o(activityRecognitionResult0);
    }

    @Override  // fuvb
    public String Y() {
        return "FullDetectingInPastState";
    }

    @Override  // futw
    public final void c(ActivityRecognitionResult activityRecognitionResult0) {
        if(!this.b) {
            int v = activityRecognitionResult0.d().a();
            List list0 = this.j;
            Integer integer0 = v;
            if(list0.contains(integer0)) {
                return;
            }
            list0.add(integer0);
        }
        super.c(activityRecognitionResult0);
    }

    @Override  // futv
    protected final long i() {
        return 36000000000L;
    }

    @Override  // futv
    protected final void j(String s) {
        if(this.b) {
            return;
        }
        this.d.j.h(false);
        super.j(s);
    }

    @Override  // futw
    protected final long l() {
        return 0x7FFFFFFFFFFFFFFFL;
    }

    @Override  // futw
    protected final fusr m() {
        return this.y();
    }

    @Override  // futw
    protected String n() {
        return "FullDetectorInPast";
    }

    @Override  // futw
    protected final void q(long v) {
        if(this.b) {
            return;
        }
        futd futd0 = this.d;
        futd0.j.h(true);
        if(v == 0x7FFFFFFFFFFFFFFFL) {
            this.p();
            return;
        }
        futd0.u(SystemClock.elapsedRealtime() + v + this.y().a / 1000000L);
    }

    @Override  // futw
    protected final void r() {
        if(this.b) {
            return;
        }
        this.d.j.h(false);
        super.r();
    }

    @Override  // futw
    protected final void t() {
        this.j.clear();
        super.t();
    }

    @Override  // futw
    public final void v() {
        super.v();
        this.d.z();
    }

    @Override  // fuvb
    protected final void w() {
        this.t();
    }

    @Override  // fuvb
    protected final void x(boolean z) {
    }

    protected final futz y() {
        futd futd0 = this.d;
        return futd0.u.h() ? null : futd0.z;
    }
}

