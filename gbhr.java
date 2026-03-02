import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.nfc.NfcAdapter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;

public final class gbhr implements gbhm {
    private final Context a;
    private final bboh b;
    private final int c;

    public gbhr(Context context0, int v) {
        ibuq.f(context0, "appContext");
        super();
        this.a = context0;
        this.c = v;
        this.b = bboh.a("DynamicSystemDataLoader");
    }

    @Override  // gbhm
    public final int a() {
        return 10;
    }

    @Override  // gbhm
    public final long b() {
        return 0L;
    }

    @Override  // gbhm
    public final Object c() {
        return this.e();
    }

    @Override  // gbhm
    public final void d(Object object0, Object object1) {
        ibuq.f(object0, "setter");
        ((gbhs)object0).C(((gbhq)object1).d.a);
        ((gbhs)object0).E(((gbhq)object1).d.b);
        ((gbhs)object0).j(((gbhq)object1).h);
        ((gbhs)object0).m(((gbhq)object1).a);
        ((gbhs)object0).w(((gbhq)object1).b);
        ((gbhs)object0).y(((gbhq)object1).c);
        ((gbhs)object0).D(((gbhq)object1).e);
        ((gbhs)object0).P(((gbhq)object1).f);
        ((gbhs)object0).S(((gbhq)object1).g);
        int v = this.c;
        if(v != 0) {
            ((gbhs)object0).X(v);
        }
    }

    public final gbhq e() {
        String s3;
        ConnectivityManager connectivityManager0 = (ConnectivityManager)this.a.getSystemService(ConnectivityManager.class);
        Locale locale0 = this.a.getResources().getConfiguration().locale;
        TimeZone timeZone0 = TimeZone.getDefault();
        ibuq.e(timeZone0, "getDefault(...)");
        String s = locale0.toString();
        ibuq.e(s, "toString(...)");
        String s1 = locale0.getCountry();
        ibuq.e(s1, "getCountry(...)");
        String s2 = locale0.getLanguage();
        ibuq.e(s2, "getLanguage(...)");
        boolean z = ActivityManager.isUserAMonkey();
        ArrayList arrayList0 = gcvg.b();
        boolean z1 = gcvl.d(this.a);
        boolean z2 = gcvl.c(this.a);
        boolean z3 = gcvl.g(this.a);
        try {
            s3 = null;
            s3 = locale0.getISO3Language();
        }
        catch(MissingResourceException unused_ex) {
        }
        Context context0 = this.a;
        int v = gcvl.a(context0);
        hhdc hhdc0 = gcvl.b(context0);
        String s4 = TimeZone.getDefault().getDisplayName();
        ibuq.e(s4, "getDisplayName(...)");
        gbho gbho0 = new gbho(s, s1, s2, z, arrayList0, z1, z2, z3, s3, v, hhdc0, s4, ((long)timeZone0.getRawOffset()));
        boolean z4 = gcvl.e();
        String s5 = gcut.b(context0);
        gcvf gcvf0 = gcvg.d(connectivityManager0);
        boolean z5 = connectivityManager0 == null ? false : connectivityManager0.isActiveNetworkMetered();
        String s6 = gcut.c();
        ibuq.e(s6, "getSerial(...)");
        ggdy ggdy0 = new ggdy();
        if(gcut.h(context0)) {
            ggdy0.i(hcix.b);
        }
        if(gcut.f(context0)) {
            ggdy0.i(hcix.d);
        }
        if(gcut.g(context0)) {
            ggdy0.i(hcix.c);
        }
        gged_interceptors gged0 = ggdy0.h();
        ibuq.e(gged0, "build(...)");
        PackageManager packageManager0 = context0.getPackageManager();
        ArrayList arrayList1 = new ArrayList();
        Intent intent0 = new Intent("com.google.android.gms.ocr.ACTION_CARD_CAPTURE");
        intent0.setPackage("com.google.android.gms");
        if(packageManager0.resolveActivity(intent0, 0x10000) != null) {
            arrayList1.add(hcjg.c);
        }
        gaxl.a();
        ibuq.f(context0, "<this>");
        if(NfcAdapter.getDefaultAdapter(context0) != null) {
            arrayList1.add(hcjg.h);
        }
        gaxl.a();
        if(hzmb.j() && bbmq.U(context0, "com.felicanetworks.mfc")) {
            arrayList1.add(hcjg.i);
        }
        gaxl.a();
        if(hzmb.i() && cmcu.b(context0, this.b)) {
            arrayList1.add(hcjg.j);
        }
        return new gbhq(gbho0, z4, s5, gcvf0, z5, s6, gged0, arrayList1);
    }
}

