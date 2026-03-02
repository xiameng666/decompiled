import android.content.ContentResolver;
import java.util.Locale;

public final class hfmo implements glzm {
    public final ContentResolver a;

    public hfmo(ContentResolver contentResolver0) {
        this.a = contentResolver0;
    }

    @Override  // glzm
    public final gmcd a() {
        gfsx gfsx0 = gfsx.l(fftn.g(this.a, "device_country", "unknown"));
        gfsx gfsx1 = gfsx0.i() && !((String)gfsx0.d()).isEmpty() && !((String)gfsx0.d()).toLowerCase(Locale.getDefault()).equals("unknown") ? gfsx.m(((String)gfsx0.d())) : gfqx.a;
        if(!gfsx1.i()) {
            return gmbu.i(hflp.a(hfnd.b(hfnd.g), 0L));
        }
        ggdy ggdy0 = new ggdy();
        ggdy0.k(hfnd.g);
        Object object0 = gfsx1.d();
        Locale locale0 = Locale.getDefault();
        if(!hfmq.a.contains(((String)object0).toLowerCase(locale0))) {
            ggdy0.k(hfnd.c);
        }
        if(!((String)gfsx1.d()).toLowerCase(Locale.getDefault()).equals("de")) {
            ggdy0.k(hfnd.d);
            ggdy0.k(hfnd.e);
            ggdy0.k(hfnd.f);
        }
        return gmbu.i(hflp.a(hfnd.b(ggdy0.h()), 0L));
    }
}

