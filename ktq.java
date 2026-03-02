import java.util.concurrent.Executor;

public final class ktq implements ibth {
    public final kty a;

    public ktq(kty kty0) {
        this.a = kty0;
    }

    @Override  // ibth
    public final Object a() {
        kty kty0 = this.a;
        Executor executor0 = kty0.g;
        if(executor0 == null) {
            ibuq.j("executor");
            executor0 = null;
        }
        executor0.execute(new ktg(kty0));
        return ibom.a;
    }
}

