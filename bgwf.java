import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Executor;

public final class bgwf {
    public final Context a;
    public static final int b;
    private static final ggeo c;
    private static volatile bgwf d;
    private final Executor e;
    private final frli f;

    static {
        ggek ggek0 = new ggek();
        ggek0.i(gxoe.c, Integer.valueOf(1));
        ggek0.i(gxoe.d, Integer.valueOf(2));
        bgwf.c = ggek0.b();
    }

    public bgwf() {
        throw null;
    }

    public bgwf(Context context0) {
        bblp bblp0 = new bblp(1, 9);
        super();
        this.a = context0;
        this.e = bblp0;
        frce frce0 = new frce(context0);
        frce0.d("crisisalerts");
        frce0.e("crisisalerts_sysstate.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)gxof.b));
        frie0.h(frhj.a);
        frif frif0 = frie0.a();
        this.f = cjtb.a.a(frif0);
    }

    public static int a(gxoe gxoe0) {
        Integer integer0 = (Integer)bgwf.c.get(gxoe0);
        return integer0 == null ? -1 : ((int)integer0);
    }

    public static bgwf b(Context context0) {
        if(bgwf.d == null) {
            synchronized(bgwf.class) {
                bgwf.d = new bgwf(context0);
            }
            return bgwf.d;
        }
        return bgwf.d;
    }

    public final gmcd c() {
        return glzd.f(this.f.a(), new bgwc(), this.e);
    }

    public final void d(gxoe gxoe0, boolean z) {
        bgwd bgwd0 = new bgwd(gxoe0, z);
        gmbu.t(this.f.b(bgwd0, this.e), new bgwe(this), this.e);
    }

    public final void e(gxod gxod0) {
        bgwa bgwa0 = new bgwa(gxod0);
        this.f.b(bgwa0, this.e).hB(new bgwb(this), this.e);
    }
}

