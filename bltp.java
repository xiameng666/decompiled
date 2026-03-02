import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

public final class bltp implements blso {
    public final Context a;
    public final bltl b;
    public final ScheduledExecutorService c;
    public static final int d;

    static {
        bnaa.a("TurnOnLocationStageHandler");
    }

    public bltp(Context context0, bnae bnae0) {
        bbll bbll0 = new bbll(1, 9);
        super();
        this.a = context0;
        this.b = new bltl(context0, bnae0);
        this.c = bbll0;
    }

    @Override  // blso
    public final void a() {
        this.b.a();
    }
}

