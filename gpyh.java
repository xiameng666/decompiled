import com.google.location.bluemoon.inertialanchor.DeepBlueResults;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;

public final class gpyh implements IFilterObserver {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private final fvyx f;

    public gpyh(fvyx fvyx0) {
        this.a = NaN;
        this.b = NaN;
        this.c = NaN;
        this.d = NaN;
        this.e = NaN;
        this.f = fvyx0;
    }

    @Override  // IFilterObserver
    public final void E(long v, int v1) {
    }

    @Override  // IFilterObserver
    public final void F(long v, double f) {
    }

    @Override  // IFilterObserver
    public final void G(gpxm_Observation gpxm0) {
        double f = gpxm0.timestamp_;
        if(!this.a()) {
            this.b(f);
        }
        switch(gpxm0.data_) {
            case 3: {
                this.c = f;
                return;
            }
            case 7: {
                this.d = f;
                return;
            }
            case 10: {
                fvyx fvyx0 = this.f;
                gkro gkro0 = gkro.a;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkro0).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gkro gkro1 = (gkro)hftp0.b_message;
                gkro1.b |= 2;
                gkro1.c = 1;
                fvyx0.a(hftp0);
                if(!gpvs.a(((gpwj)gpxm0).a.d)) {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gkro0).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gkro gkro2 = (gkro)hftp1.b_message;
                    gkro2.b |= 0x20;
                    gkro2.g = 1;
                    fvyx0.a(hftp1);
                }
                return;
            }
            case 15: {
                fvyx fvyx1 = this.f;
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gkro.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gkro gkro3 = (gkro)hftp2.b_message;
                gkro3.b |= 0x800;
                gkro3.n = 1;
                fvyx1.a(hftp2);
            }
        }
    }

    @Override  // IFilterObserver
    public final void H() {
        if(!Double.isNaN(this.b)) {
            fvyx fvyx0 = this.f;
            long v = Math.round(this.b - this.a);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkro.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkro gkro0 = (gkro)hftp0.b_message;
            gkro0.b();
            gkro0.h.g(v);
            fvyx0.a(hftp0);
        }
        this.h();
    }

    @Override  // IFilterObserver
    public final void I(long v, long v1) {
    }

    @Override  // IFilterObserver
    public final void J(long v, double f, double f1) {
    }

    @Override  // IFilterObserver
    public final void K(long v, gptu_Position gptu0) {
        this.b = TimeUtils.b(v);
        if(!this.a()) {
            this.b(this.b);
        }
    }

    @Override  // IFilterObserver
    public final void L(long v, gptu_Position gptu0) {
    }

    @Override  // IFilterObserver
    public final void M(double f, EquirectangularProjection gpuc0) {
        this.e = f;
    }

    @Override  // IFilterObserver
    public final void N(double f, boolean z) {
    }

    @Override  // IFilterObserver
    public final void O(double f, boolean z) {
    }

    @Override  // IFilterObserver
    public final void P(double f, boolean z) {
    }

    @Override  // IFilterObserver
    public final void Q(boolean z) {
    }

    @Override  // IFilterObserver
    public final void R(long v, boolean z, boolean z1, boolean z2, boolean z3) {
    }

    @Override  // IFilterObserver
    public final void S(long v, gptu_Position gptu0) {
    }

    @Override  // IFilterObserver
    public final void T(long v, List list0) {
    }

    @Override  // IFilterObserver
    public final void U(long v, fuxg fuxg0) {
    }

    @Override  // IFilterObserver
    public final void V(long v, double f, double f1) {
    }

    @Override  // IFilterObserver
    public final void W(long v, float f, float f1) {
    }

    @Override  // IFilterObserver
    public final void X(long v, gpvs gpvs0) {
    }

    @Override  // IFilterObserver
    public final void Y(long v, float f) {
    }

    @Override  // IFilterObserver
    public final void Z(long v, DeepBlueResults deepBlueResults0) {
    }

    final boolean a() {
        return !Double.isNaN(this.a) && !Double.isNaN(this.d) && !Double.isNaN(this.e);
    }

    @Override  // IFilterObserver
    public final void aA() {
    }

    @Override  // IFilterObserver
    public final void aa(long v) {
    }

    @Override  // IFilterObserver
    public final void ab(long v, fuxg fuxg0) {
    }

    @Override  // IFilterObserver
    public final void ac(long v, cjhf cjhf0) {
    }

    @Override  // IFilterObserver
    public final void ad(long v, float f) {
    }

    @Override  // IFilterObserver
    public final void ae(long v) {
    }

    @Override  // IFilterObserver
    public final void af(Collection collection0, long v) {
    }

    @Override  // IFilterObserver
    public final void ag(long v, fwed fwed0) {
    }

    @Override  // IFilterObserver
    public final void ah(long v, int v1) {
    }

    @Override  // IFilterObserver
    public final void ai(long v, String s, double f, double f1, double f2, double f3, boolean z, int v1) {
    }

    @Override  // IFilterObserver
    public final void aj(double f, int v) {
    }

    @Override  // IFilterObserver
    public final void ak(long v, int v1) {
    }

    @Override  // IFilterObserver
    public final void al(double f, int v) {
    }

    @Override  // IFilterObserver
    public final void am(PrintWriter printWriter0) {
    }

    @Override  // IFilterObserver
    public final void an() {
    }

    @Override  // IFilterObserver
    public final void ao() {
    }

    @Override  // IFilterObserver
    public final void ap() {
    }

    @Override  // IFilterObserver
    public final void aq() {
    }

    @Override  // IFilterObserver
    public final void ar() {
    }

    @Override  // IFilterObserver
    public final void as() {
    }

    @Override  // IFilterObserver
    public final void at() {
    }

    @Override  // IFilterObserver
    public final void au(EquirectangularProjection gpuc0) {
    }

    @Override  // IFilterObserver
    public final void av() {
    }

    @Override  // IFilterObserver
    public final void aw() {
    }

    @Override  // IFilterObserver
    public final void ax_onCallback(long v, boolean z, boolean z1, boolean z2, boolean z3) {
    }

    @Override  // IFilterObserver
    public final void ay() {
    }

    @Override  // IFilterObserver
    public final void az() {
    }

    private final void b(double f) {
        this.a = f;
        this.d = f;
        this.e = f;
    }

    @Override  // IFilterObserver
    public final void h() {
        this.a = NaN;
        this.b = NaN;
        this.c = NaN;
        this.d = NaN;
        this.e = NaN;
    }

    @Override  // IFilterObserver
    public final void i(double f, int v) {
    }

    @Override  // IFilterObserver
    public final void l(long v, long v1, int v2, double f, double f1) {
    }
}

