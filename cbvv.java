import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Base64;
import android.view.View;
import java.util.List;

public final class cbvv extends cbhk {
    private static final bboh a;
    private final ibnn b;
    private final ibnn c;
    private fzbf d;

    static {
        cbvv.a = bboh.b("OnboardingWebViewViewModel", bbcu.ac);
    }

    public cbvv() {
        cbvr cbvr0 = new cbvr(new cbvn(this));
        ibnn ibnn0 = ibno.a(ibnp.c, cbvr0);
        ibuk ibuk0 = new ibuk(cbvj.class);
        cbvs cbvs0 = new cbvs(ibnn0);
        cbvt cbvt0 = new cbvt(ibnn0);
        this.b = new lsd(ibuk0, cbvs0, new cbvu(this, ibnn0), cbvt0);
        this.c = new ibnz(new cbvo(this));
    }

    @Override  // cbhk
    protected final List A() {
        List list0 = hukq.a.b().a().b;
        ibuq.e(list0, "getElementList(...)");
        return list0;
    }

    @Override  // cbhk
    public final void F() {
        this.ah(0);
    }

    @Override  // cbhk
    public final void H() {
        Uri.Builder uri$Builder0 = Uri.parse((hukq.a.b().e() ? hukq.a.b().c() : hukq.a.b().b())).buildUpon().path(hukq.a.b().d()).appendQueryParameter("session_id", this.y().a());
        String s = xoc.b(this).getIntent().getStringExtra("deviceId");
        if(s != null) {
            uri$Builder0.appendQueryParameter("deviceId", s);
        }
        String s1 = xoc.b(this).getIntent().getStringExtra("kolToken");
        if(s1 != null) {
            uri$Builder0.appendQueryParameter("kolToken", s1);
        }
        Context context0 = this.requireContext();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqkp.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gvmp.a).v_newBuilder();
        ibuq.f(hftp1, "builder");
        long v = bbmq.f(context0);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gvmp gvmp0 = (gvmp)hftp1.b_message;
        int v1 = 1;
        gvmp0.b = 1;
        gvmp0.c = v;
        ProtoLiteMessage hftv0 = hftp1.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gvmp)hftv0), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqkp gqkp0 = (gqkp)hftp0.b_message;
        ((gvmp)hftv0).getClass();
        gqkp0.c = (gvmp)hftv0;
        gqkp0.b |= 1;
        if(cbvw.a(context0) == null) {
            gqkq.a(gqko.b, hftp0);
        }
        else {
            gqkq.a(gqko.c, hftp0);
            PackageInfo packageInfo0 = cbvw.a(context0);
            long v2 = packageInfo0 == null ? 0L : packageInfo0.getLongVersionCode();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gqkp gqkp1 = (gqkp)hftp0.b_message;
            gqkp1.b |= 2;
            gqkp1.d = v2;
        }
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        String s2 = Base64.encodeToString(((gqkp)hftv1).toBytesArray(), 11);
        ibuq.e(s2, "encodeToString(...)");
        uri$Builder0.appendQueryParameter("familyLinkEntryData", s2);
        String s3 = xoc.b(this).getIntent().getStringExtra("colorTheme");
        if(ibuq.m(s3, "dark")) {
            v1 = 2;
        }
        else if(!ibuq.m(s3, "light")) {
            v1 = 0;
        }
        cbgh cbgh0 = cbgg.a(this.requireContext());
        ibuq.c(uri$Builder0);
        cbgh.b(cbgh0, uri$Builder0, v1, 4);
        ((ggtj)cbvv.a.h()).B("Starting onboarding flow with URI: [%s]", uri$Builder0);
        Uri uri0 = uri$Builder0.build();
        ibuq.e(uri0, "build(...)");
        this.al(uri0);
    }

    @Override  // cbhk
    protected final cbir R() {
        return (cbir)this.c.a();
    }

    @Override  // cbhk
    public final void Y(String s, int v, int v1) {
        ibuq.f(s, "title");
        fzbf fzbf0 = this.d;
        if(fzbf0 != null) {
            fzbf0.dismiss();
        }
        fzbe fzbe0 = new fzbe();
        fzbe0.d = 0x7F160DD8;  // style:ThemeOverlay.GoogleMaterial3.MaterialTimePicker
        fzbe0.c = s;
        fzbe0.b();
        fzbe0.a(v);
        fzbe0.c(v1);
        fzbe0.d(((int)DateFormat.is24HourFormat(xoc.b(this))));
        fzbf fzbf1 = fzbf.A(fzbe0);
        fzbf1.E(new cbvk(this, fzbf1));
        fzbf1.C(new cbvl(this));
        fzbf1.D(new cbvm(this));
        this.d = fzbf1;
        fzbf1.show(xoc.b(this).getSupportFragmentManager(), "time_picker");
    }

    @Override  // cbhk
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        super.onViewCreated(view0, bundle0);
        cbjb cbjb0 = new cbjb(new cbvp(this));
        super.ar(gvlr.c, cbjb0);
        Integer integer0 = (int)0x7F160DD8;  // style:ThemeOverlay.GoogleMaterial3.MaterialTimePicker
        cbjf cbjf0 = new cbjf(xoc.b(this), integer0);
        super.ar(gvlr.e, cbjf0);
        cbjg cbjg0 = new cbjg(xoc.b(this), integer0);
        super.ar(gvlr.f, cbjg0);
        cbjh cbjh0 = new cbjh(new cbvq(this));
        super.ar(gvlr.d, cbjh0);
        if(bundle0 == null) {
            cbir cbir0 = this.R();
            if(cbir0 != null) {
                cbir0.b();
            }
        }
        else {
            du du0 = xoc.b(this).getSupportFragmentManager().h("time_picker");
            if(du0 != null) {
                ca ca0 = new ca(xoc.b(this).getSupportFragmentManager());
                ca0.o(du0);
                ca0.b();
            }
        }
    }

    public final cbvj y() {
        return (cbvj)this.b.a();
    }

    @Override  // cbhk
    public final String z() {
        return xoc.b(this).getIntent().getStringExtra("accountName");
    }
}

