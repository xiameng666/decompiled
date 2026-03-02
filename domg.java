import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class domg implements Factory {
    private final doma a;

    public domg(doma doma0) {
        this.a = doma0;
    }

    public static lps a(doma doma0) {
        Preconditions.f(doma0.a);
        return doma0.a;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return domg.a(this.a);
    }
}

