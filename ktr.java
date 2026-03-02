import java.util.concurrent.Executor;

public final class ktr implements ibth {
    public final kty a;
    public final kiu b;

    public ktr(kty kty0, kiu kiu0) {
        this.a = kty0;
        this.b = kiu0;
    }

    @Override  // ibth
    public final Object a() {
        kty kty0 = this.a;
        Executor executor0 = kty0.g;
        if(executor0 == null) {
            ibuq.j("executor");
            executor0 = null;
        }
        executor0.execute(new ktf(kty0, this.b));
        return ibom.a;
    }
}

