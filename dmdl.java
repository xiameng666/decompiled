import dagger.internal.Factory;

public final class dmdl implements Factory {
    private final dmdk a;

    public dmdl(dmdk dmdk0) {
        this.a = dmdk0;
    }

    public final dmdi a() {
        return this.a.a;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

