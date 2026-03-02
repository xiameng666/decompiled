import android.content.Context;
import android.net.Uri;
import java.util.concurrent.ExecutionException;

public final class ekaq {
    public final gmcg a;
    public frli b;
    public static final int c;

    static {
        bboh.b("ROM_RomanescoStoreMgr", bbcu.bN);
    }

    public ekaq() {
        this.a = new bblp(1, 9);
    }

    public ekaq(Context context0) {
        frce frce0 = new frce(context0);
        frce0.d("romanesco");
        frce0.e("DataStore.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)ejyo.a));
        frif frif0 = frie0.a();
        this.b = cjtb.a.a(frif0);
    }

    public ekaq(Context context0, String s) {
        frce frce0 = new frce(context0);
        frce0.d("romanesco");
        frce0.e(s + "_DataStore.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)ejyo.a));
        frif frif0 = frie0.a();
        this.b = cjtb.a.a(frif0);
    }

    public final gmcd a() {
        return glzd.f(this.b.a(), new ekac(), gmap.a);
    }

    public final gmcd b() {
        return glzd.f(this.b.a(), new ekah(), gmap.a);
    }

    public final gmcd c() {
        return glzd.f(this.b.a(), new ejzv(), this.a);
    }

    public final gmcd d() {
        return glzd.f(this.b.a(), new ejzo(), gmap.a);
    }

    public static final void e(gmcd gmcd0) {
        try {
            ((glyq)gmcd0).u();
        }
        catch(InterruptedException | ExecutionException unused_ex) {
        }
    }

    public final void f(Boolean boolean0) {
        this.b.b(new ejzt(boolean0), gmap.a);
    }
}

