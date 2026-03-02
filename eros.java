import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;

public final class eros {
    private final frli a;

    public eros(Context context0) {
        frce frce0 = new frce(context0);
        frce0.d("smartdevice");
        frce0.e("quickStartSequenceCounterProto.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)eqog.a));
        frie0.h(new frjp(cjtd.a));
        frif frif0 = frie0.a();
        this.a = cjtb.a.a(frif0);
    }

    public final gmcd a() {
        gmcd gmcd0;
        synchronized(this) {
            AtomicInteger atomicInteger0 = new AtomicInteger();
            eroq eroq0 = new eroq(atomicInteger0);
            gmcd0 = glzd.f(this.a.b(eroq0, gmap.a), new eror(atomicInteger0), gmap.a);
        }
        return gmcd0;
    }
}

