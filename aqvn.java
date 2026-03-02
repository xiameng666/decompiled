import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class aqvn implements aqvg {
    private final aqvf a;
    private final gful_cronetEngineProvider b;
    private final gful_cronetEngineProvider c;

    public aqvn(Context context0) {
        aqvf aqvf0 = aqvf.b(context0, 3);
        aqvm aqvm0 = new aqvm(context0);
        super();
        this.c = gfus.a(((gful_cronetEngineProvider)new aqvl()));
        this.a = aqvf0;
        this.b = gfus.a(((gful_cronetEngineProvider)aqvm0));
    }

    @Override  // aqvg
    public final aqvk a(aqvd aqvd0) {
        Long long0;
        try {
            long0 = this.a.a();
            aqvk aqvk0 = this.b();
            this.a.g(15, aqvd0, aqvk0, long0);
            return aqvk0;
        }
        catch(InterruptedException | ExecutionException | TimeoutException exception0) {
            if((exception0 instanceof InterruptedException)) {
                Thread.currentThread().interrupt();
            }
            this.a.f(15, aqvd0, aqvf.d(true, exception0), long0);
            return new aqvk(aqvj.c, null, exception0);
        }
    }

    @Override  // aqvg
    public final aqvk b() {
        fpug fpug0 = (fpug)((glyq)((fptx)this.b.mr()).b(fpua.a)).v(((Long)this.c.mr()).longValue(), TimeUnit.SECONDS);
        if((fpug0.b & 1) != 0 && (fpug0.c == null ? fpub.a : fpug0.c).c) {
            fpub fpub0 = fpug0.c == null ? fpub.a : fpug0.c;
            return new aqvk(aqvj.a, (fpub0.d == null ? fptn.a : fpub0.d).b, null);
        }
        return new aqvk(aqvj.b, null, null);
    }
}

