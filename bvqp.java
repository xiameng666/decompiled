import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class bvqp implements Factory {
    private final Provider a;

    public bvqp(Provider provider0) {
        this.a = provider0;
    }

    public final bbfe_BaseGrpcServer a() {
        return new bbfe_BaseGrpcServer(((Context)this.a.get()), htwl.e(), ((int)htwl.b()), bbmq.b, 0x4700);
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

