import android.content.Context;
import android.net.Uri;

public final class ekog {
    public final frli a;
    private final Context b;
    private final ccim c;

    public ekog(Context context0) {
        this.b = context0;
        this.c = ccil.a(context0);
        frce frce0 = new frce(context0);
        frce0.d("safebrowsing");
        frce0.e("safebrowsing_settings.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)elkc.a));
        frie0.h(new frjp(cjtd.a));
        frif frif0 = frie0.a();
        this.a = cjtb.a.a(frif0);
    }

    public final gmcd a() {
        return !hxuv.f() || !ccin.a(this.b) || !this.c.d() ? glzd.f(this.a.a(), new ekod(), gmap.a) : gmbu.i(Boolean.valueOf(true));
    }

    public static final boolean b(eljz eljz0) {
        return eljz0.c >= System.currentTimeMillis() - 2592000000L;
    }
}

