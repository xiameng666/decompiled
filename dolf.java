import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class dolf implements Factory {
    private final dola a;

    public dolf(dola dola0) {
        this.a = dola0;
    }

    public final String a() {
        return dolf.b(this.a);
    }

    public static String b(dola dola0) {
        Preconditions.f(dola0.a);
        return dola0.a;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

