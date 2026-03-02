import android.content.Context;
import java.net.HttpURLConnection;
import java.net.URL;

public final class aqwm {
    private final gful_cronetEngineProvider a;
    private final gful_cronetEngineProvider b;

    public aqwm() {
        this(((gful_cronetEngineProvider)new aqwj()), ((gful_cronetEngineProvider)new aqwk()));
    }

    public aqwm(gful_cronetEngineProvider gful0, gful_cronetEngineProvider gful1) {
        this.a = gful0;
        this.b = gful1;
    }

    public final cjxa a(Context context0, URL uRL0) {
        aqwl aqwl0 = () -> new bwjm(context0, true).b(uRL0);
        return new cjxa(this.a, this.b, aqwl0);
    }

    // Detected as a lambda impl.
    public static final HttpURLConnection b(Context context0, URL uRL0) {
        return new bwjm(context0, true).b(uRL0);
    }
}

