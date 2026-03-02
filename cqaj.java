import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class cqaj implements Factory {
    private final Provider a;

    public cqaj(Provider provider0) {
        this.a = provider0;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        Context context0 = (Context)this.a.get();
        return new ccmp();
    }
}

