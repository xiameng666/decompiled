import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class beah implements Factory {
    private final Provider a;

    public beah(Provider provider0) {
        this.a = provider0;
    }

    public final aysr a() {
        return beah.b(((ejaz)this.a).a());
    }

    public static aysr b(Context context0) {
        return new aysr(context0, axzj.b(), null);
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

