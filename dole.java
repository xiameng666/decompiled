import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class dole implements Factory {
    private final dola a;

    public dole(dola dola0) {
        this.a = dola0;
    }

    public final String a() {
        return dole.b(this.a);
    }

    public static String b(dola dola0) {
        Preconditions.f(dola0.b);
        return dola0.b;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

