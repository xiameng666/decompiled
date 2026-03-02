import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Executor;

public final class bgvx {
    public final Context a;
    private static volatile bgvx b;
    private final Executor c;
    private final frli d;

    public bgvx() {
        throw null;
    }

    public bgvx(Context context0) {
        bblp bblp0 = new bblp(1, 9);
        super();
        this.a = context0;
        this.c = bblp0;
        frce frce0 = new frce(context0);
        frce0.d("crisisalerts");
        frce0.e("crisisalerts_settings.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)gxoa.a));
        frie0.h(frhj.a);
        frif frif0 = frie0.a();
        this.d = cjtb.a.a(frif0);
    }

    public static bgvx a(Context context0) {
        if(bgvx.b == null) {
            synchronized(bgvx.class) {
                bgvx.b = new bgvx(context0);
            }
            return bgvx.b;
        }
        return bgvx.b;
    }

    public final gmcd b() {
        return glzd.f(this.d.a(), new bgvw(), this.c);
    }

    public final gmcd c(boolean z) {
        bgvu bgvu0 = new bgvu(z);
        gmcd gmcd0 = this.d.b(bgvu0, this.c);
        gmcd0.hB(new bgvv(this), this.c);
        return gmcd0;
    }
}

