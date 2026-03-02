import android.content.Context;
import android.net.Uri;
import dagger.Lazy;
import java.util.concurrent.ScheduledExecutorService;

public final class cjji implements gful_cronetEngineProvider {
    public final Context a;
    public final frbx b;
    public final String c;
    public final gfsx d;
    public final clbs e;

    public cjji(Context context0, frbx frbx0, String s, gfsx gfsx0, clbs clbs0) {
        this.a = context0;
        this.b = frbx0;
        this.c = s;
        this.d = gfsx0;
        this.e = clbs0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        cjjj cjjj0 = new cjjj();
        Context context0 = this.a;
        cjjd cjjd0 = new cjjd(context0, cjjj0);
        gmcg gmcg0 = gmcn.a(clhl.b.d(clhr.a));
        ibuq.e(gmcg0, "listeningDecorator(...)");
        fjak fjak0 = fjgg.a;
        ScheduledExecutorService scheduledExecutorService0 = clhl.b.h(fjak0.g(), clhr.a);
        gfsx gfsx0 = gfsx.l(this.c);
        frce frce0 = new frce(context0);
        frce0.d("datadownloadmanifest");
        frce0.e(((String)gfsx0.f("datadownload")));
        Uri uri0 = frce0.a().buildUpon().appendPath("download_metadata.pb").build();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)fjhu.a));
        frif frif0 = frie0.a();
        frli frli0 = cjtb.a.a(frif0);
        gfsx gfsx1 = gfsx.l(new cjjk(this.e, scheduledExecutorService0, cjjd0));
        fjhy fjhy0 = (fjhy)gfsx.l(new cjjl()).b(new fjig()).f(new fjhy(new fjhw()));
        ymu ymu0 = gfsx1.i() ? ((ymu)((Lazy)gfsx1.d()).get()) : new yms(gmcg0, fjak0.p(), fjak0.p());
        gfsx gfsx2 = this.d;
        ykq ykq0 = new ykq(context0, scheduledExecutorService0, ((long)fjak0.p()));
        ymm ymm0 = new ymm();
        frfc frfc0 = new frfc(frli0, gmcg0);
        ymg ymg0 = new ymg();
        ymg0.b = gmcg0;
        ymg0.e = ykq0;
        int v = fjak0.g();
        gftb.checkTrue(v > 0);
        ymg0.c = v;
        ymg0.d = ymm0;
        gftb.f(ymu0.b().contains("https"), "Provided UrlEngine must support URL scheme: %s", "https");
        gftb.f(((boolean)(1 ^ ymg0.a.containsKey("https"))), "Requested scheme already has a UrlEngine registered: %s", "https");
        ymg0.a.put("https", ymu0);
        ymj ymj0 = new ymj(ymg0);
        if(gfsx2.i()) {
            fjih fjih0 = new fjih(gfsx2);
            synchronized(ymj0.f) {
                gmct gmct0 = new gmct(gmcg0);
                ymj0.b.put(fjih0, gmct0);
            }
            return new cjjp(new fjic(ymj0, this.b, scheduledExecutorService0, frfc0, fjhy0), cjjd0, cclw.b);
        }
        return new cjjp(new fjic(ymj0, this.b, scheduledExecutorService0, frfc0, fjhy0), cjjd0, cclw.b);
    }
}

