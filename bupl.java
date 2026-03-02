import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;

public final class bupl extends buqb {
    public static final bboh a;
    public tyb ag;
    public buje ah;
    public cmhi ai;
    public buqq aj;
    public acp ak;
    private final ibnn al;
    public ccmg b;
    public bujj c;
    public bujp d;

    static {
        bupl.a = bboh.b("LandingPage", bbcu.hd);
    }

    public bupl() {
        buph buph0 = new buph(new bupg(this));
        ibnn ibnn0 = ibno.a(ibnp.c, buph0);
        ibuk ibuk0 = new ibuk(bupw.class);
        bupi bupi0 = new bupi(ibnn0);
        bupj bupj0 = new bupj(ibnn0);
        this.al = new lsd(ibuk0, bupi0, new bupk(this, ibnn0), bupj0);
    }

    public final bupw A() {
        return (bupw)this.al.a();
    }

    public final buqq B() {
        buqq buqq0 = this.aj;
        if(buqq0 != null) {
            return buqq0;
        }
        ibuq.j("cuiLogger");
        return null;
    }

    public final void C(hivr hivr0, hivx hivx0, tyb tyb0, ibts ibts0, ibts ibts1, goz goz0, int v) {
        Context context1;
        Object object7;
        ibts ibts3;
        goz goz2;
        ibts ibts2;
        tyb tyb1;
        hivr hivr1;
        bupl bupl0;
        ibuq.f(hivr0, "landingPageResponse");
        ibuq.f(hivx0, "storageManagerSignalResponse");
        ibuq.f(tyb0, "glideRequestManager");
        ibuq.f(ibts0, "onSuggestedItemsViewClicked");
        ibuq.f(ibts1, "onCleanupByServiceClicked");
        goz goz1 = goz0.ao(0x14D83EB4);
        int v1 = (v & 6) == 0 ? (goz1.X(hivr0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(hivx0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(tyb0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.Z(ibts1) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (goz1.Z(this) ? 0x20000 : 0x10000);
        }
        if((74899 & v1) == 74898 && goz1.ac()) {
            goz1.G();
            bupl0 = this;
            hivr1 = hivr0;
            tyb1 = tyb0;
            ibts2 = ibts0;
            goz2 = goz1;
            ibts3 = ibts1;
            goto label_173;
        }
        else {
            Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
            Object object0 = goz1.h(AndroidCompositionLocals_androidKt.b);
            goz1.M(1069782406);
            if(((object0 instanceof xob) ? ((xob)object0) : null) == null) {
                ((ggtj)bupl.a.j()).x("activity is not a chimera activity");
                ibom ibom0 = ibom.a;
                goz1.M(5004770);
                boolean z = goz1.Z(this);
                Object object1 = goz1.j();
                if(z || object1 == gop.a) {
                    object1 = new buoq(this, null);
                    goz1.P(object1);
                }
                goz1.x();
                gqe.f(ibom0, ((ibtw)object1), goz1);
                goz1.x();
                gsb gsb0 = goz1.af();
                if(gsb0 != null) {
                    gsb0.d = new buoc(this, hivr0, hivx0, tyb0, ibts0, ibts1, v);
                }
            }
            else {
                bupl0 = this;
                goz1.x();
                ibom ibom1 = ibom.a;
                goz1.M(5004770);
                boolean z1 = goz1.Z(bupl0);
                Object object2 = goz1.j();
                if(z1 || object2 == gop.a) {
                    object2 = new buor(bupl0, null);
                    goz1.P(object2);
                }
                goz1.x();
                gqe.f(ibom1, ((ibtw)object2), goz1);
                hey hey0 = hfc.e;
                hfc hfc0 = iqn.a(dla.j(hey0, 16.0f, 0.0f, 16.0f, 0.0f, 10), "StorageMeterContainer");
                goz1.N(1765406104);
                lmi lmi0 = lmm.a(goz1);
                Bundle bundle0 = Bundle.EMPTY;
                goz1.N(0x6E3C21FE);
                Object object3 = goz1.j();
                Object object4 = gop.a;
                if(object3 == object4) {
                    object3 = buop.a;
                    goz1.P(object3);
                }
                goz1.x();
                lmf.a(buqh.class, hfc0, lmi0, bundle0, ((ibts)object3), goz1, 0x30, 0);
                goz1.x();
                goz1.M(1069798804);
                if(hivx0.c) {
                    goz1.M(5004770);
                    boolean z2 = goz1.Z(context0);
                    Object object5 = goz1.j();
                    if(z2 || object5 == object4) {
                        object5 = new buof(context0);
                        goz1.P(object5);
                    }
                    goz1.x();
                    hfc hfc1 = iqn.a(dla.j(dls.w(hey0), 16.0f, 32.0f, 16.0f, 0.0f, 8), "UpsellCardView");
                    goz1.M(-1633490746);
                    int v2 = ((v1 & 0x70) == 0x20 ? 1 : 0) | goz1.Z(bupl0);
                    Object object6 = goz1.j();
                    if(v2 != 0 || object6 == object4) {
                        object6 = new buog(hivx0, bupl0);
                        goz1.P(object6);
                    }
                    goz1.x();
                    object7 = object4;
                    goz2 = goz1;
                    tyb1 = tyb0;
                    ibts2 = ibts0;
                    ibts3 = ibts1;
                    context1 = context0;
                    hivr1 = hivr0;
                    jnl.b(((ibts)object5), hfc1, ((ibts)object6), goz2, 0, 0);
                }
                else {
                    hivr1 = hivr0;
                    tyb1 = tyb0;
                    ibts2 = ibts0;
                    context1 = context0;
                    object7 = object4;
                    goz2 = goz1;
                    ibts3 = ibts1;
                }
                goz2.x();
                goz2.M(5004770);
                boolean z3 = goz2.Z(context1);
                Object object8 = goz2.j();
                if(z3 || object8 == object7) {
                    object8 = new buoh(context1);
                    goz2.P(object8);
                }
                goz2.x();
                hfc hfc2 = iqn.a(dla.j(dls.w(hey0), 0.0f, 40.0f, 16.0f, 0.0f, 9), "SuggestedItemsView");
                goz2.M(0x97EA02AA);
                int v3 = (v1 & 14) == 4 ? 1 : 0;
                int v4 = v3 | goz2.Z(tyb1);
                Object object9 = goz2.j();
                if((v4 | ((v1 & 0x1C00) == 0x800 ? 1 : 0)) != 0 || object9 == object7) {
                    object9 = new bunp(hivr1, tyb1, ibts2);
                    goz2.P(object9);
                }
                goz2.x();
                jnl.b(((ibts)object8), hfc2, ((ibts)object9), goz2, 0x30, 0);
                goz2.M(5004770);
                boolean z4 = goz2.Z(context1);
                Object object10 = goz2.j();
                if(z4 || object10 == object7) {
                    object10 = new bunq(context1);
                    goz2.P(object10);
                }
                goz2.x();
                hfc hfc3 = iqn.a(dla.j(dls.w(hey0), 16.0f, 56.0f, 16.0f, 0.0f, 8), "CleanupByServiceView");
                goz2.M(0x97EA02AA);
                int v5 = v3 | goz2.Z(tyb1);
                int v6 = (v1 & 0xE000) == 0x4000 ? 1 : 0;
                Object object11 = goz2.j();
                if((v5 | v6) != 0 || object11 == object7) {
                    object11 = new bunr(hivr1, tyb1, ibts3);
                    goz2.P(object11);
                }
                goz2.x();
                jnl.b(((ibts)object10), hfc3, ((ibts)object11), goz2, 0, 0);
                goz2.M(0x3FC4A479);
                if((hivr1.b & 4) != 0 && (hivr1.e == null ? hiup.a : hivr1.e).b.size() > 0) {
                    goz2.M(5004770);
                    boolean z5 = goz2.Z(context1);
                    Object object12 = goz2.j();
                    if(z5 || object12 == object7) {
                        object12 = new buns(context1);
                        goz2.P(object12);
                    }
                    goz2.x();
                    hfc hfc4 = iqn.a(dla.j(dls.w(hey0), 16.0f, 56.0f, 16.0f, 0.0f, 8), "CleanupByOthersView");
                    goz2.M(0x97EA02AA);
                    int v7 = v3 | goz2.Z(tyb1);
                    Object object13 = goz2.j();
                    if((v7 | v6) != 0 || object13 == object7) {
                        object13 = new bunt(hivr1, tyb1, ibts3);
                        goz2.P(object13);
                    }
                    goz2.x();
                    jnl.b(((ibts)object12), hfc4, ((ibts)object13), goz2, 0, 0);
                }
                goz2.x();
                goz2.M(5004770);
                boolean z6 = goz2.Z(context1);
                Object object14 = goz2.j();
                if(z6 || object14 == object7) {
                    object14 = new bunu(context1);
                    goz2.P(object14);
                }
                goz2.x();
                hfc hfc5 = iqn.a(dla.f(dls.w(hey0), 16.0f, 56.0f, 16.0f, 64.0f), "CleanupYourDeviceView");
                goz2.M(-1633490746);
                int v8 = v3 | goz2.Z(tyb1);
                Object object15 = goz2.j();
                if(v8 != 0 || object15 == object7) {
                    object15 = new buod(hivr1, tyb1);
                    goz2.P(object15);
                }
                goz2.x();
                jnl.b(((ibts)object14), hfc5, ((ibts)object15), goz2, 0, 0);
            label_173:
                gsb gsb1 = goz2.af();
                if(gsb1 != null) {
                    gsb1.d = new buoe(bupl0, hivr1, hivx0, tyb1, ibts2, ibts3, v);
                }
            }
        }
    }

    public final void D(tyb tyb0, ibts ibts0, ibts ibts1, ibth ibth0, bupw bupw0, goz goz0, int v) {
        bupw bupw2;
        int v2;
        goz goz2;
        bupw bupw1;
        ibuq.f(tyb0, "glideRequestManager");
        ibuq.f(ibts0, "onSuggestedItemsViewClicked");
        ibuq.f(ibts1, "onCleanupByServiceClicked");
        ibuq.f(ibth0, "onBackPressed");
        goz goz1 = goz0.ao(0xDA4F53FC);
        int v1 = (v & 6) == 0 ? (goz1.Z(tyb0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibts1) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= 0x2000;
        }
        if((0x30000 & v) == 0) {
            v1 |= (goz1.Z(this) ? 0x20000 : 0x10000);
        }
        if((74899 & v1) == 74898 && goz1.ac()) {
            goz1.G();
            bupw1 = bupw0;
            goz2 = goz1;
        }
        else {
            goz1.I();
            if((v & 1) != 0 && !goz1.aa()) {
                v2 = v1 & 0xFFFF1FFF;
                goz1.G();
                bupw2 = bupw0;
            }
            else {
                lsq lsq0 = lud.b(goz1);
                if(lsq0 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                v2 = v1 & 0xFFFF1FFF;
                ltx ltx0 = (lsq0 instanceof loz) ? ((loz)lsq0).getDefaultViewModelCreationExtras() : ltv.a;
                bupw2 = (bupw)lue.a(new ibuk(bupw.class), lsq0, null, null, ltx0);
            }
            goz1.w();
            goz2 = goz1;
            this.E(tyb0, ibth0, null, gzf.e(0xEFC8E94F, new buoo(bupw2, this, tyb0, ibts0, ibts1), goz1), goz2, v2 & 14 | 0xC00 | v2 >> 6 & 0x70 | 0xE000 & v2 >> 3);
            bupw1 = bupw2;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bunv(this, tyb0, ibts0, ibts1, ibth0, bupw1, v);
        }
    }

    public final void E(tyb tyb0, ibth ibth0, bupw bupw0, ibtw ibtw0, goz goz0, int v) {
        bupw bupw2;
        goz goz2;
        bupw bupw1;
        ibuq.f(tyb0, "glideRequestManager");
        ibuq.f(ibth0, "onBackPressed");
        ibuq.f(ibtw0, "content");
        goz goz1 = goz0.ao(1303721678);
        int v1 = (v & 6) == 0 ? (goz1.Z(tyb0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= 0x80;
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibtw0) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
            bupw1 = bupw0;
            goz2 = goz1;
        }
        else {
            goz1.I();
            if((v & 1) != 0 && !goz1.aa()) {
                goz1.G();
                bupw2 = bupw0;
            }
            else {
                lsq lsq0 = lud.b(goz1);
                if(lsq0 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ltx ltx0 = (lsq0 instanceof loz) ? ((loz)lsq0).getDefaultViewModelCreationExtras() : ltv.a;
                bupw2 = (bupw)lue.a(new ibuk(bupw.class), lsq0, null, null, ltx0);
            }
            goz1.w();
            goz2 = goz1;
            fits.a(null, gzf.e(-1427695990, new buox(ibth0, ((Context)goz1.h(AndroidCompositionLocals_androidKt.b)), tyb0, gtr.a(bupw2.f, goz1)), goz1), null, null, null, 0, 0L, 0L, null, gzf.e(0xF7AB4E1F, new buoy(ibtw0), goz1), goz2, 0x30000030, 509);
            bupw1 = bupw2;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new buny(this, tyb0, ibth0, bupw1, ibtw0, v);
        }
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        int v;
        super.onCreate(bundle0);
        this.ak = this.registerForActivityResult(new adt(), new bunw(this));
        buqq buqq0 = this.B();
        ibuq.f(hjbx.f, "currentView");
        ibuq.f(hgeg.by, "interactionType");
        buca buca0 = buqq0.b.a(hjbx.f, hgeg.by, "", buqq0.a.a);
        buca0.b(this.z().a());
        bujp bujp0 = this.z();
        try {
            v = hite.b(bujp0.b);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            ((ggtj)((ggtj)bujp.a.j()).s(illegalArgumentException0)).B("Failed to convert onramp ID %s", bujp0.b);
            v = 0x3AF;
        }
        ProtoLiteBuilder hftp0 = buca0.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hjbv hjbv0 = (hjbv)hftp0.b_message;
        if(v == 1) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        hjbv0.j = v - 2;
        hjbv0.b |= 0x1000;
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        View view0 = new ComposeView(this.requireContext(), null, 0, 6, null);
        ((ComposeView)view0).a(new gze(0xB2CDB1B8, true, new bupf(this)));
        return view0;
    }

    public final buje y() {
        buje buje0 = this.ah;
        if(buje0 != null) {
            return buje0;
        }
        ibuq.j("pageNavigator");
        return null;
    }

    public final bujp z() {
        bujp bujp0 = this.d;
        if(bujp0 != null) {
            return bujp0;
        }
        ibuq.j("acquisitionInfo");
        return null;
    }
}

