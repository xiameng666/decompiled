import android.content.Context;
import android.content.ContextWrapper;
import android.webkit.WebView;

final class butg implements ibtw {
    final buty a;
    final butr b;
    final Context c;
    final xob d;

    public butg(buty buty0, butr butr0, Context context0, xob xob0) {
        this.a = buty0;
        this.b = butr0;
        this.c = context0;
        this.d = xob0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        dic dic1;
        hey hey1;
        Object object6;
        exw exw1;
        xob xob1;
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        bboh bboh0 = butr.a;
        ((ggtj)bboh0.h()).x("Rendering web view");
        cvq cvq0 = cvf.d(0, ((goz)object0), 0, 1);
        ((goz)object0).M(0x6E3C21FE);
        Context context0 = this.c;
        Object object2 = ((goz)object0).k();
        Object object3 = gop.a;
        if(object2 == object3) {
            object2 = new WebView(new ContextWrapper(context0));
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        buty buty0 = this.a;
        gui gui0 = gtr.a(buty0.d, ((goz)object0));
        gui gui1 = gtr.a(buty0.e, ((goz)object0));
        boolean z = csd.a(((goz)object0));
        Boolean boolean0 = Boolean.valueOf(true);
        boolean z1 = ibuq.m(butg.c(gui1), boolean0);
        ((goz)object0).M(0x97EA02AA);
        int v = ((goz)object0).Z(buty0);
        butr butr0 = this.b;
        int v1 = v | ((goz)object0).Z(butr0) | ((goz)object0).Y(z);
        Object object4 = ((goz)object0).k();
        if(v1 != 0 || object4 == object3) {
            object4 = new butd(buty0, butr0, z);
            ((goz)object0).R(object4);
        }
        ((goz)object0).A();
        exw exw0 = exy.a(z1, ((ibth)object4), ((goz)object0));
        hey hey0 = hfc.e;
        hfc hfc0 = dls.v(exp.a(hey0, exw0, ibuq.m(butg.c(gui1), Boolean.valueOf(false))));
        xob xob0 = this.d;
        hel hel0 = hei.a;
        iau iau0 = dhw.a(hel0, false);
        int v2 = butc.a(gol.c(((goz)object0)));
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
            xob1 = xob0;
            exw1 = exw0;
        label_56:
            Integer integer0 = v2;
            ((goz)object0).R(integer0);
            ((goz)object0).p(integer0, ibtw2);
        }
        else {
            xob1 = xob0;
            exw1 = exw0;
            if(!ibuq.m(((goz)object0).k(), Integer.valueOf(v2))) {
                goto label_56;
            }
        }
        guo.a(((goz)object0), iej.g);
        guo.b(((goz)object0), hfc1, iej.c);
        boolean z2 = ibuq.m(butg.c(gui1), boolean0);
        hfc hfc2 = dls.k(hey0, 50.0f);
        hfc hfc3 = dic.a.a(hfc2, hei.b);
        goz goz0 = (goz)object0;
        dic dic0 = dic.a;
        ibts ibts0 = iej.g;
        ibtw ibtw3 = iej.c;
        exk.b(z2, exw1, hfc3, 0L, 0L, goz0, 0x40);
        if((butg.b(gui0) instanceof butv)) {
            goz0.M(583951044);
            butw butw0 = butg.b(gui0);
            ibuq.d(butw0, "null cannot be cast to non-null type com.google.android.gms.googleone.smui.webview.WebViewViewModel.WebViewUrlState.Ready");
            String s = ((butv)butw0).a;
            hfc hfc4 = dls.v(hey0);
            iau iau1 = dhw.a(hel0, false);
            int v3 = butc.a(gol.c(goz0));
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
            guo.b(goz0, gzk1, ibtw1);
            if(goz0.ab() || !ibuq.m(goz0.k(), Integer.valueOf(v3))) {
                Integer integer1 = v3;
                goz0.R(integer1);
                goz0.p(integer1, ibtw2);
            }
            guo.a(goz0, ibts0);
            guo.b(goz0, hfc5, ibtw3);
            hfc hfc6 = iqn.a(dls.v(hey0), "ReadyScreen");
            goz0.M(0x97EA02AA);
            int v4 = goz0.Z(((WebView)object2)) | goz0.Z(xob1) | goz0.X(s);
            Object object5 = goz0.k();
            if(v4 == 0) {
                object6 = object3;
                if(object5 == object6) {
                    object5 = new bute(((WebView)object2), xob1, s);
                    goz0.R(object5);
                }
            }
            else {
                object6 = object3;
                object5 = new bute(((WebView)object2), xob1, s);
                goz0.R(object5);
            }
            goz0.A();
            goz0.M(0x6E3C21FE);
            Object object7 = goz0.k();
            if(object7 == object6) {
                object7 = new butf();
                goz0.R(object7);
            }
            goz0.A();
            jnl.b(((ibts)object5), hfc6, ((ibts)object7), goz0, 0x1B0, 0);
            goz0.z();
            goz0.A();
            hey1 = hey0;
            dic1 = dic0;
        }
        else {
            if((butg.b(gui0) instanceof butt)) {
                goz0.M(0x22E152C1);
                butw butw1 = butg.b(gui0);
                ibuq.d(butw1, "null cannot be cast to non-null type com.google.android.gms.googleone.smui.webview.WebViewViewModel.WebViewUrlState.Error");
                ((ggtj)((ggtj)bboh0.j()).s(((butt)butw1).a)).x("Failed to load web view");
                hfc hfc7 = cvf.c(dls.v(hey0), cvq0);
                iau iau2 = dii.a(dho.e, hei.n, goz0, 54);
                int v5 = butc.a(gol.c(goz0));
                gzk gzk2 = goz0.ap();
                hfc hfc8 = hew.c(goz0, hfc7);
                goz0.O();
                if(goz0.ab()) {
                    goz0.t(ibth0);
                }
                else {
                    goz0.T();
                }
                guo.b(goz0, iau2, ibtw0);
                guo.b(goz0, gzk2, ibtw1);
                if(goz0.ab() || !ibuq.m(goz0.k(), Integer.valueOf(v5))) {
                    Integer integer2 = v5;
                    goz0.R(integer2);
                    goz0.p(integer2, ibtw2);
                }
                guo.a(goz0, ibts0);
                guo.b(goz0, hfc8, ibtw3);
                hfc hfc9 = dls.v(hey0);
                iau iau3 = dhw.a(hel0, false);
                int v6 = butc.a(gol.c(goz0));
                gzk gzk3 = goz0.ap();
                hfc hfc10 = hew.c(goz0, hfc9);
                goz0.O();
                if(goz0.ab()) {
                    goz0.t(ibth0);
                }
                else {
                    goz0.T();
                }
                guo.b(goz0, iau3, ibtw0);
                guo.b(goz0, gzk3, ibtw1);
                if(goz0.ab() || !ibuq.m(goz0.k(), Integer.valueOf(v6))) {
                    Integer integer3 = v6;
                    goz0.R(integer3);
                    goz0.p(integer3, ibtw2);
                }
                guo.a(goz0, ibts0);
                guo.b(goz0, hfc10, ibtw3);
                hey1 = hey0;
                dic1 = dic0;
                gdh.b(isq.c(0x7F15366A, goz0), iqn.a(dic0.a(hey0, hei.e), "ErrorText"), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, goz0, 0, 0, 0x3FFFC);  // string:webview_data_failed_to_load "Couldn\'t load data"
                goz0 = goz0;
                goz0.z();
                goz0.z();
            }
            else {
                hey1 = hey0;
                dic1 = dic0;
                goz0.M(585900386);
            }
            goz0.A();
        }
        goz0.M(0xE85A3478);
        if((butg.b(gui0) instanceof butu)) {
            fitn.a(dic1.a(dls.k(hey1, 50.0f), hei.e), 0L, 0.0f, 0L, 0, 0.0f, goz0, 0, 62);
            goz0 = goz0;
        }
        goz0.A();
        goz0.z();
        return ibom.a;
    }

    private static final butw b(gui gui0) {
        return (butw)gui0.a();
    }

    private static final Boolean c(gui gui0) {
        return (Boolean)gui0.a();
    }
}

