import dagger.internal.Factory;

public final class dcmx implements Factory {
    @Override  // ibnf, ibne
    public final Object get() {
        return new ccmp();
    }
}

