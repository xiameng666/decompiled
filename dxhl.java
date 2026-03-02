import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

public final class dxhl extends dokz implements ednc {
    public fhwk a;
    private final ibnn ag;
    private AndroidInjector ah;
    public fhvw b;
    public fhxi c;
    public dxhm d;

    public dxhl() {
        dxgf dxgf0 = new dxgf(this);
        dxhi dxhi0 = new dxhi(new dxhh(this));
        ibnn ibnn0 = ibno.a(ibnp.c, dxhi0);
        this.ag = new lsd(new ibuk(dxht.class), new dxhj(ibnn0), dxgf0, new dxhk(ibnn0));
    }

    public final void A(goz goz0, int v) {
        goz goz1 = goz0.ao(0xD9EFE9D0);
        if((v & 1) == 0 && goz1.ac()) {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dxgp(this, v);
        }
    }

    public final void B(goz goz0, int v) {
        goz goz1 = goz0.ao(0xF13CF43C);
        int v1 = (v & 6) == 0 ? (goz1.Z(this) ? 4 : 2) | v : v;
        if((v1 & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            hey hey0 = hfc.e;
            hfc hfc0 = dla.f(dls.w(hey0), 24.0f, 32.0f, 24.0f, 16.0f);
            iau iau0 = dii.a(dho.c, hei.n, goz1, 0x30);
            int v2 = dxge.a(gol.c(goz1));
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
            hfc hfc2 = dls.w(hey0);
            iau iau1 = dll.b(dho.e, hei.k, goz1, 54);
            int v3 = dxge.a(gol.c(goz1));
            gzk gzk1 = goz1.ak();
            hfc hfc3 = hew.c(goz1, hfc2);
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
            guo.b(goz1, hfc3, ibtw3);
            ftsq.b(dls.e(hey0, 24.0f), null, ftsr.c, goz1, 390, 2);
            dlv.a(dls.o(hey0, 18.0f), goz1);
            fkx.c(dls.e(hey0, 24.0f), 0.0f, 0L, goz1, 6, 6);
            dlv.a(dls.o(hey0, 18.0f), goz1);
            hfc hfc4 = dls.e(hey0, 24.0f);
            cth.a(ism.a(0x7F080A2D, goz1, 0), null, hfc4, null, hys.b, 0.0f, null, goz1, 25016, 104);  // drawable:pix
            goz1.z();
            dlv.a(dls.e(hey0, 16.0f), goz1);
            ftzt.a(null, new ftzv(new fryr(0x7F15203E), new fryr(0x7F15203D), null, null, null, null, null, false, null, 0, null, 0xFFC), goz1, 0x40, 1);  // string:pay_pix_confirm_fop_title "Pay with Pix without switching apps"
            fsko fsko0 = new fsko(new fskc(null));
            goz1.M(5004770);
            boolean z = goz1.Z(this);
            Object object0 = goz1.j();
            if(z || object0 == gop.a) {
                object0 = new dxgm(this);
                goz1.P(object0);
            }
            goz1.x();
            fsja.a(fsko0, ((ibth)object0), goz1, 8);
            dlv.a(dls.e(hey0, 4.0f), goz1);
            ftwq.a(null, new ftwn(new fryr(0x7F15203C), ftwo.c), goz1, 0x40, 1);  // string:pay_pix_confirm_fop_disclaimer "Financial institution limits apply. To turn 
                                                                                  // off Pix code detection, go to Wallet Settings"
            goz1.z();
            dlv.a(dls.e(hey0, 8.0f), goz1);
            fryr fryr0 = new fryr(0x7F151CC1);  // string:pay_continue "Continue"
            goz1.M(5004770);
            boolean z1 = goz1.Z(this);
            Object object1 = goz1.j();
            if(z1 || object1 == gop.a) {
                object1 = new dxgn(this);
                goz1.P(object1);
            }
            goz1.x();
            this.H(null, fryr0, ((ibth)object1), goz1, v1 << 15 & 0x70000 | 0xD80);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dxgo(this, v);
        }
    }

    public final void D(fskb fskb0, goz goz0, int v) {
        fskb fskb1;
        goz goz1 = goz0.ao(0x13FF22D6);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(fskb0) : goz1.Z(fskb0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(this) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            fskb1 = fskb0;
        }
        else {
            goz1.M(5004770);
            boolean z = goz1.Z(this);
            Object object0 = goz1.j();
            if(z || object0 == gop.a) {
                object0 = new dxgg(this);
                goz1.P(object0);
            }
            goz1.x();
            goz1.M(5004770);
            boolean z1 = goz1.Z(this);
            Object object1 = goz1.j();
            if(z1 || object1 == gop.a) {
                object1 = new dxgh(this);
                goz1.P(object1);
            }
            goz1.x();
            goz1.M(5004770);
            boolean z2 = goz1.Z(this);
            Object object2 = goz1.j();
            if(z2 || object2 == gop.a) {
                object2 = new dxgi(this);
                goz1.P(object2);
            }
            goz1.x();
            fskb1 = fskb0;
            fsjz.d(fskb1, ((ibts)object0), ((ibts)object1), ((ibth)object2), goz1, v1 & 14);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dxgj(this, fskb1, v);
        }
    }

    public final void E(goz goz0, int v) {
        goz goz1 = goz0.ao(0xF40FF9C);
        if((v & 1) == 0 && goz1.ac()) {
            goz1.G();
        }
        else {
            hey hey0 = hfc.e;
            hfc hfc0 = dla.f(dls.w(hey0), 24.0f, 32.0f, 24.0f, 16.0f);
            hej hej0 = hei.n;
            dhn dhn0 = dho.c;
            iau iau0 = dii.a(dhn0, hej0, goz1, 0x30);
            int v1 = dxge.a(gol.c(goz1));
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
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v1))) {
                Integer integer0 = v1;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            hfc hfc2 = dls.e(hey0, 24.0f);
            ibtw ibtw3 = iej.c;
            ibts ibts0 = iej.g;
            ftsq.b(hfc2, null, ftsr.c, goz1, 390, 2);
            hfc hfc3 = dls.e(hey0, 300.0f);
            hej hej1 = hei.m;
            iau iau1 = dii.a(dho.e, hej1, goz1, 6);
            gzk gzk1 = goz1.ak();
            hfc hfc4 = hew.c(goz1, hfc3);
            goz1.O();
            int v2 = dxge.a(gol.c(goz1));
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau1, ibtw0);
            guo.b(goz1, gzk1, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer1 = v2;
                goz1.P(integer1);
                goz1.p(integer1, ibtw2);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc4, ibtw3);
            hfc hfc5 = dla.i(hey0, 24.0f, 0.0f, 2);
            iau iau2 = dii.a(dhn0, hej1, goz1, 0);
            int v3 = dxge.a(gol.c(goz1));
            gzk gzk2 = goz1.ak();
            hfc hfc6 = hew.c(goz1, hfc5);
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau2, ibtw0);
            guo.b(goz1, gzk2, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer2 = v3;
                goz1.P(integer2);
                goz1.p(integer2, ibtw2);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc6, ibtw3);
            dim dim0 = dim.a;
            ftyy.b(new frxv(new fryn(fuqd.a, 0, 6), new frxt(0x7FFFFFFF, 6)), null, dls.v(dim0.a(dls.k(hey0, 80.0f), hej0)), hei.e, null, 0.0f, null, goz1, 0xC38, 0x70);
            dlv.a(dls.e(hey0, 16.0f), goz1);
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = new ParcelableSnapshotMutableIntState(0);
                goz1.P(object0);
            }
            goz1.x();
            ibom ibom0 = ibom.a;
            goz1.M(5004770);
            Object object2 = goz1.j();
            if(object2 == object1) {
                object2 = new dxgt(((gtl)object0), null);
                goz1.P(object2);
            }
            goz1.x();
            gqe.f(ibom0, ((ibtw)object2), goz1);
            fryr[] arr_fryr = {new fryr(0x7F15203F), new fryr(0x7F15203B), new fryr(0x7F152056)};  // string:pay_pix_contacting "Contacting your financial institution..."
            fryr fryr0 = arr_fryr[((gtl)object0).e()];
            jbn jbn0 = fpu.d(goz1).k;
            ftzd.a(fryr0, dim0.a(hey0, hej0), fpu.a(goz1).q, 0L, null, 0L, new jjy(3), 0L, 0, false, 0, 0, null, null, jbn0, goz1, 0, 0, 0x1FDF8);
            goz1 = goz1;
            goz1.z();
            goz1.z();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dxgs(this, v);
        }
    }

    @Override  // ednc
    public final boolean F() {
        return true;
    }

    public final void G(goz goz0, int v) {
        goz goz1 = goz0.ao(0xB5885FDD);
        if((v & 1) == 0 && goz1.ac()) {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dxgr(this, v);
        }
    }

    public final void H(hfc hfc0, fryr fryr0, ibth ibth0, goz goz0, int v) {
        hfc hfc1;
        ibth ibth1;
        fryr fryr1;
        goz goz1 = goz0.ao(0xB6BCD3D5);
        int v1 = v | 6;
        if((v & 0x30) == 0) {
            fryr1 = fryr0;
            v1 |= (goz1.Z(fryr1) ? 0x20 : 16);
        }
        else {
            fryr1 = fryr0;
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Y(true) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Y(false) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            ibth1 = ibth0;
            v1 |= (goz1.Z(ibth1) ? 0x4000 : 0x2000);
        }
        else {
            ibth1 = ibth0;
        }
        if((v1 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else {
            ftuw ftuw0 = new ftuw(new ftts(fryr1, null, true, null, null, ftva.a, 0x427FE, null, null, ibth1, 410), null, false, ftvd.b, null, ftvb.c, null, false, 0xD6);
            ftuu.a(hfc.e, ftuw0, goz1, v1 & 14 | 0x40, 0);
            hfc1 = hfc.e;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dxgq(this, hfc1, fryr0, ibth0, v);
        }
    }

    public final void I(dxht dxht0, goz goz0, int v) {
        goz goz2;
        dxht dxht1;
        goz goz1 = goz0.ao(0xB31DB08C);
        int v1 = (v & 6) == 0 ? v | 2 : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(this) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            dxht1 = dxht0;
            goz2 = goz1;
        }
        else {
            goz1.I();
            if((v & 1) != 0 && !goz1.aa()) {
                goz1.G();
                dxht1 = dxht0;
            }
            else {
                lsq lsq0 = lud.b(goz1);
                if(lsq0 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ltx ltx0 = (lsq0 instanceof loz) ? ((loz)lsq0).getDefaultViewModelCreationExtras() : ltv.a;
                dxht1 = (dxht)lue.a(new ibuk(dxht.class), lsq0, null, null, ltx0);
            }
            goz1.w();
            gui gui0 = ltd.c(dxht1.b.a, dxho.a, goz1);
            if((dxhl.y(gui0) instanceof dxhp)) {
                goz1.M(0xEC093819);
                fugo.b(0x4285C, null, null, gzf.e(0x9BB9EFC3, new dxgu(this, gui0), goz1), goz1, 0xC06, 6);
                goz1.x();
                goz2 = goz1;
            }
            else {
                goz1.M(0xEC0C0FDF);
                fyx fyx0 = fsr.e(true, goz1, 6, 2);
                goz1.M(5004770);
                boolean z = goz1.Z(this);
                Object object0 = goz1.j();
                if(z || object0 == gop.a) {
                    object0 = new dxgk(this);
                    goz1.P(object0);
                }
                goz1.x();
                goz2 = goz1;
                fsr.c(((ibth)object0), null, fyx0, 0.0f, false, null, fpu.a(goz1).p, 0L, 0.0f, 0L, null, null, null, gzf.e(0xACAA44CA, new dxgz(gui0, this), goz1), goz2, 0, 0xC06, 7098);
                goz2.x();
            }
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new dxgl(this, dxht1, v);
        }
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        if(this.ah == null) {
            Preconditions.b(this.ap());
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            this.ah = new dxgd(domv0);
        }
        AndroidInjector androidInjector0 = this.ah;
        if(androidInjector0 == null) {
            throw new IllegalStateException("component was null after injection");
        }
        androidInjector0.inject(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        View view0 = new ComposeView(this.requireContext(), null, 0, 6, null);
        ((ComposeView)view0).a(new gze(0xA3368B0, true, new dxhd(this)));
        return view0;
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        icmq icmq0 = this.z().a.c;
        lps lps0 = this.getViewLifecycleOwner();
        icbb.b(lpt.a(lps0), null, null, new dxhg(lps0, icmq0, null, this), 3);
    }

    public static final dxhs y(gui gui0) {
        return (dxhs)gui0.a();
    }

    public final dxht z() {
        return (dxht)this.ag.a();
    }
}

