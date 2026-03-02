import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

final class aud {
    public static final MeteringRectangle[] a;
    public final aow b;
    final Executor c;
    public volatile boolean d;
    public volatile Rational e;
    public int f;
    public final aov g;
    public MeteringRectangle[] h;
    public MeteringRectangle[] i;
    public MeteringRectangle[] j;
    public boolean k;
    public aov l;

    static {
        aud.a = new MeteringRectangle[0];
    }

    public aud(aow aow0, Executor executor0) {
        this.d = false;
        this.e = null;
        this.f = 1;
        this.g = null;
        this.h = aud.a;
        this.i = aud.a;
        this.j = aud.a;
        this.k = false;
        this.l = null;
        this.b = aow0;
        this.c = executor0;
    }

    final gmcd a(boolean z) {
        return this.b.a(5) == 5 ? jqy.a(new atw(this, z)) : bpt.b(null);
    }

    final gmcd b() {
        return jqy.a(new aua(this));
    }

    final void c(boolean z, boolean z1) {
        if(!this.d) {
            return;
        }
        bjm bjm0 = new bjm();
        bjm0.m();
        bjm0.b = this.f;
        ans ans0 = new ans();
        if(z) {
            ans0.d(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
        }
        if(z1) {
            ans0.d(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(2));
        }
        bjm0.f(ans0.a());
        List list0 = Collections.singletonList(bjm0.b());
        this.b.x(list0);
    }

    final void d(jqt jqt0) {
        bcs.h("FocusMeteringControl");
        if(!this.d) {
            jqt0.c(new azq("Camera is not active."));
            return;
        }
        bjm bjm0 = new bjm();
        bjm0.b = this.f;
        bjm0.m();
        ans ans0 = new ans();
        ans0.d(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(1));
        bjm0.f(ans0.a());
        bjm0.d(new auc(jqt0));
        List list0 = Collections.singletonList(bjm0.b());
        this.b.x(list0);
    }
}

