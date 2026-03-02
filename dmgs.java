import dagger.internal.Factory;

public final class dmgs implements Factory {
    private final dmgr a;

    public dmgs(dmgr dmgr0) {
        this.a = dmgr0;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a.a;
    }
}

