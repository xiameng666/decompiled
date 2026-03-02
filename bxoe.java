import com.google.android.gms.common.api.Status;
import java.util.function.Consumer;

public final class bxoe implements cjui {
    public final bbng a;
    private final Consumer b;

    private bxoe(Consumer consumer0, bbng bbng0) {
        this.a = bbng0;
        this.b = consumer0;
    }

    @Override  // cjui
    public final void a(cjtm cjtm0, Status status0) {
        Long long0 = ((bxoi)cjtm0).e;
        if(long0 != null) {
            long v = System.currentTimeMillis();
            Long long1 = v;
            long1.getClass();
            long1.getClass();
            this.b.accept(new bxof(((long)long0), v, v - ((long)long0), status0, cjtm0));
        }
    }

    public static void b(cjts cjts0, Consumer consumer0) {
        bxoe bxoe0 = new bxoe(consumer0, bbnk.a);
        cjts0.e(gged_interceptors.l(bxoe0));
        cjts0.d(gged_interceptors.l(bxoe0));
    }
}

