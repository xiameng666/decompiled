import android.os.Looper;
import java.util.concurrent.Executor;

public final class azyf {
    public volatile azyd_linstner listener_;
    private final Executor b;

    public azyf(Looper looper0, Object object0, String s) {
        this.b = new bbre(looper0);
        batl.t(object0, "Listener must not be null");
        batl.q(s);
        this.listener_ = new azyd_linstner(object0, s);
    }

    public azyf(Executor executor0, Object object0, String s) {
        batl.t(executor0, "Executor must not be null");
        this.b = executor0;
        batl.t(object0, "Listener must not be null");
        batl.q(s);
        this.listener_ = new azyd_linstner(object0, s);
    }

    public final void a() {
        this.listener_ = null;
    }

    public final void b(azye azye0) {
        azyc azyc0 = new azyc(this, azye0);
        this.b.execute(azyc0);
    }
}

