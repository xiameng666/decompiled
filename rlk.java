import android.os.PersistableBundle;

public abstract class rlk extends rvp {
    @Override  // rvp
    public final PersistableBundle d(Object object0) {
        rkx rkx0 = (rkx)object0;
        ibuq.f(rkx0, "taskResult");
        return rkx0.a();
    }

    public abstract sdg e();

    public abstract sdg f();

    @Override  // rvp
    public final PersistableBundle gx(Object object0) {
        scz scz0 = (scz)object0;
        ibuq.f(scz0, "taskArgs");
        return scz0.a();
    }

    @Override  // rvp
    public final Object i(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "bundle");
        return (scz)this.e().c(persistableBundle0);
    }

    @Override  // rvp
    public final Object j(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "bundle");
        sdg sdg0 = this.f();
        ibuq.f(sdg0, "deserializer");
        return new rkr(sdg0).d(persistableBundle0);
    }
}

