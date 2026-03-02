import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class bvsh implements Factory {
    private final Provider a;

    public bvsh(Provider provider0) {
        this.a = provider0;
    }

    public final bbfe_BaseGrpcServer a() {
        return new bbfe_BaseGrpcServer(((Context)this.a.get()), htxc.a.b().c(), ((int)htxc.a.b().a()), bbmq.b, 0x4700);
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

