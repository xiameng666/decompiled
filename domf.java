import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class domf implements Factory {
    private final doma a;

    public domf(doma doma0) {
        this.a = doma0;
    }

    public static du a(doma doma0) {
        Preconditions.f(doma0.a);
        return doma0.a;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return domf.a(this.a);
    }
}

