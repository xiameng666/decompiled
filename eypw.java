import android.view.ViewGroup;
import com.google.android.material.progressindicator.CircularProgressIndicator;

public final class eypw extends tk {
    static final ibxd[] a;
    public final ibts e;
    public final ibvv f;
    private final ibth g;

    static {
        eypw.a = new ibxd[]{new ibut(eypw.class, "uiState", "getUiState()Lcom/google/android/gms/trustagent/activeunlock/primary/ui/enrolleddevice/EnrolledDeviceListUiState;", 0)};
    }

    public eypw(eyqq eyqq0, ibth ibth0, ibts ibts0) {
        ibuq.f(eyqq0, "initialUiState");
        super();
        this.g = ibth0;
        this.e = ibts0;
        this.f = new eypv(eyqq0, this);
    }

    @Override  // tk
    public final int b() {
        return this.f().a.size() + this.f().e;
    }

    @Override  // tk
    public final int dx(int v) {
        return v == this.f().a.size() ? 1 : 0;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        switch(v) {
            case 0: {
                return new eypx(eyzw.a(viewGroup0, 0x7F0E031E));  // layout:enrolled_device
            }
            case 1: {
                return new eypt(eyzw.a(viewGroup0, 0x7F0E0068), this.g);  // layout:add_device
            }
            default: {
                throw new IllegalStateException("Attempted to create unrecognized viewholder");
            }
        }
    }

    public final eyqq f() {
        return (eyqq)this.f.a(this, eypw.a[0]);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        ibuq.f(uq0, "holder");
        if((uq0 instanceof eypx)) {
            eyqt eyqt0 = (eyqt)this.f().a.get(v);
            float f = eyqt0.d ? 1.0f : 0.6f;
            ((eypx)uq0).t.setAlpha(f);
            ((eypx)uq0).u.setText(eyqt0.a);
            ((eypx)uq0).u.setAlpha(f);
            ((eypx)uq0).v.setOnClickListener(new eypu(this, v));
            int v1 = 0;
            ((eypx)uq0).v.setVisibility((eyqt0.b ? 8 : 0));
            CircularProgressIndicator circularProgressIndicator0 = ((eypx)uq0).w;
            if(!eyqt0.b) {
                v1 = 8;
            }
            circularProgressIndicator0.setVisibility(v1);
            return;
        }
        if((uq0 instanceof eypt)) {
            return;
        }
        throw new IllegalStateException("Attempted to bind unrecognized viewholder");
    }
}

