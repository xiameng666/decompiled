import dagger.internal.Factory;

public final class dmhe implements Factory {
    private final dmhd a;

    public dmhe(dmhd dmhd0) {
        this.a = dmhd0;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return (int)this.a.a;
    }
}

