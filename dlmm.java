import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class dlmm implements Factory {
    private final dlmk a;

    public dlmm(dlmk dlmk0) {
        this.a = dlmk0;
    }

    public static xni a(dlmk dlmk0) {
        Preconditions.f(dlmk0.a);
        return dlmk0.a;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return dlmm.a(this.a);
    }
}

