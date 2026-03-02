import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

final class buoo implements ibtw {
    final bupw a;
    final bupl b;
    final tyb c;
    final ibts d;
    final ibts e;

    public buoo(bupw bupw0, bupl bupl0, tyb tyb0, ibts ibts0, ibts ibts1) {
        this.a = bupw0;
        this.b = bupl0;
        this.c = tyb0;
        this.d = ibts0;
        this.e = ibts1;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        hey hey1;
        ibtw ibtw3;
        ibts ibts2;
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        bboh bboh0 = bupl.a;
        ((ggtj)bboh0.h()).x("Rendering Landing page");
        Context context0 = (Context)((goz)object0).h(AndroidCompositionLocals_androidKt.b);
        cvq cvq0 = cvf.d(0, ((goz)object0), 0, 1);
        bupw bupw0 = this.a;
        gui gui0 = gtr.a(bupw0.d, ((goz)object0));
        gui gui1 = gtr.a(bupw0.g, ((goz)object0));
        Boolean boolean0 = Boolean.valueOf(true);
        boolean z = ibuq.m(buoo.c(gui1), boolean0);
        ((goz)object0).M(5004770);
        boolean z1 = ((goz)object0).Z(bupw0);
        Object object2 = ((goz)object0).k();
        if(z1 || object2 == gop.a) {
            object2 = new buoj(bupw0);
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        exw exw0 = exy.a(z, ((ibth)object2), ((goz)object0));
        hey hey0 = hfc.e;
        hfc hfc0 = dls.v(exp.a(hey0, exw0, ibuq.m(buoo.c(gui1), Boolean.valueOf(false))));
        bupl bupl0 = this.b;
        tyb tyb0 = this.c;
        ibts ibts0 = this.d;
        ibts ibts1 = this.e;
        iau iau0 = dhw.a(hei.a, false);
        int v = buoi.a(gol.c(((goz)object0)));
        gzk gzk0 = ((goz)object0).ap();
        hfc hfc1 = hew.c(((goz)object0), hfc0);
        ibth ibth0 = iej.a;
        ((goz)object0).O();
        if(((goz)object0).ab()) {
            ((goz)object0).t(ibth0);
        }
        else {
            ((goz)object0).T();
        }
        ibtw ibtw0 = iej.e;
        guo.b(((goz)object0), iau0, ibtw0);
        ibtw ibtw1 = iej.d;
        guo.b(((goz)object0), gzk0, ibtw1);
        ibtw ibtw2 = iej.f;
        if(((goz)object0).ab()) {
            ibts2 = ibts1;
            ibtw3 = ibtw1;
        label_48:
            Integer integer0 = v;
            ((goz)object0).R(integer0);
            ((goz)object0).p(integer0, ibtw2);
        }
        else {
            ibts2 = ibts1;
            ibtw3 = ibtw1;
            if(!ibuq.m(((goz)object0).k(), Integer.valueOf(v))) {
                goto label_48;
            }
        }
        guo.a(((goz)object0), iej.g);
        guo.b(((goz)object0), hfc1, iej.c);
        boolean z2 = ibuq.m(buoo.c(gui1), boolean0);
        hfc hfc2 = dls.k(hey0, 50.0f);
        hfc hfc3 = dic.a.a(hfc2, hei.b);
        goz goz0 = (goz)object0;
        ibts ibts3 = iej.g;
        dic dic0 = dic.a;
        ibtw ibtw4 = iej.c;
        exk.b(z2, exw0, hfc3, 0L, 0L, goz0, 0x40);
        hfc hfc4 = cvf.c(dls.v(hey0), cvq0);
        iau iau1 = dii.a(dho.e, hei.n, goz0, 54);
        int v1 = buoi.a(gol.c(goz0));
        gzk gzk1 = goz0.ap();
        hfc hfc5 = hew.c(goz0, hfc4);
        goz0.O();
        if(goz0.ab()) {
            goz0.t(ibth0);
        }
        else {
            goz0.T();
        }
        guo.b(goz0, iau1, ibtw0);
        guo.b(goz0, gzk1, ibtw3);
        if(goz0.ab() || !ibuq.m(goz0.k(), Integer.valueOf(v1))) {
            Integer integer1 = v1;
            goz0.R(integer1);
            goz0.p(integer1, ibtw2);
        }
        guo.a(goz0, ibts3);
        guo.b(goz0, hfc5, ibtw4);
        if((buoo.b(gui0) instanceof bupp)) {
            goz0.M(0xF33EDE55);
            bupq bupq0 = buoo.b(gui0);
            ibuq.d(bupq0, "null cannot be cast to non-null type com.google.android.gms.googleone.smui.landing.LandingPageViewModel.RpcState.Success");
            hivr hivr0 = ((bupp)bupq0).a;
            hivx hivx0 = ((bupp)bupq0).b;
            if((hivr0.b & 0x20) == 0) {
                goz0.M(0xF348DD0B);
                bupl0.C(hivr0, hivx0, tyb0, ibts0, ibts2, goz0, 0);
                goz0 = goz0;
            }
            else {
                goz0.M(0xF342B141);
                ibom ibom0 = ibom.a;
                goz0.M(5004770);
                boolean z3 = goz0.Z(bupl0);
                Object object3 = goz0.k();
                if(z3 || object3 == gop.a) {
                    object3 = new buom(bupl0, null);
                    goz0.R(object3);
                }
                goz0.A();
                gqe.f(ibom0, ((ibtw)object3), goz0);
                goz0.M(5004770);
                boolean z4 = goz0.Z(context0);
                Object object4 = goz0.k();
                if(z4 || object4 == gop.a) {
                    object4 = new buok(context0);
                    goz0.R(object4);
                }
                goz0.A();
                hfc hfc6 = iqn.a(dls.v(hey0), "IneligibleView");
                goz0.M(5004770);
                boolean z5 = goz0.X(hivr0);
                Object object5 = goz0.k();
                if(z5 || object5 == gop.a) {
                    object5 = new buol(hivr0);
                    goz0.R(object5);
                }
                goz0.A();
                jnl.b(((ibts)object4), hfc6, ((ibts)object5), goz0, 0x30, 0);
            }
            goz0.A();
            goz0.A();
            hey1 = hey0;
        }
        else {
            if((buoo.b(gui0) instanceof bupn)) {
                goz0.M(-213005144);
                bupq bupq1 = buoo.b(gui0);
                ibuq.d(bupq1, "null cannot be cast to non-null type com.google.android.gms.googleone.smui.landing.LandingPageViewModel.RpcState.Error");
                ((ggtj)((ggtj)bboh0.h()).s(((bupn)bupq1).a)).x("Rendering Error State");
                ibom ibom1 = ibom.a;
                goz0.M(5004770);
                boolean z6 = goz0.Z(bupl0);
                Object object6 = goz0.k();
                if(z6 || object6 == gop.a) {
                    object6 = new buon(bupl0, null);
                    goz0.R(object6);
                }
                goz0.A();
                gqe.f(ibom1, ((ibtw)object6), goz0);
                hey1 = hey0;
                gdh.b(isq.c(0x7F152F81, goz0), iqn.a(hey0, "ErrorText"), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, goz0, 0x30, 0, 0x3FFFC);  // string:subscriptions_data_failed_to_load "Couldn\'t load data"
                goz0 = goz0;
            }
            else {
                hey1 = hey0;
                goz0.M(-212560201);
            }
            goz0.A();
        }
        goz0.z();
        goz0.M(0xB75E10C1);
        if((buoo.b(gui0) instanceof bupo)) {
            fitn.a(dic0.a(dls.k(hey1, 50.0f), hei.e), 0L, 0.0f, 0L, 0, 0.0f, goz0, 0, 62);
            goz0 = goz0;
        }
        goz0.A();
        goz0.z();
        return ibom.a;
    }

    private static final bupq b(gui gui0) {
        return (bupq)gui0.a();
    }

    private static final Boolean c(gui gui0) {
        return (Boolean)gui0.a();
    }
}

