import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import dagger.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

public final class dxpm extends dokz implements ednc {
    public static final List a;
    private final ibnn ag;
    public ibnf b;
    public fhwk c;
    public List d;

    static {
        List list0 = ibpo.g(new Integer[]{((int)0xFA), ((int)500), ((int)750), ((int)1000), ((int)1500)});
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        for(Object object0: list0) {
            int v = ((Number)object0).intValue();
            dymi dymi0 = dymh.a(((ProtoLiteMessage)dymg.a).v_newBuilder());
            dymi0.b("JPY");
            dymi0.c(((long)v) * 1000000L);
            arrayList0.add(dymi0.a());
        }
        dxpm.a = arrayList0;
    }

    public dxpm() {
        dxph dxph0 = new dxph(this);
        dxpj dxpj0 = new dxpj(new dxpi(this));
        ibnn ibnn0 = ibno.a(ibnp.c, dxpj0);
        this.ag = new lsd(new ibuk(dxpr.class), new dxpk(ibnn0), dxph0, new dxpl(ibnn0));
    }

    public final List A() {
        List list0 = this.d;
        if(list0 != null) {
            return list0;
        }
        ibuq.j("options");
        return null;
    }

    public final void B(boolean z, dymg dymg0) {
        dxpr dxpr0 = this.y();
        ((ggtj)dxpr.a.h()).V("store low balance notification settings: %s, %s", z, dymg0);
        icbb.b(lsc.a(dxpr0), null, null, new dxpq(dxpr0, z, dymg0, null), 3);
    }

    public final void D(dxpn dxpn0, goz goz0, int v) {
        fule fule0;
        ibtw ibtw8;
        ibth ibth2;
        hej hej1;
        ibtw ibtw7;
        ibth ibth1;
        ibtw ibtw6;
        ibts ibts1;
        ibtw ibtw5;
        ibtw ibtw4;
        boolean z1;
        dxpn dxpn1;
        goz goz2;
        dxpm dxpm0;
        ibuq.f(dxpn0, "state");
        goz goz1 = goz0.ao(-1526800052);
        int v1 = (v & 6) == 0 ? v | (goz1.X(dxpn0) ? 4 : 2) : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(this) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            dxpm0 = this;
            goz2 = goz1;
            dxpn1 = dxpn0;
        }
        else {
            hey hey0 = hfc.e;
            hfc hfc0 = dls.w(hey0);
            dhg dhg0 = dho.g(16.0f);
            hej hej0 = hei.m;
            iau iau0 = dii.a(dhg0, hej0, goz1, 0);
            int v2 = dxos.a(gol.c(goz1));
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
            guo.a(goz1, iej.g);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc1, ibtw3);
            hfc hfc2 = iqn.a(dls.w(hey0), "notificationToggle");
            fryr fryr0 = new fryr(0x7F151F54);  // string:pay_low_balance_notification_switch_label "Get notifications"
            boolean z = dxpn0.a;
            ibts ibts0 = iej.g;
            goz1.M(-1633490746);
            int v3 = goz1.Z(this);
            Object object0 = goz1.j();
            if((v3 | ((v1 & 14) == 4 ? 1 : 0)) != 0 || object0 == gop.a) {
                object0 = new dxou(this, dxpn0);
                goz1.P(object0);
            }
            goz1.x();
            fuar.f(hfc2, new fuat(fryr0, null, null, new fubx(z, ((ibts)object0)), 0, null, null, null, null, false, false, true, null, false, 0x37F6), goz1, 70, 0);
            goz1.M(0x700DFC0D);
            if(z) {
                goz2 = goz1;
                ibtw4 = ibtw1;
                hej1 = hej0;
                z1 = z;
                ibtw6 = ibtw3;
                ibtw7 = ibtw2;
                ibth1 = ibth0;
                ibtw5 = ibtw0;
                ibts1 = ibts0;
            }
            else {
                String s = isq.c(0x7F151F55, goz1);  // string:pay_low_balance_notification_switch_off_subtitle "You won\'t receive notifications 
                                                     // about your balances"
                jbn jbn0 = fpu.d(goz1).j;
                z1 = z;
                ibtw4 = ibtw1;
                ibtw5 = ibtw0;
                ibts1 = ibts0;
                ibtw6 = ibtw3;
                ibth1 = ibth0;
                ibtw7 = ibtw2;
                hej1 = hej0;
                gdh.b(s, null, fpu.a(goz1).q, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jbn0, goz1, 0, 0, 0x1FFFA);
                goz2 = goz1;
            }
            goz2.x();
            goz2.z();
            if(z1) {
                hfc hfc3 = dls.w(hey0);
                iau iau1 = dii.a(dho.g(16.0f), hej1, goz2, 0);
                int v4 = dxos.a(gol.c(goz2));
                gzk gzk1 = goz2.ak();
                hfc hfc4 = hew.c(goz2, hfc3);
                goz2.O();
                if(goz2.x) {
                    ibth2 = ibth1;
                    goz2.t(ibth2);
                }
                else {
                    ibth2 = ibth1;
                    goz2.T();
                }
                guo.b(goz2, iau1, ibtw5);
                guo.b(goz2, gzk1, ibtw4);
                if(!goz2.x && ibuq.m(goz2.j(), Integer.valueOf(v4))) {
                    ibtw8 = ibtw7;
                }
                else {
                    Integer integer1 = v4;
                    goz2.P(integer1);
                    ibtw8 = ibtw7;
                    goz2.p(integer1, ibtw8);
                }
                guo.a(goz2, ibts1);
                guo.b(goz2, hfc4, ibtw6);
                hfc hfc5 = dls.w(hey0);
                String s1 = isq.c(0x7F151F52, goz2);  // string:pay_low_balance_notification_options_subtitle "Notify me when balance is 
                                                      // below"
                jbn jbn1 = fpu.d(goz2).B;
                gdh.b(s1, hfc5, fpu.a(goz2).s, 0L, jeu.i, 0L, null, null, 0L, 0, false, 0, 0, null, jbn1, goz2, 0x180030, 0, 131000);
                goz2 = goz2;
                hfc hfc6 = dls.B(dls.w(hey0));
                iau iau2 = dii.a(dho.g(2.0f), hej1, goz2, 0);
                int v5 = dxos.a(gol.c(goz2));
                gzk gzk2 = goz2.ak();
                hfc hfc7 = hew.c(goz2, hfc6);
                goz2.O();
                if(goz2.x) {
                    goz2.t(ibth2);
                }
                else {
                    goz2.T();
                }
                guo.b(goz2, iau2, ibtw5);
                guo.b(goz2, gzk2, ibtw4);
                if(goz2.x || !ibuq.m(goz2.j(), Integer.valueOf(v5))) {
                    Integer integer2 = v5;
                    goz2.P(integer2);
                    goz2.p(integer2, ibtw8);
                }
                guo.a(goz2, ibts1);
                guo.b(goz2, hfc7, ibtw6);
                goz2.M(0x329908FB);
                int v6 = 0;
                for(Object object1: this.A()) {
                    if(v6 < 0) {
                        ibpo.m();
                    }
                    hfc hfc8 = dls.w(hey0);
                    String s2 = fscd.b(((dymg)object1));
                    ibuq.e(s2, "toDisplayableString(...)");
                    fryu fryu0 = new fryu(s2);
                    fubb fubb0 = new fubb(ibuq.m(((dymg)object1), dxpn0.b));
                    if(v6 == 0) {
                        fule0 = fule.b;
                    }
                    else {
                        fule0 = v6 == this.A().size() - 1 ? fule.d : fule.c;
                    }
                    goz2.M(-1633490746);
                    int v7 = goz2.Z(this) | goz2.X(((dymg)object1));
                    Object object2 = goz2.j();
                    if(v7 != 0 || object2 == gop.a) {
                        object2 = new dxov(this, ((dymg)object1));
                        goz2.P(object2);
                    }
                    goz2.x();
                    ftzt.a(hfc8, new ftzv(fryu0, null, null, fubb0, null, null, fule0, true, ((ibth)object2), 0, null, 3190), goz2, 70, 0);
                    ++v6;
                }
                dxpm0 = this;
                dxpn1 = dxpn0;
                goz2.x();
                goz2.z();
                goz2.z();
            }
            else {
                dxpm0 = this;
                dxpn1 = dxpn0;
            }
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new dxow(dxpm0, dxpn1, v);
        }
    }

    public final void E(goz goz0, int v) {
        goz goz1 = goz0.ao(0x3F3793D);
        if((v & 1) == 0 && goz1.ac()) {
            goz1.G();
        }
        else {
            fryr fryr0 = new fryr(0x7F151F53);  // string:pay_low_balance_notification_setup_title "Manage low balance notifications"
            fuhl.a(null, new fuhm(new fugt(new fryh(0x7F080BDD), null, null, null, 28), fryr0, null, 4), goz1, 0x40, 1);  // drawable:quantum_gm_ic_notifications_vd_theme_24
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dxot(this, v);
        }
    }

    @Override  // ednc
    public final boolean F() {
        return true;
    }

    public final void G(float f, dxpn dxpn0, goz goz0, int v) {
        float f1;
        dxpn dxpn1;
        dxpm dxpm0;
        ibuq.f(dxpn0, "state");
        goz goz1 = goz0.ao(-2036689545);
        int v1 = (v & 6) == 0 ? (goz1.U(f) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(dxpn0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(this) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            dxpm0 = this;
            dxpn1 = dxpn0;
            f1 = f;
        }
        else {
            gep gep0 = gem.d(far.k(goz1), null, goz1, 2);
            hey hey0 = hfc.e;
            hfc hfc0 = dls.v(hey0);
            iau iau0 = dii.a(dho.c, hei.m, goz1, 0);
            int v2 = dxos.a(gol.c(goz1));
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
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            gej gej0 = gem.f(goz1);
            gze gze0 = gzf.e(0xC89408E7, new dxoz(this), goz1);
            ibts ibts0 = iej.g;
            ibtw ibtw3 = iej.c;
            far.d(dxmm.a, null, gze0, null, 0.0f, null, gej0, gep0, goz1, 390, 58);
            gze gze1 = gzf.e(0xF5DA612, new dxpd(dim.a), goz1);
            hfc hfc2 = huw.b(dla.i(dls.v(hey0), 24.0f, 0.0f, 2), ((fwe)gep0).c);
            iau iau1 = dll.b(dho.g(24.0f), hei.j, goz1, 6);
            int v3 = dxos.a(gol.c(goz1));
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
            f1 = f;
            if(jkv.a(f1, 600.0f) >= 0) {
                goz1.M(0x58555890);
                dxpm0 = this;
                Integer integer2 = (int)54;
                gze1.a(gzf.e(52077585, new dxpa(dxpm0), goz1), goz1, integer2);
                dxpn1 = dxpn0;
                gze1.a(gzf.e(0x80D92648, new dxpb(dxpm0, dxpn1), goz1), goz1, integer2);
            }
            else {
                dxpm0 = this;
                dxpn1 = dxpn0;
                goz1.M(0x58576543);
                gze1.a(gzf.e(1980962202, new dxpc(dxpm0, dxpn1), goz1), goz1, Integer.valueOf(54));
            }
            goz1.x();
            goz1.z();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dxox(dxpm0, f1, dxpn1, v);
        }
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        dolg dolg0 = this.ap();
        Preconditions.b(dolg0);
        domv domv0 = domu.a(context0);
        Preconditions.b(domv0);
        new dxoc(dolg0, domv0, new done(), dolz.a(this)).inject(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        View view0 = new ComposeView(this.requireContext(), null, 0, 6, null);
        ((ijr)view0).j();
        ((ComposeView)view0).a(new gze(1094634311, true, new dxpf(this)));
        fhvo fhvo0 = this.z().a.a(0x41C2A);
        this.z().f(view0, fhvo0);
        return view0;
    }

    public final dxpr y() {
        return (dxpr)this.ag.a();
    }

    public final fhwk z() {
        fhwk fhwk0 = this.c;
        if(fhwk0 != null) {
            return fhwk0;
        }
        ibuq.j("viewVisualElements");
        return null;
    }
}

