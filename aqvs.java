import android.os.Bundle;

public final class aqvs implements gful_cronetEngineProvider {
    public final aqvv a;

    public aqvs(aqvv aqvv0) {
        this.a = aqvv0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        Bundle bundle0 = aqvv.f(this.a.c);
        aqwd.b.h("Pausing app updates", new Object[0]);
        return glzd.g(this.a.b.c(), new aqvy(this.a.b, bundle0), this.a.b.c);
    }
}

