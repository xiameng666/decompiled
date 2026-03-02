import android.content.Context;
import j..util.Optional;
import java.util.function.Supplier;

public final class cqjh {
    public final frli a;
    private static final Object b;
    private static cqjh c;

    static {
        cqjh.b = new Object();
    }

    private cqjh(frli frli0) {
        this.a = frli0;
    }

    public static cqjh a(Context context0) {
        cqjh cqjh1;
        synchronized(cqjh.b) {
            cqjh cqjh0 = cqjh.c;
            if(cqjh0 != null) {
                return cqjh0;
            }
            frce frce0 = new frce(context0.getApplicationContext());
            frce0.d("security");
            frce0.e("qrl_store.pb");
            frce0.f(frgo.a);
            frie frie0 = frif.a();
            frie0.f(frce0.a());
            frie0.e(((MessageLite)elhq.a));
            frie0.h(new frjp(cjtd.a));
            frif frif0 = frie0.a();
            cqjh1 = new cqjh(cjtb.a.a(frif0));
            cqjh.c = cqjh1;
        }
        return cqjh1;
    }

    public final gmcd b() {
        return glzd.f(this.a.a(), new cqjb(), gmap.a);
    }

    public final gmcd c() {
        return glzd.f(this.a.a(), new cqje(), gmap.a);
    }

    public final gmcd d(Optional optional0, Supplier supplier0) {
        return optional0.isPresent() ? glzd.g(gmbu.f(new gmcd[]{this.e(((elhs)optional0.get())), ((gmcd)supplier0.get())}), new cqjg(this, optional0), gmap.a) : glzd.g(gmbu.f(new gmcd[]{this.e(elhs.a), ((gmcd)supplier0.get())}), new cqjg(this, optional0), gmap.a);
    }

    private final gmcd e(elhs elhs0) {
        cqjd cqjd0 = new cqjd(elhs0);
        return this.a.b(cqjd0, gmap.a);
    }
}

