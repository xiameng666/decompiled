import android.content.Context;
import android.net.Uri;

public final class aqjv {
    public final frli a;

    public aqjv(Context context0) {
        frce frce0 = new frce(context0);
        frce0.d("backup");
        frce0.e("PackageRestoreStatusRepository.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)aqhp.a));
        frie0.h(new frjp(cjtd.a));
        frif frif0 = frie0.a();
        this.a = cjtb.a.a(frif0);
    }

    public final gmcd a(String s, long v) {
        aqjt aqjt0 = new aqjt(s, v);
        return this.a.b(aqjt0, gmap.a);
    }

    public final gmcd b(String s, long v) {
        aqjs aqjs0 = new aqjs(v, s);
        return this.a.b(aqjs0, gmap.a);
    }
}

