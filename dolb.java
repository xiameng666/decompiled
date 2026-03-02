import dagger.internal.Factory;

public final class dolb implements Factory {
    private final dola a;

    public dolb(dola dola0) {
        this.a = dola0;
    }

    public final Boolean a() {
        return Boolean.valueOf(this.a.c);
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

