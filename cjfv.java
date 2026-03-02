import j..util.Objects;
import java.util.concurrent.Executor;

public final class cjfv extends cjdf {
    final cjfw e;

    public cjfv(cjfw cjfw0, Executor executor0, cjfo cjfo0) {
        Objects.requireNonNull(cjfw0);
        this.e = cjfw0;
        super(executor0, cjfo0);
    }

    @Override  // cjdf
    protected final void e(Object object0) {
        cjft cjft0 = this.e.e;
        if(cjft0 != null && cjft0.a) {
            this.ir(new cjfu(this));
        }
    }
}

