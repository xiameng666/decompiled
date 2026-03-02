import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import dagger.internal.Preconditions;

public final class dnfc extends dokz implements ednc, fshb {
    public static final bboh a;
    public dmsn ag;
    public ibnf ah;
    private final ibnn ai;
    public fhwk b;
    public fhxi c;
    public fhvw d;

    static {
        dnfc.a = bboh.b("Pay", bbcu.cZ);
    }

    public dnfc() {
        dnew dnew0 = new dnew(this);
        dney dney0 = new dney(new dnex(this));
        ibnn ibnn0 = ibno.a(ibnp.c, dney0);
        this.ai = new lsd(new ibuk(dnfg.class), new dnez(ibnn0), dnew0, new dnfa(ibnn0));
    }

    public final fhwk A() {
        fhwk fhwk0 = this.b;
        if(fhwk0 != null) {
            return fhwk0;
        }
        ibuq.j("viewVisualElements");
        return null;
    }

    public final void B(gep gep0, goz goz0, int v) {
        ibuq.f(gep0, "scrollBehavior");
        goz goz1 = goz0.ao(0x40C7FE0A);
        int v1 = (v & 6) == 0 ? (goz1.X(gep0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(this) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            gej gej0 = fiuq.d(0L, goz1, 0x3F);
            gze gze0 = gzf.e(2067574660, new dnek(this), goz1);
            fiqk.a(dmzx.a, null, gze0, null, 0.0f, null, gej0, gep0, goz1, v1 << 21 & 0x1C00000 | 390, 58);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dnea(this, gep0, v);
        }
    }

    public final void D(dld dld0, goz goz0, int v) {
        long v7;
        goz goz1 = goz0.ao(863670934);
        int v1 = (v & 6) == 0 ? v | (goz1.X(dld0) ? 4 : 2) : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(this) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            cvq cvq0 = cvf.d(0, goz1, 0, 1);
            cvq cvq1 = cvf.d(0, goz1, 0, 1);
            hey hey0 = hfc.e;
            hfc hfc0 = dls.v(hey0);
            dhn dhn0 = dho.c;
            hej hej0 = hei.m;
            iau iau0 = dii.a(dhn0, hej0, goz1, 0);
            gzk gzk0 = goz1.ak();
            hfc hfc1 = hew.c(goz1, hfc0);
            int v2 = dndw.a(gol.c(goz1));
            ibth ibth0 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            ibtw ibtw0 = iej.e;
            guo.b(goz1, iau0, ibtw0);
            ibtw ibtw1 = iej.d;
            guo.b(goz1, gzk0, ibtw1);
            ibtw ibtw2 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc1, ibtw3);
            hfc hfc2 = dls.w(hey0);
            hfc hfc3 = dil.a(dim.a, hfc2);
            float f = dld0.d();
            dim dim0 = dim.a;
            hfc hfc4 = dla.f(hfc3, dla.b(dld0, ((jlm)goz1.h(ipa.i))), f, dla.a(dld0, ((jlm)goz1.h(ipa.i))), 0.0f);
            dhf dhf0 = dho.a;
            iau iau1 = dll.b(dhf0, hei.j, goz1, 0);
            hek hek0 = hei.j;
            gzk gzk1 = goz1.ak();
            hfc hfc5 = hew.c(goz1, hfc4);
            goz1.O();
            int v3 = dndw.a(gol.c(goz1));
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau1, ibtw0);
            guo.b(goz1, gzk1, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer1 = v3;
                goz1.P(integer1);
                goz1.p(integer1, ibtw2);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc5, ibtw3);
            dlq dlq0 = dlq.a;
            hfc hfc6 = dlo.a(dlq0, cvf.c(dla.i(hey0, 24.0f, 0.0f, 2), cvq0), 1.0f);
            iau iau2 = dii.a(dhn0, hej0, goz1, 0);
            int v4 = dndw.a(gol.c(goz1));
            gzk gzk2 = goz1.ak();
            hfc hfc7 = hew.c(goz1, hfc6);
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau2, ibtw0);
            guo.b(goz1, gzk2, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                Integer integer2 = v4;
                goz1.P(integer2);
                goz1.p(integer2, ibtw2);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc7, ibtw3);
            fuho fuho0 = this.y().d;
            goz1.M(-60478861);
            fuhl.a(dla.i(dls.w(hey0), 0.0f, 16.0f, 1), fuho0, goz1, 0, 0);
            goz1.x();
            goz1.z();
            hfc hfc8 = dlo.a(dlq0, dla.i(dls.u(hey0), 24.0f, 0.0f, 2), 1.0f);
            iau iau3 = dii.a(dhn0, hej0, goz1, 0);
            int v5 = dndw.a(gol.c(goz1));
            gzk gzk3 = goz1.ak();
            hfc hfc9 = hew.c(goz1, hfc8);
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau3, ibtw0);
            guo.b(goz1, gzk3, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v5))) {
                Integer integer3 = v5;
                goz1.P(integer3);
                goz1.p(integer3, ibtw2);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc9, ibtw3);
            hfc hfc10 = dil.a(dim0, dla.i(cvf.c(dls.w(hey0), cvq1), 0.0f, 16.0f, 1));
            iau iau4 = dii.a(dhn0, hei.n, goz1, 0x30);
            int v6 = dndw.a(gol.c(goz1));
            gzk gzk4 = goz1.ak();
            hfc hfc11 = hew.c(goz1, hfc10);
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau4, ibtw0);
            guo.b(goz1, gzk4, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v6))) {
                Integer integer4 = v6;
                goz1.P(integer4);
                goz1.p(integer4, ibtw2);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc11, ibtw3);
            fryk fryk0 = this.y().e;
            goz1.M(0x9E73AC7B);
            ftyy.b(fryk0, null, dls.k(hey0, 300.0f), hei.e, null, 0.0f, null, goz1, 0xDB0, 0x70);
            goz1.x();
            goz1.z();
            goz1.z();
            goz1.z();
            hfc hfc12 = dls.w(hey0);
            if(!cvq0.g() && !cvq1.g()) {
                goz1.M(0x7DF24B9F);
                if(hwev.c()) {
                    goz1.M(0x7DF2D5AB);
                    v7 = fpu.a(goz1).p;
                }
                else {
                    goz1.M(0x7DF40FAA);
                    v7 = fsbs.g(fpu.a(goz1), goz1);
                }
            }
            else {
                goz1.M(0x7DEEC272);
                if(hwev.c()) {
                    goz1.M(0x7DEF4C7E);
                    v7 = fpu.a(goz1).G;
                }
                else {
                    goz1.M(0x7DF0B74A);
                    v7 = fsbs.h(fpu.a(goz1), goz1);
                }
            }
            goz1.x();
            goz1.x();
            hfc hfc13 = cqx.c(hfc12, v7);
            ftuw ftuw0 = this.y().f;
            hfc hfc14 = fgzw.a(hfc13, (ftuw0 == null ? false : ftuw0.h), dml.b(hey0, new dkt(dmw.f(goz1), 0x20)));
            iau iau5 = dll.b(dhf0, hek0, goz1, 0);
            int v8 = dndw.a(gol.c(goz1));
            gzk gzk5 = goz1.ak();
            hfc hfc15 = hew.c(goz1, hfc14);
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau5, ibtw0);
            guo.b(goz1, gzk5, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v8))) {
                Integer integer5 = v8;
                goz1.P(integer5);
                goz1.p(integer5, ibtw2);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc15, ibtw3);
            dlv.a(dlo.a(dlq0, hey0, 1.0f), goz1);
            ftuw ftuw1 = this.y().f;
            goz1.M(0x9596F957);
            if(ftuw1 != null) {
                ftuu.a(dlo.a(dlq0, hey0, 1.0f), ftuw.a(ftuw1, null, null, false, null, new frxq(hll.h), false, 0xBB), goz1, 0x40, 0);
            }
            goz1.x();
            goz1.z();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dndz(this, dld0, v);
        }
    }

    public final void E(goz goz0, int v) {
        goz goz2;
        goz goz1 = goz0.ao(0x54830C9E);
        if((((v & 6) == 0 ? (goz1.Z(this) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            goz2 = goz1;
            fits.a(iqn.a(hfc.e, "LoadingScreen"), null, null, null, null, 0, 0L, 0L, null, gzf.e(0xDFE4062F, new dnem(this), goz1), goz2, 0x30000006, 510);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new dnee(this, v);
        }
    }

    @Override  // ednc
    public final boolean F() {
        return true;
    }

    public final void G(boolean z, goz goz0, int v) {
        goz goz2;
        goz goz1 = goz0.ao(0xF14C9FB2);
        int v1 = (v & 6) == 0 ? (goz1.Y(z) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(this) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
            goto label_20;
        }
        else {
            goz1.M(0xD0A38A5C);
            if(z) {
                this.E(goz1, v1 >> 3 & 14);
                goz1.x();
                gsb gsb0 = goz1.af();
                if(gsb0 != null) {
                    gsb0.d = new dnef(this, v);
                }
            }
            else {
                goz1.x();
                gep gep0 = fiuq.c(fiqk.c(goz1), goz1);
                goz2 = goz1;
                fits.a(iqn.a(huw.b(hfc.e, ((fwe)gep0).c), "ValuePropScreen"), gzf.e(5823606, new dnen(this, gep0), goz1), null, null, null, 0, 0L, 0L, null, gzf.e(0xFE8CD941, new dneo(this), goz1), goz2, 0x30000030, 508);
            label_20:
                gsb gsb1 = goz2.af();
                if(gsb1 != null) {
                    gsb1.d = new dneg(this, z, v);
                }
            }
        }
    }

    public final void H(goz goz0, int v) {
        goz goz1 = goz0.ao(0xB3391361);
        if((v & 1) == 0 && goz1.ac()) {
            goz1.G();
            gsb gsb0 = goz1.af();
            if(gsb0 != null) {
                gsb0.d = new dndy(this, v);
            }
        }
        else if(hwev.c()) {
            goz1.M(0x5EF76D2B);
            ftyy.b(new frxv(new fryn(fuqd.a, 0, 6), new frxt(0x7FFFFFFF, 6)), null, dls.k(hfc.e, 120.0f), hei.e, null, 0.0f, null, goz1, 0xDB8, 0x70);
            goz1.x();
            gsb gsb1 = goz1.af();
            if(gsb1 != null) {
                gsb1.d = new dneh(this, v);
            }
        }
        else {
            goz1.M(0x5EFE2130);
            qop qop0 = (qop)qpj.d(new qou(0x7F14024C), goz1, 0);  // raw:shape_loader_lottie
            qnu qnu0 = qnk.a(qop0.b(), false, false, false, null, 0.0f, 0x7FFFFFFF, goz1, 0x180000, 958);
            hfc hfc0 = dls.k(hfc.e, 120.0f);
            qkb qkb0 = qop0.b();
            goz1.M(5004770);
            boolean z = goz1.X(qnu0);
            Object object0 = goz1.j();
            if(z || object0 == gop.a) {
                object0 = new dnei(qnu0);
                goz1.P(object0);
            }
            goz1.x();
            qob.c(qkb0, ((ibth)object0), hfc0, false, false, false, 0, false, null, null, null, false, 0, goz1, 0x180, 0, 0xFFF8);
            goz1.x();
            gsb gsb2 = goz1.af();
            if(gsb2 != null) {
                gsb2.d = new dndx(this, v);
            }
        }
    }

    public final void I(dld dld0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x3446643F);
        int v1 = (v & 6) == 0 ? (goz1.X(dld0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(this) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            cvq cvq0 = cvf.d(0, goz1, 0, 1);
            hey hey0 = hfc.e;
            hfc hfc0 = dla.j(dls.v(hey0), 0.0f, dld0.d(), 0.0f, 0.0f, 5);
            dhn dhn0 = dho.c;
            iau iau0 = dii.a(dhn0, hei.m, goz1, 0);
            int v2 = dndw.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc1 = hew.c(goz1, hfc0);
            ibth ibth0 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            ibtw ibtw0 = iej.e;
            guo.b(goz1, iau0, ibtw0);
            ibtw ibtw1 = iej.d;
            guo.b(goz1, gzk0, ibtw1);
            ibtw ibtw2 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc1, ibtw3);
            hfc hfc2 = cvf.c(dla.i(dls.v(hey0), 24.0f, 0.0f, 2), cvq0);
            hfc hfc3 = dil.a(dim.a, hfc2);
            iau iau1 = dii.a(dhn0, hei.n, goz1, 0x30);
            int v3 = dndw.a(gol.c(goz1));
            gzk gzk1 = goz1.ak();
            hfc hfc4 = hew.c(goz1, hfc3);
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau1, ibtw0);
            guo.b(goz1, gzk1, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer1 = v3;
                goz1.P(integer1);
                goz1.p(integer1, ibtw2);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc4, ibtw3);
            fuhl.a(dla.j(dls.w(hey0), 0.0f, 16.0f, 0.0f, 32.0f, 5), this.y().d, goz1, 0, 0);
            fryk fryk0 = this.y().e;
            goz1.M(0xE73C7F3F);
            ftyy.b(fryk0, null, dla.j(dls.k(hey0, 300.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7), hei.e, null, 0.0f, null, goz1, 0xC30, 0x70);
            goz1.x();
            goz1.z();
            ftuw ftuw0 = this.y().f;
            goz1.M(-1642812205);
            if(ftuw0 != null) {
                ftuu.a(null, ftuw.a(ftuw0, null, null, cvq0.g(), null, null, false, 0xFB), goz1, 0x40, 1);
            }
            goz1.x();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dneb(this, dld0, v);
        }
    }

    public static final void J(dnfc dnfc0, goz goz0) {
        dnfc0.H(goz0, 0);
    }

    @Override  // fshb
    public final int kd() {
        return 1;
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        if(v == 301 && v1 == -1) {
            if(intent0 == null) {
                xob xob0 = this.an();
                if(xob0 != null) {
                    xob0.setResult(-1);
                }
                this.ar();
                return;
            }
            xob xob1 = this.an();
            if(xob1 != null) {
                xob1.setResult(-1, intent0);
            }
            this.ar();
            return;
        }
        this.y().a(false);
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        doly doly0 = dolz.a(this);
        dolg dolg0 = this.ap();
        Preconditions.b(dolg0);
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        new dnba(dolg0, dxee.a(doly0), eczs.a(doly0), doly0, new edop(), domv0).inject(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        icmq icmq0 = this.y().b.c;
        lps lps0 = this.getViewLifecycleOwner();
        icbb.b(lpt.a(lps0), null, null, new dner(lps0, icmq0, null, this), 3);
        View view0 = new ComposeView(this.requireContext(), null, 0, 6, null);
        ((ijr)view0).j();
        ((ComposeView)view0).a(new gze(0x65A52B01, true, new dneu(this)));
        fhvo fhvo0 = this.A().a.a(0x4164C);
        this.A().f(view0, fhvo0);
        return view0;
    }

    public final dnfg y() {
        return (dnfg)this.ai.a();
    }
}

