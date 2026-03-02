import android.content.Context;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public final class bcxv {
    public static final bboh a;
    public static CountDownLatch b;
    public static final List c;
    public final Context d;

    static {
        bcxv.a = bboh.b("CoreSettingsGetter", bbcu.ft);
        bcxv.c = DesugarCollections.synchronizedList(new ArrayList());
    }

    public bcxv(Context context0) {
        this.d = context0;
    }
}

