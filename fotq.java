import android.content.Context;
import android.content.pm.PackageManager;
import java.util.List;

@ibnh
final class fotq {
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final fhci e;
    public final gful_cronetEngineProvider f;
    public final ibnf g;
    public final fosv h;
    public final gfsx i;
    public final gfsx j;
    public final gfsx k;
    public final ibnf l;
    public final int m;

    public fotq(Context context0, gfsx gfsx0, String s, ibnf ibnf0, fosv fosv0, gfsx gfsx1, gfsx gfsx2, gfsx gfsx3, ibnf ibnf1) {
        int v;
        this.a = context0;
        this.g = ibnf0;
        this.b = "com.google.android.gms";
        this.c = foro.c("com.google.android.gms", foro.b());
        if(gfsx0.i()) {
            foss foss0 = (foss)gfsx0.d();
        }
        this.d = s;
        PackageManager packageManager0 = context0.getPackageManager();
        if(packageManager0.hasSystemFeature("android.hardware.type.watch")) {
            v = 3;
        }
        else {
            v = packageManager0.hasSystemFeature("android.software.leanback") ? 4 : 2;
        }
        if(packageManager0.hasSystemFeature("android.hardware.type.automotive")) {
            v = 5;
        }
        this.m = v;
        this.e = new fhci(context0);
        this.f = gfus.a(((gful_cronetEngineProvider)new fotn(this)));
        this.h = fosv0;
        this.i = gfsx1;
        this.j = gfsx2;
        this.k = gfsx3;
        this.l = ibnf1;
    }

    public static List a(List list0, int v) {
        return list0.size() <= v ? list0 : list0.subList(0, v);
    }
}

