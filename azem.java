import android.content.Context;
import j..time.Duration;
import java.lang.ref.WeakReference;

public final class azem {
    public final Context a;
    public final gful_cronetEngineProvider b;
    public final gful_cronetEngineProvider c;
    public static final int d;
    private static volatile WeakReference e;

    static {
        azem.e = new WeakReference(null);
    }

    public azem(Context context0) {
        this.c = gfus.b(((gful_cronetEngineProvider)new azek(this)), Duration.ofMinutes(1L));
        this.a = context0;
        this.b = gfus.b(((gful_cronetEngineProvider)new azei(context0)), Duration.ofMinutes(1L));
        gfus.b(((gful_cronetEngineProvider)new azej(context0)), Duration.ofMinutes(1L));
    }
}

