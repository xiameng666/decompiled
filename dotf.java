import android.content.ComponentName;
import android.os.IBinder;
import java.util.ArrayDeque;

public final class dotf extends clil {
    public static final bboh a;
    private final gmcg b;

    static {
        dotf.a = bboh.b("Jpeg2kConversionServiceConnection", bbcu.cZ);
    }

    public dotf(gmcg gmcg0) {
        super("jpeg2k_conversion");
        this.b = gmcg0;
        new ArrayDeque();
        new ArrayDeque();
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        dote dote0 = new dote(iBinder0);
        this.b.execute(dote0);
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        dotd dotd0 = new dotd();
        this.b.execute(dotd0);
    }
}

