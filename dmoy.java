import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class dmoy implements Factory {
    public static String a(dmox dmox0) {
        Preconditions.f(dmox0.a);
        return dmox0.a;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        throw null;
    }
}

