import dagger.internal.Preconditions;
import dagger.internal.Provider;

final class dwcv implements Provider {
    private final dpqp a;

    public dwcv(dpqp dpqp0) {
        this.a = dpqp0;
    }

    public final dprs a() {
        dprs dprs0 = (dprs)this.a.T.get();
        Preconditions.e(dprs0);
        return dprs0;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

