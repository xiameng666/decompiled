import android.content.Context;
import java.util.List;

public final class dxnc {
    public final Context a;
    public final dsgr b;
    private final boolean c;
    private final boolean d;

    public dxnc(Context context0, dsgr dsgr0, boolean z, boolean z1) {
        this.a = context0;
        this.b = dsgr0;
        this.c = z;
        this.d = z1;
    }

    public final gucn a(gtlg gtlg0, ftem ftem0, boolean z) {
        gucr gucr1;
        guhl guhl1;
        gucr gucr0;
        guhl guhl0;
        if(z) {
            return dxsy.o();
        }
        gulb gulb0 = gula.a(((ProtoLiteMessage)gucn.a).v_newBuilder());
        gulf gulf0 = gule.a(((gucs)((ProtoLiteMessage)guct.a).v_newBuilder()));
        gulf0.d();
        String s = ftem0.x;
        ibuq.e(s, "getBrandName(...)");
        String s1 = fscd.c(gtlg0);
        if(s.length() == 0) {
            guld guld0 = gulc.a(((ProtoLiteMessage)gucr.a).v_newBuilder());
            guld0.e(gufo.b);
            if(hwev.c()) {
                guhl0 = dsgr.j(dsgr.g(this.a.getString(0x7F151FFB, new Object[]{"<b>", s1, "</b>"}), "Provider will process payment", null, 9), gujx.e, gujx.i);  // string:pay_order_total_with_bold_amount "Payment due: %1$s%2$s%3$s"
            }
            else {
                String s2 = this.a.getString(0x7F151FFA, new Object[]{s1});  // string:pay_order_total "Payment due: %1$s"
                ibuq.e(s2, "getString(...)");
                ibuq.e("Provider will process payment", "getString(...)");
                ibuq.f(s2, "label");
                ibuq.f("Provider will process payment", "content");
                ibuq.f(gujx.e, "labelAppearance");
                ibuq.f(gujx.i, "contentAppearance");
                gulr gulr0 = gulq.a(((guhj)((ProtoLiteMessage)guhl.a).v_newBuilder()));
                ProtoLiteMessage hftv0 = dspl.j(s2, "Provider will process payment").N_build();
                ibuq.e(hftv0, "build(...)");
                gulr0.c(((gunu)hftv0));
                gufn gufn0 = gufm.a(((ProtoLiteMessage)gufy.a).v_newBuilder());
                gufn0.c(gujx.e);
                gufn0.b(gujx.i);
                gulr0.b(gufn0.a());
                guhl0 = gulr0.a();
            }
            guld0.h(guhl0);
            gucr0 = guld0.a();
        }
        else {
            guld guld1 = gulc.a(((ProtoLiteMessage)gucr.a).v_newBuilder());
            guld1.e(gufo.b);
            if(hwev.c()) {
                guhl1 = dsgr.j(dsgr.g(null, null, this.a.getString(0x7F151FFD, new Object[]{s, "<b>", s1, "</b>"}), 7), null, gujx.e);  // string:pay_order_total_with_provider_title_with_bold_amount "Payment to %1$s: %2$s%3$s%4$s"
            }
            else {
                String s3 = this.a.getString(0x7F151FFC, new Object[]{s, s1});  // string:pay_order_total_with_provider_title "Payment to %1$s: %2$s"
                ibuq.e(s3, "getString(...)");
                guhl1 = dsgr.k(s3, gujx.e);
            }
            guld1.h(guhl1);
            gucr0 = guld1.a();
        }
        gulf0.c(gucr0);
        gulf0.d();
        if(hwue.k()) {
            guld guld2 = gulc.a(((ProtoLiteMessage)gucr.a).v_newBuilder());
            gull gull0 = gulk.a(((ProtoLiteMessage)gugc.a).v_newBuilder());
            gulj gulj0 = guli.a(((ProtoLiteMessage)guga.a).v_newBuilder());
            gulj0.b(gugb.b);
            gulj0.e();
            gubf gubf0 = gube.a(((ProtoLiteMessage)gtzc.a).v_newBuilder());
            gumm gumm0 = guml.a(((ProtoLiteMessage)gtzk.a).v_newBuilder());
            gumm0.b(gtzj.i);
            gubf0.e(gumm0.a());
            gtlq gtlq0 = gtlq.b(ftem0.B) == null ? gtlq.a : gtlq.b(ftem0.B);
            ibuq.e(gtlq0, "getImplementationType(...)");
            gubf0.d(dxsy.n(hagt.bb, gtlq0, (ftem0.r == null ? hkug.a : ftem0.r).d));
            gulj0.c(gubf0.a());
            gulj0.d(this.b.b(0x7F150815));  // string:common_continue "Continue"
            gull0.b(gulj0.a());
            guld2.b(gull0.a());
            gucr1 = guld2.a();
        }
        else {
            guld guld3 = gulc.a(((ProtoLiteMessage)gucr.a).v_newBuilder());
            guln guln0 = gulm.a(((ProtoLiteMessage)gugs.a).v_newBuilder());
            guln0.b(gugr.b);
            ibuq.e("Continue", "getString(...)");
            guln0.c(dsgr.l("Continue"));
            guld3.c(guln0.a());
            guld3.r(gufp.b);
            gubf gubf1 = gube.a(((ProtoLiteMessage)gtzc.a).v_newBuilder());
            gumm gumm1 = guml.a(((ProtoLiteMessage)gtzk.a).v_newBuilder());
            gumm1.b(gtzj.w);
            gubf1.e(gumm1.a());
            gtlq gtlq1 = gtlq.b(ftem0.B) == null ? gtlq.a : gtlq.b(ftem0.B);
            ibuq.e(gtlq1, "getImplementationType(...)");
            gubf1.d(dxsy.n(hagt.bb, gtlq1, (ftem0.r == null ? hkug.a : ftem0.r).d));
            guld3.d(gubf1.a());
            gucr1 = guld3.a();
        }
        gulf0.c(gucr1);
        gulb0.b(gulf0.a());
        return gulb0.a();
    }

    public final List b(ftem ftem0) {
        ibuq.e("Review payment", "getString(...)");
        if(this.d && this.c && hwev.c()) {
            return dsgr.m("Review payment", null);
        }
        if((ftem0.b & 0x1000000) != 0 && (ftem0.A == null ? ftfu.a : ftem0.A).c == 0) {
            throw new IllegalArgumentException("SE card art not set in the config.");
        }
        String s = ftem0.v;
        ibuq.e(s, "getCardArtFifeUrl(...)");
        if(s.length() <= 0 && (ftem0.A == null ? ftfu.a : ftem0.A).c == 0) {
            String s1 = ftem0.w;
            ibuq.e(s1, "getLogoFifeUrl(...)");
            return this.b.d(s1, "Review payment", null);
        }
        return dsgr.f(this.b, "Review payment", ftem0.v, (ftem0.A == null ? ftfu.a : ftem0.A).c);
    }

    public static final gucr c(gtlg gtlg0, String s, String s1) {
        guld guld0 = gulc.a(((ProtoLiteMessage)gucr.a).v_newBuilder());
        gulx gulx0 = gulw.a(((ProtoLiteMessage)guia.a).v_newBuilder());
        gulx0.d(dsgr.l(s));
        if(s1 != null) {
            gulx0.c(dsgr.l(s1));
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)guoy.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        String s2 = fscd.c(gtlg0);
        ibuq.e(s2, "toDisplayableString(...)");
        gunw gunw0 = dsgr.l(s2);
        ibuq.f(gunw0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        gunw0.getClass();
        ((guoy)hftv0).c = gunw0;
        ((guoy)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((guoy)hftp0.b_message).f = true;
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        ibuq.f(((guoy)hftv1), "value");
        ProtoLiteBuilder hftp1 = gulx0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((guoy)hftv1).getClass();
        ((guia)hftv2).f = (guoy)hftv1;
        ((guia)hftv2).e = 9;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((guia)hftp1.b_message).l = true;
        guld0.j(gulx0.a());
        return guld0.a();
    }
}

