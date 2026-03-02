import java.util.concurrent.Executor;

public final class kts implements ibth {
    public final kty a;
    public final kle b;

    public kts(kty kty0, kle kle0) {
        this.a = kty0;
        this.b = kle0;
    }

    @Override  // ibth
    public final Object a() {
        kty kty0 = this.a;
        Executor executor0 = kty0.g;
        if(executor0 == null) {
            ibuq.j("executor");
            executor0 = null;
        }
        executor0.execute(new ktl(kty0, this.b));
        return ibom.a;
    }
}

