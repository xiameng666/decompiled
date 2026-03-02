import com.google.location.bluemoon.inertialanchor.DeepBlueResults;
import j..lang.Iterable.-EL;
import j..util.Objects;
import j..util.stream.IntStream.-CC;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;

public final class gpyg implements IFilterObserver {
    public final gpwr a;
    public long b;
    private EquirectangularProjection c;

    public gpyg(gpwr gpwr0) {
        this.b = -1L;
        this.a = gpwr0;
    }

    @Override  // IFilterObserver
    public final void E(long v, int v1) {
        if(!this.a(v)) {
            return;
        }
        gvzx gvzx0 = gpyd.m(null, null, v1);
        this.a.c(v, ((MessageLite)gvzx0));
    }

    @Override  // IFilterObserver
    public final void F(long v, double f) {
        if(!this.a(v)) {
            return;
        }
        gvxw gvxw0 = gpyd.b(null, null, ((float)f));
        this.a.c(v, ((MessageLite)gvxw0));
    }

    @Override  // IFilterObserver
    public final void G(gpxm_Observation gpxm0) {
        double f = gpxm0.timestamp_;
        if(this.b(f)) {
            int v = gpxm0.data_;
            switch(v) {
                case 3: {
                    if(this.c != null) {
                        gpxm_Observation gpxm1 = ((gpwl)gpxm0).a;
                        if(gpxm1 != null) {
                            gvxw gvxw0 = this.c(gpxm1, gvxv.ae);
                            this.a.c(TimeUtils.d(f), ((MessageLite)gvxw0));
                        }
                        gpxm_Observation gpxm2 = ((gpwl)gpxm0).b;
                        if(gpxm2 != null) {
                            gvxw gvxw1 = this.c(gpxm2, gvxv.af);
                            this.a.c(TimeUtils.d(f), ((MessageLite)gvxw1));
                            return;
                        }
                    }
                    break;
                }
                case 5: {
                    gvyx gvyx0 = gpyd.d(null, null, 5);
                    this.a.c(TimeUtils.d(f), ((MessageLite)gvyx0));
                    return;
                }
                case 13: 
                case 14: {
                    if(this.c != null) {
                        this.a.c(TimeUtils.d(f), ((MessageLite)this.c(gpxm0, (v == 13 ? gvxv.ad : gvxv.ac))));
                        return;
                    }
                    break;
                }
            }
        }
    }

    @Override  // IFilterObserver
    public final void H() {
    }

    @Override  // IFilterObserver
    public final void I(long v, long v1) {
    }

    @Override  // IFilterObserver
    public final void J(long v, double f, double f1) {
        if(!this.a(v)) {
            return;
        }
        gvuj gvuj0 = gpyd.i(null, null, ggna.a, ggna.a, f, f1);
        this.a.c(v, ((MessageLite)gvuj0));
    }

    @Override  // IFilterObserver
    public final void K(long v, gptu_Position gptu0) {
        if(!this.a(v)) {
            return;
        }
        gvxw gvxw0 = gpyd.c(null, null, null, gvxv.al, gptu0);
        this.a.c(v, ((MessageLite)gvxw0));
    }

    @Override  // IFilterObserver
    public final void L(long v, gptu_Position gptu0) {
        if(gptu0 != null && this.a(v)) {
            gvxw gvxw0 = gpyd.c(null, null, null, gvxv.t, gptu0);
            this.a.c(v, ((MessageLite)gvxw0));
        }
    }

    @Override  // IFilterObserver
    public final void M(double f, EquirectangularProjection gpuc0) {
        if(!this.b(f)) {
            return;
        }
        gpwr gpwr0 = this.a;
        long v = this.b;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvvv.a).v_newBuilder();
        int v1 = gpuc0.refLatE7_;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gvvv)hftv0).b |= 16;
        ((gvvv)hftv0).d = v1;
        int v2 = gpuc0.refLngE7_;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gvvv)hftv1).b |= 0x20;
        ((gvvv)hftv1).e = v2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvvv)hftp0.b_message).c = 1;
        ((gvvv)hftp0.b_message).b |= 8;
        gpwr0.c(v, ((MessageLite)hftp0.N_build()));
    }

    @Override  // IFilterObserver
    public final void N(double f, boolean z) {
        if(!this.b(f)) {
            return;
        }
        gpwr gpwr0 = this.a;
        long v = this.b;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvyu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v1 = 3;
        ((gvyu)hftv0).f = 3;
        ((gvyu)hftv0).b |= 8;
        if(!z) {
            v1 = 2;
        }
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvyu)hftp0.b_message).g = v1 - 1;
        ((gvyu)hftp0.b_message).b |= 16;
        gpwr0.c(v, ((MessageLite)hftp0.N_build()));
    }

    @Override  // IFilterObserver
    public final void O(double f, boolean z) {
        if(!this.b(f)) {
            return;
        }
        gpwr gpwr0 = this.a;
        long v = this.b;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvyu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gvyu)hftv0).f = 4;
        ((gvyu)hftv0).b |= 8;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvyu)hftp0.b_message).g = (z ? 3 : 2) - 1;
        ((gvyu)hftp0.b_message).b |= 16;
        gpwr0.c(v, ((MessageLite)hftp0.N_build()));
    }

    @Override  // IFilterObserver
    public final void P(double f, boolean z) {
        if(!this.b(f)) {
            return;
        }
        gpwr gpwr0 = this.a;
        long v = this.b;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvyu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gvyu)hftv0).f = 17;
        ((gvyu)hftv0).b |= 8;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvyu)hftp0.b_message).g = (z ? 3 : 2) - 1;
        ((gvyu)hftp0.b_message).b |= 16;
        gpwr0.c(v, ((MessageLite)hftp0.N_build()));
    }

    @Override  // IFilterObserver
    public final void Q(boolean z) {
        if(this.a(this.b)) {
            gpwr gpwr0 = this.a;
            long v = this.b;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvyu.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gvyu)hftv0).f = 15;
            ((gvyu)hftv0).b |= 8;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gvyu)hftp0.b_message).g = (z ? 3 : 2) - 1;
            ((gvyu)hftp0.b_message).b |= 16;
            gpwr0.c(v, ((MessageLite)hftp0.N_build()));
        }
    }

    @Override  // IFilterObserver
    public final void R(long v, boolean z, boolean z1, boolean z2, boolean z3) {
        if(this.a(v)) {
            gged_interceptors gged0 = gpyd.a(null, null, z, z1, z2, z3);
            int v1 = ((ggna)gged0).c;
            for(int v2 = 0; v2 < v1; ++v2) {
                gvyu gvyu0 = (gvyu)gged0.get(v2);
                this.a.c(v, ((MessageLite)gvyu0));
            }
        }
    }

    @Override  // IFilterObserver
    public final void S(long v, gptu_Position gptu0) {
        if(!this.a(v)) {
            return;
        }
        gvxw gvxw0 = gpyd.c(null, null, null, ((gvxv)gpyd.a.getOrDefault(gptu0.provider, gvxv.a)), gptu0);
        this.a.c(v, ((MessageLite)gvxw0));
    }

    @Override  // IFilterObserver
    public final void T(long v, List list0) {
        if(!this.a(v)) {
            return;
        }
        gvtm gvtm0 = gpyd.g(null, null, null, 4, list0);
        this.a.c(v, ((MessageLite)gvtm0));
    }

    @Override  // IFilterObserver
    public final void U(long v, fuxg fuxg0) {
        if(!this.a(v)) {
            return;
        }
        gvts gvts0 = gpyd.h(null, null, 3, fuxg0);
        this.a.c(v, ((MessageLite)gvts0));
    }

    @Override  // IFilterObserver
    public final void V(long v, double f, double f1) {
        if(!this.a(v)) {
            return;
        }
        gpwr gpwr0 = this.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvxw.a).v_newBuilder();
        gvxv gvxv0 = gvxv.an;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gvxw)hftv0).f = gvxv0.aX;
        ((gvxw)hftv0).b |= 8;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvxw gvxw0 = (gvxw)hftp0.b_message;
        gvxw0.b |= 0x100;
        gvxw0.k = (float)f;
        int v1 = (int)TimeUtils.c(f1);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvxw gvxw1 = (gvxw)hftp0.b_message;
        gvxw1.b |= 0x800;
        gvxw1.n = v1;
        gpwr0.c(v, ((MessageLite)hftp0.N_build()));
    }

    @Override  // IFilterObserver
    public final void W(long v, float f, float f1) {
        if(!this.a(v)) {
            return;
        }
        gpwr gpwr0 = this.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvum.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gvum)hftv0).f = 8;
        ((gvum)hftv0).b |= 8;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gvum)hftv1).b |= 16;
        ((gvum)hftv1).g = f;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvum gvum0 = (gvum)hftp0.b_message;
        gvum0.b |= 0x20;
        gvum0.h = f1;
        gpwr0.c(v, ((MessageLite)hftp0.N_build()));
    }

    @Override  // IFilterObserver
    public final void X(long v, gpvs gpvs0) {
        if(!this.a(v)) {
            return;
        }
        gvut gvut0 = gpyd.j(null, null, gpvs0);
        this.a.c(v, ((MessageLite)gvut0));
    }

    @Override  // IFilterObserver
    public final void Y(long v, float f) {
        if(!this.a(v)) {
            return;
        }
        gpwr gpwr0 = this.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvuz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gvuz)hftv0).f = 2;
        ((gvuz)hftv0).b |= 8;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvuz gvuz0 = (gvuz)hftp0.b_message;
        gvuz0.b |= 16;
        gvuz0.g = f;
        gpwr0.c(v, ((MessageLite)hftp0.N_build()));
    }

    @Override  // IFilterObserver
    public final void Z(long v, DeepBlueResults deepBlueResults0) {
        if(!this.a(v)) {
            return;
        }
        gpwr gpwr0 = this.a;
        gwak gwak0 = (gwak)((ProtoLiteMessage)gwam.a).v_newBuilder();
        if(!gwak0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gwak0).ensureMutable();
        }
        ((gwam)gwak0.b_message).f = 1;
        ((gwam)gwak0.b_message).b |= 8;
        float f = (float)deepBlueResults0.b();
        if(!gwak0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gwak0).ensureMutable();
        }
        gwam gwam0 = (gwam)gwak0.b_message;
        gwam0.b |= 16;
        gwam0.g = 5.0f / f;
        gwak0.a(glws.c(deepBlueResults0.d()));
        gpwr0.c(v, ((MessageLite)((ProtoLiteBuilder)gwak0).N_build()));
        gvvj gvvj0 = (gvvj)((ProtoLiteMessage)gvvl.a).v_newBuilder();
        if(!gvvj0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gvvj0).ensureMutable();
        }
        ((gvvl)gvvj0.b_message).f = 1;
        ((gvvl)gvvj0.b_message).b |= 8;
        float f1 = (float)deepBlueResults0.a();
        if(!gvvj0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gvvj0).ensureMutable();
        }
        gvvl gvvl0 = (gvvl)gvvj0.b_message;
        gvvl0.b |= 16;
        gvvl0.g = 6.283185f / f1;
        gvvj0.a(glws.c(deepBlueResults0.c()));
        gpwr0.c(v, ((MessageLite)((ProtoLiteBuilder)gvvj0).N_build()));
    }

    private final boolean a(long v) {
        if(v <= 0L) {
            return false;
        }
        this.b = v;
        return true;
    }

    @Override  // IFilterObserver
    public final void aA() {
    }

    @Override  // IFilterObserver
    public final void aa(long v) {
        if(!this.a(v)) {
            return;
        }
        gpwr gpwr0 = this.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvxi.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvxi)hftp0.b_message).f = 1;
        ((gvxi)hftp0.b_message).b |= 8;
        gpwr0.c(v, ((MessageLite)hftp0.N_build()));
    }

    @Override  // IFilterObserver
    public final void ab(long v, fuxg fuxg0) {
        if(!this.a(v)) {
            return;
        }
        gvts gvts0 = gpyd.h(null, null, 4, fuxg0);
        this.a.c(v, ((MessageLite)gvts0));
    }

    @Override  // IFilterObserver
    public final void ac(long v, cjhf cjhf0) {
        if(!this.a(v)) {
            return;
        }
        gvws gvws0 = gpyd.k(null, null, cjhf0);
        this.a.c(v, ((MessageLite)gvws0));
    }

    @Override  // IFilterObserver
    public final void ad(long v, float f) {
        if(!this.a(v)) {
            return;
        }
        gvzo gvzo0 = gpyd.l(null, null, f);
        this.a.c(v, ((MessageLite)gvzo0));
    }

    @Override  // IFilterObserver
    public final void ae(long v) {
        if(!this.a(v)) {
            return;
        }
        gwat gwat0 = gpyd.n(null, null);
        this.a.c(v, ((MessageLite)gwat0));
    }

    @Override  // IFilterObserver
    public final void af(Collection collection0, long v) {
        Iterable.-EL.forEach(collection0, new gpyf(this, v));
    }

    @Override  // IFilterObserver
    public final void ag(long v, fwed fwed0) {
        if(!this.a(v)) {
            return;
        }
        gwce gwce0 = gpyd.o(null, null, fwed0);
        this.a.c(v, ((MessageLite)gwce0));
    }

    @Override  // IFilterObserver
    public final void ah(long v, int v1) {
        if(!this.a(v)) {
            return;
        }
        gpwr gpwr0 = this.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwce.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gwce)hftv0).f = 2;
        ((gwce)hftv0).b |= 8;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwce gwce0 = (gwce)hftp0.b_message;
        gwce0.b |= 0x20;
        gwce0.i = v1;
        gpwr0.c(v, ((MessageLite)hftp0.N_build()));
    }

    @Override  // IFilterObserver
    public final void ai(long v, String s, double f, double f1, double f2, double f3, boolean z, int v1) {
        if(!this.a(v)) {
            return;
        }
        if(v1 == 0) {
            throw null;
        }
        int v2 = gvvx.a(v1) == 0 ? 1 : gvvx.a(v1);
        gpwr gpwr0 = this.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvwa.a).v_newBuilder();
        gvvz gvvz0 = (gvvz)gpyd.e.getOrDefault(s, gvvz.a);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gvwa)hftv0).c = gvvz0.f;
        ((gvwa)hftv0).b |= 8;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gvwa)hftv1).b |= 0x20;
        ((gvwa)hftv1).e = f;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gvwa)hftv2).b |= 0x40;
        ((gvwa)hftv2).f = f1;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((gvwa)hftv3).b |= 0x80;
        ((gvwa)hftv3).g = f2;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((gvwa)hftv4).b |= 0x100;
        ((gvwa)hftv4).h = f3;
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp0.b_message;
        ((gvwa)hftv5).b |= 0x200;
        ((gvwa)hftv5).i = z;
        if(!hftv5.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvwa)hftp0.b_message).d = v2 - 1;
        ((gvwa)hftp0.b_message).b |= 16;
        gpwr0.c(v, ((MessageLite)hftp0.N_build()));
    }

    @Override  // IFilterObserver
    public final void aj(double f, int v) {
        if(!this.b(f)) {
            return;
        }
        int v1 = gvwc.a(v) == 0 ? 1 : gvwc.a(v);
        gpwr gpwr0 = this.a;
        long v2 = TimeUtils.d(f);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvwd.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvwd)hftp0.b_message).c = v1 - 1;
        ((gvwd)hftp0.b_message).b |= 8;
        gpwr0.c(v2, ((MessageLite)hftp0.N_build()));
    }

    @Override  // IFilterObserver
    public final void ak(long v, int v1) {
        int v2 = gvxk.a(v1) == 0 ? 1 : gvxk.a(v1);
        gpwr gpwr0 = this.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvxl.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvxl)hftp0.b_message).e = v2 - 1;
        ((gvxl)hftp0.b_message).b |= 8;
        gpwr0.c(v, ((MessageLite)hftp0.N_build()));
    }

    @Override  // IFilterObserver
    public final void al(double f, int v) {
        if(!this.b(f)) {
            return;
        }
        int v1 = gvzj.a(v) == 0 ? 1 : gvzj.a(v);
        gpwr gpwr0 = this.a;
        long v2 = this.b;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvzk.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvzk)hftp0.b_message).f = v1 - 1;
        ((gvzk)hftp0.b_message).b |= 8;
        gpwr0.c(v2, ((MessageLite)hftp0.N_build()));
    }

    @Override  // IFilterObserver
    public final void am(PrintWriter printWriter0) {
        this.a.f(printWriter0);
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
        this.c = gpuc0;
    }

    @Override  // IFilterObserver
    public final void av() {
    }

    @Override  // IFilterObserver
    public final void aw() {
    }

    @Override  // IFilterObserver
    public final void ax_onCallback(long v, boolean z, boolean z1, boolean z2, boolean z3) {
        if(this.a(v)) {
            gged_interceptors gged0 = gpyd.f(null, null, z, z1, z2, z3);
            int v1 = ((ggna)gged0).c;
            for(int v2 = 0; v2 < v1; ++v2) {
                gvyu gvyu0 = (gvyu)gged0.get(v2);
                this.a.c(v, ((MessageLite)gvyu0));
            }
        }
    }

    @Override  // IFilterObserver
    public final void ay() {
    }

    @Override  // IFilterObserver
    public final void az() {
    }

    private final boolean b(double f) {
        if(!Double.isNaN(f) && f > 0.0) {
            this.b = TimeUtils.d(f);
            return true;
        }
        return false;
    }

    private final gvxw c(gpxm_Observation gpxm0, gvxv gvxv0) {
        int v = ((EquirectangularProjection)Objects.requireNonNull(this.c)).metersYToLatE7(gpxm0.b(1));
        int v1 = ((EquirectangularProjection)Objects.requireNonNull(this.c)).metersXToLngE7(gpxm0.b(0));
        double f = gpxm0.b(2);
        PositionBuilder gptr0 = new PositionBuilder();
        gptr0.i(v, v1, ((int)(f * 1000.0)));
        return gpyd.c(null, null, null, gvxv0, new gptu_Position(gptr0));
    }

    @Override  // IFilterObserver
    public final void h() {
        this.a.e();
        this.b = -1L;
        this.c = null;
    }

    @Override  // IFilterObserver
    public final void i(double f, int v) {
        if(!this.b(f)) {
            return;
        }
        gpwr gpwr0 = this.a;
        long v1 = TimeUtils.d(f);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvub.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v2 = 1;
        ((gvub)hftv0).d = 1;
        ((gvub)hftv0).b |= 16;
        switch(v) {
            case 2: {
                v2 = 3;
                break;
            }
            case 0: 
            case 3: {
                v2 = 2;
                break;
            }
            case 4: {
                v2 = 5;
            }
        }
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvub)hftp0.b_message).c = v2 - 1;
        ((gvub)hftp0.b_message).b |= 8;
        gpwr0.c(v1, ((MessageLite)(((gvub)hftp0.N_build()))));
    }

    @Override  // IFilterObserver
    public final void l(long v, long v1, int v2, double f, double f1) {
        if(!this.a(v)) {
            return;
        }
        gpwr gpwr0 = this.a;
        gged_interceptors gged0 = gged_interceptors.l(Double.valueOf(f));
        gged_interceptors gged1 = gged_interceptors.l(Long.valueOf(v1));
        gged_interceptors gged2 = gged_interceptors.l(Integer.valueOf(v2));
        gged_interceptors gged3 = gged_interceptors.l(Double.valueOf(f1));
        boolean z = true;
        if(gged1 != null) {
            gftb.b(((ggna)gged0).c == ((ggna)gged1).c, "The bias list and the timestamp day list must have the same size.");
        }
        if(gged2 != null) {
            gftb.b(((ggna)gged0).c == ((ggna)gged2).c, "The bias list and the AP strength list must have the same size.");
        }
        if(gged3 != null) {
            if(((ggna)gged0).c != ((ggna)gged3).c) {
                z = false;
            }
            gftb.b(z, "The bias list and the weather pressure uncertainty list must have the same size.");
        }
        gvug gvug0 = (gvug)((ProtoLiteMessage)gvuj.a).v_newBuilder();
        if(!gvug0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gvug0).ensureMutable();
        }
        ((gvuj)gvug0.b_message).f = 3;
        ((gvuj)gvug0.b_message).b |= 8;
        gvug0.a(((Iterable)IntStream.-CC.range(0, ((ggna)gged0).c).mapToObj(new gpyc(gged0, gged1, gged2, gged3)).collect(ggaf.a)));
        gpwr0.c(v, ((MessageLite)(((gvuj)((ProtoLiteBuilder)gvug0).N_build()))));
    }
}

