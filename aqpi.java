import android.content.Context;
import android.net.Uri;

public final class aqpi {
    private final frli a;

    public aqpi(Context context0) {
        frce frce0 = new frce(context0);
        frce0.d("backup");
        frce0.e("EtuDataStore.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)arwa.a));
        frif frif0 = frie0.a();
        this.a = cjtb.a.a(frif0);
    }

    public final gmcd a() {
        return glzd.f(this.a.a(), new aqpg(), gmap.a);
    }

    public final gmcd b(String s) {
        aqph aqph0 = new aqph(s);
        return this.a.b(aqph0, gmap.a);
    }
}

