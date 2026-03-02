import android.os.Bundle;

public final class aqvr implements gful_cronetEngineProvider {
    public final aqvv a;

    public aqvr(aqvv aqvv0) {
        this.a = aqvv0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        Bundle bundle0 = aqvv.f(this.a.c);
        aqwd.b.h("Resuming app updates", new Object[0]);
        return glzd.g(this.a.b.c(), new aqvx(this.a.b, bundle0), this.a.b.c);
    }
}

