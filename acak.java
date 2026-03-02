import android.content.Context;
import android.net.Uri;

public final class acak {
    public final frli a;
    public final frli b;

    public acak(Context context0) {
        frce frce0 = new frce(context0);
        frce0.d("stats");
        frce0.e("AppErrors.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)abzr.a));
        frif frif0 = frie0.a();
        this.a = cjtb.a.a(frif0);
        frce frce1 = new frce(context0);
        frce1.d("stats");
        frce1.e("AppFilteredErrors.pb");
        Uri uri1 = frce1.a();
        frie frie1 = frif.a();
        frie1.f(uri1);
        frie1.e(((MessageLite)acab.a));
        frif frif1 = frie1.a();
        this.b = cjtb.a.a(frif1);
    }
}

