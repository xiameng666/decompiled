import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class domd implements Factory {
    private final doma a;

    public domd(doma doma0) {
        this.a = doma0;
    }

    public final xni a() {
        return domd.b(this.a);
    }

    public static xni b(doma doma0) {
        xni xni0 = (xni)doma0.a.getContext();
        Preconditions.f(xni0);
        return xni0;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

