import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class golv implements Factory {
    @Override  // ibnf, ibne
    public final Object get() {
        Preconditions.f(idlv.a);
        return idlv.a;
    }
}

