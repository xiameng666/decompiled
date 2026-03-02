import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class dmgz implements Factory {
    @Override  // ibnf, ibne
    public final Object get() {
        Object object0 = dmgy.a().equals("SANDBOX") ? eczp.a : eczp.b;
        Preconditions.f(object0);
        return object0;
    }
}

