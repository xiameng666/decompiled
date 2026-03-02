import java.util.concurrent.Executor;

public final class ktp implements ibts {
    public final kty a;

    public ktp(kty kty0) {
        this.a = kty0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((kle)object0), "e");
        kty kty0 = this.a;
        Executor executor0 = kty0.g;
        if(executor0 == null) {
            ibuq.j("executor");
            executor0 = null;
        }
        executor0.execute(new kte(kty0, ((kle)object0)));
        return ibom.a;
    }
}

