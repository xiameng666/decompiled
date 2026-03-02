import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import dagger.internal.Preconditions;

public final class duoa extends dokz implements ednc {
    public static final bboh a;
    public fhvw ag;
    public String ah;
    public gtxf ai;
    public acp aj;
    private final ibnn ak;
    public ibnf b;
    public edse c;
    public fhxi d;

    static {
        duoa.a = bboh.b("Pay", bbcu.cZ);
    }

    public duoa() {
        dunv dunv0 = new dunv(this);
        dunx dunx0 = new dunx(new dunw(this));
        ibnn ibnn0 = ibno.a(ibnp.c, dunx0);
        this.ak = new lsd(new ibuk(duog.class), new duny(ibnn0), dunv0, new dunz(ibnn0));
    }

    public final void A(hjzq hjzq0, goz goz0, int v) {
        goz goz2;
        goz goz1 = goz0.ao(0xC9FDD6D6);
        int v1 = (v & 6) == 0 ? (goz1.X(hjzq0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(this) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
            goto label_47;
        }
        else if(hjzq0 == null) {
        label_51:
            gsb gsb1 = goz1.af();
            if(gsb1 != null) {
                gsb1.d = new dund(this, hjzq0, v);
            }
        }
        else {
            hjzl hjzl0 = hjzq0.b == null ? hjzl.a : hjzq0.b;
            if(hjzl0 == null) {
                goto label_51;
            }
            else {
                String s = hjzl0.g;
                if(s == null) {
                    goto label_51;
                }
                else {
                    hey hey0 = hfc.e;
                    hfc hfc0 = dls.w(hey0);
                    long v2 = fpu.a(goz1).r;
                    ibuq.f(hfc0, "$this$topBorder");
                    hfc hfc1 = dla.d(hhm.a(hfc0, new duna(v2)), 24.0f);
                    iau iau0 = dll.b(dho.a, hei.j, goz1, 0);
                    long v3 = gol.c(goz1);
                    gzk gzk0 = goz1.ak();
                    hfc hfc2 = hew.c(goz1, hfc1);
                    ibth ibth0 = iej.a;
                    goz1.O();
                    if(goz1.x) {
                        goz1.t(ibth0);
                    }
                    else {
                        goz1.T();
                    }
                    int v4 = (int)(v3 ^ v3 >>> 0x20);
                    guo.b(goz1, iau0, iej.e);
                    guo.b(goz1, gzk0, iej.d);
                    ibtw ibtw0 = iej.f;
                    if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                        Integer integer0 = v4;
                        goz1.P(integer0);
                        goz1.p(integer0, ibtw0);
                    }
                    guo.a(goz1, iej.g);
                    guo.b(goz1, hfc2, iej.c);
                    fdb.c(dls.k(hey0, 72.0f), null, null, null, dumf.a, goz1, 0x6006);
                    dlv.a(dls.o(hey0, 16.0f), goz1);
                    hfc hfc3 = dls.w(hey0);
                    hfc hfc4 = dlq.a.a(hfc3, hei.k);
                    frys frys0 = new frys(0x7F151EF5, new Object[]{s});  // string:pay_id_provision_install_wallet_message "To view your %1$s, install Google 
                                                                         // Wallet"
                    jbn jbn0 = fpu.d(goz1).g;
                    goz2 = goz1;
                    ftzd.a(frys0, hfc4, fpu.a(goz1).q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn0, goz2, 0, 0, 0x1FFF8);
                    goz2.z();
                label_47:
                    gsb gsb0 = goz2.af();
                    if(gsb0 != null) {
                        gsb0.d = new dune(this, hjzq0, v);
                    }
                }
            }
        }
    }

    public final void B(goz goz0, int v) {
        goz goz1 = goz0.ao(0xB77A6017);
        if((((v & 6) == 0 ? (goz1.Z(this) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            String s = this.ah;
            if(s == null) {
                ibuq.j("provisioningId");
                s = null;
            }
            goz1.M(5004770);
            boolean z = goz1.Z(this);
            Object object0 = goz1.j();
            if(z || object0 == gop.a) {
                object0 = new dunm(this, null);
                goz1.P(object0);
            }
            goz1.x();
            gqe.f(s, ((ibtw)object0), goz1);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dumw(this, v);
        }
    }

    public final void D(goz goz0, int v) {
        goz goz1 = goz0.ao(0xFD5967E7);
        if((((v & 6) == 0 ? (goz1.Z(this) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            String s = this.ah;
            if(s == null) {
                ibuq.j("provisioningId");
                s = null;
            }
            goz1.M(5004770);
            boolean z = goz1.Z(this);
            Object object0 = goz1.j();
            if(z || object0 == gop.a) {
                object0 = new dunn(this, null);
                goz1.P(object0);
            }
            goz1.x();
            gqe.f(s, ((ibtw)object0), goz1);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dunb(this, v);
        }
    }

    public final void E(hfc hfc0, goz goz0, int v) {
        goz goz2;
        goz goz1 = goz0.ao(0x6A4AAED6);
        int v1 = (v & 6) == 0 ? v | (goz1.X(hfc0) ? 4 : 2) : v;
        if((v1 & 3) == 2 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            qok qok0 = fuqy.b(fuqd.a, goz1);
            qox qox0 = fuqy.c(fuqd.a, null, goz1, 6);
            goz2 = goz1;
            qob.b(((qop)qok0).b(), hfc0, false, false, null, 0.0f, 0x7FFFFFFF, false, false, false, 0, false, false, qox0, null, null, false, 0, goz2, v1 << 3 & 0x70 | 0x180000, 0x1000, 0, 0x1FDFBC);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new dunf(this, hfc0, v);
        }
    }

    @Override  // ednc
    public final boolean F() {
        return true;
    }

    public final void G(hfc hfc0, duob duob0, goz goz0, int v) {
        hfc hfc1;
        goz goz2;
        goz goz1 = goz0.ao(0x31966E90);
        int v1 = (v & 0x30) == 0 ? v | 6 | (goz1.X(duob0) ? 0x20 : 16) : v | 6;
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(this) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
            hfc1 = hfc0;
        }
        else {
            gep gep0 = gem.d(far.k(goz1), null, goz1, 2);
            goz2 = goz1;
            fxw.a(huw.b(dls.v(hfc.e), ((fwe)gep0).c), gzf.e(0x6079A554, new dung(this, gep0), goz1), gzf.e(1050612693, new dunh(this, duob0), goz1), null, null, 0, 0L, 0L, null, gzf.e(-965097057, new dunj(duob0, this), goz1), goz2, 0x300001B0, 504);
            hfc1 = hfc.e;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new dumx(this, hfc1, duob0, v);
        }
    }

    public final void H(hfc hfc0, gep gep0, goz goz0, int v) {
        hfc hfc1;
        goz goz1 = goz0.ao(0xF2ACF688);
        int v1 = (v & 0x30) == 0 ? v | 6 | (goz1.X(gep0) ? 0x20 : 16) : v | 6;
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(this) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else {
            hfc1 = hfc.e;
            gze gze0 = gzf.e(0x623F3BCE, new dunl(this), goz1);
            far.d(dumf.c, hfc1, gze0, null, 0.0f, null, null, gep0, goz1, v1 << 3 & 0x70 | 390 | v1 << 18 & 0x1C00000, 120);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dumq(this, hfc1, gep0, v);
        }
    }

    public final void I(hfc hfc0, goz goz0, int v) {
        hfc hfc1;
        goz goz1 = goz0.ao(0x7235DE8);
        if(((v | 6) & 3) == 2 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else {
            hfc1 = hfc.e;
            far.d(dumf.b, hfc1, null, null, 0.0f, null, null, null, goz1, (v | 6) << 3 & 0x70 | 6, 0xFC);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dunc(this, hfc1, v);
        }
    }

    public final void J(hfc hfc0, duob duob0, goz goz0, int v) {
        hfc hfc1;
        goz goz2;
        goz goz1 = goz0.ao(0x5EB80647);
        int v1 = (v & 0x30) == 0 ? v | 6 | (goz1.X(duob0) ? 0x20 : 16) : v | 6;
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(this) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
            hfc1 = hfc0;
            goto label_19;
        }
        else {
            hey hey0 = hfc.e;
            hjzq hjzq0 = duob0.b;
            if(hjzq0 == null) {
            label_23:
                gsb gsb1 = goz1.af();
                if(gsb1 != null) {
                    gsb1.d = new dumr(this, hey0, duob0, v);
                }
            }
            else {
                hjzl hjzl0 = hjzq0.b == null ? hjzl.a : hjzq0.b;
                if(hjzl0 == null) {
                    goto label_23;
                }
                else {
                    String s = hjzl0.g;
                    if(s == null) {
                        goto label_23;
                    }
                    else {
                        goz2 = goz1;
                        hfc1 = hey0;
                        fxw.a(dls.v(hey0), gzf.e(0x36F0E703, new duno(this), goz1), null, null, null, 0, 0L, 0L, null, gzf.e(0x63858D58, new dunp(s, this), goz1), goz2, 0x30000030, 508);
                    label_19:
                        gsb gsb0 = goz2.af();
                        if(gsb0 != null) {
                            gsb0.d = new dums(this, hfc1, duob0, v);
                        }
                    }
                }
            }
        }
    }

    private static final duob K(gui gui0) {
        return (duob)gui0.a();
    }

    private final duog L() {
        return (duog)this.ak.a();
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        Bundle bundle0 = this.getArguments();
        String s = bundle0 == null ? null : bundle0.getString("mdoc_provisioning_id");
        if(s == null) {
            throw new IllegalStateException("IdProvisioningStatusFragment do not have provisioningId in argument");
        }
        this.ah = s;
        Bundle bundle1 = this.getArguments();
        gtxf gtxf0 = bundle1 == null ? null : gtxf.b(bundle1.getInt("mdoc_type"));
        if(gtxf0 == null) {
            throw new IllegalStateException("IdProvisioningStatusFragment do not have valid mdoc type in argument");
        }
        this.ai = gtxf0;
        doly doly0 = dolz.a(this);
        dolg dolg0 = this.ap();
        Preconditions.b(dolg0);
        dxed dxed0 = dxee.a(doly0);
        dpsz dpsz0 = dpsw.a(doly0, this.ap());
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        new duml(dolg0, dxed0, dpsz0, domv0).inject(this);
        duog duog0 = this.L();
        String s1 = this.ah;
        if(s1 == null) {
            ibuq.j("provisioningId");
            s1 = null;
        }
        ibuq.f(s1, "provisioningId");
        if(duog0.d == null) {
            duog0.d = s1;
            icbb.b(lsc.a(duog0), null, null, new duod(duog0, null), 3);
            icbb.b(lsc.a(duog0), null, null, new duoe(duog0, null), 3);
        }
        this.getLifecycle().c(this.L());
        this.aj = this.registerForActivityResult(new adt(), new dumz());
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        View view0 = new ComposeView(this.requireContext(), null, 0, 6, null);
        ((ComposeView)view0).a(new gze(0xC0440394, true, new dunt(this)));
        return view0;
    }

    public final void y(boolean z, goz goz0, int v) {
        ftts ftts0;
        goz goz1 = goz0.ao(0x8AC5722E);
        int v1 = (v & 6) == 0 ? (goz1.Y(z) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(this) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            if(z) {
                goz1.M(-150703607);
                fryr fryr0 = new fryr(0x7F152499);  // string:pay_wallet_view_pass "View in Wallet"
                goz1.M(5004770);
                boolean z1 = goz1.Z(this);
                Object object0 = goz1.j();
                if(z1 || object0 == gop.a) {
                    object0 = new dumt(this);
                    goz1.P(object0);
                }
                goz1.x();
                ftts0 = new ftts(fryr0, null, false, null, null, null, 0x42DA1, null, null, ((ibth)object0), 430);
            }
            else {
                goz1.M(0xF70BFD3D);
                fryr fryr1 = new fryr(0x7F1523FD);  // string:pay_wallet_install_wallet "Install Wallet"
                fryh fryh0 = new fryh(0x7F080558);  // drawable:gs_download_vd_theme_24
                goz1.M(5004770);
                boolean z2 = goz1.Z(this);
                Object object1 = goz1.j();
                if(z2 || object1 == gop.a) {
                    object1 = new dumu(this);
                    goz1.P(object1);
                }
                goz1.x();
                ftts0 = new ftts(fryr1, null, false, null, fryh0, null, 0x42D9F, null, null, ((ibth)object1), 430);
            }
            goz1.x();
            ftuu.a(null, new ftuw(ftts0, null, false, null, null, null, null, true, 0x7E), goz1, 0x40, 1);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dumv(this, z, v);
        }
    }

    public final void z(goz goz0, int v) {
        goz goz1 = goz0.ao(-601155253);
        int v1 = (v & 6) == 0 ? (goz1.Z(this) ? 4 : 2) | v : v;
        if((v1 & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            gui gui0 = ltd.c(this.L().a.a, this.L().a(), goz1);
            int v2 = duoa.K(gui0).a.ordinal();
            switch(v2) {
                case 0: {
                    goz1.M(0x7DCA0E85);
                    this.J(null, duoa.K(gui0), goz1, v1 << 6 & 0x380);
                    goz1.x();
                    break;
                }
                case 1: {
                    goz1.M(2110396385);
                    this.B(goz1, v1 & 14);
                    goz1.x();
                    break;
                }
                case 2: {
                    goz1.M(0x7DCA20C6);
                    this.G(null, duoa.K(gui0), goz1, v1 << 6 & 0x380);
                    goz1.x();
                    break;
                }
                default: {
                    if(v2 == 3) {
                        goz1.M(2110401220);
                        this.D(goz1, v1 & 14);
                        goz1.x();
                        break;
                    }
                    goz1.M(0x7DCA074F);
                    goz1.x();
                    throw new ibnq();
                }
            }
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dumy(this, v);
        }
    }
}

