import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

public final class blss implements blso {
    public final bltv a;
    public final ScheduledExecutorService b;
    public static final int c;

    static {
        bnaa.a("AuthorizationStageHandler");
    }

    public blss(Context context0, bnae bnae0, String s, int v) {
        bbll bbll0 = new bbll(1, 9);
        super();
        this.a = new bltv(context0, bnae0, s, v);
        this.b = bbll0;
    }

    @Override  // blso
    public final void a() {
        this.a.a();
    }
}

